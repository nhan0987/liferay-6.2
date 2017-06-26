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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException;
import vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the issue category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssueCategoryPersistence
 * @see IssueCategoryUtil
 * @generated
 */
public class IssueCategoryPersistenceImpl extends BasePersistenceImpl<IssueCategory>
	implements IssueCategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IssueCategoryUtil} to access the issue category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IssueCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED,
			IssueCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED,
			IssueCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUETRACKINGID =
		new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED,
			IssueCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByIssueTrackingid",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUETRACKINGID =
		new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED,
			IssueCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByIssueTrackingid", new String[] { Integer.class.getName() },
			IssueCategoryModelImpl.ISSUETRACKINGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUETRACKINGID = new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByIssueTrackingid", new String[] { Integer.class.getName() });

	/**
	 * Returns all the issue categories where issuetrackingid = &#63;.
	 *
	 * @param issuetrackingid the issuetrackingid
	 * @return the matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByIssueTrackingid(int issuetrackingid)
		throws SystemException {
		return findByIssueTrackingid(issuetrackingid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue categories where issuetrackingid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issuetrackingid the issuetrackingid
	 * @param start the lower bound of the range of issue categories
	 * @param end the upper bound of the range of issue categories (not inclusive)
	 * @return the range of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByIssueTrackingid(int issuetrackingid,
		int start, int end) throws SystemException {
		return findByIssueTrackingid(issuetrackingid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue categories where issuetrackingid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issuetrackingid the issuetrackingid
	 * @param start the lower bound of the range of issue categories
	 * @param end the upper bound of the range of issue categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByIssueTrackingid(int issuetrackingid,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUETRACKINGID;
			finderArgs = new Object[] { issuetrackingid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUETRACKINGID;
			finderArgs = new Object[] {
					issuetrackingid,
					
					start, end, orderByComparator
				};
		}

		List<IssueCategory> list = (List<IssueCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueCategory issueCategory : list) {
				if ((issuetrackingid != issueCategory.getIssuetrackingid())) {
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

			query.append(_SQL_SELECT_ISSUECATEGORY_WHERE);

			query.append(_FINDER_COLUMN_ISSUETRACKINGID_ISSUETRACKINGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(issuetrackingid);

				if (!pagination) {
					list = (List<IssueCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueCategory>(list);
				}
				else {
					list = (List<IssueCategory>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first issue category in the ordered set where issuetrackingid = &#63;.
	 *
	 * @param issuetrackingid the issuetrackingid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory findByIssueTrackingid_First(int issuetrackingid,
		OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = fetchByIssueTrackingid_First(issuetrackingid,
				orderByComparator);

		if (issueCategory != null) {
			return issueCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issuetrackingid=");
		msg.append(issuetrackingid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueCategoryException(msg.toString());
	}

	/**
	 * Returns the first issue category in the ordered set where issuetrackingid = &#63;.
	 *
	 * @param issuetrackingid the issuetrackingid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue category, or <code>null</code> if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory fetchByIssueTrackingid_First(int issuetrackingid,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueCategory> list = findByIssueTrackingid(issuetrackingid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue category in the ordered set where issuetrackingid = &#63;.
	 *
	 * @param issuetrackingid the issuetrackingid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory findByIssueTrackingid_Last(int issuetrackingid,
		OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = fetchByIssueTrackingid_Last(issuetrackingid,
				orderByComparator);

		if (issueCategory != null) {
			return issueCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issuetrackingid=");
		msg.append(issuetrackingid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueCategoryException(msg.toString());
	}

	/**
	 * Returns the last issue category in the ordered set where issuetrackingid = &#63;.
	 *
	 * @param issuetrackingid the issuetrackingid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue category, or <code>null</code> if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory fetchByIssueTrackingid_Last(int issuetrackingid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByIssueTrackingid(issuetrackingid);

		if (count == 0) {
			return null;
		}

		List<IssueCategory> list = findByIssueTrackingid(issuetrackingid,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue categories before and after the current issue category in the ordered set where issuetrackingid = &#63;.
	 *
	 * @param id the primary key of the current issue category
	 * @param issuetrackingid the issuetrackingid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory[] findByIssueTrackingid_PrevAndNext(long id,
		int issuetrackingid, OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueCategory[] array = new IssueCategoryImpl[3];

			array[0] = getByIssueTrackingid_PrevAndNext(session, issueCategory,
					issuetrackingid, orderByComparator, true);

			array[1] = issueCategory;

			array[2] = getByIssueTrackingid_PrevAndNext(session, issueCategory,
					issuetrackingid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IssueCategory getByIssueTrackingid_PrevAndNext(Session session,
		IssueCategory issueCategory, int issuetrackingid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUECATEGORY_WHERE);

		query.append(_FINDER_COLUMN_ISSUETRACKINGID_ISSUETRACKINGID_2);

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
			query.append(IssueCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(issuetrackingid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue categories where issuetrackingid = &#63; from the database.
	 *
	 * @param issuetrackingid the issuetrackingid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByIssueTrackingid(int issuetrackingid)
		throws SystemException {
		for (IssueCategory issueCategory : findByIssueTrackingid(
				issuetrackingid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(issueCategory);
		}
	}

	/**
	 * Returns the number of issue categories where issuetrackingid = &#63;.
	 *
	 * @param issuetrackingid the issuetrackingid
	 * @return the number of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByIssueTrackingid(int issuetrackingid)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUETRACKINGID;

		Object[] finderArgs = new Object[] { issuetrackingid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUECATEGORY_WHERE);

			query.append(_FINDER_COLUMN_ISSUETRACKINGID_ISSUETRACKINGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(issuetrackingid);

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

	private static final String _FINDER_COLUMN_ISSUETRACKINGID_ISSUETRACKINGID_2 =
		"issueCategory.issuetrackingid = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEFECTCATEGORYCODE =
		new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED,
			IssueCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDefectCategoryCode",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTCATEGORYCODE =
		new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED,
			IssueCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDefectCategoryCode",
			new String[] { String.class.getName(), Integer.class.getName() },
			IssueCategoryModelImpl.DEFECTCATEGORYCODE_COLUMN_BITMASK |
			IssueCategoryModelImpl.DEFECTDATAGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEFECTCATEGORYCODE = new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDefectCategoryCode",
			new String[] { String.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @return the matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByDefectCategoryCode(
		String defectcategorycode, int defectdatagroupid)
		throws SystemException {
		return findByDefectCategoryCode(defectcategorycode, defectdatagroupid,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param start the lower bound of the range of issue categories
	 * @param end the upper bound of the range of issue categories (not inclusive)
	 * @return the range of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByDefectCategoryCode(
		String defectcategorycode, int defectdatagroupid, int start, int end)
		throws SystemException {
		return findByDefectCategoryCode(defectcategorycode, defectdatagroupid,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param start the lower bound of the range of issue categories
	 * @param end the upper bound of the range of issue categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByDefectCategoryCode(
		String defectcategorycode, int defectdatagroupid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTCATEGORYCODE;
			finderArgs = new Object[] { defectcategorycode, defectdatagroupid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEFECTCATEGORYCODE;
			finderArgs = new Object[] {
					defectcategorycode, defectdatagroupid,
					
					start, end, orderByComparator
				};
		}

		List<IssueCategory> list = (List<IssueCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueCategory issueCategory : list) {
				if (!Validator.equals(defectcategorycode,
							issueCategory.getDefectcategorycode()) ||
						(defectdatagroupid != issueCategory.getDefectdatagroupid())) {
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

			query.append(_SQL_SELECT_ISSUECATEGORY_WHERE);

			boolean bindDefectcategorycode = false;

			if (defectcategorycode == null) {
				query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_1);
			}
			else if (defectcategorycode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_3);
			}
			else {
				bindDefectcategorycode = true;

				query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_2);
			}

			query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTDATAGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDefectcategorycode) {
					qPos.add(defectcategorycode);
				}

				qPos.add(defectdatagroupid);

				if (!pagination) {
					list = (List<IssueCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueCategory>(list);
				}
				else {
					list = (List<IssueCategory>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory findByDefectCategoryCode_First(
		String defectcategorycode, int defectdatagroupid,
		OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = fetchByDefectCategoryCode_First(defectcategorycode,
				defectdatagroupid, orderByComparator);

		if (issueCategory != null) {
			return issueCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("defectcategorycode=");
		msg.append(defectcategorycode);

		msg.append(", defectdatagroupid=");
		msg.append(defectdatagroupid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueCategoryException(msg.toString());
	}

	/**
	 * Returns the first issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue category, or <code>null</code> if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory fetchByDefectCategoryCode_First(
		String defectcategorycode, int defectdatagroupid,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueCategory> list = findByDefectCategoryCode(defectcategorycode,
				defectdatagroupid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory findByDefectCategoryCode_Last(
		String defectcategorycode, int defectdatagroupid,
		OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = fetchByDefectCategoryCode_Last(defectcategorycode,
				defectdatagroupid, orderByComparator);

		if (issueCategory != null) {
			return issueCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("defectcategorycode=");
		msg.append(defectcategorycode);

		msg.append(", defectdatagroupid=");
		msg.append(defectdatagroupid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueCategoryException(msg.toString());
	}

	/**
	 * Returns the last issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue category, or <code>null</code> if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory fetchByDefectCategoryCode_Last(
		String defectcategorycode, int defectdatagroupid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDefectCategoryCode(defectcategorycode,
				defectdatagroupid);

		if (count == 0) {
			return null;
		}

		List<IssueCategory> list = findByDefectCategoryCode(defectcategorycode,
				defectdatagroupid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue categories before and after the current issue category in the ordered set where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param id the primary key of the current issue category
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory[] findByDefectCategoryCode_PrevAndNext(long id,
		String defectcategorycode, int defectdatagroupid,
		OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueCategory[] array = new IssueCategoryImpl[3];

			array[0] = getByDefectCategoryCode_PrevAndNext(session,
					issueCategory, defectcategorycode, defectdatagroupid,
					orderByComparator, true);

			array[1] = issueCategory;

			array[2] = getByDefectCategoryCode_PrevAndNext(session,
					issueCategory, defectcategorycode, defectdatagroupid,
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

	protected IssueCategory getByDefectCategoryCode_PrevAndNext(
		Session session, IssueCategory issueCategory,
		String defectcategorycode, int defectdatagroupid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUECATEGORY_WHERE);

		boolean bindDefectcategorycode = false;

		if (defectcategorycode == null) {
			query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_1);
		}
		else if (defectcategorycode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_3);
		}
		else {
			bindDefectcategorycode = true;

			query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_2);
		}

		query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTDATAGROUPID_2);

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
			query.append(IssueCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDefectcategorycode) {
			qPos.add(defectcategorycode);
		}

		qPos.add(defectdatagroupid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63; from the database.
	 *
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDefectCategoryCode(String defectcategorycode,
		int defectdatagroupid) throws SystemException {
		for (IssueCategory issueCategory : findByDefectCategoryCode(
				defectcategorycode, defectdatagroupid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(issueCategory);
		}
	}

	/**
	 * Returns the number of issue categories where defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @return the number of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDefectCategoryCode(String defectcategorycode,
		int defectdatagroupid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEFECTCATEGORYCODE;

		Object[] finderArgs = new Object[] { defectcategorycode, defectdatagroupid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ISSUECATEGORY_WHERE);

			boolean bindDefectcategorycode = false;

			if (defectcategorycode == null) {
				query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_1);
			}
			else if (defectcategorycode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_3);
			}
			else {
				bindDefectcategorycode = true;

				query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_2);
			}

			query.append(_FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTDATAGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDefectcategorycode) {
					qPos.add(defectcategorycode);
				}

				qPos.add(defectdatagroupid);

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

	private static final String _FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_1 =
		"issueCategory.defectcategorycode IS NULL AND ";
	private static final String _FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_2 =
		"issueCategory.defectcategorycode = ? AND ";
	private static final String _FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTCATEGORYCODE_3 =
		"(issueCategory.defectcategorycode IS NULL OR issueCategory.defectcategorycode = '') AND ";
	private static final String _FINDER_COLUMN_DEFECTCATEGORYCODE_DEFECTDATAGROUPID_2 =
		"issueCategory.defectdatagroupid = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEFECTDETECTIONANDCATEGORYCODE =
		new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED,
			IssueCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDefectDetectionAndCategoryCode",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTDETECTIONANDCATEGORYCODE =
		new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED,
			IssueCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDefectDetectionAndCategoryCode",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			IssueCategoryModelImpl.DEFECTDETECTION_COLUMN_BITMASK |
			IssueCategoryModelImpl.DEFECTCATEGORYCODE_COLUMN_BITMASK |
			IssueCategoryModelImpl.DEFECTDATAGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEFECTDETECTIONANDCATEGORYCODE =
		new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDefectDetectionAndCategoryCode",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectdetection the defectdetection
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @return the matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByDefectDetectionAndCategoryCode(
		int defectdetection, String defectcategorycode, int defectdatagroupid)
		throws SystemException {
		return findByDefectDetectionAndCategoryCode(defectdetection,
			defectcategorycode, defectdatagroupid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param defectdetection the defectdetection
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param start the lower bound of the range of issue categories
	 * @param end the upper bound of the range of issue categories (not inclusive)
	 * @return the range of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByDefectDetectionAndCategoryCode(
		int defectdetection, String defectcategorycode, int defectdatagroupid,
		int start, int end) throws SystemException {
		return findByDefectDetectionAndCategoryCode(defectdetection,
			defectcategorycode, defectdatagroupid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param defectdetection the defectdetection
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param start the lower bound of the range of issue categories
	 * @param end the upper bound of the range of issue categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByDefectDetectionAndCategoryCode(
		int defectdetection, String defectcategorycode, int defectdatagroupid,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTDETECTIONANDCATEGORYCODE;
			finderArgs = new Object[] {
					defectdetection, defectcategorycode, defectdatagroupid
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEFECTDETECTIONANDCATEGORYCODE;
			finderArgs = new Object[] {
					defectdetection, defectcategorycode, defectdatagroupid,
					
					start, end, orderByComparator
				};
		}

		List<IssueCategory> list = (List<IssueCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueCategory issueCategory : list) {
				if ((defectdetection != issueCategory.getDefectdetection()) ||
						!Validator.equals(defectcategorycode,
							issueCategory.getDefectcategorycode()) ||
						(defectdatagroupid != issueCategory.getDefectdatagroupid())) {
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

			query.append(_SQL_SELECT_ISSUECATEGORY_WHERE);

			query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTDETECTION_2);

			boolean bindDefectcategorycode = false;

			if (defectcategorycode == null) {
				query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_1);
			}
			else if (defectcategorycode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_3);
			}
			else {
				bindDefectcategorycode = true;

				query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_2);
			}

			query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTDATAGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(defectdetection);

				if (bindDefectcategorycode) {
					qPos.add(defectcategorycode);
				}

				qPos.add(defectdatagroupid);

				if (!pagination) {
					list = (List<IssueCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueCategory>(list);
				}
				else {
					list = (List<IssueCategory>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first issue category in the ordered set where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectdetection the defectdetection
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory findByDefectDetectionAndCategoryCode_First(
		int defectdetection, String defectcategorycode, int defectdatagroupid,
		OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = fetchByDefectDetectionAndCategoryCode_First(defectdetection,
				defectcategorycode, defectdatagroupid, orderByComparator);

		if (issueCategory != null) {
			return issueCategory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("defectdetection=");
		msg.append(defectdetection);

		msg.append(", defectcategorycode=");
		msg.append(defectcategorycode);

		msg.append(", defectdatagroupid=");
		msg.append(defectdatagroupid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueCategoryException(msg.toString());
	}

	/**
	 * Returns the first issue category in the ordered set where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectdetection the defectdetection
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue category, or <code>null</code> if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory fetchByDefectDetectionAndCategoryCode_First(
		int defectdetection, String defectcategorycode, int defectdatagroupid,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueCategory> list = findByDefectDetectionAndCategoryCode(defectdetection,
				defectcategorycode, defectdatagroupid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue category in the ordered set where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectdetection the defectdetection
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory findByDefectDetectionAndCategoryCode_Last(
		int defectdetection, String defectcategorycode, int defectdatagroupid,
		OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = fetchByDefectDetectionAndCategoryCode_Last(defectdetection,
				defectcategorycode, defectdatagroupid, orderByComparator);

		if (issueCategory != null) {
			return issueCategory;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("defectdetection=");
		msg.append(defectdetection);

		msg.append(", defectcategorycode=");
		msg.append(defectcategorycode);

		msg.append(", defectdatagroupid=");
		msg.append(defectdatagroupid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueCategoryException(msg.toString());
	}

	/**
	 * Returns the last issue category in the ordered set where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectdetection the defectdetection
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue category, or <code>null</code> if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory fetchByDefectDetectionAndCategoryCode_Last(
		int defectdetection, String defectcategorycode, int defectdatagroupid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDefectDetectionAndCategoryCode(defectdetection,
				defectcategorycode, defectdatagroupid);

		if (count == 0) {
			return null;
		}

		List<IssueCategory> list = findByDefectDetectionAndCategoryCode(defectdetection,
				defectcategorycode, defectdatagroupid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue categories before and after the current issue category in the ordered set where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param id the primary key of the current issue category
	 * @param defectdetection the defectdetection
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory[] findByDefectDetectionAndCategoryCode_PrevAndNext(
		long id, int defectdetection, String defectcategorycode,
		int defectdatagroupid, OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueCategory[] array = new IssueCategoryImpl[3];

			array[0] = getByDefectDetectionAndCategoryCode_PrevAndNext(session,
					issueCategory, defectdetection, defectcategorycode,
					defectdatagroupid, orderByComparator, true);

			array[1] = issueCategory;

			array[2] = getByDefectDetectionAndCategoryCode_PrevAndNext(session,
					issueCategory, defectdetection, defectcategorycode,
					defectdatagroupid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IssueCategory getByDefectDetectionAndCategoryCode_PrevAndNext(
		Session session, IssueCategory issueCategory, int defectdetection,
		String defectcategorycode, int defectdatagroupid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUECATEGORY_WHERE);

		query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTDETECTION_2);

		boolean bindDefectcategorycode = false;

		if (defectcategorycode == null) {
			query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_1);
		}
		else if (defectcategorycode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_3);
		}
		else {
			bindDefectcategorycode = true;

			query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_2);
		}

		query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTDATAGROUPID_2);

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
			query.append(IssueCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(defectdetection);

		if (bindDefectcategorycode) {
			qPos.add(defectcategorycode);
		}

		qPos.add(defectdatagroupid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63; from the database.
	 *
	 * @param defectdetection the defectdetection
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDefectDetectionAndCategoryCode(int defectdetection,
		String defectcategorycode, int defectdatagroupid)
		throws SystemException {
		for (IssueCategory issueCategory : findByDefectDetectionAndCategoryCode(
				defectdetection, defectcategorycode, defectdatagroupid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(issueCategory);
		}
	}

	/**
	 * Returns the number of issue categories where defectdetection = &#63; and defectcategorycode = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectdetection the defectdetection
	 * @param defectcategorycode the defectcategorycode
	 * @param defectdatagroupid the defectdatagroupid
	 * @return the number of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDefectDetectionAndCategoryCode(int defectdetection,
		String defectcategorycode, int defectdatagroupid)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEFECTDETECTIONANDCATEGORYCODE;

		Object[] finderArgs = new Object[] {
				defectdetection, defectcategorycode, defectdatagroupid
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ISSUECATEGORY_WHERE);

			query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTDETECTION_2);

			boolean bindDefectcategorycode = false;

			if (defectcategorycode == null) {
				query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_1);
			}
			else if (defectcategorycode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_3);
			}
			else {
				bindDefectcategorycode = true;

				query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_2);
			}

			query.append(_FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTDATAGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(defectdetection);

				if (bindDefectcategorycode) {
					qPos.add(defectcategorycode);
				}

				qPos.add(defectdatagroupid);

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

	private static final String _FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTDETECTION_2 =
		"issueCategory.defectdetection = ? AND ";
	private static final String _FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_1 =
		"issueCategory.defectcategorycode IS NULL AND ";
	private static final String _FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_2 =
		"issueCategory.defectcategorycode = ? AND ";
	private static final String _FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTCATEGORYCODE_3 =
		"(issueCategory.defectcategorycode IS NULL OR issueCategory.defectcategorycode = '') AND ";
	private static final String _FINDER_COLUMN_DEFECTDETECTIONANDCATEGORYCODE_DEFECTDATAGROUPID_2 =
		"issueCategory.defectdatagroupid = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEFECTCATEGORYSHORTNAME =
		new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED,
			IssueCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDefectCategoryShortname",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTCATEGORYSHORTNAME =
		new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED,
			IssueCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDefectCategoryShortname",
			new String[] { String.class.getName(), Integer.class.getName() },
			IssueCategoryModelImpl.DEFECTCATEGORYSHORTNAME_COLUMN_BITMASK |
			IssueCategoryModelImpl.DEFECTDATAGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEFECTCATEGORYSHORTNAME = new FinderPath(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDefectCategoryShortname",
			new String[] { String.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategoryshortname the defectcategoryshortname
	 * @param defectdatagroupid the defectdatagroupid
	 * @return the matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByDefectCategoryShortname(
		String defectcategoryshortname, int defectdatagroupid)
		throws SystemException {
		return findByDefectCategoryShortname(defectcategoryshortname,
			defectdatagroupid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param defectcategoryshortname the defectcategoryshortname
	 * @param defectdatagroupid the defectdatagroupid
	 * @param start the lower bound of the range of issue categories
	 * @param end the upper bound of the range of issue categories (not inclusive)
	 * @return the range of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByDefectCategoryShortname(
		String defectcategoryshortname, int defectdatagroupid, int start,
		int end) throws SystemException {
		return findByDefectCategoryShortname(defectcategoryshortname,
			defectdatagroupid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param defectcategoryshortname the defectcategoryshortname
	 * @param defectdatagroupid the defectdatagroupid
	 * @param start the lower bound of the range of issue categories
	 * @param end the upper bound of the range of issue categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findByDefectCategoryShortname(
		String defectcategoryshortname, int defectdatagroupid, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTCATEGORYSHORTNAME;
			finderArgs = new Object[] { defectcategoryshortname, defectdatagroupid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEFECTCATEGORYSHORTNAME;
			finderArgs = new Object[] {
					defectcategoryshortname, defectdatagroupid,
					
					start, end, orderByComparator
				};
		}

		List<IssueCategory> list = (List<IssueCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueCategory issueCategory : list) {
				if (!Validator.equals(defectcategoryshortname,
							issueCategory.getDefectcategoryshortname()) ||
						(defectdatagroupid != issueCategory.getDefectdatagroupid())) {
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

			query.append(_SQL_SELECT_ISSUECATEGORY_WHERE);

			boolean bindDefectcategoryshortname = false;

			if (defectcategoryshortname == null) {
				query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_1);
			}
			else if (defectcategoryshortname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_3);
			}
			else {
				bindDefectcategoryshortname = true;

				query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_2);
			}

			query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTDATAGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDefectcategoryshortname) {
					qPos.add(defectcategoryshortname);
				}

				qPos.add(defectdatagroupid);

				if (!pagination) {
					list = (List<IssueCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueCategory>(list);
				}
				else {
					list = (List<IssueCategory>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Returns the first issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategoryshortname the defectcategoryshortname
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory findByDefectCategoryShortname_First(
		String defectcategoryshortname, int defectdatagroupid,
		OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = fetchByDefectCategoryShortname_First(defectcategoryshortname,
				defectdatagroupid, orderByComparator);

		if (issueCategory != null) {
			return issueCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("defectcategoryshortname=");
		msg.append(defectcategoryshortname);

		msg.append(", defectdatagroupid=");
		msg.append(defectdatagroupid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueCategoryException(msg.toString());
	}

	/**
	 * Returns the first issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategoryshortname the defectcategoryshortname
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue category, or <code>null</code> if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory fetchByDefectCategoryShortname_First(
		String defectcategoryshortname, int defectdatagroupid,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueCategory> list = findByDefectCategoryShortname(defectcategoryshortname,
				defectdatagroupid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategoryshortname the defectcategoryshortname
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory findByDefectCategoryShortname_Last(
		String defectcategoryshortname, int defectdatagroupid,
		OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = fetchByDefectCategoryShortname_Last(defectcategoryshortname,
				defectdatagroupid, orderByComparator);

		if (issueCategory != null) {
			return issueCategory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("defectcategoryshortname=");
		msg.append(defectcategoryshortname);

		msg.append(", defectdatagroupid=");
		msg.append(defectdatagroupid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueCategoryException(msg.toString());
	}

	/**
	 * Returns the last issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategoryshortname the defectcategoryshortname
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue category, or <code>null</code> if a matching issue category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory fetchByDefectCategoryShortname_Last(
		String defectcategoryshortname, int defectdatagroupid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDefectCategoryShortname(defectcategoryshortname,
				defectdatagroupid);

		if (count == 0) {
			return null;
		}

		List<IssueCategory> list = findByDefectCategoryShortname(defectcategoryshortname,
				defectdatagroupid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue categories before and after the current issue category in the ordered set where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param id the primary key of the current issue category
	 * @param defectcategoryshortname the defectcategoryshortname
	 * @param defectdatagroupid the defectdatagroupid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory[] findByDefectCategoryShortname_PrevAndNext(long id,
		String defectcategoryshortname, int defectdatagroupid,
		OrderByComparator orderByComparator)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueCategory[] array = new IssueCategoryImpl[3];

			array[0] = getByDefectCategoryShortname_PrevAndNext(session,
					issueCategory, defectcategoryshortname, defectdatagroupid,
					orderByComparator, true);

			array[1] = issueCategory;

			array[2] = getByDefectCategoryShortname_PrevAndNext(session,
					issueCategory, defectcategoryshortname, defectdatagroupid,
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

	protected IssueCategory getByDefectCategoryShortname_PrevAndNext(
		Session session, IssueCategory issueCategory,
		String defectcategoryshortname, int defectdatagroupid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUECATEGORY_WHERE);

		boolean bindDefectcategoryshortname = false;

		if (defectcategoryshortname == null) {
			query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_1);
		}
		else if (defectcategoryshortname.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_3);
		}
		else {
			bindDefectcategoryshortname = true;

			query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_2);
		}

		query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTDATAGROUPID_2);

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
			query.append(IssueCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDefectcategoryshortname) {
			qPos.add(defectcategoryshortname);
		}

		qPos.add(defectdatagroupid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63; from the database.
	 *
	 * @param defectcategoryshortname the defectcategoryshortname
	 * @param defectdatagroupid the defectdatagroupid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDefectCategoryShortname(
		String defectcategoryshortname, int defectdatagroupid)
		throws SystemException {
		for (IssueCategory issueCategory : findByDefectCategoryShortname(
				defectcategoryshortname, defectdatagroupid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(issueCategory);
		}
	}

	/**
	 * Returns the number of issue categories where defectcategoryshortname = &#63; and defectdatagroupid = &#63;.
	 *
	 * @param defectcategoryshortname the defectcategoryshortname
	 * @param defectdatagroupid the defectdatagroupid
	 * @return the number of matching issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDefectCategoryShortname(String defectcategoryshortname,
		int defectdatagroupid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEFECTCATEGORYSHORTNAME;

		Object[] finderArgs = new Object[] {
				defectcategoryshortname, defectdatagroupid
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ISSUECATEGORY_WHERE);

			boolean bindDefectcategoryshortname = false;

			if (defectcategoryshortname == null) {
				query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_1);
			}
			else if (defectcategoryshortname.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_3);
			}
			else {
				bindDefectcategoryshortname = true;

				query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_2);
			}

			query.append(_FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTDATAGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDefectcategoryshortname) {
					qPos.add(defectcategoryshortname);
				}

				qPos.add(defectdatagroupid);

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

	private static final String _FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_1 =
		"issueCategory.defectcategoryshortname IS NULL AND ";
	private static final String _FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_2 =
		"issueCategory.defectcategoryshortname = ? AND ";
	private static final String _FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTCATEGORYSHORTNAME_3 =
		"(issueCategory.defectcategoryshortname IS NULL OR issueCategory.defectcategoryshortname = '') AND ";
	private static final String _FINDER_COLUMN_DEFECTCATEGORYSHORTNAME_DEFECTDATAGROUPID_2 =
		"issueCategory.defectdatagroupid = ?";

	public IssueCategoryPersistenceImpl() {
		setModelClass(IssueCategory.class);
	}

	/**
	 * Caches the issue category in the entity cache if it is enabled.
	 *
	 * @param issueCategory the issue category
	 */
	@Override
	public void cacheResult(IssueCategory issueCategory) {
		EntityCacheUtil.putResult(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryImpl.class, issueCategory.getPrimaryKey(),
			issueCategory);

		issueCategory.resetOriginalValues();
	}

	/**
	 * Caches the issue categories in the entity cache if it is enabled.
	 *
	 * @param issueCategories the issue categories
	 */
	@Override
	public void cacheResult(List<IssueCategory> issueCategories) {
		for (IssueCategory issueCategory : issueCategories) {
			if (EntityCacheUtil.getResult(
						IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
						IssueCategoryImpl.class, issueCategory.getPrimaryKey()) == null) {
				cacheResult(issueCategory);
			}
			else {
				issueCategory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all issue categories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(IssueCategoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(IssueCategoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the issue category.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IssueCategory issueCategory) {
		EntityCacheUtil.removeResult(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryImpl.class, issueCategory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<IssueCategory> issueCategories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IssueCategory issueCategory : issueCategories) {
			EntityCacheUtil.removeResult(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
				IssueCategoryImpl.class, issueCategory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new issue category with the primary key. Does not add the issue category to the database.
	 *
	 * @param id the primary key for the new issue category
	 * @return the new issue category
	 */
	@Override
	public IssueCategory create(long id) {
		IssueCategory issueCategory = new IssueCategoryImpl();

		issueCategory.setNew(true);
		issueCategory.setPrimaryKey(id);

		return issueCategory;
	}

	/**
	 * Removes the issue category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the issue category
	 * @return the issue category that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory remove(long id)
		throws NoSuchIssueCategoryException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the issue category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the issue category
	 * @return the issue category that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory remove(Serializable primaryKey)
		throws NoSuchIssueCategoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			IssueCategory issueCategory = (IssueCategory)session.get(IssueCategoryImpl.class,
					primaryKey);

			if (issueCategory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIssueCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(issueCategory);
		}
		catch (NoSuchIssueCategoryException nsee) {
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
	protected IssueCategory removeImpl(IssueCategory issueCategory)
		throws SystemException {
		issueCategory = toUnwrappedModel(issueCategory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(issueCategory)) {
				issueCategory = (IssueCategory)session.get(IssueCategoryImpl.class,
						issueCategory.getPrimaryKeyObj());
			}

			if (issueCategory != null) {
				session.delete(issueCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (issueCategory != null) {
			clearCache(issueCategory);
		}

		return issueCategory;
	}

	@Override
	public IssueCategory updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory issueCategory)
		throws SystemException {
		issueCategory = toUnwrappedModel(issueCategory);

		boolean isNew = issueCategory.isNew();

		IssueCategoryModelImpl issueCategoryModelImpl = (IssueCategoryModelImpl)issueCategory;

		Session session = null;

		try {
			session = openSession();

			if (issueCategory.isNew()) {
				session.save(issueCategory);

				issueCategory.setNew(false);
			}
			else {
				session.merge(issueCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !IssueCategoryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((issueCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUETRACKINGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueCategoryModelImpl.getOriginalIssuetrackingid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISSUETRACKINGID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUETRACKINGID,
					args);

				args = new Object[] { issueCategoryModelImpl.getIssuetrackingid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ISSUETRACKINGID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUETRACKINGID,
					args);
			}

			if ((issueCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTCATEGORYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueCategoryModelImpl.getOriginalDefectcategorycode(),
						issueCategoryModelImpl.getOriginalDefectdatagroupid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEFECTCATEGORYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTCATEGORYCODE,
					args);

				args = new Object[] {
						issueCategoryModelImpl.getDefectcategorycode(),
						issueCategoryModelImpl.getDefectdatagroupid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEFECTCATEGORYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTCATEGORYCODE,
					args);
			}

			if ((issueCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTDETECTIONANDCATEGORYCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueCategoryModelImpl.getOriginalDefectdetection(),
						issueCategoryModelImpl.getOriginalDefectcategorycode(),
						issueCategoryModelImpl.getOriginalDefectdatagroupid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEFECTDETECTIONANDCATEGORYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTDETECTIONANDCATEGORYCODE,
					args);

				args = new Object[] {
						issueCategoryModelImpl.getDefectdetection(),
						issueCategoryModelImpl.getDefectcategorycode(),
						issueCategoryModelImpl.getDefectdatagroupid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEFECTDETECTIONANDCATEGORYCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTDETECTIONANDCATEGORYCODE,
					args);
			}

			if ((issueCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTCATEGORYSHORTNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueCategoryModelImpl.getOriginalDefectcategoryshortname(),
						issueCategoryModelImpl.getOriginalDefectdatagroupid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEFECTCATEGORYSHORTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTCATEGORYSHORTNAME,
					args);

				args = new Object[] {
						issueCategoryModelImpl.getDefectcategoryshortname(),
						issueCategoryModelImpl.getDefectdatagroupid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEFECTCATEGORYSHORTNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTCATEGORYSHORTNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
			IssueCategoryImpl.class, issueCategory.getPrimaryKey(),
			issueCategory);

		return issueCategory;
	}

	protected IssueCategory toUnwrappedModel(IssueCategory issueCategory) {
		if (issueCategory instanceof IssueCategoryImpl) {
			return issueCategory;
		}

		IssueCategoryImpl issueCategoryImpl = new IssueCategoryImpl();

		issueCategoryImpl.setNew(issueCategory.isNew());
		issueCategoryImpl.setPrimaryKey(issueCategory.getPrimaryKey());

		issueCategoryImpl.setId(issueCategory.getId());
		issueCategoryImpl.setIssuetrackingid(issueCategory.getIssuetrackingid());
		issueCategoryImpl.setDefectcategorycode(issueCategory.getDefectcategorycode());
		issueCategoryImpl.setDefectcategoryshortname(issueCategory.getDefectcategoryshortname());
		issueCategoryImpl.setDefectcategoryfullname(issueCategory.getDefectcategoryfullname());
		issueCategoryImpl.setDefectdetection(issueCategory.getDefectdetection());
		issueCategoryImpl.setDefectdatagroupid(issueCategory.getDefectdatagroupid());

		return issueCategoryImpl;
	}

	/**
	 * Returns the issue category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue category
	 * @return the issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchIssueCategoryException, SystemException {
		IssueCategory issueCategory = fetchByPrimaryKey(primaryKey);

		if (issueCategory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchIssueCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return issueCategory;
	}

	/**
	 * Returns the issue category with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException} if it could not be found.
	 *
	 * @param id the primary key of the issue category
	 * @return the issue category
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueCategoryException if a issue category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory findByPrimaryKey(long id)
		throws NoSuchIssueCategoryException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the issue category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue category
	 * @return the issue category, or <code>null</code> if a issue category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		IssueCategory issueCategory = (IssueCategory)EntityCacheUtil.getResult(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
				IssueCategoryImpl.class, primaryKey);

		if (issueCategory == _nullIssueCategory) {
			return null;
		}

		if (issueCategory == null) {
			Session session = null;

			try {
				session = openSession();

				issueCategory = (IssueCategory)session.get(IssueCategoryImpl.class,
						primaryKey);

				if (issueCategory != null) {
					cacheResult(issueCategory);
				}
				else {
					EntityCacheUtil.putResult(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
						IssueCategoryImpl.class, primaryKey, _nullIssueCategory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(IssueCategoryModelImpl.ENTITY_CACHE_ENABLED,
					IssueCategoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return issueCategory;
	}

	/**
	 * Returns the issue category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the issue category
	 * @return the issue category, or <code>null</code> if a issue category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueCategory fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the issue categories.
	 *
	 * @return the issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue categories
	 * @param end the upper bound of the range of issue categories (not inclusive)
	 * @return the range of issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue categories
	 * @param end the upper bound of the range of issue categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of issue categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueCategory> findAll(int start, int end,
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

		List<IssueCategory> list = (List<IssueCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ISSUECATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISSUECATEGORY;

				if (pagination) {
					sql = sql.concat(IssueCategoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<IssueCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueCategory>(list);
				}
				else {
					list = (List<IssueCategory>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the issue categories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (IssueCategory issueCategory : findAll()) {
			remove(issueCategory);
		}
	}

	/**
	 * Returns the number of issue categories.
	 *
	 * @return the number of issue categories
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

				Query q = session.createQuery(_SQL_COUNT_ISSUECATEGORY);

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
	 * Initializes the issue category persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.IssueCategory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<IssueCategory>> listenersList = new ArrayList<ModelListener<IssueCategory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<IssueCategory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IssueCategoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ISSUECATEGORY = "SELECT issueCategory FROM IssueCategory issueCategory";
	private static final String _SQL_SELECT_ISSUECATEGORY_WHERE = "SELECT issueCategory FROM IssueCategory issueCategory WHERE ";
	private static final String _SQL_COUNT_ISSUECATEGORY = "SELECT COUNT(issueCategory) FROM IssueCategory issueCategory";
	private static final String _SQL_COUNT_ISSUECATEGORY_WHERE = "SELECT COUNT(issueCategory) FROM IssueCategory issueCategory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issueCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IssueCategory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IssueCategory exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(IssueCategoryPersistenceImpl.class);
	private static IssueCategory _nullIssueCategory = new IssueCategoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<IssueCategory> toCacheModel() {
				return _nullIssueCategoryCacheModel;
			}
		};

	private static CacheModel<IssueCategory> _nullIssueCategoryCacheModel = new CacheModel<IssueCategory>() {
			@Override
			public IssueCategory toEntityModel() {
				return _nullIssueCategory;
			}
		};
}