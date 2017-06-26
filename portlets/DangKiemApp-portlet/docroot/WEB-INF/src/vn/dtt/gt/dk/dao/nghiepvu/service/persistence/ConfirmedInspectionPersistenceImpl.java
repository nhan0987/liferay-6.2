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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException;
import vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the confirmed inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ConfirmedInspectionPersistence
 * @see ConfirmedInspectionUtil
 * @generated
 */
public class ConfirmedInspectionPersistenceImpl extends BasePersistenceImpl<ConfirmedInspection>
	implements ConfirmedInspectionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConfirmedInspectionUtil} to access the confirmed inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConfirmedInspectionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED,
			ConfirmedInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED,
			ConfirmedInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSTOMSDECLARATIONID =
		new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED,
			ConfirmedInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCustomsDeclarationId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMSDECLARATIONID =
		new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED,
			ConfirmedInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCustomsDeclarationId",
			new String[] { Long.class.getName() },
			ConfirmedInspectionModelImpl.CUSTOMSDECLARATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CUSTOMSDECLARATIONID = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCustomsDeclarationId", new String[] { Long.class.getName() });

	/**
	 * Returns all the confirmed inspections where customsDeclarationId = &#63;.
	 *
	 * @param customsDeclarationId the customs declaration ID
	 * @return the matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findByCustomsDeclarationId(
		long customsDeclarationId) throws SystemException {
		return findByCustomsDeclarationId(customsDeclarationId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the confirmed inspections where customsDeclarationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param customsDeclarationId the customs declaration ID
	 * @param start the lower bound of the range of confirmed inspections
	 * @param end the upper bound of the range of confirmed inspections (not inclusive)
	 * @return the range of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findByCustomsDeclarationId(
		long customsDeclarationId, int start, int end)
		throws SystemException {
		return findByCustomsDeclarationId(customsDeclarationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the confirmed inspections where customsDeclarationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param customsDeclarationId the customs declaration ID
	 * @param start the lower bound of the range of confirmed inspections
	 * @param end the upper bound of the range of confirmed inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findByCustomsDeclarationId(
		long customsDeclarationId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMSDECLARATIONID;
			finderArgs = new Object[] { customsDeclarationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSTOMSDECLARATIONID;
			finderArgs = new Object[] {
					customsDeclarationId,
					
					start, end, orderByComparator
				};
		}

		List<ConfirmedInspection> list = (List<ConfirmedInspection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ConfirmedInspection confirmedInspection : list) {
				if ((customsDeclarationId != confirmedInspection.getCustomsDeclarationId())) {
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

			query.append(_SQL_SELECT_CONFIRMEDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_CUSTOMSDECLARATIONID_CUSTOMSDECLARATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConfirmedInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(customsDeclarationId);

				if (!pagination) {
					list = (List<ConfirmedInspection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ConfirmedInspection>(list);
				}
				else {
					list = (List<ConfirmedInspection>)QueryUtil.list(q,
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
	 * Returns the first confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	 *
	 * @param customsDeclarationId the customs declaration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection findByCustomsDeclarationId_First(
		long customsDeclarationId, OrderByComparator orderByComparator)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = fetchByCustomsDeclarationId_First(customsDeclarationId,
				orderByComparator);

		if (confirmedInspection != null) {
			return confirmedInspection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customsDeclarationId=");
		msg.append(customsDeclarationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConfirmedInspectionException(msg.toString());
	}

	/**
	 * Returns the first confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	 *
	 * @param customsDeclarationId the customs declaration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByCustomsDeclarationId_First(
		long customsDeclarationId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ConfirmedInspection> list = findByCustomsDeclarationId(customsDeclarationId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	 *
	 * @param customsDeclarationId the customs declaration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection findByCustomsDeclarationId_Last(
		long customsDeclarationId, OrderByComparator orderByComparator)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = fetchByCustomsDeclarationId_Last(customsDeclarationId,
				orderByComparator);

		if (confirmedInspection != null) {
			return confirmedInspection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("customsDeclarationId=");
		msg.append(customsDeclarationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConfirmedInspectionException(msg.toString());
	}

	/**
	 * Returns the last confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	 *
	 * @param customsDeclarationId the customs declaration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByCustomsDeclarationId_Last(
		long customsDeclarationId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCustomsDeclarationId(customsDeclarationId);

		if (count == 0) {
			return null;
		}

		List<ConfirmedInspection> list = findByCustomsDeclarationId(customsDeclarationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the confirmed inspections before and after the current confirmed inspection in the ordered set where customsDeclarationId = &#63;.
	 *
	 * @param id the primary key of the current confirmed inspection
	 * @param customsDeclarationId the customs declaration ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection[] findByCustomsDeclarationId_PrevAndNext(
		long id, long customsDeclarationId, OrderByComparator orderByComparator)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ConfirmedInspection[] array = new ConfirmedInspectionImpl[3];

			array[0] = getByCustomsDeclarationId_PrevAndNext(session,
					confirmedInspection, customsDeclarationId,
					orderByComparator, true);

			array[1] = confirmedInspection;

			array[2] = getByCustomsDeclarationId_PrevAndNext(session,
					confirmedInspection, customsDeclarationId,
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

	protected ConfirmedInspection getByCustomsDeclarationId_PrevAndNext(
		Session session, ConfirmedInspection confirmedInspection,
		long customsDeclarationId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONFIRMEDINSPECTION_WHERE);

		query.append(_FINDER_COLUMN_CUSTOMSDECLARATIONID_CUSTOMSDECLARATIONID_2);

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
			query.append(ConfirmedInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(customsDeclarationId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(confirmedInspection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ConfirmedInspection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the confirmed inspections where customsDeclarationId = &#63; from the database.
	 *
	 * @param customsDeclarationId the customs declaration ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCustomsDeclarationId(long customsDeclarationId)
		throws SystemException {
		for (ConfirmedInspection confirmedInspection : findByCustomsDeclarationId(
				customsDeclarationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(confirmedInspection);
		}
	}

	/**
	 * Returns the number of confirmed inspections where customsDeclarationId = &#63;.
	 *
	 * @param customsDeclarationId the customs declaration ID
	 * @return the number of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCustomsDeclarationId(long customsDeclarationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CUSTOMSDECLARATIONID;

		Object[] finderArgs = new Object[] { customsDeclarationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONFIRMEDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_CUSTOMSDECLARATIONID_CUSTOMSDECLARATIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(customsDeclarationId);

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

	private static final String _FINDER_COLUMN_CUSTOMSDECLARATIONID_CUSTOMSDECLARATIONID_2 =
		"confirmedInspection.customsDeclarationId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED,
			ConfirmedInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByHoSoThuTucId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED,
			ConfirmedInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByHoSoThuTucId",
			new String[] { Long.class.getName() },
			ConfirmedInspectionModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByHoSoThuTucId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the confirmed inspections where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the confirmed inspections where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of confirmed inspections
	 * @param end the upper bound of the range of confirmed inspections (not inclusive)
	 * @return the range of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end) throws SystemException {
		return findByHoSoThuTucId(hoSoThuTucId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the confirmed inspections where hoSoThuTucId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param start the lower bound of the range of confirmed inspections
	 * @param end the upper bound of the range of confirmed inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findByHoSoThuTucId(long hoSoThuTucId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] { hoSoThuTucId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] {
					hoSoThuTucId,
					
					start, end, orderByComparator
				};
		}

		List<ConfirmedInspection> list = (List<ConfirmedInspection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ConfirmedInspection confirmedInspection : list) {
				if ((hoSoThuTucId != confirmedInspection.getHoSoThuTucId())) {
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

			query.append(_SQL_SELECT_CONFIRMEDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConfirmedInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

				if (!pagination) {
					list = (List<ConfirmedInspection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ConfirmedInspection>(list);
				}
				else {
					list = (List<ConfirmedInspection>)QueryUtil.list(q,
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
	 * Returns the first confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection findByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = fetchByHoSoThuTucId_First(hoSoThuTucId,
				orderByComparator);

		if (confirmedInspection != null) {
			return confirmedInspection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConfirmedInspectionException(msg.toString());
	}

	/**
	 * Returns the first confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByHoSoThuTucId_First(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ConfirmedInspection> list = findByHoSoThuTucId(hoSoThuTucId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection findByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = fetchByHoSoThuTucId_Last(hoSoThuTucId,
				orderByComparator);

		if (confirmedInspection != null) {
			return confirmedInspection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hoSoThuTucId=");
		msg.append(hoSoThuTucId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConfirmedInspectionException(msg.toString());
	}

	/**
	 * Returns the last confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByHoSoThuTucId_Last(long hoSoThuTucId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByHoSoThuTucId(hoSoThuTucId);

		if (count == 0) {
			return null;
		}

		List<ConfirmedInspection> list = findByHoSoThuTucId(hoSoThuTucId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the confirmed inspections before and after the current confirmed inspection in the ordered set where hoSoThuTucId = &#63;.
	 *
	 * @param id the primary key of the current confirmed inspection
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection[] findByHoSoThuTucId_PrevAndNext(long id,
		long hoSoThuTucId, OrderByComparator orderByComparator)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ConfirmedInspection[] array = new ConfirmedInspectionImpl[3];

			array[0] = getByHoSoThuTucId_PrevAndNext(session,
					confirmedInspection, hoSoThuTucId, orderByComparator, true);

			array[1] = confirmedInspection;

			array[2] = getByHoSoThuTucId_PrevAndNext(session,
					confirmedInspection, hoSoThuTucId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ConfirmedInspection getByHoSoThuTucId_PrevAndNext(
		Session session, ConfirmedInspection confirmedInspection,
		long hoSoThuTucId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONFIRMEDINSPECTION_WHERE);

		query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

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
			query.append(ConfirmedInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hoSoThuTucId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(confirmedInspection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ConfirmedInspection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the confirmed inspections where hoSoThuTucId = &#63; from the database.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws SystemException {
		for (ConfirmedInspection confirmedInspection : findByHoSoThuTucId(
				hoSoThuTucId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(confirmedInspection);
		}
	}

	/**
	 * Returns the number of confirmed inspections where hoSoThuTucId = &#63;.
	 *
	 * @param hoSoThuTucId the ho so thu tuc ID
	 * @return the number of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByHoSoThuTucId(long hoSoThuTucId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCID;

		Object[] finderArgs = new Object[] { hoSoThuTucId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONFIRMEDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hoSoThuTucId);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "confirmedInspection.hoSoThuTucId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_PHIEUXULYPHUID = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED,
			ConfirmedInspectionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPhieuXuLyPhuId", new String[] { Long.class.getName() },
			ConfirmedInspectionModelImpl.PHIEUXULYPHUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PHIEUXULYPHUID = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPhieuXuLyPhuId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the confirmed inspection where phieuXuLyPhuId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the matching confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection findByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = fetchByPhieuXuLyPhuId(phieuXuLyPhuId);

		if (confirmedInspection == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("phieuXuLyPhuId=");
			msg.append(phieuXuLyPhuId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchConfirmedInspectionException(msg.toString());
		}

		return confirmedInspection;
	}

	/**
	 * Returns the confirmed inspection where phieuXuLyPhuId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		return fetchByPhieuXuLyPhuId(phieuXuLyPhuId, true);
	}

	/**
	 * Returns the confirmed inspection where phieuXuLyPhuId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByPhieuXuLyPhuId(long phieuXuLyPhuId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { phieuXuLyPhuId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
					finderArgs, this);
		}

		if (result instanceof ConfirmedInspection) {
			ConfirmedInspection confirmedInspection = (ConfirmedInspection)result;

			if ((phieuXuLyPhuId != confirmedInspection.getPhieuXuLyPhuId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CONFIRMEDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

				List<ConfirmedInspection> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ConfirmedInspectionPersistenceImpl.fetchByPhieuXuLyPhuId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ConfirmedInspection confirmedInspection = list.get(0);

					result = confirmedInspection;

					cacheResult(confirmedInspection);

					if ((confirmedInspection.getPhieuXuLyPhuId() != phieuXuLyPhuId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
							finderArgs, confirmedInspection);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
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
			return (ConfirmedInspection)result;
		}
	}

	/**
	 * Removes the confirmed inspection where phieuXuLyPhuId = &#63; from the database.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the confirmed inspection that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection removeByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = findByPhieuXuLyPhuId(phieuXuLyPhuId);

		return remove(confirmedInspection);
	}

	/**
	 * Returns the number of confirmed inspections where phieuXuLyPhuId = &#63;.
	 *
	 * @param phieuXuLyPhuId the phieu xu ly phu ID
	 * @return the number of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PHIEUXULYPHUID;

		Object[] finderArgs = new Object[] { phieuXuLyPhuId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONFIRMEDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(phieuXuLyPhuId);

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

	private static final String _FINDER_COLUMN_PHIEUXULYPHUID_PHIEUXULYPHUID_2 = "confirmedInspection.phieuXuLyPhuId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CORPORATIONID = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED,
			ConfirmedInspectionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCorporationId", new String[] { String.class.getName() },
			ConfirmedInspectionModelImpl.CORPORATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONID = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCorporationId",
			new String[] { String.class.getName() });

	/**
	 * Returns the confirmed inspection where corporationId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	 *
	 * @param corporationId the corporation ID
	 * @return the matching confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection findByCorporationId(String corporationId)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = fetchByCorporationId(corporationId);

		if (confirmedInspection == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("corporationId=");
			msg.append(corporationId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchConfirmedInspectionException(msg.toString());
		}

		return confirmedInspection;
	}

	/**
	 * Returns the confirmed inspection where corporationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param corporationId the corporation ID
	 * @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByCorporationId(String corporationId)
		throws SystemException {
		return fetchByCorporationId(corporationId, true);
	}

	/**
	 * Returns the confirmed inspection where corporationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param corporationId the corporation ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByCorporationId(String corporationId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { corporationId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CORPORATIONID,
					finderArgs, this);
		}

		if (result instanceof ConfirmedInspection) {
			ConfirmedInspection confirmedInspection = (ConfirmedInspection)result;

			if (!Validator.equals(corporationId,
						confirmedInspection.getCorporationId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CONFIRMEDINSPECTION_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				List<ConfirmedInspection> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CORPORATIONID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ConfirmedInspectionPersistenceImpl.fetchByCorporationId(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ConfirmedInspection confirmedInspection = list.get(0);

					result = confirmedInspection;

					cacheResult(confirmedInspection);

					if ((confirmedInspection.getCorporationId() == null) ||
							!confirmedInspection.getCorporationId()
													.equals(corporationId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CORPORATIONID,
							finderArgs, confirmedInspection);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CORPORATIONID,
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
			return (ConfirmedInspection)result;
		}
	}

	/**
	 * Removes the confirmed inspection where corporationId = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 * @return the confirmed inspection that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection removeByCorporationId(String corporationId)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = findByCorporationId(corporationId);

		return remove(confirmedInspection);
	}

	/**
	 * Returns the number of confirmed inspections where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the number of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCorporationId(String corporationId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONID;

		Object[] finderArgs = new Object[] { corporationId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONFIRMEDINSPECTION_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
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

	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1 = "confirmedInspection.corporationId IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2 = "confirmedInspection.corporationId = ?";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3 = "(confirmedInspection.corporationId IS NULL OR confirmedInspection.corporationId = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_INSPECTORID = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED,
			ConfirmedInspectionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByInspectorId", new String[] { Long.class.getName() },
			ConfirmedInspectionModelImpl.INSPECTORID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORID = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInspectorId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the confirmed inspection where inspectorId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	 *
	 * @param inspectorId the inspector ID
	 * @return the matching confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection findByInspectorId(long inspectorId)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = fetchByInspectorId(inspectorId);

		if (confirmedInspection == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("inspectorId=");
			msg.append(inspectorId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchConfirmedInspectionException(msg.toString());
		}

		return confirmedInspection;
	}

	/**
	 * Returns the confirmed inspection where inspectorId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param inspectorId the inspector ID
	 * @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByInspectorId(long inspectorId)
		throws SystemException {
		return fetchByInspectorId(inspectorId, true);
	}

	/**
	 * Returns the confirmed inspection where inspectorId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param inspectorId the inspector ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByInspectorId(long inspectorId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { inspectorId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_INSPECTORID,
					finderArgs, this);
		}

		if (result instanceof ConfirmedInspection) {
			ConfirmedInspection confirmedInspection = (ConfirmedInspection)result;

			if ((inspectorId != confirmedInspection.getInspectorId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_CONFIRMEDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorId);

				List<ConfirmedInspection> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTORID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ConfirmedInspectionPersistenceImpl.fetchByInspectorId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ConfirmedInspection confirmedInspection = list.get(0);

					result = confirmedInspection;

					cacheResult(confirmedInspection);

					if ((confirmedInspection.getInspectorId() != inspectorId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTORID,
							finderArgs, confirmedInspection);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTORID,
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
			return (ConfirmedInspection)result;
		}
	}

	/**
	 * Removes the confirmed inspection where inspectorId = &#63; from the database.
	 *
	 * @param inspectorId the inspector ID
	 * @return the confirmed inspection that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection removeByInspectorId(long inspectorId)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = findByInspectorId(inspectorId);

		return remove(confirmedInspection);
	}

	/**
	 * Returns the number of confirmed inspections where inspectorId = &#63;.
	 *
	 * @param inspectorId the inspector ID
	 * @return the number of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectorId(long inspectorId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORID;

		Object[] finderArgs = new Object[] { inspectorId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONFIRMEDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorId);

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

	private static final String _FINDER_COLUMN_INSPECTORID_INSPECTORID_2 = "confirmedInspection.inspectorId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID =
		new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED,
			ConfirmedInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByRegisteredInspectionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID =
		new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED,
			ConfirmedInspectionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByRegisteredInspectionId",
			new String[] { Long.class.getName() },
			ConfirmedInspectionModelImpl.REGISTEREDINSPECTIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID = new FinderPath(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRegisteredInspectionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the confirmed inspections where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findByRegisteredInspectionId(
		long registeredInspectionId) throws SystemException {
		return findByRegisteredInspectionId(registeredInspectionId,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the confirmed inspections where registeredInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param start the lower bound of the range of confirmed inspections
	 * @param end the upper bound of the range of confirmed inspections (not inclusive)
	 * @return the range of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end)
		throws SystemException {
		return findByRegisteredInspectionId(registeredInspectionId, start, end,
			null);
	}

	/**
	 * Returns an ordered range of all the confirmed inspections where registeredInspectionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param start the lower bound of the range of confirmed inspections
	 * @param end the upper bound of the range of confirmed inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID;
			finderArgs = new Object[] { registeredInspectionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID;
			finderArgs = new Object[] {
					registeredInspectionId,
					
					start, end, orderByComparator
				};
		}

		List<ConfirmedInspection> list = (List<ConfirmedInspection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ConfirmedInspection confirmedInspection : list) {
				if ((registeredInspectionId != confirmedInspection.getRegisteredInspectionId())) {
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

			query.append(_SQL_SELECT_CONFIRMEDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ConfirmedInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registeredInspectionId);

				if (!pagination) {
					list = (List<ConfirmedInspection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ConfirmedInspection>(list);
				}
				else {
					list = (List<ConfirmedInspection>)QueryUtil.list(q,
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
	 * Returns the first confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection findByRegisteredInspectionId_First(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = fetchByRegisteredInspectionId_First(registeredInspectionId,
				orderByComparator);

		if (confirmedInspection != null) {
			return confirmedInspection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registeredInspectionId=");
		msg.append(registeredInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConfirmedInspectionException(msg.toString());
	}

	/**
	 * Returns the first confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByRegisteredInspectionId_First(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		List<ConfirmedInspection> list = findByRegisteredInspectionId(registeredInspectionId,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection findByRegisteredInspectionId_Last(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = fetchByRegisteredInspectionId_Last(registeredInspectionId,
				orderByComparator);

		if (confirmedInspection != null) {
			return confirmedInspection;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registeredInspectionId=");
		msg.append(registeredInspectionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchConfirmedInspectionException(msg.toString());
	}

	/**
	 * Returns the last confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching confirmed inspection, or <code>null</code> if a matching confirmed inspection could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByRegisteredInspectionId_Last(
		long registeredInspectionId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByRegisteredInspectionId(registeredInspectionId);

		if (count == 0) {
			return null;
		}

		List<ConfirmedInspection> list = findByRegisteredInspectionId(registeredInspectionId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the confirmed inspections before and after the current confirmed inspection in the ordered set where registeredInspectionId = &#63;.
	 *
	 * @param id the primary key of the current confirmed inspection
	 * @param registeredInspectionId the registered inspection ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection[] findByRegisteredInspectionId_PrevAndNext(
		long id, long registeredInspectionId,
		OrderByComparator orderByComparator)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ConfirmedInspection[] array = new ConfirmedInspectionImpl[3];

			array[0] = getByRegisteredInspectionId_PrevAndNext(session,
					confirmedInspection, registeredInspectionId,
					orderByComparator, true);

			array[1] = confirmedInspection;

			array[2] = getByRegisteredInspectionId_PrevAndNext(session,
					confirmedInspection, registeredInspectionId,
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

	protected ConfirmedInspection getByRegisteredInspectionId_PrevAndNext(
		Session session, ConfirmedInspection confirmedInspection,
		long registeredInspectionId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CONFIRMEDINSPECTION_WHERE);

		query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

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
			query.append(ConfirmedInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(registeredInspectionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(confirmedInspection);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ConfirmedInspection> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the confirmed inspections where registeredInspectionId = &#63; from the database.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRegisteredInspectionId(long registeredInspectionId)
		throws SystemException {
		for (ConfirmedInspection confirmedInspection : findByRegisteredInspectionId(
				registeredInspectionId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(confirmedInspection);
		}
	}

	/**
	 * Returns the number of confirmed inspections where registeredInspectionId = &#63;.
	 *
	 * @param registeredInspectionId the registered inspection ID
	 * @return the number of matching confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRegisteredInspectionId(long registeredInspectionId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID;

		Object[] finderArgs = new Object[] { registeredInspectionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CONFIRMEDINSPECTION_WHERE);

			query.append(_FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(registeredInspectionId);

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

	private static final String _FINDER_COLUMN_REGISTEREDINSPECTIONID_REGISTEREDINSPECTIONID_2 =
		"confirmedInspection.registeredInspectionId = ?";

	public ConfirmedInspectionPersistenceImpl() {
		setModelClass(ConfirmedInspection.class);
	}

	/**
	 * Caches the confirmed inspection in the entity cache if it is enabled.
	 *
	 * @param confirmedInspection the confirmed inspection
	 */
	@Override
	public void cacheResult(ConfirmedInspection confirmedInspection) {
		EntityCacheUtil.putResult(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionImpl.class, confirmedInspection.getPrimaryKey(),
			confirmedInspection);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
			new Object[] { confirmedInspection.getPhieuXuLyPhuId() },
			confirmedInspection);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CORPORATIONID,
			new Object[] { confirmedInspection.getCorporationId() },
			confirmedInspection);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTORID,
			new Object[] { confirmedInspection.getInspectorId() },
			confirmedInspection);

		confirmedInspection.resetOriginalValues();
	}

	/**
	 * Caches the confirmed inspections in the entity cache if it is enabled.
	 *
	 * @param confirmedInspections the confirmed inspections
	 */
	@Override
	public void cacheResult(List<ConfirmedInspection> confirmedInspections) {
		for (ConfirmedInspection confirmedInspection : confirmedInspections) {
			if (EntityCacheUtil.getResult(
						ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
						ConfirmedInspectionImpl.class,
						confirmedInspection.getPrimaryKey()) == null) {
				cacheResult(confirmedInspection);
			}
			else {
				confirmedInspection.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all confirmed inspections.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ConfirmedInspectionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ConfirmedInspectionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the confirmed inspection.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ConfirmedInspection confirmedInspection) {
		EntityCacheUtil.removeResult(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionImpl.class, confirmedInspection.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(confirmedInspection);
	}

	@Override
	public void clearCache(List<ConfirmedInspection> confirmedInspections) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ConfirmedInspection confirmedInspection : confirmedInspections) {
			EntityCacheUtil.removeResult(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
				ConfirmedInspectionImpl.class,
				confirmedInspection.getPrimaryKey());

			clearUniqueFindersCache(confirmedInspection);
		}
	}

	protected void cacheUniqueFindersCache(
		ConfirmedInspection confirmedInspection) {
		if (confirmedInspection.isNew()) {
			Object[] args = new Object[] { confirmedInspection.getPhieuXuLyPhuId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
				args, confirmedInspection);

			args = new Object[] { confirmedInspection.getCorporationId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CORPORATIONID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CORPORATIONID, args,
				confirmedInspection);

			args = new Object[] { confirmedInspection.getInspectorId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTORID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTORID, args,
				confirmedInspection);
		}
		else {
			ConfirmedInspectionModelImpl confirmedInspectionModelImpl = (ConfirmedInspectionModelImpl)confirmedInspection;

			if ((confirmedInspectionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PHIEUXULYPHUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						confirmedInspection.getPhieuXuLyPhuId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
					args, confirmedInspection);
			}

			if ((confirmedInspectionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						confirmedInspection.getCorporationId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CORPORATIONID,
					args, confirmedInspection);
			}

			if ((confirmedInspectionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_INSPECTORID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						confirmedInspection.getInspectorId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_INSPECTORID,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_INSPECTORID,
					args, confirmedInspection);
			}
		}
	}

	protected void clearUniqueFindersCache(
		ConfirmedInspection confirmedInspection) {
		ConfirmedInspectionModelImpl confirmedInspectionModelImpl = (ConfirmedInspectionModelImpl)confirmedInspection;

		Object[] args = new Object[] { confirmedInspection.getPhieuXuLyPhuId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID, args);

		if ((confirmedInspectionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PHIEUXULYPHUID.getColumnBitmask()) != 0) {
			args = new Object[] {
					confirmedInspectionModelImpl.getOriginalPhieuXuLyPhuId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PHIEUXULYPHUID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PHIEUXULYPHUID,
				args);
		}

		args = new Object[] { confirmedInspection.getCorporationId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CORPORATIONID, args);

		if ((confirmedInspectionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CORPORATIONID.getColumnBitmask()) != 0) {
			args = new Object[] {
					confirmedInspectionModelImpl.getOriginalCorporationId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CORPORATIONID,
				args);
		}

		args = new Object[] { confirmedInspection.getInspectorId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTORID, args);

		if ((confirmedInspectionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_INSPECTORID.getColumnBitmask()) != 0) {
			args = new Object[] {
					confirmedInspectionModelImpl.getOriginalInspectorId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_INSPECTORID, args);
		}
	}

	/**
	 * Creates a new confirmed inspection with the primary key. Does not add the confirmed inspection to the database.
	 *
	 * @param id the primary key for the new confirmed inspection
	 * @return the new confirmed inspection
	 */
	@Override
	public ConfirmedInspection create(long id) {
		ConfirmedInspection confirmedInspection = new ConfirmedInspectionImpl();

		confirmedInspection.setNew(true);
		confirmedInspection.setPrimaryKey(id);

		return confirmedInspection;
	}

	/**
	 * Removes the confirmed inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the confirmed inspection
	 * @return the confirmed inspection that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection remove(long id)
		throws NoSuchConfirmedInspectionException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the confirmed inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the confirmed inspection
	 * @return the confirmed inspection that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection remove(Serializable primaryKey)
		throws NoSuchConfirmedInspectionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ConfirmedInspection confirmedInspection = (ConfirmedInspection)session.get(ConfirmedInspectionImpl.class,
					primaryKey);

			if (confirmedInspection == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConfirmedInspectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(confirmedInspection);
		}
		catch (NoSuchConfirmedInspectionException nsee) {
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
	protected ConfirmedInspection removeImpl(
		ConfirmedInspection confirmedInspection) throws SystemException {
		confirmedInspection = toUnwrappedModel(confirmedInspection);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(confirmedInspection)) {
				confirmedInspection = (ConfirmedInspection)session.get(ConfirmedInspectionImpl.class,
						confirmedInspection.getPrimaryKeyObj());
			}

			if (confirmedInspection != null) {
				session.delete(confirmedInspection);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (confirmedInspection != null) {
			clearCache(confirmedInspection);
		}

		return confirmedInspection;
	}

	@Override
	public ConfirmedInspection updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection confirmedInspection)
		throws SystemException {
		confirmedInspection = toUnwrappedModel(confirmedInspection);

		boolean isNew = confirmedInspection.isNew();

		ConfirmedInspectionModelImpl confirmedInspectionModelImpl = (ConfirmedInspectionModelImpl)confirmedInspection;

		Session session = null;

		try {
			session = openSession();

			if (confirmedInspection.isNew()) {
				session.save(confirmedInspection);

				confirmedInspection.setNew(false);
			}
			else {
				session.merge(confirmedInspection);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ConfirmedInspectionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((confirmedInspectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMSDECLARATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						confirmedInspectionModelImpl.getOriginalCustomsDeclarationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMSDECLARATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMSDECLARATIONID,
					args);

				args = new Object[] {
						confirmedInspectionModelImpl.getCustomsDeclarationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMSDECLARATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMSDECLARATIONID,
					args);
			}

			if ((confirmedInspectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						confirmedInspectionModelImpl.getOriginalHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] {
						confirmedInspectionModelImpl.getHoSoThuTucId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((confirmedInspectionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						confirmedInspectionModelImpl.getOriginalRegisteredInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID,
					args);

				args = new Object[] {
						confirmedInspectionModelImpl.getRegisteredInspectionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDINSPECTIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDINSPECTIONID,
					args);
			}
		}

		EntityCacheUtil.putResult(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
			ConfirmedInspectionImpl.class, confirmedInspection.getPrimaryKey(),
			confirmedInspection);

		clearUniqueFindersCache(confirmedInspection);
		cacheUniqueFindersCache(confirmedInspection);

		return confirmedInspection;
	}

	protected ConfirmedInspection toUnwrappedModel(
		ConfirmedInspection confirmedInspection) {
		if (confirmedInspection instanceof ConfirmedInspectionImpl) {
			return confirmedInspection;
		}

		ConfirmedInspectionImpl confirmedInspectionImpl = new ConfirmedInspectionImpl();

		confirmedInspectionImpl.setNew(confirmedInspection.isNew());
		confirmedInspectionImpl.setPrimaryKey(confirmedInspection.getPrimaryKey());

		confirmedInspectionImpl.setId(confirmedInspection.getId());
		confirmedInspectionImpl.setRegisteredInspectionId(confirmedInspection.getRegisteredInspectionId());
		confirmedInspectionImpl.setCustomsDeclarationId(confirmedInspection.getCustomsDeclarationId());
		confirmedInspectionImpl.setConfirmationCode(confirmedInspection.getConfirmationCode());
		confirmedInspectionImpl.setAttachedFile(confirmedInspection.getAttachedFile());
		confirmedInspectionImpl.setInspectionDate(confirmedInspection.getInspectionDate());
		confirmedInspectionImpl.setInspectionSite(confirmedInspection.getInspectionSite());
		confirmedInspectionImpl.setInspectionDistrictCode(confirmedInspection.getInspectionDistrictCode());
		confirmedInspectionImpl.setInspectionProvincecode(confirmedInspection.getInspectionProvincecode());
		confirmedInspectionImpl.setCustomsRegion(confirmedInspection.getCustomsRegion());
		confirmedInspectionImpl.setMarkasChangedSite(confirmedInspection.getMarkasChangedSite());
		confirmedInspectionImpl.setContactName(confirmedInspection.getContactName());
		confirmedInspectionImpl.setContactPhone(confirmedInspection.getContactPhone());
		confirmedInspectionImpl.setContactEmail(confirmedInspection.getContactEmail());
		confirmedInspectionImpl.setSignName(confirmedInspection.getSignName());
		confirmedInspectionImpl.setSignTitle(confirmedInspection.getSignTitle());
		confirmedInspectionImpl.setSignPlace(confirmedInspection.getSignPlace());
		confirmedInspectionImpl.setSignDate(confirmedInspection.getSignDate());
		confirmedInspectionImpl.setRemarks(confirmedInspection.getRemarks());
		confirmedInspectionImpl.setCorporationId(confirmedInspection.getCorporationId());
		confirmedInspectionImpl.setInspectorId(confirmedInspection.getInspectorId());
		confirmedInspectionImpl.setPhieuXuLyPhuId(confirmedInspection.getPhieuXuLyPhuId());
		confirmedInspectionImpl.setHoSoThuTucId(confirmedInspection.getHoSoThuTucId());
		confirmedInspectionImpl.setDateFrom(confirmedInspection.getDateFrom());
		confirmedInspectionImpl.setDateTo(confirmedInspection.getDateTo());
		confirmedInspectionImpl.setLeader(confirmedInspection.getLeader());

		return confirmedInspectionImpl;
	}

	/**
	 * Returns the confirmed inspection with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the confirmed inspection
	 * @return the confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchConfirmedInspectionException, SystemException {
		ConfirmedInspection confirmedInspection = fetchByPrimaryKey(primaryKey);

		if (confirmedInspection == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchConfirmedInspectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return confirmedInspection;
	}

	/**
	 * Returns the confirmed inspection with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException} if it could not be found.
	 *
	 * @param id the primary key of the confirmed inspection
	 * @return the confirmed inspection
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchConfirmedInspectionException if a confirmed inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection findByPrimaryKey(long id)
		throws NoSuchConfirmedInspectionException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the confirmed inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the confirmed inspection
	 * @return the confirmed inspection, or <code>null</code> if a confirmed inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ConfirmedInspection confirmedInspection = (ConfirmedInspection)EntityCacheUtil.getResult(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
				ConfirmedInspectionImpl.class, primaryKey);

		if (confirmedInspection == _nullConfirmedInspection) {
			return null;
		}

		if (confirmedInspection == null) {
			Session session = null;

			try {
				session = openSession();

				confirmedInspection = (ConfirmedInspection)session.get(ConfirmedInspectionImpl.class,
						primaryKey);

				if (confirmedInspection != null) {
					cacheResult(confirmedInspection);
				}
				else {
					EntityCacheUtil.putResult(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
						ConfirmedInspectionImpl.class, primaryKey,
						_nullConfirmedInspection);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ConfirmedInspectionModelImpl.ENTITY_CACHE_ENABLED,
					ConfirmedInspectionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return confirmedInspection;
	}

	/**
	 * Returns the confirmed inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the confirmed inspection
	 * @return the confirmed inspection, or <code>null</code> if a confirmed inspection with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConfirmedInspection fetchByPrimaryKey(long id)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the confirmed inspections.
	 *
	 * @return the confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the confirmed inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of confirmed inspections
	 * @param end the upper bound of the range of confirmed inspections (not inclusive)
	 * @return the range of confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the confirmed inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ConfirmedInspectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of confirmed inspections
	 * @param end the upper bound of the range of confirmed inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of confirmed inspections
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ConfirmedInspection> findAll(int start, int end,
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

		List<ConfirmedInspection> list = (List<ConfirmedInspection>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONFIRMEDINSPECTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONFIRMEDINSPECTION;

				if (pagination) {
					sql = sql.concat(ConfirmedInspectionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ConfirmedInspection>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ConfirmedInspection>(list);
				}
				else {
					list = (List<ConfirmedInspection>)QueryUtil.list(q,
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
	 * Removes all the confirmed inspections from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ConfirmedInspection confirmedInspection : findAll()) {
			remove(confirmedInspection);
		}
	}

	/**
	 * Returns the number of confirmed inspections.
	 *
	 * @return the number of confirmed inspections
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

				Query q = session.createQuery(_SQL_COUNT_CONFIRMEDINSPECTION);

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
	 * Initializes the confirmed inspection persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.ConfirmedInspection")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ConfirmedInspection>> listenersList = new ArrayList<ModelListener<ConfirmedInspection>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ConfirmedInspection>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ConfirmedInspectionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CONFIRMEDINSPECTION = "SELECT confirmedInspection FROM ConfirmedInspection confirmedInspection";
	private static final String _SQL_SELECT_CONFIRMEDINSPECTION_WHERE = "SELECT confirmedInspection FROM ConfirmedInspection confirmedInspection WHERE ";
	private static final String _SQL_COUNT_CONFIRMEDINSPECTION = "SELECT COUNT(confirmedInspection) FROM ConfirmedInspection confirmedInspection";
	private static final String _SQL_COUNT_CONFIRMEDINSPECTION_WHERE = "SELECT COUNT(confirmedInspection) FROM ConfirmedInspection confirmedInspection WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "confirmedInspection.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ConfirmedInspection exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ConfirmedInspection exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ConfirmedInspectionPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"registeredInspectionId", "customsDeclarationId",
				"confirmationCode", "attachedFile", "inspectionDate",
				"inspectionSite", "inspectionDistrictCode",
				"inspectionProvincecode", "customsRegion", "markasChangedSite",
				"contactName", "contactPhone", "contactEmail", "signName",
				"signTitle", "signPlace", "signDate", "corporationId",
				"inspectorId", "phieuXuLyPhuId", "hoSoThuTucId", "dateFrom",
				"dateTo"
			});
	private static ConfirmedInspection _nullConfirmedInspection = new ConfirmedInspectionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ConfirmedInspection> toCacheModel() {
				return _nullConfirmedInspectionCacheModel;
			}
		};

	private static CacheModel<ConfirmedInspection> _nullConfirmedInspectionCacheModel =
		new CacheModel<ConfirmedInspection>() {
			@Override
			public ConfirmedInspection toEntityModel() {
				return _nullConfirmedInspection;
			}
		};
}