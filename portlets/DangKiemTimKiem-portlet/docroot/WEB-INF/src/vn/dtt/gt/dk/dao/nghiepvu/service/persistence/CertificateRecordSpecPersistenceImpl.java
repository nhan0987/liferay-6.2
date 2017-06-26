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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the certificate record spec service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CertificateRecordSpecPersistence
 * @see CertificateRecordSpecUtil
 * @generated
 */
public class CertificateRecordSpecPersistenceImpl extends BasePersistenceImpl<CertificateRecordSpec>
	implements CertificateRecordSpecPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CertificateRecordSpecUtil} to access the certificate record spec persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CertificateRecordSpecImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordSpecModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordSpecModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordSpecModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCertificateRecordId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID =
		new FinderPath(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordSpecModelImpl.FINDER_CACHE_ENABLED,
			CertificateRecordSpecImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCertificateRecordId", new String[] { Long.class.getName() },
			CertificateRecordSpecModelImpl.CERTIFICATERECORDID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CERTIFICATERECORDID = new FinderPath(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordSpecModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCertificateRecordId", new String[] { Long.class.getName() });

	/**
	 * Returns all the certificate record specs where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the matching certificate record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecordSpec> findByCertificateRecordId(
		long certificateRecordId) throws SystemException {
		return findByCertificateRecordId(certificateRecordId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificate record specs where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of certificate record specs
	 * @param end the upper bound of the range of certificate record specs (not inclusive)
	 * @return the range of matching certificate record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecordSpec> findByCertificateRecordId(
		long certificateRecordId, int start, int end) throws SystemException {
		return findByCertificateRecordId(certificateRecordId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate record specs where certificateRecordId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param start the lower bound of the range of certificate record specs
	 * @param end the upper bound of the range of certificate record specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching certificate record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecordSpec> findByCertificateRecordId(
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

		List<CertificateRecordSpec> list = (List<CertificateRecordSpec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CertificateRecordSpec certificateRecordSpec : list) {
				if ((certificateRecordId != certificateRecordSpec.getCertificateRecordId())) {
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

			query.append(_SQL_SELECT_CERTIFICATERECORDSPEC_WHERE);

			query.append(_FINDER_COLUMN_CERTIFICATERECORDID_CERTIFICATERECORDID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CertificateRecordSpecModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(certificateRecordId);

				if (!pagination) {
					list = (List<CertificateRecordSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CertificateRecordSpec>(list);
				}
				else {
					list = (List<CertificateRecordSpec>)QueryUtil.list(q,
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
	 * Returns the first certificate record spec in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a matching certificate record spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecordSpec findByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordSpecException, SystemException {
		CertificateRecordSpec certificateRecordSpec = fetchByCertificateRecordId_First(certificateRecordId,
				orderByComparator);

		if (certificateRecordSpec != null) {
			return certificateRecordSpec;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordSpecException(msg.toString());
	}

	/**
	 * Returns the first certificate record spec in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching certificate record spec, or <code>null</code> if a matching certificate record spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecordSpec fetchByCertificateRecordId_First(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		List<CertificateRecordSpec> list = findByCertificateRecordId(certificateRecordId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last certificate record spec in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a matching certificate record spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecordSpec findByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordSpecException, SystemException {
		CertificateRecordSpec certificateRecordSpec = fetchByCertificateRecordId_Last(certificateRecordId,
				orderByComparator);

		if (certificateRecordSpec != null) {
			return certificateRecordSpec;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("certificateRecordId=");
		msg.append(certificateRecordId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCertificateRecordSpecException(msg.toString());
	}

	/**
	 * Returns the last certificate record spec in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching certificate record spec, or <code>null</code> if a matching certificate record spec could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecordSpec fetchByCertificateRecordId_Last(
		long certificateRecordId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCertificateRecordId(certificateRecordId);

		if (count == 0) {
			return null;
		}

		List<CertificateRecordSpec> list = findByCertificateRecordId(certificateRecordId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the certificate record specs before and after the current certificate record spec in the ordered set where certificateRecordId = &#63;.
	 *
	 * @param id the primary key of the current certificate record spec
	 * @param certificateRecordId the certificate record ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next certificate record spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a certificate record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecordSpec[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId, OrderByComparator orderByComparator)
		throws NoSuchCertificateRecordSpecException, SystemException {
		CertificateRecordSpec certificateRecordSpec = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CertificateRecordSpec[] array = new CertificateRecordSpecImpl[3];

			array[0] = getByCertificateRecordId_PrevAndNext(session,
					certificateRecordSpec, certificateRecordId,
					orderByComparator, true);

			array[1] = certificateRecordSpec;

			array[2] = getByCertificateRecordId_PrevAndNext(session,
					certificateRecordSpec, certificateRecordId,
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

	protected CertificateRecordSpec getByCertificateRecordId_PrevAndNext(
		Session session, CertificateRecordSpec certificateRecordSpec,
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

		query.append(_SQL_SELECT_CERTIFICATERECORDSPEC_WHERE);

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
			query.append(CertificateRecordSpecModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(certificateRecordId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(certificateRecordSpec);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CertificateRecordSpec> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the certificate record specs where certificateRecordId = &#63; from the database.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCertificateRecordId(long certificateRecordId)
		throws SystemException {
		for (CertificateRecordSpec certificateRecordSpec : findByCertificateRecordId(
				certificateRecordId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(certificateRecordSpec);
		}
	}

	/**
	 * Returns the number of certificate record specs where certificateRecordId = &#63;.
	 *
	 * @param certificateRecordId the certificate record ID
	 * @return the number of matching certificate record specs
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

			query.append(_SQL_COUNT_CERTIFICATERECORDSPEC_WHERE);

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
		"certificateRecordSpec.certificateRecordId = ?";

	public CertificateRecordSpecPersistenceImpl() {
		setModelClass(CertificateRecordSpec.class);
	}

	/**
	 * Caches the certificate record spec in the entity cache if it is enabled.
	 *
	 * @param certificateRecordSpec the certificate record spec
	 */
	@Override
	public void cacheResult(CertificateRecordSpec certificateRecordSpec) {
		EntityCacheUtil.putResult(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordSpecImpl.class,
			certificateRecordSpec.getPrimaryKey(), certificateRecordSpec);

		certificateRecordSpec.resetOriginalValues();
	}

	/**
	 * Caches the certificate record specs in the entity cache if it is enabled.
	 *
	 * @param certificateRecordSpecs the certificate record specs
	 */
	@Override
	public void cacheResult(List<CertificateRecordSpec> certificateRecordSpecs) {
		for (CertificateRecordSpec certificateRecordSpec : certificateRecordSpecs) {
			if (EntityCacheUtil.getResult(
						CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
						CertificateRecordSpecImpl.class,
						certificateRecordSpec.getPrimaryKey()) == null) {
				cacheResult(certificateRecordSpec);
			}
			else {
				certificateRecordSpec.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all certificate record specs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CertificateRecordSpecImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CertificateRecordSpecImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the certificate record spec.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CertificateRecordSpec certificateRecordSpec) {
		EntityCacheUtil.removeResult(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordSpecImpl.class,
			certificateRecordSpec.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CertificateRecordSpec> certificateRecordSpecs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CertificateRecordSpec certificateRecordSpec : certificateRecordSpecs) {
			EntityCacheUtil.removeResult(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
				CertificateRecordSpecImpl.class,
				certificateRecordSpec.getPrimaryKey());
		}
	}

	/**
	 * Creates a new certificate record spec with the primary key. Does not add the certificate record spec to the database.
	 *
	 * @param id the primary key for the new certificate record spec
	 * @return the new certificate record spec
	 */
	@Override
	public CertificateRecordSpec create(long id) {
		CertificateRecordSpec certificateRecordSpec = new CertificateRecordSpecImpl();

		certificateRecordSpec.setNew(true);
		certificateRecordSpec.setPrimaryKey(id);

		return certificateRecordSpec;
	}

	/**
	 * Removes the certificate record spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the certificate record spec
	 * @return the certificate record spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a certificate record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecordSpec remove(long id)
		throws NoSuchCertificateRecordSpecException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the certificate record spec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the certificate record spec
	 * @return the certificate record spec that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a certificate record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecordSpec remove(Serializable primaryKey)
		throws NoSuchCertificateRecordSpecException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CertificateRecordSpec certificateRecordSpec = (CertificateRecordSpec)session.get(CertificateRecordSpecImpl.class,
					primaryKey);

			if (certificateRecordSpec == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCertificateRecordSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(certificateRecordSpec);
		}
		catch (NoSuchCertificateRecordSpecException nsee) {
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
	protected CertificateRecordSpec removeImpl(
		CertificateRecordSpec certificateRecordSpec) throws SystemException {
		certificateRecordSpec = toUnwrappedModel(certificateRecordSpec);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(certificateRecordSpec)) {
				certificateRecordSpec = (CertificateRecordSpec)session.get(CertificateRecordSpecImpl.class,
						certificateRecordSpec.getPrimaryKeyObj());
			}

			if (certificateRecordSpec != null) {
				session.delete(certificateRecordSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (certificateRecordSpec != null) {
			clearCache(certificateRecordSpec);
		}

		return certificateRecordSpec;
	}

	@Override
	public CertificateRecordSpec updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec certificateRecordSpec)
		throws SystemException {
		certificateRecordSpec = toUnwrappedModel(certificateRecordSpec);

		boolean isNew = certificateRecordSpec.isNew();

		CertificateRecordSpecModelImpl certificateRecordSpecModelImpl = (CertificateRecordSpecModelImpl)certificateRecordSpec;

		Session session = null;

		try {
			session = openSession();

			if (certificateRecordSpec.isNew()) {
				session.save(certificateRecordSpec);

				certificateRecordSpec.setNew(false);
			}
			else {
				session.merge(certificateRecordSpec);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CertificateRecordSpecModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((certificateRecordSpecModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						certificateRecordSpecModelImpl.getOriginalCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);

				args = new Object[] {
						certificateRecordSpecModelImpl.getCertificateRecordId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CERTIFICATERECORDID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CERTIFICATERECORDID,
					args);
			}
		}

		EntityCacheUtil.putResult(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
			CertificateRecordSpecImpl.class,
			certificateRecordSpec.getPrimaryKey(), certificateRecordSpec);

		return certificateRecordSpec;
	}

	protected CertificateRecordSpec toUnwrappedModel(
		CertificateRecordSpec certificateRecordSpec) {
		if (certificateRecordSpec instanceof CertificateRecordSpecImpl) {
			return certificateRecordSpec;
		}

		CertificateRecordSpecImpl certificateRecordSpecImpl = new CertificateRecordSpecImpl();

		certificateRecordSpecImpl.setNew(certificateRecordSpec.isNew());
		certificateRecordSpecImpl.setPrimaryKey(certificateRecordSpec.getPrimaryKey());

		certificateRecordSpecImpl.setId(certificateRecordSpec.getId());
		certificateRecordSpecImpl.setCertificateRecordId(certificateRecordSpec.getCertificateRecordId());
		certificateRecordSpecImpl.setSpecificationCode(certificateRecordSpec.getSpecificationCode());
		certificateRecordSpecImpl.setSpecificationName(certificateRecordSpec.getSpecificationName());
		certificateRecordSpecImpl.setSpecificationValue(certificateRecordSpec.getSpecificationValue());
		certificateRecordSpecImpl.setVersion(certificateRecordSpec.getVersion());

		return certificateRecordSpecImpl;
	}

	/**
	 * Returns the certificate record spec with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the certificate record spec
	 * @return the certificate record spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a certificate record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecordSpec findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCertificateRecordSpecException, SystemException {
		CertificateRecordSpec certificateRecordSpec = fetchByPrimaryKey(primaryKey);

		if (certificateRecordSpec == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCertificateRecordSpecException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return certificateRecordSpec;
	}

	/**
	 * Returns the certificate record spec with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException} if it could not be found.
	 *
	 * @param id the primary key of the certificate record spec
	 * @return the certificate record spec
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCertificateRecordSpecException if a certificate record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecordSpec findByPrimaryKey(long id)
		throws NoSuchCertificateRecordSpecException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the certificate record spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the certificate record spec
	 * @return the certificate record spec, or <code>null</code> if a certificate record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecordSpec fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CertificateRecordSpec certificateRecordSpec = (CertificateRecordSpec)EntityCacheUtil.getResult(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
				CertificateRecordSpecImpl.class, primaryKey);

		if (certificateRecordSpec == _nullCertificateRecordSpec) {
			return null;
		}

		if (certificateRecordSpec == null) {
			Session session = null;

			try {
				session = openSession();

				certificateRecordSpec = (CertificateRecordSpec)session.get(CertificateRecordSpecImpl.class,
						primaryKey);

				if (certificateRecordSpec != null) {
					cacheResult(certificateRecordSpec);
				}
				else {
					EntityCacheUtil.putResult(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
						CertificateRecordSpecImpl.class, primaryKey,
						_nullCertificateRecordSpec);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CertificateRecordSpecModelImpl.ENTITY_CACHE_ENABLED,
					CertificateRecordSpecImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return certificateRecordSpec;
	}

	/**
	 * Returns the certificate record spec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the certificate record spec
	 * @return the certificate record spec, or <code>null</code> if a certificate record spec with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CertificateRecordSpec fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the certificate record specs.
	 *
	 * @return the certificate record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecordSpec> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the certificate record specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate record specs
	 * @param end the upper bound of the range of certificate record specs (not inclusive)
	 * @return the range of certificate record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecordSpec> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the certificate record specs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CertificateRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of certificate record specs
	 * @param end the upper bound of the range of certificate record specs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of certificate record specs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CertificateRecordSpec> findAll(int start, int end,
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

		List<CertificateRecordSpec> list = (List<CertificateRecordSpec>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CERTIFICATERECORDSPEC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CERTIFICATERECORDSPEC;

				if (pagination) {
					sql = sql.concat(CertificateRecordSpecModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CertificateRecordSpec>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CertificateRecordSpec>(list);
				}
				else {
					list = (List<CertificateRecordSpec>)QueryUtil.list(q,
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
	 * Removes all the certificate record specs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CertificateRecordSpec certificateRecordSpec : findAll()) {
			remove(certificateRecordSpec);
		}
	}

	/**
	 * Returns the number of certificate record specs.
	 *
	 * @return the number of certificate record specs
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

				Query q = session.createQuery(_SQL_COUNT_CERTIFICATERECORDSPEC);

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
	 * Initializes the certificate record spec persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.CertificateRecordSpec")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CertificateRecordSpec>> listenersList = new ArrayList<ModelListener<CertificateRecordSpec>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CertificateRecordSpec>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CertificateRecordSpecImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CERTIFICATERECORDSPEC = "SELECT certificateRecordSpec FROM CertificateRecordSpec certificateRecordSpec";
	private static final String _SQL_SELECT_CERTIFICATERECORDSPEC_WHERE = "SELECT certificateRecordSpec FROM CertificateRecordSpec certificateRecordSpec WHERE ";
	private static final String _SQL_COUNT_CERTIFICATERECORDSPEC = "SELECT COUNT(certificateRecordSpec) FROM CertificateRecordSpec certificateRecordSpec";
	private static final String _SQL_COUNT_CERTIFICATERECORDSPEC_WHERE = "SELECT COUNT(certificateRecordSpec) FROM CertificateRecordSpec certificateRecordSpec WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "certificateRecordSpec.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CertificateRecordSpec exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CertificateRecordSpec exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CertificateRecordSpecPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"certificateRecordId", "specificationCode", "specificationName",
				"specificationValue"
			});
	private static CertificateRecordSpec _nullCertificateRecordSpec = new CertificateRecordSpecImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CertificateRecordSpec> toCacheModel() {
				return _nullCertificateRecordSpecCacheModel;
			}
		};

	private static CacheModel<CertificateRecordSpec> _nullCertificateRecordSpecCacheModel =
		new CacheModel<CertificateRecordSpec>() {
			@Override
			public CertificateRecordSpec toEntityModel() {
				return _nullCertificateRecordSpec;
			}
		};
}