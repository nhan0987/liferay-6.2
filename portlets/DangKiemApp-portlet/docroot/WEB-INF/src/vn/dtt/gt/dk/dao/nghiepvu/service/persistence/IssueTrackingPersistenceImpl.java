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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException;
import vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the issue tracking service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see IssueTrackingPersistence
 * @see IssueTrackingUtil
 * @generated
 */
public class IssueTrackingPersistenceImpl extends BasePersistenceImpl<IssueTracking>
	implements IssueTrackingPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IssueTrackingUtil} to access the issue tracking persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = IssueTrackingImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODE =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByImporterCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByImporterCode", new String[] { String.class.getName() },
			IssueTrackingModelImpl.IMPORTERCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IMPORTERCODE = new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByImporterCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the issue trackings where importercode = &#63;.
	 *
	 * @param importercode the importercode
	 * @return the matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByImporterCode(String importercode)
		throws SystemException {
		return findByImporterCode(importercode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue trackings where importercode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercode the importercode
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @return the range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByImporterCode(String importercode,
		int start, int end) throws SystemException {
		return findByImporterCode(importercode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue trackings where importercode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importercode the importercode
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByImporterCode(String importercode,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE;
			finderArgs = new Object[] { importercode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERCODE;
			finderArgs = new Object[] {
					importercode,
					
					start, end, orderByComparator
				};
		}

		List<IssueTracking> list = (List<IssueTracking>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueTracking issueTracking : list) {
				if (!Validator.equals(importercode,
							issueTracking.getImportercode())) {
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

			query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

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

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueTracking>(list);
				}
				else {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first issue tracking in the ordered set where importercode = &#63;.
	 *
	 * @param importercode the importercode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByImporterCode_First(String importercode,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByImporterCode_First(importercode,
				orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importercode=");
		msg.append(importercode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the first issue tracking in the ordered set where importercode = &#63;.
	 *
	 * @param importercode the importercode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByImporterCode_First(String importercode,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueTracking> list = findByImporterCode(importercode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue tracking in the ordered set where importercode = &#63;.
	 *
	 * @param importercode the importercode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByImporterCode_Last(String importercode,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByImporterCode_Last(importercode,
				orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importercode=");
		msg.append(importercode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the last issue tracking in the ordered set where importercode = &#63;.
	 *
	 * @param importercode the importercode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByImporterCode_Last(String importercode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByImporterCode(importercode);

		if (count == 0) {
			return null;
		}

		List<IssueTracking> list = findByImporterCode(importercode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue trackings before and after the current issue tracking in the ordered set where importercode = &#63;.
	 *
	 * @param id the primary key of the current issue tracking
	 * @param importercode the importercode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking[] findByImporterCode_PrevAndNext(long id,
		String importercode, OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueTracking[] array = new IssueTrackingImpl[3];

			array[0] = getByImporterCode_PrevAndNext(session, issueTracking,
					importercode, orderByComparator, true);

			array[1] = issueTracking;

			array[2] = getByImporterCode_PrevAndNext(session, issueTracking,
					importercode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IssueTracking getByImporterCode_PrevAndNext(Session session,
		IssueTracking issueTracking, String importercode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

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
			query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindImportercode) {
			qPos.add(importercode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueTracking);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueTracking> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue trackings where importercode = &#63; from the database.
	 *
	 * @param importercode the importercode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByImporterCode(String importercode)
		throws SystemException {
		for (IssueTracking issueTracking : findByImporterCode(importercode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(issueTracking);
		}
	}

	/**
	 * Returns the number of issue trackings where importercode = &#63;.
	 *
	 * @param importercode the importercode
	 * @return the number of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByImporterCode(String importercode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IMPORTERCODE;

		Object[] finderArgs = new Object[] { importercode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUETRACKING_WHERE);

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

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportercode) {
					qPos.add(importercode);
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

	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_1 = "issueTracking.importercode IS NULL";
	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_2 = "issueTracking.importercode = ?";
	private static final String _FINDER_COLUMN_IMPORTERCODE_IMPORTERCODE_3 = "(issueTracking.importercode IS NULL OR issueTracking.importercode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTEREDNUMBER =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRegisteredNumber",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDNUMBER =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByRegisteredNumber", new String[] { String.class.getName() },
			IssueTrackingModelImpl.REGISTEREDNUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGISTEREDNUMBER = new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRegisteredNumber", new String[] { String.class.getName() });

	/**
	 * Returns all the issue trackings where registerednumber = &#63;.
	 *
	 * @param registerednumber the registerednumber
	 * @return the matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByRegisteredNumber(String registerednumber)
		throws SystemException {
		return findByRegisteredNumber(registerednumber, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue trackings where registerednumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registerednumber the registerednumber
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @return the range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByRegisteredNumber(String registerednumber,
		int start, int end) throws SystemException {
		return findByRegisteredNumber(registerednumber, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue trackings where registerednumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registerednumber the registerednumber
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByRegisteredNumber(String registerednumber,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDNUMBER;
			finderArgs = new Object[] { registerednumber };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTEREDNUMBER;
			finderArgs = new Object[] {
					registerednumber,
					
					start, end, orderByComparator
				};
		}

		List<IssueTracking> list = (List<IssueTracking>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueTracking issueTracking : list) {
				if (!Validator.equals(registerednumber,
							issueTracking.getRegisterednumber())) {
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

			query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

			boolean bindRegisterednumber = false;

			if (registerednumber == null) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_1);
			}
			else if (registerednumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisterednumber = true;

				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegisterednumber) {
					qPos.add(registerednumber);
				}

				if (!pagination) {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueTracking>(list);
				}
				else {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first issue tracking in the ordered set where registerednumber = &#63;.
	 *
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByRegisteredNumber_First(String registerednumber,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByRegisteredNumber_First(registerednumber,
				orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registerednumber=");
		msg.append(registerednumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the first issue tracking in the ordered set where registerednumber = &#63;.
	 *
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByRegisteredNumber_First(
		String registerednumber, OrderByComparator orderByComparator)
		throws SystemException {
		List<IssueTracking> list = findByRegisteredNumber(registerednumber, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue tracking in the ordered set where registerednumber = &#63;.
	 *
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByRegisteredNumber_Last(String registerednumber,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByRegisteredNumber_Last(registerednumber,
				orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registerednumber=");
		msg.append(registerednumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the last issue tracking in the ordered set where registerednumber = &#63;.
	 *
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByRegisteredNumber_Last(String registerednumber,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRegisteredNumber(registerednumber);

		if (count == 0) {
			return null;
		}

		List<IssueTracking> list = findByRegisteredNumber(registerednumber,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue trackings before and after the current issue tracking in the ordered set where registerednumber = &#63;.
	 *
	 * @param id the primary key of the current issue tracking
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking[] findByRegisteredNumber_PrevAndNext(long id,
		String registerednumber, OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueTracking[] array = new IssueTrackingImpl[3];

			array[0] = getByRegisteredNumber_PrevAndNext(session,
					issueTracking, registerednumber, orderByComparator, true);

			array[1] = issueTracking;

			array[2] = getByRegisteredNumber_PrevAndNext(session,
					issueTracking, registerednumber, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IssueTracking getByRegisteredNumber_PrevAndNext(Session session,
		IssueTracking issueTracking, String registerednumber,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

		boolean bindRegisterednumber = false;

		if (registerednumber == null) {
			query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_1);
		}
		else if (registerednumber.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_3);
		}
		else {
			bindRegisterednumber = true;

			query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_2);
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
			query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindRegisterednumber) {
			qPos.add(registerednumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueTracking);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueTracking> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue trackings where registerednumber = &#63; from the database.
	 *
	 * @param registerednumber the registerednumber
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRegisteredNumber(String registerednumber)
		throws SystemException {
		for (IssueTracking issueTracking : findByRegisteredNumber(
				registerednumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(issueTracking);
		}
	}

	/**
	 * Returns the number of issue trackings where registerednumber = &#63;.
	 *
	 * @param registerednumber the registerednumber
	 * @return the number of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRegisteredNumber(String registerednumber)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGISTEREDNUMBER;

		Object[] finderArgs = new Object[] { registerednumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUETRACKING_WHERE);

			boolean bindRegisterednumber = false;

			if (registerednumber == null) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_1);
			}
			else if (registerednumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisterednumber = true;

				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegisterednumber) {
					qPos.add(registerednumber);
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

	private static final String _FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_1 =
		"issueTracking.registerednumber IS NULL";
	private static final String _FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_2 =
		"issueTracking.registerednumber = ?";
	private static final String _FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_3 =
		"(issueTracking.registerednumber IS NULL OR issueTracking.registerednumber = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDNO =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByInspectionRecordno",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDNO =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByInspectionRecordno",
			new String[] { String.class.getName(), String.class.getName() },
			IssueTrackingModelImpl.INSPECTIONRECORDNO_COLUMN_BITMASK |
			IssueTrackingModelImpl.REGISTEREDNUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO = new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByInspectionRecordno",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the issue trackings where inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @return the matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByInspectionRecordno(
		String inspectionrecordno, String registerednumber)
		throws SystemException {
		return findByInspectionRecordno(inspectionrecordno, registerednumber,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue trackings where inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @return the range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByInspectionRecordno(
		String inspectionrecordno, String registerednumber, int start, int end)
		throws SystemException {
		return findByInspectionRecordno(inspectionrecordno, registerednumber,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue trackings where inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByInspectionRecordno(
		String inspectionrecordno, String registerednumber, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDNO;
			finderArgs = new Object[] { inspectionrecordno, registerednumber };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTIONRECORDNO;
			finderArgs = new Object[] {
					inspectionrecordno, registerednumber,
					
					start, end, orderByComparator
				};
		}

		List<IssueTracking> list = (List<IssueTracking>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueTracking issueTracking : list) {
				if (!Validator.equals(inspectionrecordno,
							issueTracking.getInspectionrecordno()) ||
						!Validator.equals(registerednumber,
							issueTracking.getRegisterednumber())) {
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

			query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

			boolean bindInspectionrecordno = false;

			if (inspectionrecordno == null) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_1);
			}
			else if (inspectionrecordno.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_3);
			}
			else {
				bindInspectionrecordno = true;

				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_2);
			}

			boolean bindRegisterednumber = false;

			if (registerednumber == null) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_1);
			}
			else if (registerednumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisterednumber = true;

				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectionrecordno) {
					qPos.add(inspectionrecordno);
				}

				if (bindRegisterednumber) {
					qPos.add(registerednumber);
				}

				if (!pagination) {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueTracking>(list);
				}
				else {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first issue tracking in the ordered set where inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByInspectionRecordno_First(
		String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByInspectionRecordno_First(inspectionrecordno,
				registerednumber, orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionrecordno=");
		msg.append(inspectionrecordno);

		msg.append(", registerednumber=");
		msg.append(registerednumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the first issue tracking in the ordered set where inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByInspectionRecordno_First(
		String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueTracking> list = findByInspectionRecordno(inspectionrecordno,
				registerednumber, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue tracking in the ordered set where inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByInspectionRecordno_Last(
		String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByInspectionRecordno_Last(inspectionrecordno,
				registerednumber, orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectionrecordno=");
		msg.append(inspectionrecordno);

		msg.append(", registerednumber=");
		msg.append(registerednumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the last issue tracking in the ordered set where inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByInspectionRecordno_Last(
		String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByInspectionRecordno(inspectionrecordno,
				registerednumber);

		if (count == 0) {
			return null;
		}

		List<IssueTracking> list = findByInspectionRecordno(inspectionrecordno,
				registerednumber, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue trackings before and after the current issue tracking in the ordered set where inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param id the primary key of the current issue tracking
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking[] findByInspectionRecordno_PrevAndNext(long id,
		String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueTracking[] array = new IssueTrackingImpl[3];

			array[0] = getByInspectionRecordno_PrevAndNext(session,
					issueTracking, inspectionrecordno, registerednumber,
					orderByComparator, true);

			array[1] = issueTracking;

			array[2] = getByInspectionRecordno_PrevAndNext(session,
					issueTracking, inspectionrecordno, registerednumber,
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

	protected IssueTracking getByInspectionRecordno_PrevAndNext(
		Session session, IssueTracking issueTracking,
		String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

		boolean bindInspectionrecordno = false;

		if (inspectionrecordno == null) {
			query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_1);
		}
		else if (inspectionrecordno.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_3);
		}
		else {
			bindInspectionrecordno = true;

			query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_2);
		}

		boolean bindRegisterednumber = false;

		if (registerednumber == null) {
			query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_1);
		}
		else if (registerednumber.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_3);
		}
		else {
			bindRegisterednumber = true;

			query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_2);
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
			query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindInspectionrecordno) {
			qPos.add(inspectionrecordno);
		}

		if (bindRegisterednumber) {
			qPos.add(registerednumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueTracking);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueTracking> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue trackings where inspectionrecordno = &#63; and registerednumber = &#63; from the database.
	 *
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectionRecordno(String inspectionrecordno,
		String registerednumber) throws SystemException {
		for (IssueTracking issueTracking : findByInspectionRecordno(
				inspectionrecordno, registerednumber, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(issueTracking);
		}
	}

	/**
	 * Returns the number of issue trackings where inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @return the number of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectionRecordno(String inspectionrecordno,
		String registerednumber) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO;

		Object[] finderArgs = new Object[] { inspectionrecordno, registerednumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ISSUETRACKING_WHERE);

			boolean bindInspectionrecordno = false;

			if (inspectionrecordno == null) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_1);
			}
			else if (inspectionrecordno.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_3);
			}
			else {
				bindInspectionrecordno = true;

				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_2);
			}

			boolean bindRegisterednumber = false;

			if (registerednumber == null) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_1);
			}
			else if (registerednumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisterednumber = true;

				query.append(_FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindInspectionrecordno) {
					qPos.add(inspectionrecordno);
				}

				if (bindRegisterednumber) {
					qPos.add(registerednumber);
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

	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_1 =
		"issueTracking.inspectionrecordno IS NULL AND ";
	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_2 =
		"issueTracking.inspectionrecordno = ? AND ";
	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_INSPECTIONRECORDNO_3 =
		"(issueTracking.inspectionrecordno IS NULL OR issueTracking.inspectionrecordno = '') AND ";
	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_1 =
		"issueTracking.registerednumber IS NULL";
	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_2 =
		"issueTracking.registerednumber = ?";
	private static final String _FINDER_COLUMN_INSPECTIONRECORDNO_REGISTEREDNUMBER_3 =
		"(issueTracking.registerednumber IS NULL OR issueTracking.registerednumber = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERNAME =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByImporterName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByImporterName", new String[] { String.class.getName() },
			IssueTrackingModelImpl.IMPORTERNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IMPORTERNAME = new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByImporterName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the issue trackings where importername = &#63;.
	 *
	 * @param importername the importername
	 * @return the matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByImporterName(String importername)
		throws SystemException {
		return findByImporterName(importername, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue trackings where importername = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @return the range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByImporterName(String importername,
		int start, int end) throws SystemException {
		return findByImporterName(importername, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue trackings where importername = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByImporterName(String importername,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME;
			finderArgs = new Object[] { importername };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERNAME;
			finderArgs = new Object[] {
					importername,
					
					start, end, orderByComparator
				};
		}

		List<IssueTracking> list = (List<IssueTracking>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueTracking issueTracking : list) {
				if (!Validator.equals(importername,
							issueTracking.getImportername())) {
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

			query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

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

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueTracking>(list);
				}
				else {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first issue tracking in the ordered set where importername = &#63;.
	 *
	 * @param importername the importername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByImporterName_First(String importername,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByImporterName_First(importername,
				orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importername=");
		msg.append(importername);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the first issue tracking in the ordered set where importername = &#63;.
	 *
	 * @param importername the importername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByImporterName_First(String importername,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueTracking> list = findByImporterName(importername, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue tracking in the ordered set where importername = &#63;.
	 *
	 * @param importername the importername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByImporterName_Last(String importername,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByImporterName_Last(importername,
				orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importername=");
		msg.append(importername);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the last issue tracking in the ordered set where importername = &#63;.
	 *
	 * @param importername the importername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByImporterName_Last(String importername,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByImporterName(importername);

		if (count == 0) {
			return null;
		}

		List<IssueTracking> list = findByImporterName(importername, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue trackings before and after the current issue tracking in the ordered set where importername = &#63;.
	 *
	 * @param id the primary key of the current issue tracking
	 * @param importername the importername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking[] findByImporterName_PrevAndNext(long id,
		String importername, OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueTracking[] array = new IssueTrackingImpl[3];

			array[0] = getByImporterName_PrevAndNext(session, issueTracking,
					importername, orderByComparator, true);

			array[1] = issueTracking;

			array[2] = getByImporterName_PrevAndNext(session, issueTracking,
					importername, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IssueTracking getByImporterName_PrevAndNext(Session session,
		IssueTracking issueTracking, String importername,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

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
			query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindImportername) {
			qPos.add(importername);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueTracking);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueTracking> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue trackings where importername = &#63; from the database.
	 *
	 * @param importername the importername
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByImporterName(String importername)
		throws SystemException {
		for (IssueTracking issueTracking : findByImporterName(importername,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(issueTracking);
		}
	}

	/**
	 * Returns the number of issue trackings where importername = &#63;.
	 *
	 * @param importername the importername
	 * @return the number of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByImporterName(String importername)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IMPORTERNAME;

		Object[] finderArgs = new Object[] { importername };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUETRACKING_WHERE);

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

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindImportername) {
					qPos.add(importername);
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

	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_1 = "issueTracking.importername IS NULL";
	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_2 = "issueTracking.importername = ?";
	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_3 = "(issueTracking.importername IS NULL OR issueTracking.importername = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTCODE =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByProductCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByProductCode", new String[] { String.class.getName() },
			IssueTrackingModelImpl.PRODUCTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRODUCTCODE = new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByProductCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the issue trackings where productcode = &#63;.
	 *
	 * @param productcode the productcode
	 * @return the matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByProductCode(String productcode)
		throws SystemException {
		return findByProductCode(productcode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue trackings where productcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productcode the productcode
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @return the range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByProductCode(String productcode, int start,
		int end) throws SystemException {
		return findByProductCode(productcode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue trackings where productcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param productcode the productcode
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByProductCode(String productcode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE;
			finderArgs = new Object[] { productcode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRODUCTCODE;
			finderArgs = new Object[] { productcode, start, end, orderByComparator };
		}

		List<IssueTracking> list = (List<IssueTracking>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueTracking issueTracking : list) {
				if (!Validator.equals(productcode,
							issueTracking.getProductcode())) {
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

			query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

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

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueTracking>(list);
				}
				else {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first issue tracking in the ordered set where productcode = &#63;.
	 *
	 * @param productcode the productcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByProductCode_First(String productcode,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByProductCode_First(productcode,
				orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productcode=");
		msg.append(productcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the first issue tracking in the ordered set where productcode = &#63;.
	 *
	 * @param productcode the productcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByProductCode_First(String productcode,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueTracking> list = findByProductCode(productcode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue tracking in the ordered set where productcode = &#63;.
	 *
	 * @param productcode the productcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByProductCode_Last(String productcode,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByProductCode_Last(productcode,
				orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("productcode=");
		msg.append(productcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the last issue tracking in the ordered set where productcode = &#63;.
	 *
	 * @param productcode the productcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByProductCode_Last(String productcode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByProductCode(productcode);

		if (count == 0) {
			return null;
		}

		List<IssueTracking> list = findByProductCode(productcode, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue trackings before and after the current issue tracking in the ordered set where productcode = &#63;.
	 *
	 * @param id the primary key of the current issue tracking
	 * @param productcode the productcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking[] findByProductCode_PrevAndNext(long id,
		String productcode, OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueTracking[] array = new IssueTrackingImpl[3];

			array[0] = getByProductCode_PrevAndNext(session, issueTracking,
					productcode, orderByComparator, true);

			array[1] = issueTracking;

			array[2] = getByProductCode_PrevAndNext(session, issueTracking,
					productcode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected IssueTracking getByProductCode_PrevAndNext(Session session,
		IssueTracking issueTracking, String productcode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

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
			query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindProductcode) {
			qPos.add(productcode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueTracking);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueTracking> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue trackings where productcode = &#63; from the database.
	 *
	 * @param productcode the productcode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByProductCode(String productcode)
		throws SystemException {
		for (IssueTracking issueTracking : findByProductCode(productcode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(issueTracking);
		}
	}

	/**
	 * Returns the number of issue trackings where productcode = &#63;.
	 *
	 * @param productcode the productcode
	 * @return the number of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByProductCode(String productcode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRODUCTCODE;

		Object[] finderArgs = new Object[] { productcode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ISSUETRACKING_WHERE);

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

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindProductcode) {
					qPos.add(productcode);
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

	private static final String _FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_1 = "issueTracking.productcode IS NULL";
	private static final String _FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_2 = "issueTracking.productcode = ?";
	private static final String _FINDER_COLUMN_PRODUCTCODE_PRODUCTCODE_3 = "(issueTracking.productcode IS NULL OR issueTracking.productcode = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEFECTSTATUS =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDefectStatus",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTSTATUS =
		new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED,
			IssueTrackingImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDefectStatus",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName()
			},
			IssueTrackingModelImpl.DEFECTSTATUS_COLUMN_BITMASK |
			IssueTrackingModelImpl.INSPECTIONRECORDNO_COLUMN_BITMASK |
			IssueTrackingModelImpl.REGISTEREDNUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DEFECTSTATUS = new FinderPath(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDefectStatus",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the issue trackings where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param defectStatus the defect status
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @return the matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByDefectStatus(int defectStatus,
		String inspectionrecordno, String registerednumber)
		throws SystemException {
		return findByDefectStatus(defectStatus, inspectionrecordno,
			registerednumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue trackings where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param defectStatus the defect status
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @return the range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByDefectStatus(int defectStatus,
		String inspectionrecordno, String registerednumber, int start, int end)
		throws SystemException {
		return findByDefectStatus(defectStatus, inspectionrecordno,
			registerednumber, start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue trackings where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param defectStatus the defect status
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findByDefectStatus(int defectStatus,
		String inspectionrecordno, String registerednumber, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTSTATUS;
			finderArgs = new Object[] {
					defectStatus, inspectionrecordno, registerednumber
				};
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEFECTSTATUS;
			finderArgs = new Object[] {
					defectStatus, inspectionrecordno, registerednumber,
					
					start, end, orderByComparator
				};
		}

		List<IssueTracking> list = (List<IssueTracking>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (IssueTracking issueTracking : list) {
				if ((defectStatus != issueTracking.getDefectStatus()) ||
						!Validator.equals(inspectionrecordno,
							issueTracking.getInspectionrecordno()) ||
						!Validator.equals(registerednumber,
							issueTracking.getRegisterednumber())) {
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

			query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

			query.append(_FINDER_COLUMN_DEFECTSTATUS_DEFECTSTATUS_2);

			boolean bindInspectionrecordno = false;

			if (inspectionrecordno == null) {
				query.append(_FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_1);
			}
			else if (inspectionrecordno.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_3);
			}
			else {
				bindInspectionrecordno = true;

				query.append(_FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_2);
			}

			boolean bindRegisterednumber = false;

			if (registerednumber == null) {
				query.append(_FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_1);
			}
			else if (registerednumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisterednumber = true;

				query.append(_FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(defectStatus);

				if (bindInspectionrecordno) {
					qPos.add(inspectionrecordno);
				}

				if (bindRegisterednumber) {
					qPos.add(registerednumber);
				}

				if (!pagination) {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueTracking>(list);
				}
				else {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first issue tracking in the ordered set where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param defectStatus the defect status
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByDefectStatus_First(int defectStatus,
		String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByDefectStatus_First(defectStatus,
				inspectionrecordno, registerednumber, orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("defectStatus=");
		msg.append(defectStatus);

		msg.append(", inspectionrecordno=");
		msg.append(inspectionrecordno);

		msg.append(", registerednumber=");
		msg.append(registerednumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the first issue tracking in the ordered set where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param defectStatus the defect status
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByDefectStatus_First(int defectStatus,
		String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator) throws SystemException {
		List<IssueTracking> list = findByDefectStatus(defectStatus,
				inspectionrecordno, registerednumber, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last issue tracking in the ordered set where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param defectStatus the defect status
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByDefectStatus_Last(int defectStatus,
		String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByDefectStatus_Last(defectStatus,
				inspectionrecordno, registerednumber, orderByComparator);

		if (issueTracking != null) {
			return issueTracking;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("defectStatus=");
		msg.append(defectStatus);

		msg.append(", inspectionrecordno=");
		msg.append(inspectionrecordno);

		msg.append(", registerednumber=");
		msg.append(registerednumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchIssueTrackingException(msg.toString());
	}

	/**
	 * Returns the last issue tracking in the ordered set where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param defectStatus the defect status
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching issue tracking, or <code>null</code> if a matching issue tracking could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByDefectStatus_Last(int defectStatus,
		String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDefectStatus(defectStatus, inspectionrecordno,
				registerednumber);

		if (count == 0) {
			return null;
		}

		List<IssueTracking> list = findByDefectStatus(defectStatus,
				inspectionrecordno, registerednumber, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the issue trackings before and after the current issue tracking in the ordered set where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param id the primary key of the current issue tracking
	 * @param defectStatus the defect status
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking[] findByDefectStatus_PrevAndNext(long id,
		int defectStatus, String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			IssueTracking[] array = new IssueTrackingImpl[3];

			array[0] = getByDefectStatus_PrevAndNext(session, issueTracking,
					defectStatus, inspectionrecordno, registerednumber,
					orderByComparator, true);

			array[1] = issueTracking;

			array[2] = getByDefectStatus_PrevAndNext(session, issueTracking,
					defectStatus, inspectionrecordno, registerednumber,
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

	protected IssueTracking getByDefectStatus_PrevAndNext(Session session,
		IssueTracking issueTracking, int defectStatus,
		String inspectionrecordno, String registerednumber,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ISSUETRACKING_WHERE);

		query.append(_FINDER_COLUMN_DEFECTSTATUS_DEFECTSTATUS_2);

		boolean bindInspectionrecordno = false;

		if (inspectionrecordno == null) {
			query.append(_FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_1);
		}
		else if (inspectionrecordno.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_3);
		}
		else {
			bindInspectionrecordno = true;

			query.append(_FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_2);
		}

		boolean bindRegisterednumber = false;

		if (registerednumber == null) {
			query.append(_FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_1);
		}
		else if (registerednumber.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_3);
		}
		else {
			bindRegisterednumber = true;

			query.append(_FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_2);
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
			query.append(IssueTrackingModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(defectStatus);

		if (bindInspectionrecordno) {
			qPos.add(inspectionrecordno);
		}

		if (bindRegisterednumber) {
			qPos.add(registerednumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(issueTracking);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<IssueTracking> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the issue trackings where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63; from the database.
	 *
	 * @param defectStatus the defect status
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDefectStatus(int defectStatus,
		String inspectionrecordno, String registerednumber)
		throws SystemException {
		for (IssueTracking issueTracking : findByDefectStatus(defectStatus,
				inspectionrecordno, registerednumber, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(issueTracking);
		}
	}

	/**
	 * Returns the number of issue trackings where defectStatus = &#63; and inspectionrecordno = &#63; and registerednumber = &#63;.
	 *
	 * @param defectStatus the defect status
	 * @param inspectionrecordno the inspectionrecordno
	 * @param registerednumber the registerednumber
	 * @return the number of matching issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDefectStatus(int defectStatus, String inspectionrecordno,
		String registerednumber) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DEFECTSTATUS;

		Object[] finderArgs = new Object[] {
				defectStatus, inspectionrecordno, registerednumber
			};

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_ISSUETRACKING_WHERE);

			query.append(_FINDER_COLUMN_DEFECTSTATUS_DEFECTSTATUS_2);

			boolean bindInspectionrecordno = false;

			if (inspectionrecordno == null) {
				query.append(_FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_1);
			}
			else if (inspectionrecordno.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_3);
			}
			else {
				bindInspectionrecordno = true;

				query.append(_FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_2);
			}

			boolean bindRegisterednumber = false;

			if (registerednumber == null) {
				query.append(_FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_1);
			}
			else if (registerednumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisterednumber = true;

				query.append(_FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(defectStatus);

				if (bindInspectionrecordno) {
					qPos.add(inspectionrecordno);
				}

				if (bindRegisterednumber) {
					qPos.add(registerednumber);
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

	private static final String _FINDER_COLUMN_DEFECTSTATUS_DEFECTSTATUS_2 = "issueTracking.defectStatus = ? AND ";
	private static final String _FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_1 =
		"issueTracking.inspectionrecordno IS NULL AND ";
	private static final String _FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_2 =
		"issueTracking.inspectionrecordno = ? AND ";
	private static final String _FINDER_COLUMN_DEFECTSTATUS_INSPECTIONRECORDNO_3 =
		"(issueTracking.inspectionrecordno IS NULL OR issueTracking.inspectionrecordno = '') AND ";
	private static final String _FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_1 = "issueTracking.registerednumber IS NULL";
	private static final String _FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_2 = "issueTracking.registerednumber = ?";
	private static final String _FINDER_COLUMN_DEFECTSTATUS_REGISTEREDNUMBER_3 = "(issueTracking.registerednumber IS NULL OR issueTracking.registerednumber = '')";

	public IssueTrackingPersistenceImpl() {
		setModelClass(IssueTracking.class);
	}

	/**
	 * Caches the issue tracking in the entity cache if it is enabled.
	 *
	 * @param issueTracking the issue tracking
	 */
	@Override
	public void cacheResult(IssueTracking issueTracking) {
		EntityCacheUtil.putResult(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingImpl.class, issueTracking.getPrimaryKey(),
			issueTracking);

		issueTracking.resetOriginalValues();
	}

	/**
	 * Caches the issue trackings in the entity cache if it is enabled.
	 *
	 * @param issueTrackings the issue trackings
	 */
	@Override
	public void cacheResult(List<IssueTracking> issueTrackings) {
		for (IssueTracking issueTracking : issueTrackings) {
			if (EntityCacheUtil.getResult(
						IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
						IssueTrackingImpl.class, issueTracking.getPrimaryKey()) == null) {
				cacheResult(issueTracking);
			}
			else {
				issueTracking.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all issue trackings.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(IssueTrackingImpl.class.getName());
		}

		EntityCacheUtil.clearCache(IssueTrackingImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the issue tracking.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(IssueTracking issueTracking) {
		EntityCacheUtil.removeResult(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingImpl.class, issueTracking.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<IssueTracking> issueTrackings) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (IssueTracking issueTracking : issueTrackings) {
			EntityCacheUtil.removeResult(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
				IssueTrackingImpl.class, issueTracking.getPrimaryKey());
		}
	}

	/**
	 * Creates a new issue tracking with the primary key. Does not add the issue tracking to the database.
	 *
	 * @param id the primary key for the new issue tracking
	 * @return the new issue tracking
	 */
	@Override
	public IssueTracking create(long id) {
		IssueTracking issueTracking = new IssueTrackingImpl();

		issueTracking.setNew(true);
		issueTracking.setPrimaryKey(id);

		return issueTracking;
	}

	/**
	 * Removes the issue tracking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the issue tracking
	 * @return the issue tracking that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking remove(long id)
		throws NoSuchIssueTrackingException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the issue tracking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the issue tracking
	 * @return the issue tracking that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking remove(Serializable primaryKey)
		throws NoSuchIssueTrackingException, SystemException {
		Session session = null;

		try {
			session = openSession();

			IssueTracking issueTracking = (IssueTracking)session.get(IssueTrackingImpl.class,
					primaryKey);

			if (issueTracking == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchIssueTrackingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(issueTracking);
		}
		catch (NoSuchIssueTrackingException nsee) {
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
	protected IssueTracking removeImpl(IssueTracking issueTracking)
		throws SystemException {
		issueTracking = toUnwrappedModel(issueTracking);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(issueTracking)) {
				issueTracking = (IssueTracking)session.get(IssueTrackingImpl.class,
						issueTracking.getPrimaryKeyObj());
			}

			if (issueTracking != null) {
				session.delete(issueTracking);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (issueTracking != null) {
			clearCache(issueTracking);
		}

		return issueTracking;
	}

	@Override
	public IssueTracking updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking issueTracking)
		throws SystemException {
		issueTracking = toUnwrappedModel(issueTracking);

		boolean isNew = issueTracking.isNew();

		IssueTrackingModelImpl issueTrackingModelImpl = (IssueTrackingModelImpl)issueTracking;

		Session session = null;

		try {
			session = openSession();

			if (issueTracking.isNew()) {
				session.save(issueTracking);

				issueTracking.setNew(false);
			}
			else {
				session.merge(issueTracking);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !IssueTrackingModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((issueTrackingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueTrackingModelImpl.getOriginalImportercode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE,
					args);

				args = new Object[] { issueTrackingModelImpl.getImportercode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERCODE,
					args);
			}

			if ((issueTrackingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDNUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueTrackingModelImpl.getOriginalRegisterednumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDNUMBER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDNUMBER,
					args);

				args = new Object[] { issueTrackingModelImpl.getRegisterednumber() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDNUMBER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDNUMBER,
					args);
			}

			if ((issueTrackingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueTrackingModelImpl.getOriginalInspectionrecordno(),
						issueTrackingModelImpl.getOriginalRegisterednumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDNO,
					args);

				args = new Object[] {
						issueTrackingModelImpl.getInspectionrecordno(),
						issueTrackingModelImpl.getRegisterednumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTIONRECORDNO,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTIONRECORDNO,
					args);
			}

			if ((issueTrackingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueTrackingModelImpl.getOriginalImportername()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME,
					args);

				args = new Object[] { issueTrackingModelImpl.getImportername() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME,
					args);
			}

			if ((issueTrackingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueTrackingModelImpl.getOriginalProductcode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE,
					args);

				args = new Object[] { issueTrackingModelImpl.getProductcode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PRODUCTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRODUCTCODE,
					args);
			}

			if ((issueTrackingModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTSTATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						issueTrackingModelImpl.getOriginalDefectStatus(),
						issueTrackingModelImpl.getOriginalInspectionrecordno(),
						issueTrackingModelImpl.getOriginalRegisterednumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEFECTSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTSTATUS,
					args);

				args = new Object[] {
						issueTrackingModelImpl.getDefectStatus(),
						issueTrackingModelImpl.getInspectionrecordno(),
						issueTrackingModelImpl.getRegisterednumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEFECTSTATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEFECTSTATUS,
					args);
			}
		}

		EntityCacheUtil.putResult(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
			IssueTrackingImpl.class, issueTracking.getPrimaryKey(),
			issueTracking);

		return issueTracking;
	}

	protected IssueTracking toUnwrappedModel(IssueTracking issueTracking) {
		if (issueTracking instanceof IssueTrackingImpl) {
			return issueTracking;
		}

		IssueTrackingImpl issueTrackingImpl = new IssueTrackingImpl();

		issueTrackingImpl.setNew(issueTracking.isNew());
		issueTrackingImpl.setPrimaryKey(issueTracking.getPrimaryKey());

		issueTrackingImpl.setId(issueTracking.getId());
		issueTrackingImpl.setImportercode(issueTracking.getImportercode());
		issueTrackingImpl.setImportername(issueTracking.getImportername());
		issueTrackingImpl.setRegisterednumber(issueTracking.getRegisterednumber());
		issueTrackingImpl.setInspectionrecordno(issueTracking.getInspectionrecordno());
		issueTrackingImpl.setInspectionRecordDate(issueTracking.getInspectionRecordDate());
		issueTrackingImpl.setCorporationId(issueTracking.getCorporationId());
		issueTrackingImpl.setInspectorId(issueTracking.getInspectorId());
		issueTrackingImpl.setVehicleClass(issueTracking.getVehicleClass());
		issueTrackingImpl.setProductcode(issueTracking.getProductcode());
		issueTrackingImpl.setProductname(issueTracking.getProductname());
		issueTrackingImpl.setTotalvehicle(issueTracking.getTotalvehicle());
		issueTrackingImpl.setCodeNumber(issueTracking.getCodeNumber());
		issueTrackingImpl.setChassisNumber(issueTracking.getChassisNumber());
		issueTrackingImpl.setEngineNumber(issueTracking.getEngineNumber());
		issueTrackingImpl.setImportedorassembled(issueTracking.getImportedorassembled());
		issueTrackingImpl.setIssuetrackingfromcustomer(issueTracking.getIssuetrackingfromcustomer());
		issueTrackingImpl.setIssuetrackingbycorporation(issueTracking.getIssuetrackingbycorporation());
		issueTrackingImpl.setIssuetrackingbyimportedgroup(issueTracking.getIssuetrackingbyimportedgroup());
		issueTrackingImpl.setIssuediscovery(issueTracking.getIssuediscovery());
		issueTrackingImpl.setIssuedescription(issueTracking.getIssuedescription());
		issueTrackingImpl.setIssueVAQ1reason(issueTracking.getIssueVAQ1reason());
		issueTrackingImpl.setIssueVAQ2troubleshooting(issueTracking.getIssueVAQ2troubleshooting());
		issueTrackingImpl.setIssueVAQ3longtermsolution(issueTracking.getIssueVAQ3longtermsolution());
		issueTrackingImpl.setIssueVAQ4precaution(issueTracking.getIssueVAQ4precaution());
		issueTrackingImpl.setCreator(issueTracking.getCreator());
		issueTrackingImpl.setCreateddate(issueTracking.getCreateddate());
		issueTrackingImpl.setMarkupissueVAQ4(issueTracking.getMarkupissueVAQ4());
		issueTrackingImpl.setMakerVAQ4(issueTracking.getMakerVAQ4());
		issueTrackingImpl.setCheckerVAQ4(issueTracking.getCheckerVAQ4());
		issueTrackingImpl.setApproverVAQ4(issueTracking.getApproverVAQ4());
		issueTrackingImpl.setMakerVAQ4modified(issueTracking.getMakerVAQ4modified());
		issueTrackingImpl.setCheckerVAQ4modified(issueTracking.getCheckerVAQ4modified());
		issueTrackingImpl.setApproverVAQ4modified(issueTracking.getApproverVAQ4modified());
		issueTrackingImpl.setMarkupissueVAQ1(issueTracking.getMarkupissueVAQ1());
		issueTrackingImpl.setMakerVAQ1(issueTracking.getMakerVAQ1());
		issueTrackingImpl.setCheckerVAQ1(issueTracking.getCheckerVAQ1());
		issueTrackingImpl.setMakerVAQ1modified(issueTracking.getMakerVAQ1modified());
		issueTrackingImpl.setCheckerVAQ1modified(issueTracking.getCheckerVAQ1modified());
		issueTrackingImpl.setMarkupissueVAQ2(issueTracking.getMarkupissueVAQ2());
		issueTrackingImpl.setMakerVAQ2(issueTracking.getMakerVAQ2());
		issueTrackingImpl.setCheckerVAQ2(issueTracking.getCheckerVAQ2());
		issueTrackingImpl.setMakerVAQ2modified(issueTracking.getMakerVAQ2modified());
		issueTrackingImpl.setCheckerVAQ2modified(issueTracking.getCheckerVAQ2modified());
		issueTrackingImpl.setMarkupissueVAQ3(issueTracking.getMarkupissueVAQ3());
		issueTrackingImpl.setMakerVAQ3(issueTracking.getMakerVAQ3());
		issueTrackingImpl.setCheckerVAQ3(issueTracking.getCheckerVAQ3());
		issueTrackingImpl.setApproverVAQ3(issueTracking.getApproverVAQ3());
		issueTrackingImpl.setMakerVAQ3modified(issueTracking.getMakerVAQ3modified());
		issueTrackingImpl.setCheckerVAQ3modified(issueTracking.getCheckerVAQ3modified());
		issueTrackingImpl.setApproverVAQ3modified(issueTracking.getApproverVAQ3modified());
		issueTrackingImpl.setDefectStatus(issueTracking.getDefectStatus());
		issueTrackingImpl.setSynchdate(issueTracking.getSynchdate());

		return issueTrackingImpl;
	}

	/**
	 * Returns the issue tracking with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue tracking
	 * @return the issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByPrimaryKey(Serializable primaryKey)
		throws NoSuchIssueTrackingException, SystemException {
		IssueTracking issueTracking = fetchByPrimaryKey(primaryKey);

		if (issueTracking == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchIssueTrackingException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return issueTracking;
	}

	/**
	 * Returns the issue tracking with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException} if it could not be found.
	 *
	 * @param id the primary key of the issue tracking
	 * @return the issue tracking
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchIssueTrackingException if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking findByPrimaryKey(long id)
		throws NoSuchIssueTrackingException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the issue tracking with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the issue tracking
	 * @return the issue tracking, or <code>null</code> if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		IssueTracking issueTracking = (IssueTracking)EntityCacheUtil.getResult(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
				IssueTrackingImpl.class, primaryKey);

		if (issueTracking == _nullIssueTracking) {
			return null;
		}

		if (issueTracking == null) {
			Session session = null;

			try {
				session = openSession();

				issueTracking = (IssueTracking)session.get(IssueTrackingImpl.class,
						primaryKey);

				if (issueTracking != null) {
					cacheResult(issueTracking);
				}
				else {
					EntityCacheUtil.putResult(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
						IssueTrackingImpl.class, primaryKey, _nullIssueTracking);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(IssueTrackingModelImpl.ENTITY_CACHE_ENABLED,
					IssueTrackingImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return issueTracking;
	}

	/**
	 * Returns the issue tracking with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the issue tracking
	 * @return the issue tracking, or <code>null</code> if a issue tracking with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public IssueTracking fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the issue trackings.
	 *
	 * @return the issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the issue trackings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @return the range of issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the issue trackings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.IssueTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of issue trackings
	 * @param end the upper bound of the range of issue trackings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of issue trackings
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<IssueTracking> findAll(int start, int end,
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

		List<IssueTracking> list = (List<IssueTracking>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ISSUETRACKING);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ISSUETRACKING;

				if (pagination) {
					sql = sql.concat(IssueTrackingModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<IssueTracking>(list);
				}
				else {
					list = (List<IssueTracking>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the issue trackings from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (IssueTracking issueTracking : findAll()) {
			remove(issueTracking);
		}
	}

	/**
	 * Returns the number of issue trackings.
	 *
	 * @return the number of issue trackings
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

				Query q = session.createQuery(_SQL_COUNT_ISSUETRACKING);

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
	 * Initializes the issue tracking persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.IssueTracking")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<IssueTracking>> listenersList = new ArrayList<ModelListener<IssueTracking>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<IssueTracking>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(IssueTrackingImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ISSUETRACKING = "SELECT issueTracking FROM IssueTracking issueTracking";
	private static final String _SQL_SELECT_ISSUETRACKING_WHERE = "SELECT issueTracking FROM IssueTracking issueTracking WHERE ";
	private static final String _SQL_COUNT_ISSUETRACKING = "SELECT COUNT(issueTracking) FROM IssueTracking issueTracking";
	private static final String _SQL_COUNT_ISSUETRACKING_WHERE = "SELECT COUNT(issueTracking) FROM IssueTracking issueTracking WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "issueTracking.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No IssueTracking exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No IssueTracking exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(IssueTrackingPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"inspectionRecordDate", "corporationId", "inspectorId",
				"vehicleClass", "codeNumber", "chassisNumber", "engineNumber",
				"defectStatus"
			});
	private static IssueTracking _nullIssueTracking = new IssueTrackingImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<IssueTracking> toCacheModel() {
				return _nullIssueTrackingCacheModel;
			}
		};

	private static CacheModel<IssueTracking> _nullIssueTrackingCacheModel = new CacheModel<IssueTracking>() {
			@Override
			public IssueTracking toEntityModel() {
				return _nullIssueTracking;
			}
		};
}