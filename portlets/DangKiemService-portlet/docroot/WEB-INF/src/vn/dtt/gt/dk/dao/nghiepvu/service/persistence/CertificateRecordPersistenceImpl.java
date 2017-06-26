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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the certificate record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see CertificateRecordPersistence
 * @see CertificateRecordUtil
 * @generated
 */
public class CertificateRecordPersistenceImpl extends BasePersistenceImpl<CertificateRecord>
	implements CertificateRecordPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CertificateRecordUtil} to access the certificate record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CertificateRecordImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ATTACHEDFILE =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAttachedFile",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ATTACHEDFILE =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAttachedFile",
			new String[] { Long.class.getName() },
			CertificateRecordModelImpl.ATTACHEDFILE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ATTACHEDFILE = new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAttachedFile",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the certificate records where attachedFile = &#63;.
	 *
	 * @param attachedFile the attached file
	 * @return the matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByAttachedFile(long attachedFile)
		throws SystemException {
		return findByAttachedFile(attachedFile, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificate records where attachedFile = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param attachedFile the attached file
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @return the range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByAttachedFile(long attachedFile,
		int start, int end) throws SystemException {
		return findByAttachedFile(attachedFile, start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate records where attachedFile = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param attachedFile the attached file
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByAttachedFile(long attachedFile,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ATTACHEDFILE;
			finderArgs = new Object[] { attachedFile };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ATTACHEDFILE;
			finderArgs = new Object[] {
					attachedFile,
					
					start, end, orderByComparator
				};
		}

		List<CertificateRecord> list = (List<CertificateRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CertificateRecord certificateRecord : list) {
				if ((attachedFile != certificateRecord.getAttachedFile())) {
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

			query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_ATTACHEDFILE_ATTACHEDFILE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(attachedFile);

				if (!pagination) {
					list = (List<CertificateRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CertificateRecord>(list);
				}
				else {
					list = (List<CertificateRecord>)QueryUtil.list(q,
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
	 * Returns the first certificate record in the ordered set where attachedFile = &#63;.
	 *
	 * @param attachedFile the attached file
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByAttachedFile_First(long attachedFile,
		OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByAttachedFile_First(attachedFile,
				orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("attachedFile=");
		msg.append(attachedFile);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the first certificate record in the ordered set where attachedFile = &#63;.
	 *
	 * @param attachedFile the attached file
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByAttachedFile_First(long attachedFile,
		OrderByComparator orderByComparator) throws SystemException {
		List<CertificateRecord> list = findByAttachedFile(attachedFile, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last certificate record in the ordered set where attachedFile = &#63;.
	 *
	 * @param attachedFile the attached file
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByAttachedFile_Last(long attachedFile,
		OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByAttachedFile_Last(attachedFile,
				orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("attachedFile=");
		msg.append(attachedFile);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the last certificate record in the ordered set where attachedFile = &#63;.
	 *
	 * @param attachedFile the attached file
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByAttachedFile_Last(long attachedFile,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByAttachedFile(attachedFile);

		if (count == 0) {
			return null;
		}

		List<CertificateRecord> list = findByAttachedFile(attachedFile,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the certificate records before and after the current certificate record in the ordered set where attachedFile = &#63;.
	 *
	 * @param id the primary key of the current certificate record
	 * @param attachedFile the attached file
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord[] findByAttachedFile_PrevAndNext(long id,
		long attachedFile, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CertificateRecord[] array = new CertificateRecordImpl[3];

			array[0] = getByAttachedFile_PrevAndNext(session,
					certificateRecord, attachedFile, orderByComparator, true);

			array[1] = certificateRecord;

			array[2] = getByAttachedFile_PrevAndNext(session,
					certificateRecord, attachedFile, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CertificateRecord getByAttachedFile_PrevAndNext(Session session,
		CertificateRecord certificateRecord, long attachedFile,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

		query.append(_FINDER_COLUMN_ATTACHEDFILE_ATTACHEDFILE_2);

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
			query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(attachedFile);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(certificateRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CertificateRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the certificate records where attachedFile = &#63; from the database.
	 *
	 * @param attachedFile the attached file
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByAttachedFile(long attachedFile)
		throws SystemException {
		for (CertificateRecord certificateRecord : findByAttachedFile(
				attachedFile, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(certificateRecord);
		}
	}

	/**
	 * Returns the number of certificate records where attachedFile = &#63;.
	 *
	 * @param attachedFile the attached file
	 * @return the number of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAttachedFile(long attachedFile) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ATTACHEDFILE;

		Object[] finderArgs = new Object[] { attachedFile };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_ATTACHEDFILE_ATTACHEDFILE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(attachedFile);

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

	private static final String _FINDER_COLUMN_ATTACHEDFILE_ATTACHEDFILE_2 = "certificateRecord.attachedFile = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SAFETYTESTREPORTID =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySafetyTestReportId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFETYTESTREPORTID =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBySafetyTestReportId", new String[] { Long.class.getName() },
			CertificateRecordModelImpl.SAFETYTESTREPORTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SAFETYTESTREPORTID = new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBySafetyTestReportId", new String[] { Long.class.getName() });

	/**
	 * Returns all the certificate records where safetyTestReportId = &#63;.
	 *
	 * @param safetyTestReportId the safety test report ID
	 * @return the matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findBySafetyTestReportId(
		long safetyTestReportId) throws SystemException {
		return findBySafetyTestReportId(safetyTestReportId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificate records where safetyTestReportId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param safetyTestReportId the safety test report ID
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @return the range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findBySafetyTestReportId(
		long safetyTestReportId, int start, int end) throws SystemException {
		return findBySafetyTestReportId(safetyTestReportId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate records where safetyTestReportId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param safetyTestReportId the safety test report ID
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findBySafetyTestReportId(
		long safetyTestReportId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFETYTESTREPORTID;
			finderArgs = new Object[] { safetyTestReportId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SAFETYTESTREPORTID;
			finderArgs = new Object[] {
					safetyTestReportId,
					
					start, end, orderByComparator
				};
		}

		List<CertificateRecord> list = (List<CertificateRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CertificateRecord certificateRecord : list) {
				if ((safetyTestReportId != certificateRecord.getSafetyTestReportId())) {
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

			query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_SAFETYTESTREPORTID_SAFETYTESTREPORTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(safetyTestReportId);

				if (!pagination) {
					list = (List<CertificateRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CertificateRecord>(list);
				}
				else {
					list = (List<CertificateRecord>)QueryUtil.list(q,
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
	 * Returns the first certificate record in the ordered set where safetyTestReportId = &#63;.
	 *
	 * @param safetyTestReportId the safety test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findBySafetyTestReportId_First(
		long safetyTestReportId, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchBySafetyTestReportId_First(safetyTestReportId,
				orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("safetyTestReportId=");
		msg.append(safetyTestReportId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the first certificate record in the ordered set where safetyTestReportId = &#63;.
	 *
	 * @param safetyTestReportId the safety test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchBySafetyTestReportId_First(
		long safetyTestReportId, OrderByComparator orderByComparator)
		throws SystemException {
		List<CertificateRecord> list = findBySafetyTestReportId(safetyTestReportId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last certificate record in the ordered set where safetyTestReportId = &#63;.
	 *
	 * @param safetyTestReportId the safety test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findBySafetyTestReportId_Last(
		long safetyTestReportId, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchBySafetyTestReportId_Last(safetyTestReportId,
				orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("safetyTestReportId=");
		msg.append(safetyTestReportId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the last certificate record in the ordered set where safetyTestReportId = &#63;.
	 *
	 * @param safetyTestReportId the safety test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchBySafetyTestReportId_Last(
		long safetyTestReportId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countBySafetyTestReportId(safetyTestReportId);

		if (count == 0) {
			return null;
		}

		List<CertificateRecord> list = findBySafetyTestReportId(safetyTestReportId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the certificate records before and after the current certificate record in the ordered set where safetyTestReportId = &#63;.
	 *
	 * @param id the primary key of the current certificate record
	 * @param safetyTestReportId the safety test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord[] findBySafetyTestReportId_PrevAndNext(long id,
		long safetyTestReportId, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CertificateRecord[] array = new CertificateRecordImpl[3];

			array[0] = getBySafetyTestReportId_PrevAndNext(session,
					certificateRecord, safetyTestReportId, orderByComparator,
					true);

			array[1] = certificateRecord;

			array[2] = getBySafetyTestReportId_PrevAndNext(session,
					certificateRecord, safetyTestReportId, orderByComparator,
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

	protected CertificateRecord getBySafetyTestReportId_PrevAndNext(
		Session session, CertificateRecord certificateRecord,
		long safetyTestReportId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

		query.append(_FINDER_COLUMN_SAFETYTESTREPORTID_SAFETYTESTREPORTID_2);

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
			query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(safetyTestReportId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(certificateRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CertificateRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the certificate records where safetyTestReportId = &#63; from the database.
	 *
	 * @param safetyTestReportId the safety test report ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySafetyTestReportId(long safetyTestReportId)
		throws SystemException {
		for (CertificateRecord certificateRecord : findBySafetyTestReportId(
				safetyTestReportId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(certificateRecord);
		}
	}

	/**
	 * Returns the number of certificate records where safetyTestReportId = &#63;.
	 *
	 * @param safetyTestReportId the safety test report ID
	 * @return the number of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySafetyTestReportId(long safetyTestReportId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SAFETYTESTREPORTID;

		Object[] finderArgs = new Object[] { safetyTestReportId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_SAFETYTESTREPORTID_SAFETYTESTREPORTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(safetyTestReportId);

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

	private static final String _FINDER_COLUMN_SAFETYTESTREPORTID_SAFETYTESTREPORTID_2 =
		"certificateRecord.safetyTestReportId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMISSIONTESTREPORTID =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByEmissionTestReportId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONTESTREPORTID =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEmissionTestReportId",
			new String[] { Long.class.getName() },
			CertificateRecordModelImpl.EMISSIONTESTREPORTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMISSIONTESTREPORTID = new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByEmissionTestReportId", new String[] { Long.class.getName() });

	/**
	 * Returns all the certificate records where emissionTestReportId = &#63;.
	 *
	 * @param emissionTestReportId the emission test report ID
	 * @return the matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByEmissionTestReportId(
		long emissionTestReportId) throws SystemException {
		return findByEmissionTestReportId(emissionTestReportId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificate records where emissionTestReportId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param emissionTestReportId the emission test report ID
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @return the range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByEmissionTestReportId(
		long emissionTestReportId, int start, int end)
		throws SystemException {
		return findByEmissionTestReportId(emissionTestReportId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate records where emissionTestReportId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param emissionTestReportId the emission test report ID
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByEmissionTestReportId(
		long emissionTestReportId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONTESTREPORTID;
			finderArgs = new Object[] { emissionTestReportId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMISSIONTESTREPORTID;
			finderArgs = new Object[] {
					emissionTestReportId,
					
					start, end, orderByComparator
				};
		}

		List<CertificateRecord> list = (List<CertificateRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CertificateRecord certificateRecord : list) {
				if ((emissionTestReportId != certificateRecord.getEmissionTestReportId())) {
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

			query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_EMISSIONTESTREPORTID_EMISSIONTESTREPORTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(emissionTestReportId);

				if (!pagination) {
					list = (List<CertificateRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CertificateRecord>(list);
				}
				else {
					list = (List<CertificateRecord>)QueryUtil.list(q,
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
	 * Returns the first certificate record in the ordered set where emissionTestReportId = &#63;.
	 *
	 * @param emissionTestReportId the emission test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByEmissionTestReportId_First(
		long emissionTestReportId, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByEmissionTestReportId_First(emissionTestReportId,
				orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("emissionTestReportId=");
		msg.append(emissionTestReportId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the first certificate record in the ordered set where emissionTestReportId = &#63;.
	 *
	 * @param emissionTestReportId the emission test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByEmissionTestReportId_First(
		long emissionTestReportId, OrderByComparator orderByComparator)
		throws SystemException {
		List<CertificateRecord> list = findByEmissionTestReportId(emissionTestReportId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last certificate record in the ordered set where emissionTestReportId = &#63;.
	 *
	 * @param emissionTestReportId the emission test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByEmissionTestReportId_Last(
		long emissionTestReportId, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByEmissionTestReportId_Last(emissionTestReportId,
				orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("emissionTestReportId=");
		msg.append(emissionTestReportId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the last certificate record in the ordered set where emissionTestReportId = &#63;.
	 *
	 * @param emissionTestReportId the emission test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByEmissionTestReportId_Last(
		long emissionTestReportId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByEmissionTestReportId(emissionTestReportId);

		if (count == 0) {
			return null;
		}

		List<CertificateRecord> list = findByEmissionTestReportId(emissionTestReportId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the certificate records before and after the current certificate record in the ordered set where emissionTestReportId = &#63;.
	 *
	 * @param id the primary key of the current certificate record
	 * @param emissionTestReportId the emission test report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord[] findByEmissionTestReportId_PrevAndNext(long id,
		long emissionTestReportId, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CertificateRecord[] array = new CertificateRecordImpl[3];

			array[0] = getByEmissionTestReportId_PrevAndNext(session,
					certificateRecord, emissionTestReportId, orderByComparator,
					true);

			array[1] = certificateRecord;

			array[2] = getByEmissionTestReportId_PrevAndNext(session,
					certificateRecord, emissionTestReportId, orderByComparator,
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

	protected CertificateRecord getByEmissionTestReportId_PrevAndNext(
		Session session, CertificateRecord certificateRecord,
		long emissionTestReportId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

		query.append(_FINDER_COLUMN_EMISSIONTESTREPORTID_EMISSIONTESTREPORTID_2);

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
			query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(emissionTestReportId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(certificateRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CertificateRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the certificate records where emissionTestReportId = &#63; from the database.
	 *
	 * @param emissionTestReportId the emission test report ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByEmissionTestReportId(long emissionTestReportId)
		throws SystemException {
		for (CertificateRecord certificateRecord : findByEmissionTestReportId(
				emissionTestReportId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(certificateRecord);
		}
	}

	/**
	 * Returns the number of certificate records where emissionTestReportId = &#63;.
	 *
	 * @param emissionTestReportId the emission test report ID
	 * @return the number of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByEmissionTestReportId(long emissionTestReportId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMISSIONTESTREPORTID;

		Object[] finderArgs = new Object[] { emissionTestReportId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_EMISSIONTESTREPORTID_EMISSIONTESTREPORTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(emissionTestReportId);

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

	private static final String _FINDER_COLUMN_EMISSIONTESTREPORTID_EMISSIONTESTREPORTID_2 =
		"certificateRecord.emissionTestReportId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTID =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCopReportId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTID =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCopReportId",
			new String[] { Long.class.getName() },
			CertificateRecordModelImpl.COPREPORTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_COPREPORTID = new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCopReportId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the certificate records where copReportId = &#63;.
	 *
	 * @param copReportId the cop report ID
	 * @return the matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByCopReportId(long copReportId)
		throws SystemException {
		return findByCopReportId(copReportId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificate records where copReportId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param copReportId the cop report ID
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @return the range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByCopReportId(long copReportId,
		int start, int end) throws SystemException {
		return findByCopReportId(copReportId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate records where copReportId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param copReportId the cop report ID
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByCopReportId(long copReportId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTID;
			finderArgs = new Object[] { copReportId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COPREPORTID;
			finderArgs = new Object[] { copReportId, start, end, orderByComparator };
		}

		List<CertificateRecord> list = (List<CertificateRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CertificateRecord certificateRecord : list) {
				if ((copReportId != certificateRecord.getCopReportId())) {
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

			query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTID_COPREPORTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(copReportId);

				if (!pagination) {
					list = (List<CertificateRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CertificateRecord>(list);
				}
				else {
					list = (List<CertificateRecord>)QueryUtil.list(q,
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
	 * Returns the first certificate record in the ordered set where copReportId = &#63;.
	 *
	 * @param copReportId the cop report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByCopReportId_First(long copReportId,
		OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByCopReportId_First(copReportId,
				orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("copReportId=");
		msg.append(copReportId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the first certificate record in the ordered set where copReportId = &#63;.
	 *
	 * @param copReportId the cop report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByCopReportId_First(long copReportId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CertificateRecord> list = findByCopReportId(copReportId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last certificate record in the ordered set where copReportId = &#63;.
	 *
	 * @param copReportId the cop report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByCopReportId_Last(long copReportId,
		OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByCopReportId_Last(copReportId,
				orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("copReportId=");
		msg.append(copReportId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the last certificate record in the ordered set where copReportId = &#63;.
	 *
	 * @param copReportId the cop report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByCopReportId_Last(long copReportId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCopReportId(copReportId);

		if (count == 0) {
			return null;
		}

		List<CertificateRecord> list = findByCopReportId(copReportId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the certificate records before and after the current certificate record in the ordered set where copReportId = &#63;.
	 *
	 * @param id the primary key of the current certificate record
	 * @param copReportId the cop report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord[] findByCopReportId_PrevAndNext(long id,
		long copReportId, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CertificateRecord[] array = new CertificateRecordImpl[3];

			array[0] = getByCopReportId_PrevAndNext(session, certificateRecord,
					copReportId, orderByComparator, true);

			array[1] = certificateRecord;

			array[2] = getByCopReportId_PrevAndNext(session, certificateRecord,
					copReportId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CertificateRecord getByCopReportId_PrevAndNext(Session session,
		CertificateRecord certificateRecord, long copReportId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

		query.append(_FINDER_COLUMN_COPREPORTID_COPREPORTID_2);

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
			query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(copReportId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(certificateRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CertificateRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the certificate records where copReportId = &#63; from the database.
	 *
	 * @param copReportId the cop report ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCopReportId(long copReportId) throws SystemException {
		for (CertificateRecord certificateRecord : findByCopReportId(
				copReportId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(certificateRecord);
		}
	}

	/**
	 * Returns the number of certificate records where copReportId = &#63;.
	 *
	 * @param copReportId the cop report ID
	 * @return the number of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCopReportId(long copReportId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_COPREPORTID;

		Object[] finderArgs = new Object[] { copReportId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_COPREPORTID_COPREPORTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(copReportId);

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

	private static final String _FINDER_COLUMN_COPREPORTID_COPREPORTID_2 = "certificateRecord.copReportId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDossierId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDossierId",
			new String[] { Long.class.getName() },
			CertificateRecordModelImpl.DOSSIERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERID = new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDossierId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the certificate records where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByDossierId(long dossierId)
		throws SystemException {
		return findByDossierId(dossierId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the certificate records where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @return the range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByDossierId(long dossierId, int start,
		int end) throws SystemException {
		return findByDossierId(dossierId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate records where dossierId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByDossierId(long dossierId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERID;
			finderArgs = new Object[] { dossierId, start, end, orderByComparator };
		}

		List<CertificateRecord> list = (List<CertificateRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CertificateRecord certificateRecord : list) {
				if ((dossierId != certificateRecord.getDossierId())) {
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

			query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				if (!pagination) {
					list = (List<CertificateRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CertificateRecord>(list);
				}
				else {
					list = (List<CertificateRecord>)QueryUtil.list(q,
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
	 * Returns the first certificate record in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByDossierId_First(long dossierId,
		OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByDossierId_First(dossierId,
				orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the first certificate record in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByDossierId_First(long dossierId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CertificateRecord> list = findByDossierId(dossierId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last certificate record in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByDossierId_Last(long dossierId,
		OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByDossierId_Last(dossierId,
				orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the last certificate record in the ordered set where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByDossierId_Last(long dossierId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDossierId(dossierId);

		if (count == 0) {
			return null;
		}

		List<CertificateRecord> list = findByDossierId(dossierId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the certificate records before and after the current certificate record in the ordered set where dossierId = &#63;.
	 *
	 * @param id the primary key of the current certificate record
	 * @param dossierId the dossier ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord[] findByDossierId_PrevAndNext(long id,
		long dossierId, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CertificateRecord[] array = new CertificateRecordImpl[3];

			array[0] = getByDossierId_PrevAndNext(session, certificateRecord,
					dossierId, orderByComparator, true);

			array[1] = certificateRecord;

			array[2] = getByDossierId_PrevAndNext(session, certificateRecord,
					dossierId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CertificateRecord getByDossierId_PrevAndNext(Session session,
		CertificateRecord certificateRecord, long dossierId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

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
			query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(certificateRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CertificateRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the certificate records where dossierId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDossierId(long dossierId) throws SystemException {
		for (CertificateRecord certificateRecord : findByDossierId(dossierId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(certificateRecord);
		}
	}

	/**
	 * Returns the number of certificate records where dossierId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @return the number of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDossierId(long dossierId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERID;

		Object[] finderArgs = new Object[] { dossierId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERID_DOSSIERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

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

	private static final String _FINDER_COLUMN_DOSSIERID_DOSSIERID_2 = "certificateRecord.dossierId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CERTIFICATENUMBER = new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCertificateNumber",
			new String[] { String.class.getName() },
			CertificateRecordModelImpl.CERTIFICATENUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATENUMBER = new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateNumber", new String[] { String.class.getName() });

	/**
	 * Returns the certificate record where certificateNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException} if it could not be found.
	 *
	 * @param certificateNumber the certificate number
	 * @return the matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByCertificateNumber(String certificateNumber)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByCertificateNumber(certificateNumber);

		if (certificateRecord == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("certificateNumber=");
			msg.append(certificateNumber);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchCertificateRecordException(msg.toString());
		}

		return certificateRecord;
	}

	/**
	 * Returns the certificate record where certificateNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param certificateNumber the certificate number
	 * @return the matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByCertificateNumber(String certificateNumber)
		throws SystemException {
		return fetchByCertificateNumber(certificateNumber, true);
	}

	/**
	 * Returns the certificate record where certificateNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param certificateNumber the certificate number
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByCertificateNumber(
		String certificateNumber, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { certificateNumber };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CERTIFICATENUMBER,
					finderArgs, this);
		}

		if (result instanceof CertificateRecord) {
			CertificateRecord certificateRecord = (CertificateRecord)result;

			if (!Validator.equals(certificateNumber,
						certificateRecord.getCertificateNumber())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

			boolean bindCertificateNumber = false;

			if (certificateNumber == null) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1);
			}
			else if (certificateNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3);
			}
			else {
				bindCertificateNumber = true;

				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCertificateNumber) {
					qPos.add(certificateNumber);
				}

				List<CertificateRecord> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CERTIFICATENUMBER,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"CertificateRecordPersistenceImpl.fetchByCertificateNumber(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					CertificateRecord certificateRecord = list.get(0);

					result = certificateRecord;

					cacheResult(certificateRecord);

					if ((certificateRecord.getCertificateNumber() == null) ||
							!certificateRecord.getCertificateNumber()
												  .equals(certificateNumber)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CERTIFICATENUMBER,
							finderArgs, certificateRecord);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CERTIFICATENUMBER,
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
			return (CertificateRecord)result;
		}
	}

	/**
	 * Removes the certificate record where certificateNumber = &#63; from the database.
	 *
	 * @param certificateNumber the certificate number
	 * @return the certificate record that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord removeByCertificateNumber(String certificateNumber)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = findByCertificateNumber(certificateNumber);

		return remove(certificateRecord);
	}

	/**
	 * Returns the number of certificate records where certificateNumber = &#63;.
	 *
	 * @param certificateNumber the certificate number
	 * @return the number of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCertificateNumber(String certificateNumber)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATENUMBER;

		Object[] finderArgs = new Object[] { certificateNumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CERTIFICATERECORD_WHERE);

			boolean bindCertificateNumber = false;

			if (certificateNumber == null) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1);
			}
			else if (certificateNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3);
			}
			else {
				bindCertificateNumber = true;

				query.append(_FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCertificateNumber) {
					qPos.add(certificateNumber);
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

	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_1 =
		"certificateRecord.certificateNumber IS NULL";
	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_2 =
		"certificateRecord.certificateNumber = ?";
	private static final String _FINDER_COLUMN_CERTIFICATENUMBER_CERTIFICATENUMBER_3 =
		"(certificateRecord.certificateNumber IS NULL OR certificateRecord.certificateNumber = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDANDINSPECTIONREPORTID =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDossierIdAndInspectionReportId",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDANDINSPECTIONREPORTID =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDossierIdAndInspectionReportId",
			new String[] { Long.class.getName(), Long.class.getName() },
			CertificateRecordModelImpl.DOSSIERID_COLUMN_BITMASK |
			CertificateRecordModelImpl.INSPECTIONREPORTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DOSSIERIDANDINSPECTIONREPORTID =
		new FinderPath(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDossierIdAndInspectionReportId",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the certificate records where dossierId = &#63; and inspectionReportId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param inspectionReportId the inspection report ID
	 * @return the matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByDossierIdAndInspectionReportId(
		long dossierId, long inspectionReportId) throws SystemException {
		return findByDossierIdAndInspectionReportId(dossierId,
			inspectionReportId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificate records where dossierId = &#63; and inspectionReportId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param inspectionReportId the inspection report ID
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @return the range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByDossierIdAndInspectionReportId(
		long dossierId, long inspectionReportId, int start, int end)
		throws SystemException {
		return findByDossierIdAndInspectionReportId(dossierId,
			inspectionReportId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate records where dossierId = &#63; and inspectionReportId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dossierId the dossier ID
	 * @param inspectionReportId the inspection report ID
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findByDossierIdAndInspectionReportId(
		long dossierId, long inspectionReportId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDANDINSPECTIONREPORTID;
			finderArgs = new Object[] { dossierId, inspectionReportId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DOSSIERIDANDINSPECTIONREPORTID;
			finderArgs = new Object[] {
					dossierId, inspectionReportId,
					
					start, end, orderByComparator
				};
		}

		List<CertificateRecord> list = (List<CertificateRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CertificateRecord certificateRecord : list) {
				if ((dossierId != certificateRecord.getDossierId()) ||
						(inspectionReportId != certificateRecord.getInspectionReportId())) {
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

			query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERIDANDINSPECTIONREPORTID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERIDANDINSPECTIONREPORTID_INSPECTIONREPORTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(inspectionReportId);

				if (!pagination) {
					list = (List<CertificateRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CertificateRecord>(list);
				}
				else {
					list = (List<CertificateRecord>)QueryUtil.list(q,
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
	 * Returns the first certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param inspectionReportId the inspection report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByDossierIdAndInspectionReportId_First(
		long dossierId, long inspectionReportId,
		OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByDossierIdAndInspectionReportId_First(dossierId,
				inspectionReportId, orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", inspectionReportId=");
		msg.append(inspectionReportId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the first certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param inspectionReportId the inspection report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByDossierIdAndInspectionReportId_First(
		long dossierId, long inspectionReportId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CertificateRecord> list = findByDossierIdAndInspectionReportId(dossierId,
				inspectionReportId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param inspectionReportId the inspection report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByDossierIdAndInspectionReportId_Last(
		long dossierId, long inspectionReportId,
		OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByDossierIdAndInspectionReportId_Last(dossierId,
				inspectionReportId, orderByComparator);

		if (certificateRecord != null) {
			return certificateRecord;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("dossierId=");
		msg.append(dossierId);

		msg.append(", inspectionReportId=");
		msg.append(inspectionReportId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordException(msg.toString());
	}

	/**
	 * Returns the last certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param inspectionReportId the inspection report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record, or <code>null</code> if a matching certificate record could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByDossierIdAndInspectionReportId_Last(
		long dossierId, long inspectionReportId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDossierIdAndInspectionReportId(dossierId,
				inspectionReportId);

		if (count == 0) {
			return null;
		}

		List<CertificateRecord> list = findByDossierIdAndInspectionReportId(dossierId,
				inspectionReportId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the certificate records before and after the current certificate record in the ordered set where dossierId = &#63; and inspectionReportId = &#63;.
	 *
	 * @param id the primary key of the current certificate record
	 * @param dossierId the dossier ID
	 * @param inspectionReportId the inspection report ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord[] findByDossierIdAndInspectionReportId_PrevAndNext(
		long id, long dossierId, long inspectionReportId,
		OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CertificateRecord[] array = new CertificateRecordImpl[3];

			array[0] = getByDossierIdAndInspectionReportId_PrevAndNext(session,
					certificateRecord, dossierId, inspectionReportId,
					orderByComparator, true);

			array[1] = certificateRecord;

			array[2] = getByDossierIdAndInspectionReportId_PrevAndNext(session,
					certificateRecord, dossierId, inspectionReportId,
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

	protected CertificateRecord getByDossierIdAndInspectionReportId_PrevAndNext(
		Session session, CertificateRecord certificateRecord, long dossierId,
		long inspectionReportId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CERTIFICATERECORD_WHERE);

		query.append(_FINDER_COLUMN_DOSSIERIDANDINSPECTIONREPORTID_DOSSIERID_2);

		query.append(_FINDER_COLUMN_DOSSIERIDANDINSPECTIONREPORTID_INSPECTIONREPORTID_2);

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
			query.append(CertificateRecordModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(dossierId);

		qPos.add(inspectionReportId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(certificateRecord);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CertificateRecord> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the certificate records where dossierId = &#63; and inspectionReportId = &#63; from the database.
	 *
	 * @param dossierId the dossier ID
	 * @param inspectionReportId the inspection report ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDossierIdAndInspectionReportId(long dossierId,
		long inspectionReportId) throws SystemException {
		for (CertificateRecord certificateRecord : findByDossierIdAndInspectionReportId(
				dossierId, inspectionReportId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(certificateRecord);
		}
	}

	/**
	 * Returns the number of certificate records where dossierId = &#63; and inspectionReportId = &#63;.
	 *
	 * @param dossierId the dossier ID
	 * @param inspectionReportId the inspection report ID
	 * @return the number of matching certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDossierIdAndInspectionReportId(long dossierId,
		long inspectionReportId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DOSSIERIDANDINSPECTIONREPORTID;

		Object[] finderArgs = new Object[] { dossierId, inspectionReportId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CERTIFICATERECORD_WHERE);

			query.append(_FINDER_COLUMN_DOSSIERIDANDINSPECTIONREPORTID_DOSSIERID_2);

			query.append(_FINDER_COLUMN_DOSSIERIDANDINSPECTIONREPORTID_INSPECTIONREPORTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(dossierId);

				qPos.add(inspectionReportId);

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

	private static final String _FINDER_COLUMN_DOSSIERIDANDINSPECTIONREPORTID_DOSSIERID_2 =
		"certificateRecord.dossierId = ? AND ";
	private static final String _FINDER_COLUMN_DOSSIERIDANDINSPECTIONREPORTID_INSPECTIONREPORTID_2 =
		"certificateRecord.inspectionReportId = ?";

	public CertificateRecordPersistenceImpl() {
		setModelClass(CertificateRecord.class);
	}

	/**
	 * Caches the certificate record in the entity cache if it is enabled.
	 *
	 * @param certificateRecord the certificate record
	 */
	@Override
	public void cacheResult(CertificateRecord certificateRecord) {
		EntityCacheUtil.putResult(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordImpl.class, certificateRecord.getPrimaryKey(),
			certificateRecord);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CERTIFICATENUMBER,
			new Object[] { certificateRecord.getCertificateNumber() },
			certificateRecord);

		certificateRecord.resetOriginalValues();
	}

	/**
	 * Caches the certificate records in the entity cache if it is enabled.
	 *
	 * @param certificateRecords the certificate records
	 */
	@Override
	public void cacheResult(List<CertificateRecord> certificateRecords) {
		for (CertificateRecord certificateRecord : certificateRecords) {
			if (EntityCacheUtil.getResult(
						CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
						CertificateRecordImpl.class,
						certificateRecord.getPrimaryKey()) == null) {
				cacheResult(certificateRecord);
			}
			else {
				certificateRecord.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all certificate records.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CertificateRecordImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CertificateRecordImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the certificate record.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CertificateRecord certificateRecord) {
		EntityCacheUtil.removeResult(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordImpl.class, certificateRecord.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(certificateRecord);
	}

	@Override
	public void clearCache(List<CertificateRecord> certificateRecords) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CertificateRecord certificateRecord : certificateRecords) {
			EntityCacheUtil.removeResult(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
				CertificateRecordImpl.class, certificateRecord.getPrimaryKey());

			clearUniqueFindersCache(certificateRecord);
		}
	}

	protected void cacheUniqueFindersCache(CertificateRecord certificateRecord) {
		if (certificateRecord.isNew()) {
			Object[] args = new Object[] {
					certificateRecord.getCertificateNumber()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CERTIFICATENUMBER,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CERTIFICATENUMBER,
				args, certificateRecord);
		}
		else {
			CertificateRecordModelImpl certificateRecordModelImpl = (CertificateRecordModelImpl)certificateRecord;

			if ((certificateRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CERTIFICATENUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						certificateRecord.getCertificateNumber()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CERTIFICATENUMBER,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CERTIFICATENUMBER,
					args, certificateRecord);
			}
		}
	}

	protected void clearUniqueFindersCache(CertificateRecord certificateRecord) {
		CertificateRecordModelImpl certificateRecordModelImpl = (CertificateRecordModelImpl)certificateRecord;

		Object[] args = new Object[] { certificateRecord.getCertificateNumber() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATENUMBER,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CERTIFICATENUMBER,
			args);

		if ((certificateRecordModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CERTIFICATENUMBER.getColumnBitmask()) != 0) {
			args = new Object[] {
					certificateRecordModelImpl.getOriginalCertificateNumber()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATENUMBER,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CERTIFICATENUMBER,
				args);
		}
	}

	/**
	 * Creates a new certificate record with the primary key. Does not add the certificate record to the database.
	 *
	 * @param id the primary key for the new certificate record
	 * @return the new certificate record
	 */
	@Override
	public CertificateRecord create(long id) {
		CertificateRecord certificateRecord = new CertificateRecordImpl();

		certificateRecord.setNew(true);
		certificateRecord.setPrimaryKey(id);

		return certificateRecord;
	}

	/**
	 * Removes the certificate record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the certificate record
	 * @return the certificate record that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord remove(long id)
		throws NoSuchCertificateRecordException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the certificate record with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the certificate record
	 * @return the certificate record that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord remove(Serializable primaryKey)
		throws NoSuchCertificateRecordException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CertificateRecord certificateRecord = (CertificateRecord)session.get(CertificateRecordImpl.class,
					primaryKey);

			if (certificateRecord == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCertificateRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(certificateRecord);
		}
		catch (NoSuchCertificateRecordException nsee) {
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
	protected CertificateRecord removeImpl(CertificateRecord certificateRecord)
		throws SystemException {
		certificateRecord = toUnwrappedModel(certificateRecord);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(certificateRecord)) {
				certificateRecord = (CertificateRecord)session.get(CertificateRecordImpl.class,
						certificateRecord.getPrimaryKeyObj());
			}

			if (certificateRecord != null) {
				session.delete(certificateRecord);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (certificateRecord != null) {
			clearCache(certificateRecord);
		}

		return certificateRecord;
	}

	@Override
	public CertificateRecord updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord certificateRecord)
		throws SystemException {
		certificateRecord = toUnwrappedModel(certificateRecord);

		boolean isNew = certificateRecord.isNew();

		CertificateRecordModelImpl certificateRecordModelImpl = (CertificateRecordModelImpl)certificateRecord;

		Session session = null;

		try {
			session = openSession();

			if (certificateRecord.isNew()) {
				session.save(certificateRecord);

				certificateRecord.setNew(false);
			}
			else {
				session.merge(certificateRecord);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CertificateRecordModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((certificateRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ATTACHEDFILE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						certificateRecordModelImpl.getOriginalAttachedFile()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ATTACHEDFILE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ATTACHEDFILE,
					args);

				args = new Object[] { certificateRecordModelImpl.getAttachedFile() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ATTACHEDFILE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ATTACHEDFILE,
					args);
			}

			if ((certificateRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFETYTESTREPORTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						certificateRecordModelImpl.getOriginalSafetyTestReportId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SAFETYTESTREPORTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFETYTESTREPORTID,
					args);

				args = new Object[] {
						certificateRecordModelImpl.getSafetyTestReportId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SAFETYTESTREPORTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SAFETYTESTREPORTID,
					args);
			}

			if ((certificateRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONTESTREPORTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						certificateRecordModelImpl.getOriginalEmissionTestReportId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMISSIONTESTREPORTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONTESTREPORTID,
					args);

				args = new Object[] {
						certificateRecordModelImpl.getEmissionTestReportId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMISSIONTESTREPORTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMISSIONTESTREPORTID,
					args);
			}

			if ((certificateRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						certificateRecordModelImpl.getOriginalCopReportId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COPREPORTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTID,
					args);

				args = new Object[] { certificateRecordModelImpl.getCopReportId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COPREPORTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COPREPORTID,
					args);
			}

			if ((certificateRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						certificateRecordModelImpl.getOriginalDossierId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);

				args = new Object[] { certificateRecordModelImpl.getDossierId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERID,
					args);
			}

			if ((certificateRecordModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDANDINSPECTIONREPORTID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						certificateRecordModelImpl.getOriginalDossierId(),
						certificateRecordModelImpl.getOriginalInspectionReportId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDANDINSPECTIONREPORTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDANDINSPECTIONREPORTID,
					args);

				args = new Object[] {
						certificateRecordModelImpl.getDossierId(),
						certificateRecordModelImpl.getInspectionReportId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DOSSIERIDANDINSPECTIONREPORTID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DOSSIERIDANDINSPECTIONREPORTID,
					args);
			}
		}

		EntityCacheUtil.putResult(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordImpl.class, certificateRecord.getPrimaryKey(),
			certificateRecord);

		clearUniqueFindersCache(certificateRecord);
		cacheUniqueFindersCache(certificateRecord);

		return certificateRecord;
	}

	protected CertificateRecord toUnwrappedModel(
		CertificateRecord certificateRecord) {
		if (certificateRecord instanceof CertificateRecordImpl) {
			return certificateRecord;
		}

		CertificateRecordImpl certificateRecordImpl = new CertificateRecordImpl();

		certificateRecordImpl.setNew(certificateRecord.isNew());
		certificateRecordImpl.setPrimaryKey(certificateRecord.getPrimaryKey());

		certificateRecordImpl.setId(certificateRecord.getId());
		certificateRecordImpl.setCertificateType(certificateRecord.getCertificateType());
		certificateRecordImpl.setCertificateNumber(certificateRecord.getCertificateNumber());
		certificateRecordImpl.setAttachedFile(certificateRecord.getAttachedFile());
		certificateRecordImpl.setCreatedDate(certificateRecord.getCreatedDate());
		certificateRecordImpl.setEditorName(certificateRecord.getEditorName());
		certificateRecordImpl.setInspectionReportId(certificateRecord.getInspectionReportId());
		certificateRecordImpl.setSafetyTestReportId(certificateRecord.getSafetyTestReportId());
		certificateRecordImpl.setEmissionTestReportId(certificateRecord.getEmissionTestReportId());
		certificateRecordImpl.setCopReportId(certificateRecord.getCopReportId());
		certificateRecordImpl.setDossierId(certificateRecord.getDossierId());
		certificateRecordImpl.setOldCertificateNumber(certificateRecord.getOldCertificateNumber());
		certificateRecordImpl.setReason(certificateRecord.getReason());
		certificateRecordImpl.setRemarks(certificateRecord.getRemarks());
		certificateRecordImpl.setOrganization(certificateRecord.getOrganization());
		certificateRecordImpl.setDivision(certificateRecord.getDivision());
		certificateRecordImpl.setSignName(certificateRecord.getSignName());
		certificateRecordImpl.setSignTitle(certificateRecord.getSignTitle());
		certificateRecordImpl.setSignPlace(certificateRecord.getSignPlace());
		certificateRecordImpl.setSignDate(certificateRecord.getSignDate());
		certificateRecordImpl.setDigitalIssued(certificateRecord.getDigitalIssued());
		certificateRecordImpl.setStampStatus(certificateRecord.getStampStatus());
		certificateRecordImpl.setCommentInWrongCase(certificateRecord.getCommentInWrongCase());
		certificateRecordImpl.setSynchdate(certificateRecord.getSynchdate());

		return certificateRecordImpl;
	}

	/**
	 * Returns the certificate record with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the certificate record
	 * @return the certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCertificateRecordException, SystemException {
		CertificateRecord certificateRecord = fetchByPrimaryKey(primaryKey);

		if (certificateRecord == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCertificateRecordException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return certificateRecord;
	}

	/**
	 * Returns the certificate record with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException} if it could not be found.
	 *
	 * @param id the primary key of the certificate record
	 * @return the certificate record
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordException if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord findByPrimaryKey(long id)
		throws NoSuchCertificateRecordException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the certificate record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the certificate record
	 * @return the certificate record, or <code>null</code> if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CertificateRecord certificateRecord = (CertificateRecord)EntityCacheUtil.getResult(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
				CertificateRecordImpl.class, primaryKey);

		if (certificateRecord == _nullCertificateRecord) {
			return null;
		}

		if (certificateRecord == null) {
			Session session = null;

			try {
				session = openSession();

				certificateRecord = (CertificateRecord)session.get(CertificateRecordImpl.class,
						primaryKey);

				if (certificateRecord != null) {
					cacheResult(certificateRecord);
				}
				else {
					EntityCacheUtil.putResult(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
						CertificateRecordImpl.class, primaryKey,
						_nullCertificateRecord);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CertificateRecordModelImpl.ENTITY_CACHE_ENABLED,
					CertificateRecordImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return certificateRecord;
	}

	/**
	 * Returns the certificate record with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the certificate record
	 * @return the certificate record, or <code>null</code> if a certificate record with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecord fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the certificate records.
	 *
	 * @return the certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificate records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @return the range of certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate records.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate records
	 * @param end the upper bound of the range of certificate records (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of certificate records
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecord> findAll(int start, int end,
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

		List<CertificateRecord> list = (List<CertificateRecord>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CERTIFICATERECORD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CERTIFICATERECORD;

				if (pagination) {
					sql = sql.concat(CertificateRecordModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CertificateRecord>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CertificateRecord>(list);
				}
				else {
					list = (List<CertificateRecord>)QueryUtil.list(q,
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
	 * Removes all the certificate records from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CertificateRecord certificateRecord : findAll()) {
			remove(certificateRecord);
		}
	}

	/**
	 * Returns the number of certificate records.
	 *
	 * @return the number of certificate records
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

				Query q = session.createQuery(_SQL_COUNT_CERTIFICATERECORD);

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
	 * Initializes the certificate record persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecord")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CertificateRecord>> listenersList = new ArrayList<ModelListener<CertificateRecord>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CertificateRecord>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CertificateRecordImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CERTIFICATERECORD = "SELECT certificateRecord FROM CertificateRecord certificateRecord";
	private static final String _SQL_SELECT_CERTIFICATERECORD_WHERE = "SELECT certificateRecord FROM CertificateRecord certificateRecord WHERE ";
	private static final String _SQL_COUNT_CERTIFICATERECORD = "SELECT COUNT(certificateRecord) FROM CertificateRecord certificateRecord";
	private static final String _SQL_COUNT_CERTIFICATERECORD_WHERE = "SELECT COUNT(certificateRecord) FROM CertificateRecord certificateRecord WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "certificateRecord.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CertificateRecord exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CertificateRecord exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CertificateRecordPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"certificateType", "certificateNumber", "attachedFile",
				"createdDate", "editorName", "inspectionReportId",
				"safetyTestReportId", "emissionTestReportId", "copReportId",
				"dossierId", "oldCertificateNumber", "signName", "signTitle",
				"signPlace", "signDate", "digitalIssued", "stampStatus",
				"commentInWrongCase"
			});
	private static CertificateRecord _nullCertificateRecord = new CertificateRecordImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CertificateRecord> toCacheModel() {
				return _nullCertificateRecordCacheModel;
			}
		};

	private static CacheModel<CertificateRecord> _nullCertificateRecordCacheModel =
		new CacheModel<CertificateRecord>() {
			@Override
			public CertificateRecord toEntityModel() {
				return _nullCertificateRecord;
			}
		};
}