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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateCircularException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateCircularImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateCircularModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the certificate circular service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CertificateCircularPersistence
 * @see CertificateCircularUtil
 * @generated
 */
public class CertificateCircularPersistenceImpl extends BasePersistenceImpl<CertificateCircular>
	implements CertificateCircularPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CertificateCircularUtil} to access the certificate circular persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CertificateCircularImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
			CertificateCircularModelImpl.FINDER_CACHE_ENABLED,
			CertificateCircularImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
			CertificateCircularModelImpl.FINDER_CACHE_ENABLED,
			CertificateCircularImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
			CertificateCircularModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
			CertificateCircularModelImpl.FINDER_CACHE_ENABLED,
			CertificateCircularImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
			CertificateCircularModelImpl.FINDER_CACHE_ENABLED,
			CertificateCircularImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateRecordId", new String[] { Long.class.getName() },
			CertificateCircularModelImpl.CERTIFICATERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATERECORDID = new FinderPath(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
			CertificateCircularModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the certificate circulars where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the matching certificate circulars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateCircular> findByCertificateRecordId(
		long certificateRecordId) throws SystemException {
		return findByCertificateRecordId(certificateRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificate circulars where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateCircularModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of certificate circulars
	 * @param end the upper bound of the range of certificate circulars (not inclusive)
	 * @return the range of matching certificate circulars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateCircular> findByCertificateRecordId(
		long certificateRecordId, int start, int end) throws SystemException {
		return findByCertificateRecordId(certificateRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate circulars where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateCircularModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of certificate circulars
	 * @param end the upper bound of the range of certificate circulars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching certificate circulars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateCircular> findByCertificateRecordId(
		long certificateRecordId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID;
			finderArgs = new Object[] { certificateRecordId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID;
			finderArgs = new Object[] {
					certificateRecordId,
					
					start, end, orderByComparator
				};
		}

		List<CertificateCircular> list = (List<CertificateCircular>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CertificateCircular certificateCircular : list) {
				if ((certificateRecordId != certificateCircular.getCertificateRecordId())) {
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

			query.append(_SQL_SELECT_CERTIFICATECIRCULAR_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CertificateCircularModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

				if (!pagination) {
					list = (List<CertificateCircular>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CertificateCircular>(list);
				}
				else {
					list = (List<CertificateCircular>)QueryUtil.list(q,
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
	 * Returns the first certificate circular in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate circular
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateCircularException if a matching certificate circular could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateCircular findByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchCertificateCircularException, SystemException {
		CertificateCircular certificateCircular = fetchByCertificateRecordId_First(certificateRecordId,
				orderByComparator);

		if (certificateCircular != null) {
			return certificateCircular;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateCircularException(msg.toString());
	}

	/**
	 * Returns the first certificate circular in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate circular, or <code>null</code> if a matching certificate circular could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateCircular fetchByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<CertificateCircular> list = findByCertificateRecordId(certificateRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last certificate circular in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate circular
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateCircularException if a matching certificate circular could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateCircular findByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchCertificateCircularException, SystemException {
		CertificateCircular certificateCircular = fetchByCertificateRecordId_Last(certificateRecordId,
				orderByComparator);

		if (certificateCircular != null) {
			return certificateCircular;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateCircularException(msg.toString());
	}

	/**
	 * Returns the last certificate circular in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate circular, or <code>null</code> if a matching certificate circular could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateCircular fetchByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCertificateRecordId(certificateRecordId);

		if (count == 0) {
			return null;
		}

		List<CertificateCircular> list = findByCertificateRecordId(certificateRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the certificate circulars before and after the current certificate circular in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param id the primary key of the current certificate circular
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next certificate circular
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateCircularException if a certificate circular with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateCircular[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchCertificateCircularException, SystemException {
		CertificateCircular certificateCircular = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CertificateCircular[] array = new CertificateCircularImpl[3];

			array[0] = getByCertificateRecordId_PrevAndNext(session,
					certificateCircular, certificateRecordId,
					orderByComparator, true);

			array[1] = certificateCircular;

			array[2] = getByCertificateRecordId_PrevAndNext(session,
					certificateCircular, certificateRecordId,
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

	protected CertificateCircular getByCertificateRecordId_PrevAndNext(
		Session session, CertificateCircular certificateCircular,
		long certificateRecordId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CERTIFICATECIRCULAR_WHERE);

		query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

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
			query.append(CertificateCircularModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(certificateCircular);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CertificateCircular> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the certificate circulars where certificateRecordId = &#63; from the database.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		for (CertificateCircular certificateCircular : findByCertificateRecordId(
				certificateRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(certificateCircular);
		}
	}

	/**
	 * Returns the number of certificate circulars where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the number of matching certificate circulars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CERTIFICATERECORDID;

		Object[] finderArgs = new Object[] { certificateRecordId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CERTIFICATECIRCULAR_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

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

	private static final String _FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2 =
		"certificateCircular.certificateRecordId = ?";

	public CertificateCircularPersistenceImpl() {
		setModelClass(CertificateCircular.class);
	}

	/**
	 * Caches the certificate circular in the entity cache if it is enabled.
	 *
	 * @param certificateCircular the certificate circular
	 */
	@Override
	public void cacheResult(CertificateCircular certificateCircular) {
		EntityCacheUtil.putResult(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
			CertificateCircularImpl.class, certificateCircular.getPrimaryKey(),
			certificateCircular);

		certificateCircular.resetOriginalValues();
	}

	/**
	 * Caches the certificate circulars in the entity cache if it is enabled.
	 *
	 * @param certificateCirculars the certificate circulars
	 */
	@Override
	public void cacheResult(List<CertificateCircular> certificateCirculars) {
		for (CertificateCircular certificateCircular : certificateCirculars) {
			if (EntityCacheUtil.getResult(
						CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
						CertificateCircularImpl.class,
						certificateCircular.getPrimaryKey()) == null) {
				cacheResult(certificateCircular);
			}
			else {
				certificateCircular.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all certificate circulars.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CertificateCircularImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CertificateCircularImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the certificate circular.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CertificateCircular certificateCircular) {
		EntityCacheUtil.removeResult(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
			CertificateCircularImpl.class, certificateCircular.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CertificateCircular> certificateCirculars) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CertificateCircular certificateCircular : certificateCirculars) {
			EntityCacheUtil.removeResult(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
				CertificateCircularImpl.class,
				certificateCircular.getPrimaryKey());
		}
	}

	/**
	 * Creates a new certificate circular with the primary key. Does not add the certificate circular to the database.
	 *
	 * @param id the primary key for the new certificate circular
	 * @return the new certificate circular
	 */
	@Override
	public CertificateCircular create(long id) {
		CertificateCircular certificateCircular = new CertificateCircularImpl();

		certificateCircular.setNew(true);
		certificateCircular.setPrimaryKey(id);

		return certificateCircular;
	}

	/**
	 * Removes the certificate circular with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the certificate circular
	 * @return the certificate circular that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateCircularException if a certificate circular with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateCircular remove(long id)
		throws NoSuchCertificateCircularException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the certificate circular with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the certificate circular
	 * @return the certificate circular that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateCircularException if a certificate circular with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateCircular remove(Serializable primaryKey)
		throws NoSuchCertificateCircularException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CertificateCircular certificateCircular = (CertificateCircular)session.get(CertificateCircularImpl.class,
					primaryKey);

			if (certificateCircular == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCertificateCircularException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(certificateCircular);
		}
		catch (NoSuchCertificateCircularException nsee) {
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
	protected CertificateCircular removeImpl(
		CertificateCircular certificateCircular) throws SystemException {
		certificateCircular = toUnwrappedModel(certificateCircular);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(certificateCircular)) {
				certificateCircular = (CertificateCircular)session.get(CertificateCircularImpl.class,
						certificateCircular.getPrimaryKeyObj());
			}

			if (certificateCircular != null) {
				session.delete(certificateCircular);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (certificateCircular != null) {
			clearCache(certificateCircular);
		}

		return certificateCircular;
	}

	@Override
	public CertificateCircular updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular certificateCircular)
		throws SystemException {
		certificateCircular = toUnwrappedModel(certificateCircular);

		boolean isNew = certificateCircular.isNew();

		CertificateCircularModelImpl certificateCircularModelImpl = (CertificateCircularModelImpl)certificateCircular;

		Session session = null;

		try {
			session = openSession();

			if (certificateCircular.isNew()) {
				session.save(certificateCircular);

				certificateCircular.setNew(false);
			}
			else {
				session.merge(certificateCircular);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CertificateCircularModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((certificateCircularModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						certificateCircularModelImpl.getOriginalCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);

				args = new Object[] {
						certificateCircularModelImpl.getCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);
			}
		}

		EntityCacheUtil.putResult(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
			CertificateCircularImpl.class, certificateCircular.getPrimaryKey(),
			certificateCircular);

		return certificateCircular;
	}

	protected CertificateCircular toUnwrappedModel(
		CertificateCircular certificateCircular) {
		if (certificateCircular instanceof CertificateCircularImpl) {
			return certificateCircular;
		}

		CertificateCircularImpl certificateCircularImpl = new CertificateCircularImpl();

		certificateCircularImpl.setNew(certificateCircular.isNew());
		certificateCircularImpl.setPrimaryKey(certificateCircular.getPrimaryKey());

		certificateCircularImpl.setId(certificateCircular.getId());
		certificateCircularImpl.setCertificateRecordId(certificateCircular.getCertificateRecordId());
		certificateCircularImpl.setSequenceNo(certificateCircular.getSequenceNo());
		certificateCircularImpl.setCircularNo(certificateCircular.getCircularNo());
		certificateCircularImpl.setCircularDate(certificateCircular.getCircularDate());

		return certificateCircularImpl;
	}

	/**
	 * Returns the certificate circular with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the certificate circular
	 * @return the certificate circular
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateCircularException if a certificate circular with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateCircular findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCertificateCircularException, SystemException {
		CertificateCircular certificateCircular = fetchByPrimaryKey(primaryKey);

		if (certificateCircular == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCertificateCircularException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return certificateCircular;
	}

	/**
	 * Returns the certificate circular with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateCircularException} if it could not be found.
	 *
	 * @param id the primary key of the certificate circular
	 * @return the certificate circular
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateCircularException if a certificate circular with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateCircular findByPrimaryKey(long id)
		throws NoSuchCertificateCircularException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the certificate circular with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the certificate circular
	 * @return the certificate circular, or <code>null</code> if a certificate circular with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateCircular fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CertificateCircular certificateCircular = (CertificateCircular)EntityCacheUtil.getResult(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
				CertificateCircularImpl.class, primaryKey);

		if (certificateCircular == _nullCertificateCircular) {
			return null;
		}

		if (certificateCircular == null) {
			Session session = null;

			try {
				session = openSession();

				certificateCircular = (CertificateCircular)session.get(CertificateCircularImpl.class,
						primaryKey);

				if (certificateCircular != null) {
					cacheResult(certificateCircular);
				}
				else {
					EntityCacheUtil.putResult(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
						CertificateCircularImpl.class, primaryKey,
						_nullCertificateCircular);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CertificateCircularModelImpl.ENTITY_CACHE_ENABLED,
					CertificateCircularImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return certificateCircular;
	}

	/**
	 * Returns the certificate circular with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the certificate circular
	 * @return the certificate circular, or <code>null</code> if a certificate circular with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateCircular fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the certificate circulars.
	 *
	 * @return the certificate circulars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateCircular> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificate circulars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateCircularModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate circulars
	 * @param end the upper bound of the range of certificate circulars (not inclusive)
	 * @return the range of certificate circulars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateCircular> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate circulars.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateCircularModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate circulars
	 * @param end the upper bound of the range of certificate circulars (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of certificate circulars
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateCircular> findAll(int start, int end,
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

		List<CertificateCircular> list = (List<CertificateCircular>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CERTIFICATECIRCULAR);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CERTIFICATECIRCULAR;

				if (pagination) {
					sql = sql.concat(CertificateCircularModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CertificateCircular>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CertificateCircular>(list);
				}
				else {
					list = (List<CertificateCircular>)QueryUtil.list(q,
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
	 * Removes all the certificate circulars from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CertificateCircular certificateCircular : findAll()) {
			remove(certificateCircular);
		}
	}

	/**
	 * Returns the number of certificate circulars.
	 *
	 * @return the number of certificate circulars
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

				Query q = session.createQuery(_SQL_COUNT_CERTIFICATECIRCULAR);

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
	 * Initializes the certificate circular persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.CertificateCircular")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CertificateCircular>> listenersList = new ArrayList<ModelListener<CertificateCircular>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CertificateCircular>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CertificateCircularImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CERTIFICATECIRCULAR = "SELECT certificateCircular FROM CertificateCircular certificateCircular";
	private static final String _SQL_SELECT_CERTIFICATECIRCULAR_WHERE = "SELECT certificateCircular FROM CertificateCircular certificateCircular WHERE ";
	private static final String _SQL_COUNT_CERTIFICATECIRCULAR = "SELECT COUNT(certificateCircular) FROM CertificateCircular certificateCircular";
	private static final String _SQL_COUNT_CERTIFICATECIRCULAR_WHERE = "SELECT COUNT(certificateCircular) FROM CertificateCircular certificateCircular WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "certificateCircular.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CertificateCircular exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CertificateCircular exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CertificateCircularPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"certificateRecordId", "sequenceNo", "circularNo",
				"circularDate"
			});
	private static CertificateCircular _nullCertificateCircular = new CertificateCircularImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CertificateCircular> toCacheModel() {
				return _nullCertificateCircularCacheModel;
			}
		};

	private static CacheModel<CertificateCircular> _nullCertificateCircularCacheModel =
		new CacheModel<CertificateCircular>() {
			@Override
			public CertificateCircular toEntityModel() {
				return _nullCertificateCircular;
			}
		};
}