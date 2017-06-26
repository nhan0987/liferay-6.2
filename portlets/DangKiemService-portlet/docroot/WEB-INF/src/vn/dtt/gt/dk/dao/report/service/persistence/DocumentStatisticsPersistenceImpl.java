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

package vn.dtt.gt.dk.dao.report.service.persistence;

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

import vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException;
import vn.dtt.gt.dk.dao.report.model.DocumentStatistics;
import vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsImpl;
import vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the document statistics service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DocumentStatisticsPersistence
 * @see DocumentStatisticsUtil
 * @generated
 */
public class DocumentStatisticsPersistenceImpl extends BasePersistenceImpl<DocumentStatistics>
	implements DocumentStatisticsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocumentStatisticsUtil} to access the document statistics persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocumentStatisticsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED,
			DocumentStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED,
			DocumentStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTTYPECODE =
		new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED,
			DocumentStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDocumentTypeCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTTYPECODE =
		new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED,
			DocumentStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDocumentTypeCode", new String[] { String.class.getName() },
			DocumentStatisticsModelImpl.DOCUMENTTYPECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOCUMENTTYPECODE = new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDocumentTypeCode", new String[] { String.class.getName() });

	/**
	 * Returns all the document statisticses where documentTypeCode = &#63;.
	 *
	 * @param documentTypeCode the document type code
	 * @return the matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByDocumentTypeCode(
		String documentTypeCode) throws SystemException {
		return findByDocumentTypeCode(documentTypeCode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document statisticses where documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of document statisticses
	 * @param end the upper bound of the range of document statisticses (not inclusive)
	 * @return the range of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByDocumentTypeCode(
		String documentTypeCode, int start, int end) throws SystemException {
		return findByDocumentTypeCode(documentTypeCode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the document statisticses where documentTypeCode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentTypeCode the document type code
	 * @param start the lower bound of the range of document statisticses
	 * @param end the upper bound of the range of document statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByDocumentTypeCode(
		String documentTypeCode, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTTYPECODE;
			finderArgs = new Object[] { documentTypeCode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOCUMENTTYPECODE;
			finderArgs = new Object[] {
					documentTypeCode,
					
					start, end, orderByComparator
				};
		}

		List<DocumentStatistics> list = (List<DocumentStatistics>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentStatistics documentStatistics : list) {
				if (!Validator.equals(documentTypeCode,
							documentStatistics.getDocumentTypeCode())) {
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

			query.append(_SQL_SELECT_DOCUMENTSTATISTICS_WHERE);

			boolean bindDocumentTypeCode = false;

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_1);
			}
			else if (documentTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_3);
			}
			else {
				bindDocumentTypeCode = true;

				query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentStatisticsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentTypeCode) {
					qPos.add(documentTypeCode);
				}

				if (!pagination) {
					list = (List<DocumentStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentStatistics>(list);
				}
				else {
					list = (List<DocumentStatistics>)QueryUtil.list(q,
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
	 * Returns the first document statistics in the ordered set where documentTypeCode = &#63;.
	 *
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics findByDocumentTypeCode_First(
		String documentTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = fetchByDocumentTypeCode_First(documentTypeCode,
				orderByComparator);

		if (documentStatistics != null) {
			return documentStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentTypeCode=");
		msg.append(documentTypeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentStatisticsException(msg.toString());
	}

	/**
	 * Returns the first document statistics in the ordered set where documentTypeCode = &#63;.
	 *
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document statistics, or <code>null</code> if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByDocumentTypeCode_First(
		String documentTypeCode, OrderByComparator orderByComparator)
		throws SystemException {
		List<DocumentStatistics> list = findByDocumentTypeCode(documentTypeCode,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document statistics in the ordered set where documentTypeCode = &#63;.
	 *
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics findByDocumentTypeCode_Last(
		String documentTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = fetchByDocumentTypeCode_Last(documentTypeCode,
				orderByComparator);

		if (documentStatistics != null) {
			return documentStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentTypeCode=");
		msg.append(documentTypeCode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentStatisticsException(msg.toString());
	}

	/**
	 * Returns the last document statistics in the ordered set where documentTypeCode = &#63;.
	 *
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document statistics, or <code>null</code> if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByDocumentTypeCode_Last(
		String documentTypeCode, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDocumentTypeCode(documentTypeCode);

		if (count == 0) {
			return null;
		}

		List<DocumentStatistics> list = findByDocumentTypeCode(documentTypeCode,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document statisticses before and after the current document statistics in the ordered set where documentTypeCode = &#63;.
	 *
	 * @param id the primary key of the current document statistics
	 * @param documentTypeCode the document type code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics[] findByDocumentTypeCode_PrevAndNext(long id,
		String documentTypeCode, OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DocumentStatistics[] array = new DocumentStatisticsImpl[3];

			array[0] = getByDocumentTypeCode_PrevAndNext(session,
					documentStatistics, documentTypeCode, orderByComparator,
					true);

			array[1] = documentStatistics;

			array[2] = getByDocumentTypeCode_PrevAndNext(session,
					documentStatistics, documentTypeCode, orderByComparator,
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

	protected DocumentStatistics getByDocumentTypeCode_PrevAndNext(
		Session session, DocumentStatistics documentStatistics,
		String documentTypeCode, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTSTATISTICS_WHERE);

		boolean bindDocumentTypeCode = false;

		if (documentTypeCode == null) {
			query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_1);
		}
		else if (documentTypeCode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_3);
		}
		else {
			bindDocumentTypeCode = true;

			query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_2);
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
			query.append(DocumentStatisticsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDocumentTypeCode) {
			qPos.add(documentTypeCode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentStatistics);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentStatistics> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document statisticses where documentTypeCode = &#63; from the database.
	 *
	 * @param documentTypeCode the document type code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDocumentTypeCode(String documentTypeCode)
		throws SystemException {
		for (DocumentStatistics documentStatistics : findByDocumentTypeCode(
				documentTypeCode, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(documentStatistics);
		}
	}

	/**
	 * Returns the number of document statisticses where documentTypeCode = &#63;.
	 *
	 * @param documentTypeCode the document type code
	 * @return the number of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDocumentTypeCode(String documentTypeCode)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOCUMENTTYPECODE;

		Object[] finderArgs = new Object[] { documentTypeCode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENTSTATISTICS_WHERE);

			boolean bindDocumentTypeCode = false;

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_1);
			}
			else if (documentTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_3);
			}
			else {
				bindDocumentTypeCode = true;

				query.append(_FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentTypeCode) {
					qPos.add(documentTypeCode);
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

	private static final String _FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_1 =
		"documentStatistics.documentTypeCode IS NULL";
	private static final String _FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_2 =
		"documentStatistics.documentTypeCode = ?";
	private static final String _FINDER_COLUMN_DOCUMENTTYPECODE_DOCUMENTTYPECODE_3 =
		"(documentStatistics.documentTypeCode IS NULL OR documentStatistics.documentTypeCode = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_DTC_Y_M = new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED,
			DocumentStatisticsImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByDTC_Y_M",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			DocumentStatisticsModelImpl.DOCUMENTTYPECODE_COLUMN_BITMASK |
			DocumentStatisticsModelImpl.YEAR_COLUMN_BITMASK |
			DocumentStatisticsModelImpl.MONTH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DTC_Y_M = new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDTC_Y_M",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns the document statistics where documentTypeCode = &#63; and year = &#63; and month = &#63; or throws a {@link vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException} if it could not be found.
	 *
	 * @param documentTypeCode the document type code
	 * @param year the year
	 * @param month the month
	 * @return the matching document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics findByDTC_Y_M(String documentTypeCode, int year,
		int month) throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = fetchByDTC_Y_M(documentTypeCode,
				year, month);

		if (documentStatistics == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("documentTypeCode=");
			msg.append(documentTypeCode);

			msg.append(", year=");
			msg.append(year);

			msg.append(", month=");
			msg.append(month);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDocumentStatisticsException(msg.toString());
		}

		return documentStatistics;
	}

	/**
	 * Returns the document statistics where documentTypeCode = &#63; and year = &#63; and month = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param documentTypeCode the document type code
	 * @param year the year
	 * @param month the month
	 * @return the matching document statistics, or <code>null</code> if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByDTC_Y_M(String documentTypeCode, int year,
		int month) throws SystemException {
		return fetchByDTC_Y_M(documentTypeCode, year, month, true);
	}

	/**
	 * Returns the document statistics where documentTypeCode = &#63; and year = &#63; and month = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param documentTypeCode the document type code
	 * @param year the year
	 * @param month the month
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching document statistics, or <code>null</code> if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByDTC_Y_M(String documentTypeCode, int year,
		int month, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { documentTypeCode, year, month };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_DTC_Y_M,
					finderArgs, this);
		}

		if (result instanceof DocumentStatistics) {
			DocumentStatistics documentStatistics = (DocumentStatistics)result;

			if (!Validator.equals(documentTypeCode,
						documentStatistics.getDocumentTypeCode()) ||
					(year != documentStatistics.getYear()) ||
					(month != documentStatistics.getMonth())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_DOCUMENTSTATISTICS_WHERE);

			boolean bindDocumentTypeCode = false;

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_DTC_Y_M_DOCUMENTTYPECODE_1);
			}
			else if (documentTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DTC_Y_M_DOCUMENTTYPECODE_3);
			}
			else {
				bindDocumentTypeCode = true;

				query.append(_FINDER_COLUMN_DTC_Y_M_DOCUMENTTYPECODE_2);
			}

			query.append(_FINDER_COLUMN_DTC_Y_M_YEAR_2);

			query.append(_FINDER_COLUMN_DTC_Y_M_MONTH_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentTypeCode) {
					qPos.add(documentTypeCode);
				}

				qPos.add(year);

				qPos.add(month);

				List<DocumentStatistics> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DTC_Y_M,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DocumentStatisticsPersistenceImpl.fetchByDTC_Y_M(String, int, int, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DocumentStatistics documentStatistics = list.get(0);

					result = documentStatistics;

					cacheResult(documentStatistics);

					if ((documentStatistics.getDocumentTypeCode() == null) ||
							!documentStatistics.getDocumentTypeCode()
												   .equals(documentTypeCode) ||
							(documentStatistics.getYear() != year) ||
							(documentStatistics.getMonth() != month)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DTC_Y_M,
							finderArgs, documentStatistics);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DTC_Y_M,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DocumentStatistics)result;
		}
	}

	/**
	 * Removes the document statistics where documentTypeCode = &#63; and year = &#63; and month = &#63; from the database.
	 *
	 * @param documentTypeCode the document type code
	 * @param year the year
	 * @param month the month
	 * @return the document statistics that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics removeByDTC_Y_M(String documentTypeCode,
		int year, int month)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = findByDTC_Y_M(documentTypeCode,
				year, month);

		return remove(documentStatistics);
	}

	/**
	 * Returns the number of document statisticses where documentTypeCode = &#63; and year = &#63; and month = &#63;.
	 *
	 * @param documentTypeCode the document type code
	 * @param year the year
	 * @param month the month
	 * @return the number of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDTC_Y_M(String documentTypeCode, int year, int month)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DTC_Y_M;

		Object[] finderArgs = new Object[] { documentTypeCode, year, month };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOCUMENTSTATISTICS_WHERE);

			boolean bindDocumentTypeCode = false;

			if (documentTypeCode == null) {
				query.append(_FINDER_COLUMN_DTC_Y_M_DOCUMENTTYPECODE_1);
			}
			else if (documentTypeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DTC_Y_M_DOCUMENTTYPECODE_3);
			}
			else {
				bindDocumentTypeCode = true;

				query.append(_FINDER_COLUMN_DTC_Y_M_DOCUMENTTYPECODE_2);
			}

			query.append(_FINDER_COLUMN_DTC_Y_M_YEAR_2);

			query.append(_FINDER_COLUMN_DTC_Y_M_MONTH_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentTypeCode) {
					qPos.add(documentTypeCode);
				}

				qPos.add(year);

				qPos.add(month);

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

	private static final String _FINDER_COLUMN_DTC_Y_M_DOCUMENTTYPECODE_1 = "documentStatistics.documentTypeCode IS NULL AND ";
	private static final String _FINDER_COLUMN_DTC_Y_M_DOCUMENTTYPECODE_2 = "documentStatistics.documentTypeCode = ? AND ";
	private static final String _FINDER_COLUMN_DTC_Y_M_DOCUMENTTYPECODE_3 = "(documentStatistics.documentTypeCode IS NULL OR documentStatistics.documentTypeCode = '') AND ";
	private static final String _FINDER_COLUMN_DTC_Y_M_YEAR_2 = "documentStatistics.year = ? AND ";
	private static final String _FINDER_COLUMN_DTC_Y_M_MONTH_2 = "documentStatistics.month = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_YEAR_MONTH =
		new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED,
			DocumentStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByYear_Month",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAR_MONTH =
		new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED,
			DocumentStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByYear_Month",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			DocumentStatisticsModelImpl.YEAR_COLUMN_BITMASK |
			DocumentStatisticsModelImpl.MONTH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_YEAR_MONTH = new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByYear_Month",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the document statisticses where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @return the matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByYear_Month(int year, int month)
		throws SystemException {
		return findByYear_Month(year, month, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document statisticses where year = &#63; and month = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param year the year
	 * @param month the month
	 * @param start the lower bound of the range of document statisticses
	 * @param end the upper bound of the range of document statisticses (not inclusive)
	 * @return the range of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByYear_Month(int year, int month,
		int start, int end) throws SystemException {
		return findByYear_Month(year, month, start, end, null);
	}

	/**
	 * Returns an ordered range of all the document statisticses where year = &#63; and month = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param year the year
	 * @param month the month
	 * @param start the lower bound of the range of document statisticses
	 * @param end the upper bound of the range of document statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByYear_Month(int year, int month,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAR_MONTH;
			finderArgs = new Object[] { year, month };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_YEAR_MONTH;
			finderArgs = new Object[] { year, month, start, end, orderByComparator };
		}

		List<DocumentStatistics> list = (List<DocumentStatistics>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentStatistics documentStatistics : list) {
				if ((year != documentStatistics.getYear()) ||
						(month != documentStatistics.getMonth())) {
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

			query.append(_SQL_SELECT_DOCUMENTSTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_YEAR_MONTH_YEAR_2);

			query.append(_FINDER_COLUMN_YEAR_MONTH_MONTH_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentStatisticsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(year);

				qPos.add(month);

				if (!pagination) {
					list = (List<DocumentStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentStatistics>(list);
				}
				else {
					list = (List<DocumentStatistics>)QueryUtil.list(q,
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
	 * Returns the first document statistics in the ordered set where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics findByYear_Month_First(int year, int month,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = fetchByYear_Month_First(year,
				month, orderByComparator);

		if (documentStatistics != null) {
			return documentStatistics;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("year=");
		msg.append(year);

		msg.append(", month=");
		msg.append(month);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentStatisticsException(msg.toString());
	}

	/**
	 * Returns the first document statistics in the ordered set where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document statistics, or <code>null</code> if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByYear_Month_First(int year, int month,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocumentStatistics> list = findByYear_Month(year, month, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document statistics in the ordered set where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics findByYear_Month_Last(int year, int month,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = fetchByYear_Month_Last(year,
				month, orderByComparator);

		if (documentStatistics != null) {
			return documentStatistics;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("year=");
		msg.append(year);

		msg.append(", month=");
		msg.append(month);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentStatisticsException(msg.toString());
	}

	/**
	 * Returns the last document statistics in the ordered set where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document statistics, or <code>null</code> if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByYear_Month_Last(int year, int month,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByYear_Month(year, month);

		if (count == 0) {
			return null;
		}

		List<DocumentStatistics> list = findByYear_Month(year, month,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document statisticses before and after the current document statistics in the ordered set where year = &#63; and month = &#63;.
	 *
	 * @param id the primary key of the current document statistics
	 * @param year the year
	 * @param month the month
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics[] findByYear_Month_PrevAndNext(long id, int year,
		int month, OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DocumentStatistics[] array = new DocumentStatisticsImpl[3];

			array[0] = getByYear_Month_PrevAndNext(session, documentStatistics,
					year, month, orderByComparator, true);

			array[1] = documentStatistics;

			array[2] = getByYear_Month_PrevAndNext(session, documentStatistics,
					year, month, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentStatistics getByYear_Month_PrevAndNext(Session session,
		DocumentStatistics documentStatistics, int year, int month,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTSTATISTICS_WHERE);

		query.append(_FINDER_COLUMN_YEAR_MONTH_YEAR_2);

		query.append(_FINDER_COLUMN_YEAR_MONTH_MONTH_2);

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
			query.append(DocumentStatisticsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(year);

		qPos.add(month);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentStatistics);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentStatistics> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document statisticses where year = &#63; and month = &#63; from the database.
	 *
	 * @param year the year
	 * @param month the month
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByYear_Month(int year, int month)
		throws SystemException {
		for (DocumentStatistics documentStatistics : findByYear_Month(year,
				month, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(documentStatistics);
		}
	}

	/**
	 * Returns the number of document statisticses where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @return the number of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByYear_Month(int year, int month) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_YEAR_MONTH;

		Object[] finderArgs = new Object[] { year, month };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOCUMENTSTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_YEAR_MONTH_YEAR_2);

			query.append(_FINDER_COLUMN_YEAR_MONTH_MONTH_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(year);

				qPos.add(month);

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

	private static final String _FINDER_COLUMN_YEAR_MONTH_YEAR_2 = "documentStatistics.year = ? AND ";
	private static final String _FINDER_COLUMN_YEAR_MONTH_MONTH_2 = "documentStatistics.month = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_YEAR_MONTH_STATUS =
		new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED,
			DocumentStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByYear_Month_Status",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAR_MONTH_STATUS =
		new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED,
			DocumentStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByYear_Month_Status",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			DocumentStatisticsModelImpl.YEAR_COLUMN_BITMASK |
			DocumentStatisticsModelImpl.MONTH_COLUMN_BITMASK |
			DocumentStatisticsModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_YEAR_MONTH_STATUS = new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByYear_Month_Status",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the document statisticses where year = &#63; and month = &#63; and status = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param status the status
	 * @return the matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByYear_Month_Status(int year,
		int month, int status) throws SystemException {
		return findByYear_Month_Status(year, month, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document statisticses where year = &#63; and month = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param year the year
	 * @param month the month
	 * @param status the status
	 * @param start the lower bound of the range of document statisticses
	 * @param end the upper bound of the range of document statisticses (not inclusive)
	 * @return the range of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByYear_Month_Status(int year,
		int month, int status, int start, int end) throws SystemException {
		return findByYear_Month_Status(year, month, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the document statisticses where year = &#63; and month = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param year the year
	 * @param month the month
	 * @param status the status
	 * @param start the lower bound of the range of document statisticses
	 * @param end the upper bound of the range of document statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByYear_Month_Status(int year,
		int month, int status, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAR_MONTH_STATUS;
			finderArgs = new Object[] { year, month, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_YEAR_MONTH_STATUS;
			finderArgs = new Object[] {
					year, month, status,
					
					start, end, orderByComparator
				};
		}

		List<DocumentStatistics> list = (List<DocumentStatistics>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentStatistics documentStatistics : list) {
				if ((year != documentStatistics.getYear()) ||
						(month != documentStatistics.getMonth()) ||
						(status != documentStatistics.getStatus())) {
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

			query.append(_SQL_SELECT_DOCUMENTSTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_YEAR_MONTH_STATUS_YEAR_2);

			query.append(_FINDER_COLUMN_YEAR_MONTH_STATUS_MONTH_2);

			query.append(_FINDER_COLUMN_YEAR_MONTH_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentStatisticsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(year);

				qPos.add(month);

				qPos.add(status);

				if (!pagination) {
					list = (List<DocumentStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentStatistics>(list);
				}
				else {
					list = (List<DocumentStatistics>)QueryUtil.list(q,
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
	 * Returns the first document statistics in the ordered set where year = &#63; and month = &#63; and status = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics findByYear_Month_Status_First(int year,
		int month, int status, OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = fetchByYear_Month_Status_First(year,
				month, status, orderByComparator);

		if (documentStatistics != null) {
			return documentStatistics;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("year=");
		msg.append(year);

		msg.append(", month=");
		msg.append(month);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentStatisticsException(msg.toString());
	}

	/**
	 * Returns the first document statistics in the ordered set where year = &#63; and month = &#63; and status = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document statistics, or <code>null</code> if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByYear_Month_Status_First(int year,
		int month, int status, OrderByComparator orderByComparator)
		throws SystemException {
		List<DocumentStatistics> list = findByYear_Month_Status(year, month,
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document statistics in the ordered set where year = &#63; and month = &#63; and status = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics findByYear_Month_Status_Last(int year, int month,
		int status, OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = fetchByYear_Month_Status_Last(year,
				month, status, orderByComparator);

		if (documentStatistics != null) {
			return documentStatistics;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("year=");
		msg.append(year);

		msg.append(", month=");
		msg.append(month);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentStatisticsException(msg.toString());
	}

	/**
	 * Returns the last document statistics in the ordered set where year = &#63; and month = &#63; and status = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document statistics, or <code>null</code> if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByYear_Month_Status_Last(int year,
		int month, int status, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByYear_Month_Status(year, month, status);

		if (count == 0) {
			return null;
		}

		List<DocumentStatistics> list = findByYear_Month_Status(year, month,
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document statisticses before and after the current document statistics in the ordered set where year = &#63; and month = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current document statistics
	 * @param year the year
	 * @param month the month
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics[] findByYear_Month_Status_PrevAndNext(long id,
		int year, int month, int status, OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DocumentStatistics[] array = new DocumentStatisticsImpl[3];

			array[0] = getByYear_Month_Status_PrevAndNext(session,
					documentStatistics, year, month, status, orderByComparator,
					true);

			array[1] = documentStatistics;

			array[2] = getByYear_Month_Status_PrevAndNext(session,
					documentStatistics, year, month, status, orderByComparator,
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

	protected DocumentStatistics getByYear_Month_Status_PrevAndNext(
		Session session, DocumentStatistics documentStatistics, int year,
		int month, int status, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTSTATISTICS_WHERE);

		query.append(_FINDER_COLUMN_YEAR_MONTH_STATUS_YEAR_2);

		query.append(_FINDER_COLUMN_YEAR_MONTH_STATUS_MONTH_2);

		query.append(_FINDER_COLUMN_YEAR_MONTH_STATUS_STATUS_2);

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
			query.append(DocumentStatisticsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(year);

		qPos.add(month);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentStatistics);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentStatistics> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document statisticses where year = &#63; and month = &#63; and status = &#63; from the database.
	 *
	 * @param year the year
	 * @param month the month
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByYear_Month_Status(int year, int month, int status)
		throws SystemException {
		for (DocumentStatistics documentStatistics : findByYear_Month_Status(
				year, month, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(documentStatistics);
		}
	}

	/**
	 * Returns the number of document statisticses where year = &#63; and month = &#63; and status = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param status the status
	 * @return the number of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByYear_Month_Status(int year, int month, int status)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_YEAR_MONTH_STATUS;

		Object[] finderArgs = new Object[] { year, month, status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOCUMENTSTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_YEAR_MONTH_STATUS_YEAR_2);

			query.append(_FINDER_COLUMN_YEAR_MONTH_STATUS_MONTH_2);

			query.append(_FINDER_COLUMN_YEAR_MONTH_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(year);

				qPos.add(month);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_YEAR_MONTH_STATUS_YEAR_2 = "documentStatistics.year = ? AND ";
	private static final String _FINDER_COLUMN_YEAR_MONTH_STATUS_MONTH_2 = "documentStatistics.month = ? AND ";
	private static final String _FINDER_COLUMN_YEAR_MONTH_STATUS_STATUS_2 = "documentStatistics.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED,
			DocumentStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStatus",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED,
			DocumentStatisticsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByStatus",
			new String[] { Integer.class.getName() },
			DocumentStatisticsModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByStatus",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the document statisticses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByStatus(int status)
		throws SystemException {
		return findByStatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document statisticses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of document statisticses
	 * @param end the upper bound of the range of document statisticses (not inclusive)
	 * @return the range of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByStatus(int status, int start, int end)
		throws SystemException {
		return findByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the document statisticses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of document statisticses
	 * @param end the upper bound of the range of document statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findByStatus(int status, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<DocumentStatistics> list = (List<DocumentStatistics>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DocumentStatistics documentStatistics : list) {
				if ((status != documentStatistics.getStatus())) {
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

			query.append(_SQL_SELECT_DOCUMENTSTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentStatisticsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				if (!pagination) {
					list = (List<DocumentStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentStatistics>(list);
				}
				else {
					list = (List<DocumentStatistics>)QueryUtil.list(q,
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
	 * Returns the first document statistics in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics findByStatus_First(int status,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = fetchByStatus_First(status,
				orderByComparator);

		if (documentStatistics != null) {
			return documentStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentStatisticsException(msg.toString());
	}

	/**
	 * Returns the first document statistics in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document statistics, or <code>null</code> if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByStatus_First(int status,
		OrderByComparator orderByComparator) throws SystemException {
		List<DocumentStatistics> list = findByStatus(status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document statistics in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics findByStatus_Last(int status,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = fetchByStatus_Last(status,
				orderByComparator);

		if (documentStatistics != null) {
			return documentStatistics;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentStatisticsException(msg.toString());
	}

	/**
	 * Returns the last document statistics in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document statistics, or <code>null</code> if a matching document statistics could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByStatus_Last(int status,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByStatus(status);

		if (count == 0) {
			return null;
		}

		List<DocumentStatistics> list = findByStatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the document statisticses before and after the current document statistics in the ordered set where status = &#63;.
	 *
	 * @param id the primary key of the current document statistics
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics[] findByStatus_PrevAndNext(long id, int status,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DocumentStatistics[] array = new DocumentStatisticsImpl[3];

			array[0] = getByStatus_PrevAndNext(session, documentStatistics,
					status, orderByComparator, true);

			array[1] = documentStatistics;

			array[2] = getByStatus_PrevAndNext(session, documentStatistics,
					status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DocumentStatistics getByStatus_PrevAndNext(Session session,
		DocumentStatistics documentStatistics, int status,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENTSTATISTICS_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUS_2);

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
			query.append(DocumentStatisticsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(documentStatistics);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DocumentStatistics> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the document statisticses where status = &#63; from the database.
	 *
	 * @param status the status
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByStatus(int status) throws SystemException {
		for (DocumentStatistics documentStatistics : findByStatus(status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(documentStatistics);
		}
	}

	/**
	 * Returns the number of document statisticses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByStatus(int status) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENTSTATISTICS_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "documentStatistics.status = ?";

	public DocumentStatisticsPersistenceImpl() {
		setModelClass(DocumentStatistics.class);
	}

	/**
	 * Caches the document statistics in the entity cache if it is enabled.
	 *
	 * @param documentStatistics the document statistics
	 */
	@Override
	public void cacheResult(DocumentStatistics documentStatistics) {
		EntityCacheUtil.putResult(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsImpl.class, documentStatistics.getPrimaryKey(),
			documentStatistics);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DTC_Y_M,
			new Object[] {
				documentStatistics.getDocumentTypeCode(),
				documentStatistics.getYear(), documentStatistics.getMonth()
			}, documentStatistics);

		documentStatistics.resetOriginalValues();
	}

	/**
	 * Caches the document statisticses in the entity cache if it is enabled.
	 *
	 * @param documentStatisticses the document statisticses
	 */
	@Override
	public void cacheResult(List<DocumentStatistics> documentStatisticses) {
		for (DocumentStatistics documentStatistics : documentStatisticses) {
			if (EntityCacheUtil.getResult(
						DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
						DocumentStatisticsImpl.class,
						documentStatistics.getPrimaryKey()) == null) {
				cacheResult(documentStatistics);
			}
			else {
				documentStatistics.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all document statisticses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DocumentStatisticsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DocumentStatisticsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the document statistics.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DocumentStatistics documentStatistics) {
		EntityCacheUtil.removeResult(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsImpl.class, documentStatistics.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(documentStatistics);
	}

	@Override
	public void clearCache(List<DocumentStatistics> documentStatisticses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DocumentStatistics documentStatistics : documentStatisticses) {
			EntityCacheUtil.removeResult(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
				DocumentStatisticsImpl.class, documentStatistics.getPrimaryKey());

			clearUniqueFindersCache(documentStatistics);
		}
	}

	protected void cacheUniqueFindersCache(
		DocumentStatistics documentStatistics) {
		if (documentStatistics.isNew()) {
			Object[] args = new Object[] {
					documentStatistics.getDocumentTypeCode(),
					documentStatistics.getYear(), documentStatistics.getMonth()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DTC_Y_M, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DTC_Y_M, args,
				documentStatistics);
		}
		else {
			DocumentStatisticsModelImpl documentStatisticsModelImpl = (DocumentStatisticsModelImpl)documentStatistics;

			if ((documentStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_DTC_Y_M.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentStatistics.getDocumentTypeCode(),
						documentStatistics.getYear(),
						documentStatistics.getMonth()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DTC_Y_M, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_DTC_Y_M, args,
					documentStatistics);
			}
		}
	}

	protected void clearUniqueFindersCache(
		DocumentStatistics documentStatistics) {
		DocumentStatisticsModelImpl documentStatisticsModelImpl = (DocumentStatisticsModelImpl)documentStatistics;

		Object[] args = new Object[] {
				documentStatistics.getDocumentTypeCode(),
				documentStatistics.getYear(), documentStatistics.getMonth()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DTC_Y_M, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DTC_Y_M, args);

		if ((documentStatisticsModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_DTC_Y_M.getColumnBitmask()) != 0) {
			args = new Object[] {
					documentStatisticsModelImpl.getOriginalDocumentTypeCode(),
					documentStatisticsModelImpl.getOriginalYear(),
					documentStatisticsModelImpl.getOriginalMonth()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DTC_Y_M, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_DTC_Y_M, args);
		}
	}

	/**
	 * Creates a new document statistics with the primary key. Does not add the document statistics to the database.
	 *
	 * @param id the primary key for the new document statistics
	 * @return the new document statistics
	 */
	@Override
	public DocumentStatistics create(long id) {
		DocumentStatistics documentStatistics = new DocumentStatisticsImpl();

		documentStatistics.setNew(true);
		documentStatistics.setPrimaryKey(id);

		return documentStatistics;
	}

	/**
	 * Removes the document statistics with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the document statistics
	 * @return the document statistics that was removed
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics remove(long id)
		throws NoSuchDocumentStatisticsException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the document statistics with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the document statistics
	 * @return the document statistics that was removed
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics remove(Serializable primaryKey)
		throws NoSuchDocumentStatisticsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DocumentStatistics documentStatistics = (DocumentStatistics)session.get(DocumentStatisticsImpl.class,
					primaryKey);

			if (documentStatistics == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocumentStatisticsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(documentStatistics);
		}
		catch (NoSuchDocumentStatisticsException nsee) {
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
	protected DocumentStatistics removeImpl(
		DocumentStatistics documentStatistics) throws SystemException {
		documentStatistics = toUnwrappedModel(documentStatistics);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(documentStatistics)) {
				documentStatistics = (DocumentStatistics)session.get(DocumentStatisticsImpl.class,
						documentStatistics.getPrimaryKeyObj());
			}

			if (documentStatistics != null) {
				session.delete(documentStatistics);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (documentStatistics != null) {
			clearCache(documentStatistics);
		}

		return documentStatistics;
	}

	@Override
	public DocumentStatistics updateImpl(
		vn.dtt.gt.dk.dao.report.model.DocumentStatistics documentStatistics)
		throws SystemException {
		documentStatistics = toUnwrappedModel(documentStatistics);

		boolean isNew = documentStatistics.isNew();

		DocumentStatisticsModelImpl documentStatisticsModelImpl = (DocumentStatisticsModelImpl)documentStatistics;

		Session session = null;

		try {
			session = openSession();

			if (documentStatistics.isNew()) {
				session.save(documentStatistics);

				documentStatistics.setNew(false);
			}
			else {
				session.merge(documentStatistics);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DocumentStatisticsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((documentStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTTYPECODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentStatisticsModelImpl.getOriginalDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTTYPECODE,
					args);

				args = new Object[] {
						documentStatisticsModelImpl.getDocumentTypeCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOCUMENTTYPECODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOCUMENTTYPECODE,
					args);
			}

			if ((documentStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAR_MONTH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentStatisticsModelImpl.getOriginalYear(),
						documentStatisticsModelImpl.getOriginalMonth()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_YEAR_MONTH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAR_MONTH,
					args);

				args = new Object[] {
						documentStatisticsModelImpl.getYear(),
						documentStatisticsModelImpl.getMonth()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_YEAR_MONTH,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAR_MONTH,
					args);
			}

			if ((documentStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAR_MONTH_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentStatisticsModelImpl.getOriginalYear(),
						documentStatisticsModelImpl.getOriginalMonth(),
						documentStatisticsModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_YEAR_MONTH_STATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAR_MONTH_STATUS,
					args);

				args = new Object[] {
						documentStatisticsModelImpl.getYear(),
						documentStatisticsModelImpl.getMonth(),
						documentStatisticsModelImpl.getStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_YEAR_MONTH_STATUS,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_YEAR_MONTH_STATUS,
					args);
			}

			if ((documentStatisticsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentStatisticsModelImpl.getOriginalStatus()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { documentStatisticsModelImpl.getStatus() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		EntityCacheUtil.putResult(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
			DocumentStatisticsImpl.class, documentStatistics.getPrimaryKey(),
			documentStatistics);

		clearUniqueFindersCache(documentStatistics);
		cacheUniqueFindersCache(documentStatistics);

		return documentStatistics;
	}

	protected DocumentStatistics toUnwrappedModel(
		DocumentStatistics documentStatistics) {
		if (documentStatistics instanceof DocumentStatisticsImpl) {
			return documentStatistics;
		}

		DocumentStatisticsImpl documentStatisticsImpl = new DocumentStatisticsImpl();

		documentStatisticsImpl.setNew(documentStatistics.isNew());
		documentStatisticsImpl.setPrimaryKey(documentStatistics.getPrimaryKey());

		documentStatisticsImpl.setId(documentStatistics.getId());
		documentStatisticsImpl.setCreateDate(documentStatistics.getCreateDate());
		documentStatisticsImpl.setModifiedDate(documentStatistics.getModifiedDate());
		documentStatisticsImpl.setDocumentTypeCode(documentStatistics.getDocumentTypeCode());
		documentStatisticsImpl.setRemainingNumber(documentStatistics.getRemainingNumber());
		documentStatisticsImpl.setReceivedNumber(documentStatistics.getReceivedNumber());
		documentStatisticsImpl.setOntimeNumber(documentStatistics.getOntimeNumber());
		documentStatisticsImpl.setOvertimeNumber(documentStatistics.getOvertimeNumber());
		documentStatisticsImpl.setProcessingNumber(documentStatistics.getProcessingNumber());
		documentStatisticsImpl.setDelayingNumber(documentStatistics.getDelayingNumber());
		documentStatisticsImpl.setMonth(documentStatistics.getMonth());
		documentStatisticsImpl.setYear(documentStatistics.getYear());
		documentStatisticsImpl.setStatus(documentStatistics.getStatus());

		return documentStatisticsImpl;
	}

	/**
	 * Returns the document statistics with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the document statistics
	 * @return the document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocumentStatisticsException, SystemException {
		DocumentStatistics documentStatistics = fetchByPrimaryKey(primaryKey);

		if (documentStatistics == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocumentStatisticsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return documentStatistics;
	}

	/**
	 * Returns the document statistics with the primary key or throws a {@link vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException} if it could not be found.
	 *
	 * @param id the primary key of the document statistics
	 * @return the document statistics
	 * @throws vn.dtt.gt.dk.dao.report.NoSuchDocumentStatisticsException if a document statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics findByPrimaryKey(long id)
		throws NoSuchDocumentStatisticsException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the document statistics with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the document statistics
	 * @return the document statistics, or <code>null</code> if a document statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DocumentStatistics documentStatistics = (DocumentStatistics)EntityCacheUtil.getResult(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
				DocumentStatisticsImpl.class, primaryKey);

		if (documentStatistics == _nullDocumentStatistics) {
			return null;
		}

		if (documentStatistics == null) {
			Session session = null;

			try {
				session = openSession();

				documentStatistics = (DocumentStatistics)session.get(DocumentStatisticsImpl.class,
						primaryKey);

				if (documentStatistics != null) {
					cacheResult(documentStatistics);
				}
				else {
					EntityCacheUtil.putResult(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
						DocumentStatisticsImpl.class, primaryKey,
						_nullDocumentStatistics);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DocumentStatisticsModelImpl.ENTITY_CACHE_ENABLED,
					DocumentStatisticsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return documentStatistics;
	}

	/**
	 * Returns the document statistics with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the document statistics
	 * @return the document statistics, or <code>null</code> if a document statistics with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DocumentStatistics fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the document statisticses.
	 *
	 * @return the document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the document statisticses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of document statisticses
	 * @param end the upper bound of the range of document statisticses (not inclusive)
	 * @return the range of document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the document statisticses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.report.model.impl.DocumentStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of document statisticses
	 * @param end the upper bound of the range of document statisticses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of document statisticses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DocumentStatistics> findAll(int start, int end,
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

		List<DocumentStatistics> list = (List<DocumentStatistics>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCUMENTSTATISTICS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCUMENTSTATISTICS;

				if (pagination) {
					sql = sql.concat(DocumentStatisticsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DocumentStatistics>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DocumentStatistics>(list);
				}
				else {
					list = (List<DocumentStatistics>)QueryUtil.list(q,
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
	 * Removes all the document statisticses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DocumentStatistics documentStatistics : findAll()) {
			remove(documentStatistics);
		}
	}

	/**
	 * Returns the number of document statisticses.
	 *
	 * @return the number of document statisticses
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

				Query q = session.createQuery(_SQL_COUNT_DOCUMENTSTATISTICS);

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
	 * Initializes the document statistics persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.report.model.DocumentStatistics")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DocumentStatistics>> listenersList = new ArrayList<ModelListener<DocumentStatistics>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DocumentStatistics>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DocumentStatisticsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOCUMENTSTATISTICS = "SELECT documentStatistics FROM DocumentStatistics documentStatistics";
	private static final String _SQL_SELECT_DOCUMENTSTATISTICS_WHERE = "SELECT documentStatistics FROM DocumentStatistics documentStatistics WHERE ";
	private static final String _SQL_COUNT_DOCUMENTSTATISTICS = "SELECT COUNT(documentStatistics) FROM DocumentStatistics documentStatistics";
	private static final String _SQL_COUNT_DOCUMENTSTATISTICS_WHERE = "SELECT COUNT(documentStatistics) FROM DocumentStatistics documentStatistics WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "documentStatistics.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DocumentStatistics exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DocumentStatistics exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DocumentStatisticsPersistenceImpl.class);
	private static DocumentStatistics _nullDocumentStatistics = new DocumentStatisticsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DocumentStatistics> toCacheModel() {
				return _nullDocumentStatisticsCacheModel;
			}
		};

	private static CacheModel<DocumentStatistics> _nullDocumentStatisticsCacheModel =
		new CacheModel<DocumentStatistics>() {
			@Override
			public DocumentStatistics toEntityModel() {
				return _nullDocumentStatistics;
			}
		};
}