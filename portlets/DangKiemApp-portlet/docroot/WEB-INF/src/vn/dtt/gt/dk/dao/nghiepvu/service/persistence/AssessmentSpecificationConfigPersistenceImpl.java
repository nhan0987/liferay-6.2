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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException;
import vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the assessment specification config service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see AssessmentSpecificationConfigPersistence
 * @see AssessmentSpecificationConfigUtil
 * @generated
 */
public class AssessmentSpecificationConfigPersistenceImpl
	extends BasePersistenceImpl<AssessmentSpecificationConfig>
	implements AssessmentSpecificationConfigPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AssessmentSpecificationConfigUtil} to access the assessment specification config persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AssessmentSpecificationConfigImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR =
		new FinderPath(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAssessmentidAndAssessmentyear",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR =
		new FinderPath(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAssessmentidAndAssessmentyear",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			AssessmentSpecificationConfigModelImpl.SPECIFICATIONGROUPCODE_COLUMN_BITMASK |
			AssessmentSpecificationConfigModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentSpecificationConfigModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEAR =
		new FinderPath(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAssessmentidAndAssessmentyear",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the matching assessment specification configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyear(
		String specificationgroupcode, String assessmentid,
		String assessmentyear) throws SystemException {
		return findByAssessmentidAndAssessmentyear(specificationgroupcode,
			assessmentid, assessmentyear, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specification configs
	 * @param end the upper bound of the range of assessment specification configs (not inclusive)
	 * @return the range of matching assessment specification configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyear(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, int start, int end) throws SystemException {
		return findByAssessmentidAndAssessmentyear(specificationgroupcode,
			assessmentid, assessmentyear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param start the lower bound of the range of assessment specification configs
	 * @param end the upper bound of the range of assessment specification configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment specification configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyear(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR;
			finderArgs = new Object[] {
					specificationgroupcode, assessmentid, assessmentyear
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR;
			finderArgs = new Object[] {
					specificationgroupcode, assessmentid, assessmentyear,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentSpecificationConfig> list = (List<AssessmentSpecificationConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentSpecificationConfig assessmentSpecificationConfig : list) {
				if (!Validator.equals(specificationgroupcode,
							assessmentSpecificationConfig.getSpecificationgroupcode()) ||
						!Validator.equals(assessmentid,
							assessmentSpecificationConfig.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentSpecificationConfig.getAssessmentyear())) {
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

			query.append(_SQL_SELECT_ASSESSMENTSPECIFICATIONCONFIG_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_2);
			}

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
				query.append(AssessmentSpecificationConfigModelImpl.ORDER_BY_JPQL);
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

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (!pagination) {
					list = (List<AssessmentSpecificationConfig>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentSpecificationConfig>(list);
				}
				else {
					list = (List<AssessmentSpecificationConfig>)QueryUtil.list(q,
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
	 * Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification config
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig findByAssessmentidAndAssessmentyear_First(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationConfigException, SystemException {
		AssessmentSpecificationConfig assessmentSpecificationConfig = fetchByAssessmentidAndAssessmentyear_First(specificationgroupcode,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentSpecificationConfig != null) {
			return assessmentSpecificationConfig;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationConfigException(msg.toString());
	}

	/**
	 * Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyear_First(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		List<AssessmentSpecificationConfig> list = findByAssessmentidAndAssessmentyear(specificationgroupcode,
				assessmentid, assessmentyear, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification config
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig findByAssessmentidAndAssessmentyear_Last(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationConfigException, SystemException {
		AssessmentSpecificationConfig assessmentSpecificationConfig = fetchByAssessmentidAndAssessmentyear_Last(specificationgroupcode,
				assessmentid, assessmentyear, orderByComparator);

		if (assessmentSpecificationConfig != null) {
			return assessmentSpecificationConfig;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationConfigException(msg.toString());
	}

	/**
	 * Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyear_Last(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByAssessmentidAndAssessmentyear(specificationgroupcode,
				assessmentid, assessmentyear);

		if (count == 0) {
			return null;
		}

		List<AssessmentSpecificationConfig> list = findByAssessmentidAndAssessmentyear(specificationgroupcode,
				assessmentid, assessmentyear, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment specification configs before and after the current assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param id the primary key of the current assessment specification config
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment specification config
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig[] findByAssessmentidAndAssessmentyear_PrevAndNext(
		long id, String specificationgroupcode, String assessmentid,
		String assessmentyear, OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationConfigException, SystemException {
		AssessmentSpecificationConfig assessmentSpecificationConfig = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentSpecificationConfig[] array = new AssessmentSpecificationConfigImpl[3];

			array[0] = getByAssessmentidAndAssessmentyear_PrevAndNext(session,
					assessmentSpecificationConfig, specificationgroupcode,
					assessmentid, assessmentyear, orderByComparator, true);

			array[1] = assessmentSpecificationConfig;

			array[2] = getByAssessmentidAndAssessmentyear_PrevAndNext(session,
					assessmentSpecificationConfig, specificationgroupcode,
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

	protected AssessmentSpecificationConfig getByAssessmentidAndAssessmentyear_PrevAndNext(
		Session session,
		AssessmentSpecificationConfig assessmentSpecificationConfig,
		String specificationgroupcode, String assessmentid,
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

		query.append(_SQL_SELECT_ASSESSMENTSPECIFICATIONCONFIG_WHERE);

		boolean bindSpecificationgroupcode = false;

		if (specificationgroupcode == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_1);
		}
		else if (specificationgroupcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_3);
		}
		else {
			bindSpecificationgroupcode = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_2);
		}

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
			query.append(AssessmentSpecificationConfigModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSpecificationgroupcode) {
			qPos.add(specificationgroupcode);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentSpecificationConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentSpecificationConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; from the database.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAssessmentidAndAssessmentyear(
		String specificationgroupcode, String assessmentid,
		String assessmentyear) throws SystemException {
		for (AssessmentSpecificationConfig assessmentSpecificationConfig : findByAssessmentidAndAssessmentyear(
				specificationgroupcode, assessmentid, assessmentyear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentSpecificationConfig);
		}
	}

	/**
	 * Returns the number of assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @return the number of matching assessment specification configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssessmentidAndAssessmentyear(
		String specificationgroupcode, String assessmentid,
		String assessmentyear) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEAR;

		Object[] finderArgs = new Object[] {
				specificationgroupcode, assessmentid, assessmentyear
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ASSESSMENTSPECIFICATIONCONFIG_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_2);
			}

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

				if (bindSpecificationgroupcode) {
					qPos.add(specificationgroupcode);
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

	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_1 =
		"assessmentSpecificationConfig.specificationgroupcode IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_2 =
		"assessmentSpecificationConfig.specificationgroupcode = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_SPECIFICATIONGROUPCODE_3 =
		"(assessmentSpecificationConfig.specificationgroupcode IS NULL OR assessmentSpecificationConfig.specificationgroupcode = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_1 =
		"assessmentSpecificationConfig.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_2 =
		"assessmentSpecificationConfig.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTID_3 =
		"(assessmentSpecificationConfig.assessmentid IS NULL OR assessmentSpecificationConfig.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_1 =
		"assessmentSpecificationConfig.assessmentyear IS NULL";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_2 =
		"assessmentSpecificationConfig.assessmentyear = ?";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEAR_ASSESSMENTYEAR_3 =
		"(assessmentSpecificationConfig.assessmentyear IS NULL OR assessmentSpecificationConfig.assessmentyear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByAssessmentidAndAssessmentyearWithSpecificationcode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigModelImpl.FINDER_CACHE_ENABLED,
			AssessmentSpecificationConfigImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByAssessmentidAndAssessmentyearWithSpecificationcode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			},
			AssessmentSpecificationConfigModelImpl.SPECIFICATIONGROUPCODE_COLUMN_BITMASK |
			AssessmentSpecificationConfigModelImpl.ASSESSMENTID_COLUMN_BITMASK |
			AssessmentSpecificationConfigModelImpl.ASSESSMENTYEAR_COLUMN_BITMASK |
			AssessmentSpecificationConfigModelImpl.SPECIFICATIONCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE =
		new FinderPath(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAssessmentidAndAssessmentyearWithSpecificationcode",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName()
			});

	/**
	 * Returns all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param specificationcode the specificationcode
	 * @return the matching assessment specification configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyearWithSpecificationcode(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, String specificationcode)
		throws SystemException {
		return findByAssessmentidAndAssessmentyearWithSpecificationcode(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param specificationcode the specificationcode
	 * @param start the lower bound of the range of assessment specification configs
	 * @param end the upper bound of the range of assessment specification configs (not inclusive)
	 * @return the range of matching assessment specification configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyearWithSpecificationcode(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, String specificationcode, int start, int end)
		throws SystemException {
		return findByAssessmentidAndAssessmentyearWithSpecificationcode(specificationgroupcode,
			assessmentid, assessmentyear, specificationcode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param specificationcode the specificationcode
	 * @param start the lower bound of the range of assessment specification configs
	 * @param end the upper bound of the range of assessment specification configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching assessment specification configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecificationConfig> findByAssessmentidAndAssessmentyearWithSpecificationcode(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, String specificationcode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE;
			finderArgs = new Object[] {
					specificationgroupcode, assessmentid, assessmentyear,
					specificationcode
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE;
			finderArgs = new Object[] {
					specificationgroupcode, assessmentid, assessmentyear,
					specificationcode,
					
					start, end, orderByComparator
				};
		}

		List<AssessmentSpecificationConfig> list = (List<AssessmentSpecificationConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (AssessmentSpecificationConfig assessmentSpecificationConfig : list) {
				if (!Validator.equals(specificationgroupcode,
							assessmentSpecificationConfig.getSpecificationgroupcode()) ||
						!Validator.equals(assessmentid,
							assessmentSpecificationConfig.getAssessmentid()) ||
						!Validator.equals(assessmentyear,
							assessmentSpecificationConfig.getAssessmentyear()) ||
						!Validator.equals(specificationcode,
							assessmentSpecificationConfig.getSpecificationcode())) {
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

			query.append(_SQL_SELECT_ASSESSMENTSPECIFICATIONCONFIG_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_2);
			}

			boolean bindSpecificationcode = false;

			if (specificationcode == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationcode = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AssessmentSpecificationConfigModelImpl.ORDER_BY_JPQL);
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

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (bindSpecificationcode) {
					qPos.add(specificationcode);
				}

				if (!pagination) {
					list = (List<AssessmentSpecificationConfig>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentSpecificationConfig>(list);
				}
				else {
					list = (List<AssessmentSpecificationConfig>)QueryUtil.list(q,
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
	 * Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param specificationcode the specificationcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification config
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig findByAssessmentidAndAssessmentyearWithSpecificationcode_First(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, String specificationcode,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationConfigException, SystemException {
		AssessmentSpecificationConfig assessmentSpecificationConfig = fetchByAssessmentidAndAssessmentyearWithSpecificationcode_First(specificationgroupcode,
				assessmentid, assessmentyear, specificationcode,
				orderByComparator);

		if (assessmentSpecificationConfig != null) {
			return assessmentSpecificationConfig;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(", specificationcode=");
		msg.append(specificationcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationConfigException(msg.toString());
	}

	/**
	 * Returns the first assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param specificationcode the specificationcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyearWithSpecificationcode_First(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, String specificationcode,
		OrderByComparator orderByComparator) throws SystemException {
		List<AssessmentSpecificationConfig> list = findByAssessmentidAndAssessmentyearWithSpecificationcode(specificationgroupcode,
				assessmentid, assessmentyear, specificationcode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param specificationcode the specificationcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification config
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a matching assessment specification config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig findByAssessmentidAndAssessmentyearWithSpecificationcode_Last(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, String specificationcode,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationConfigException, SystemException {
		AssessmentSpecificationConfig assessmentSpecificationConfig = fetchByAssessmentidAndAssessmentyearWithSpecificationcode_Last(specificationgroupcode,
				assessmentid, assessmentyear, specificationcode,
				orderByComparator);

		if (assessmentSpecificationConfig != null) {
			return assessmentSpecificationConfig;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("specificationgroupcode=");
		msg.append(specificationgroupcode);

		msg.append(", assessmentid=");
		msg.append(assessmentid);

		msg.append(", assessmentyear=");
		msg.append(assessmentyear);

		msg.append(", specificationcode=");
		msg.append(specificationcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAssessmentSpecificationConfigException(msg.toString());
	}

	/**
	 * Returns the last assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param specificationcode the specificationcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching assessment specification config, or <code>null</code> if a matching assessment specification config could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig fetchByAssessmentidAndAssessmentyearWithSpecificationcode_Last(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, String specificationcode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAssessmentidAndAssessmentyearWithSpecificationcode(specificationgroupcode,
				assessmentid, assessmentyear, specificationcode);

		if (count == 0) {
			return null;
		}

		List<AssessmentSpecificationConfig> list = findByAssessmentidAndAssessmentyearWithSpecificationcode(specificationgroupcode,
				assessmentid, assessmentyear, specificationcode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the assessment specification configs before and after the current assessment specification config in the ordered set where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	 *
	 * @param id the primary key of the current assessment specification config
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param specificationcode the specificationcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next assessment specification config
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig[] findByAssessmentidAndAssessmentyearWithSpecificationcode_PrevAndNext(
		long id, String specificationgroupcode, String assessmentid,
		String assessmentyear, String specificationcode,
		OrderByComparator orderByComparator)
		throws NoSuchAssessmentSpecificationConfigException, SystemException {
		AssessmentSpecificationConfig assessmentSpecificationConfig = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AssessmentSpecificationConfig[] array = new AssessmentSpecificationConfigImpl[3];

			array[0] = getByAssessmentidAndAssessmentyearWithSpecificationcode_PrevAndNext(session,
					assessmentSpecificationConfig, specificationgroupcode,
					assessmentid, assessmentyear, specificationcode,
					orderByComparator, true);

			array[1] = assessmentSpecificationConfig;

			array[2] = getByAssessmentidAndAssessmentyearWithSpecificationcode_PrevAndNext(session,
					assessmentSpecificationConfig, specificationgroupcode,
					assessmentid, assessmentyear, specificationcode,
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

	protected AssessmentSpecificationConfig getByAssessmentidAndAssessmentyearWithSpecificationcode_PrevAndNext(
		Session session,
		AssessmentSpecificationConfig assessmentSpecificationConfig,
		String specificationgroupcode, String assessmentid,
		String assessmentyear, String specificationcode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ASSESSMENTSPECIFICATIONCONFIG_WHERE);

		boolean bindSpecificationgroupcode = false;

		if (specificationgroupcode == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
		}
		else if (specificationgroupcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
		}
		else {
			bindSpecificationgroupcode = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
		}

		boolean bindAssessmentid = false;

		if (assessmentid == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_1);
		}
		else if (assessmentid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_3);
		}
		else {
			bindAssessmentid = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_2);
		}

		boolean bindAssessmentyear = false;

		if (assessmentyear == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_1);
		}
		else if (assessmentyear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_3);
		}
		else {
			bindAssessmentyear = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_2);
		}

		boolean bindSpecificationcode = false;

		if (specificationcode == null) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_1);
		}
		else if (specificationcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_3);
		}
		else {
			bindSpecificationcode = true;

			query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_2);
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
			query.append(AssessmentSpecificationConfigModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSpecificationgroupcode) {
			qPos.add(specificationgroupcode);
		}

		if (bindAssessmentid) {
			qPos.add(assessmentid);
		}

		if (bindAssessmentyear) {
			qPos.add(assessmentyear);
		}

		if (bindSpecificationcode) {
			qPos.add(specificationcode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(assessmentSpecificationConfig);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AssessmentSpecificationConfig> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63; from the database.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param specificationcode the specificationcode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAssessmentidAndAssessmentyearWithSpecificationcode(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, String specificationcode)
		throws SystemException {
		for (AssessmentSpecificationConfig assessmentSpecificationConfig : findByAssessmentidAndAssessmentyearWithSpecificationcode(
				specificationgroupcode, assessmentid, assessmentyear,
				specificationcode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(assessmentSpecificationConfig);
		}
	}

	/**
	 * Returns the number of assessment specification configs where specificationgroupcode = &#63; and assessmentid = &#63; and assessmentyear = &#63; and specificationcode = &#63;.
	 *
	 * @param specificationgroupcode the specificationgroupcode
	 * @param assessmentid the assessmentid
	 * @param assessmentyear the assessmentyear
	 * @param specificationcode the specificationcode
	 * @return the number of matching assessment specification configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAssessmentidAndAssessmentyearWithSpecificationcode(
		String specificationgroupcode, String assessmentid,
		String assessmentyear, String specificationcode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE;

		Object[] finderArgs = new Object[] {
				specificationgroupcode, assessmentid, assessmentyear,
				specificationcode
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_ASSESSMENTSPECIFICATIONCONFIG_WHERE);

			boolean bindSpecificationgroupcode = false;

			if (specificationgroupcode == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1);
			}
			else if (specificationgroupcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3);
			}
			else {
				bindSpecificationgroupcode = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2);
			}

			boolean bindAssessmentid = false;

			if (assessmentid == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_1);
			}
			else if (assessmentid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_3);
			}
			else {
				bindAssessmentid = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_2);
			}

			boolean bindAssessmentyear = false;

			if (assessmentyear == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_1);
			}
			else if (assessmentyear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_3);
			}
			else {
				bindAssessmentyear = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_2);
			}

			boolean bindSpecificationcode = false;

			if (specificationcode == null) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_1);
			}
			else if (specificationcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_3);
			}
			else {
				bindSpecificationcode = true;

				query.append(_FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_2);
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

				if (bindAssessmentid) {
					qPos.add(assessmentid);
				}

				if (bindAssessmentyear) {
					qPos.add(assessmentyear);
				}

				if (bindSpecificationcode) {
					qPos.add(specificationcode);
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

	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_1 =
		"assessmentSpecificationConfig.specificationgroupcode IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_2 =
		"assessmentSpecificationConfig.specificationgroupcode = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONGROUPCODE_3 =
		"(assessmentSpecificationConfig.specificationgroupcode IS NULL OR assessmentSpecificationConfig.specificationgroupcode = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_1 =
		"assessmentSpecificationConfig.assessmentid IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_2 =
		"assessmentSpecificationConfig.assessmentid = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTID_3 =
		"(assessmentSpecificationConfig.assessmentid IS NULL OR assessmentSpecificationConfig.assessmentid = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_1 =
		"assessmentSpecificationConfig.assessmentyear IS NULL AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_2 =
		"assessmentSpecificationConfig.assessmentyear = ? AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_ASSESSMENTYEAR_3 =
		"(assessmentSpecificationConfig.assessmentyear IS NULL OR assessmentSpecificationConfig.assessmentyear = '') AND ";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_1 =
		"assessmentSpecificationConfig.specificationcode IS NULL";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_2 =
		"assessmentSpecificationConfig.specificationcode = ?";
	private static final String _FINDER_COLUMN_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE_SPECIFICATIONCODE_3 =
		"(assessmentSpecificationConfig.specificationcode IS NULL OR assessmentSpecificationConfig.specificationcode = '')";

	public AssessmentSpecificationConfigPersistenceImpl() {
		setModelClass(AssessmentSpecificationConfig.class);
	}

	/**
	 * Caches the assessment specification config in the entity cache if it is enabled.
	 *
	 * @param assessmentSpecificationConfig the assessment specification config
	 */
	@Override
	public void cacheResult(
		AssessmentSpecificationConfig assessmentSpecificationConfig) {
		EntityCacheUtil.putResult(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigImpl.class,
			assessmentSpecificationConfig.getPrimaryKey(),
			assessmentSpecificationConfig);

		assessmentSpecificationConfig.resetOriginalValues();
	}

	/**
	 * Caches the assessment specification configs in the entity cache if it is enabled.
	 *
	 * @param assessmentSpecificationConfigs the assessment specification configs
	 */
	@Override
	public void cacheResult(
		List<AssessmentSpecificationConfig> assessmentSpecificationConfigs) {
		for (AssessmentSpecificationConfig assessmentSpecificationConfig : assessmentSpecificationConfigs) {
			if (EntityCacheUtil.getResult(
						AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentSpecificationConfigImpl.class,
						assessmentSpecificationConfig.getPrimaryKey()) == null) {
				cacheResult(assessmentSpecificationConfig);
			}
			else {
				assessmentSpecificationConfig.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all assessment specification configs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AssessmentSpecificationConfigImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AssessmentSpecificationConfigImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the assessment specification config.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AssessmentSpecificationConfig assessmentSpecificationConfig) {
		EntityCacheUtil.removeResult(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigImpl.class,
			assessmentSpecificationConfig.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<AssessmentSpecificationConfig> assessmentSpecificationConfigs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AssessmentSpecificationConfig assessmentSpecificationConfig : assessmentSpecificationConfigs) {
			EntityCacheUtil.removeResult(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentSpecificationConfigImpl.class,
				assessmentSpecificationConfig.getPrimaryKey());
		}
	}

	/**
	 * Creates a new assessment specification config with the primary key. Does not add the assessment specification config to the database.
	 *
	 * @param id the primary key for the new assessment specification config
	 * @return the new assessment specification config
	 */
	@Override
	public AssessmentSpecificationConfig create(long id) {
		AssessmentSpecificationConfig assessmentSpecificationConfig = new AssessmentSpecificationConfigImpl();

		assessmentSpecificationConfig.setNew(true);
		assessmentSpecificationConfig.setPrimaryKey(id);

		return assessmentSpecificationConfig;
	}

	/**
	 * Removes the assessment specification config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the assessment specification config
	 * @return the assessment specification config that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig remove(long id)
		throws NoSuchAssessmentSpecificationConfigException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the assessment specification config with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the assessment specification config
	 * @return the assessment specification config that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig remove(Serializable primaryKey)
		throws NoSuchAssessmentSpecificationConfigException, SystemException {
		Session session = null;

		try {
			session = openSession();

			AssessmentSpecificationConfig assessmentSpecificationConfig = (AssessmentSpecificationConfig)session.get(AssessmentSpecificationConfigImpl.class,
					primaryKey);

			if (assessmentSpecificationConfig == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAssessmentSpecificationConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(assessmentSpecificationConfig);
		}
		catch (NoSuchAssessmentSpecificationConfigException nsee) {
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
	protected AssessmentSpecificationConfig removeImpl(
		AssessmentSpecificationConfig assessmentSpecificationConfig)
		throws SystemException {
		assessmentSpecificationConfig = toUnwrappedModel(assessmentSpecificationConfig);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(assessmentSpecificationConfig)) {
				assessmentSpecificationConfig = (AssessmentSpecificationConfig)session.get(AssessmentSpecificationConfigImpl.class,
						assessmentSpecificationConfig.getPrimaryKeyObj());
			}

			if (assessmentSpecificationConfig != null) {
				session.delete(assessmentSpecificationConfig);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (assessmentSpecificationConfig != null) {
			clearCache(assessmentSpecificationConfig);
		}

		return assessmentSpecificationConfig;
	}

	@Override
	public AssessmentSpecificationConfig updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig assessmentSpecificationConfig)
		throws SystemException {
		assessmentSpecificationConfig = toUnwrappedModel(assessmentSpecificationConfig);

		boolean isNew = assessmentSpecificationConfig.isNew();

		AssessmentSpecificationConfigModelImpl assessmentSpecificationConfigModelImpl =
			(AssessmentSpecificationConfigModelImpl)assessmentSpecificationConfig;

		Session session = null;

		try {
			session = openSession();

			if (assessmentSpecificationConfig.isNew()) {
				session.save(assessmentSpecificationConfig);

				assessmentSpecificationConfig.setNew(false);
			}
			else {
				session.merge(assessmentSpecificationConfig);
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
				!AssessmentSpecificationConfigModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((assessmentSpecificationConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentSpecificationConfigModelImpl.getOriginalSpecificationgroupcode(),
						assessmentSpecificationConfigModelImpl.getOriginalAssessmentid(),
						assessmentSpecificationConfigModelImpl.getOriginalAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR,
					args);

				args = new Object[] {
						assessmentSpecificationConfigModelImpl.getSpecificationgroupcode(),
						assessmentSpecificationConfigModelImpl.getAssessmentid(),
						assessmentSpecificationConfigModelImpl.getAssessmentyear()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEAR,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEAR,
					args);
			}

			if ((assessmentSpecificationConfigModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						assessmentSpecificationConfigModelImpl.getOriginalSpecificationgroupcode(),
						assessmentSpecificationConfigModelImpl.getOriginalAssessmentid(),
						assessmentSpecificationConfigModelImpl.getOriginalAssessmentyear(),
						assessmentSpecificationConfigModelImpl.getOriginalSpecificationcode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE,
					args);

				args = new Object[] {
						assessmentSpecificationConfigModelImpl.getSpecificationgroupcode(),
						assessmentSpecificationConfigModelImpl.getAssessmentid(),
						assessmentSpecificationConfigModelImpl.getAssessmentyear(),
						assessmentSpecificationConfigModelImpl.getSpecificationcode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ASSESSMENTIDANDASSESSMENTYEARWITHSPECIFICATIONCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
			AssessmentSpecificationConfigImpl.class,
			assessmentSpecificationConfig.getPrimaryKey(),
			assessmentSpecificationConfig);

		return assessmentSpecificationConfig;
	}

	protected AssessmentSpecificationConfig toUnwrappedModel(
		AssessmentSpecificationConfig assessmentSpecificationConfig) {
		if (assessmentSpecificationConfig instanceof AssessmentSpecificationConfigImpl) {
			return assessmentSpecificationConfig;
		}

		AssessmentSpecificationConfigImpl assessmentSpecificationConfigImpl = new AssessmentSpecificationConfigImpl();

		assessmentSpecificationConfigImpl.setNew(assessmentSpecificationConfig.isNew());
		assessmentSpecificationConfigImpl.setPrimaryKey(assessmentSpecificationConfig.getPrimaryKey());

		assessmentSpecificationConfigImpl.setId(assessmentSpecificationConfig.getId());
		assessmentSpecificationConfigImpl.setAssessmenttype(assessmentSpecificationConfig.getAssessmenttype());
		assessmentSpecificationConfigImpl.setSpecificationcategory(assessmentSpecificationConfig.getSpecificationcategory());
		assessmentSpecificationConfigImpl.setSpecificationgroupcode(assessmentSpecificationConfig.getSpecificationgroupcode());
		assessmentSpecificationConfigImpl.setSpecificationsequence(assessmentSpecificationConfig.getSpecificationsequence());
		assessmentSpecificationConfigImpl.setSpecificationcode(assessmentSpecificationConfig.getSpecificationcode());
		assessmentSpecificationConfigImpl.setSpecificationname(assessmentSpecificationConfig.getSpecificationname());
		assessmentSpecificationConfigImpl.setSpecificationdescription(assessmentSpecificationConfig.getSpecificationdescription());
		assessmentSpecificationConfigImpl.setAssessmentcoefficient(assessmentSpecificationConfig.getAssessmentcoefficient());
		assessmentSpecificationConfigImpl.setAssessmentindexmin(assessmentSpecificationConfig.getAssessmentindexmin());
		assessmentSpecificationConfigImpl.setAssessmentmarkmin(assessmentSpecificationConfig.getAssessmentmarkmin());
		assessmentSpecificationConfigImpl.setAssessmentindexmax(assessmentSpecificationConfig.getAssessmentindexmax());
		assessmentSpecificationConfigImpl.setAssessmentmarkmax(assessmentSpecificationConfig.getAssessmentmarkmax());
		assessmentSpecificationConfigImpl.setAssessmentid(assessmentSpecificationConfig.getAssessmentid());
		assessmentSpecificationConfigImpl.setAssessmentyear(assessmentSpecificationConfig.getAssessmentyear());
		assessmentSpecificationConfigImpl.setEvaluationperiod(assessmentSpecificationConfig.getEvaluationperiod());
		assessmentSpecificationConfigImpl.setLatestassessment(assessmentSpecificationConfig.getLatestassessment());
		assessmentSpecificationConfigImpl.setSynchdate(assessmentSpecificationConfig.getSynchdate());

		return assessmentSpecificationConfigImpl;
	}

	/**
	 * Returns the assessment specification config with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment specification config
	 * @return the assessment specification config
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchAssessmentSpecificationConfigException, SystemException {
		AssessmentSpecificationConfig assessmentSpecificationConfig = fetchByPrimaryKey(primaryKey);

		if (assessmentSpecificationConfig == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAssessmentSpecificationConfigException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return assessmentSpecificationConfig;
	}

	/**
	 * Returns the assessment specification config with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException} if it could not be found.
	 *
	 * @param id the primary key of the assessment specification config
	 * @return the assessment specification config
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchAssessmentSpecificationConfigException if a assessment specification config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig findByPrimaryKey(long id)
		throws NoSuchAssessmentSpecificationConfigException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the assessment specification config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the assessment specification config
	 * @return the assessment specification config, or <code>null</code> if a assessment specification config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig fetchByPrimaryKey(
		Serializable primaryKey) throws SystemException {
		AssessmentSpecificationConfig assessmentSpecificationConfig = (AssessmentSpecificationConfig)EntityCacheUtil.getResult(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
				AssessmentSpecificationConfigImpl.class, primaryKey);

		if (assessmentSpecificationConfig == _nullAssessmentSpecificationConfig) {
			return null;
		}

		if (assessmentSpecificationConfig == null) {
			Session session = null;

			try {
				session = openSession();

				assessmentSpecificationConfig = (AssessmentSpecificationConfig)session.get(AssessmentSpecificationConfigImpl.class,
						primaryKey);

				if (assessmentSpecificationConfig != null) {
					cacheResult(assessmentSpecificationConfig);
				}
				else {
					EntityCacheUtil.putResult(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
						AssessmentSpecificationConfigImpl.class, primaryKey,
						_nullAssessmentSpecificationConfig);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AssessmentSpecificationConfigModelImpl.ENTITY_CACHE_ENABLED,
					AssessmentSpecificationConfigImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return assessmentSpecificationConfig;
	}

	/**
	 * Returns the assessment specification config with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the assessment specification config
	 * @return the assessment specification config, or <code>null</code> if a assessment specification config with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public AssessmentSpecificationConfig fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the assessment specification configs.
	 *
	 * @return the assessment specification configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecificationConfig> findAll()
		throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the assessment specification configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment specification configs
	 * @param end the upper bound of the range of assessment specification configs (not inclusive)
	 * @return the range of assessment specification configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecificationConfig> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the assessment specification configs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.AssessmentSpecificationConfigModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment specification configs
	 * @param end the upper bound of the range of assessment specification configs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment specification configs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<AssessmentSpecificationConfig> findAll(int start, int end,
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

		List<AssessmentSpecificationConfig> list = (List<AssessmentSpecificationConfig>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ASSESSMENTSPECIFICATIONCONFIG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ASSESSMENTSPECIFICATIONCONFIG;

				if (pagination) {
					sql = sql.concat(AssessmentSpecificationConfigModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AssessmentSpecificationConfig>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<AssessmentSpecificationConfig>(list);
				}
				else {
					list = (List<AssessmentSpecificationConfig>)QueryUtil.list(q,
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
	 * Removes all the assessment specification configs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (AssessmentSpecificationConfig assessmentSpecificationConfig : findAll()) {
			remove(assessmentSpecificationConfig);
		}
	}

	/**
	 * Returns the number of assessment specification configs.
	 *
	 * @return the number of assessment specification configs
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

				Query q = session.createQuery(_SQL_COUNT_ASSESSMENTSPECIFICATIONCONFIG);

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
	 * Initializes the assessment specification config persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.AssessmentSpecificationConfig")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<AssessmentSpecificationConfig>> listenersList =
					new ArrayList<ModelListener<AssessmentSpecificationConfig>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<AssessmentSpecificationConfig>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(AssessmentSpecificationConfigImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ASSESSMENTSPECIFICATIONCONFIG = "SELECT assessmentSpecificationConfig FROM AssessmentSpecificationConfig assessmentSpecificationConfig";
	private static final String _SQL_SELECT_ASSESSMENTSPECIFICATIONCONFIG_WHERE = "SELECT assessmentSpecificationConfig FROM AssessmentSpecificationConfig assessmentSpecificationConfig WHERE ";
	private static final String _SQL_COUNT_ASSESSMENTSPECIFICATIONCONFIG = "SELECT COUNT(assessmentSpecificationConfig) FROM AssessmentSpecificationConfig assessmentSpecificationConfig";
	private static final String _SQL_COUNT_ASSESSMENTSPECIFICATIONCONFIG_WHERE = "SELECT COUNT(assessmentSpecificationConfig) FROM AssessmentSpecificationConfig assessmentSpecificationConfig WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "assessmentSpecificationConfig.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AssessmentSpecificationConfig exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AssessmentSpecificationConfig exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AssessmentSpecificationConfigPersistenceImpl.class);
	private static AssessmentSpecificationConfig _nullAssessmentSpecificationConfig =
		new AssessmentSpecificationConfigImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<AssessmentSpecificationConfig> toCacheModel() {
				return _nullAssessmentSpecificationConfigCacheModel;
			}
		};

	private static CacheModel<AssessmentSpecificationConfig> _nullAssessmentSpecificationConfigCacheModel =
		new CacheModel<AssessmentSpecificationConfig>() {
			@Override
			public AssessmentSpecificationConfig toEntityModel() {
				return _nullAssessmentSpecificationConfig;
			}
		};
}