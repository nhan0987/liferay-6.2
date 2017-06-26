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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException;
import vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the corporation team service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see CorporationTeamPersistence
 * @see CorporationTeamUtil
 * @generated
 */
public class CorporationTeamPersistenceImpl extends BasePersistenceImpl<CorporationTeam>
	implements CorporationTeamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CorporationTeamUtil} to access the corporation team persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CorporationTeamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamModelImpl.FINDER_CACHE_ENABLED,
			CorporationTeamImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamModelImpl.FINDER_CACHE_ENABLED,
			CorporationTeamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONIDANDTRANGTHAI =
		new FinderPath(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamModelImpl.FINDER_CACHE_ENABLED,
			CorporationTeamImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCorporationIdAndTrangThai",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONIDANDTRANGTHAI =
		new FinderPath(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamModelImpl.FINDER_CACHE_ENABLED,
			CorporationTeamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCorporationIdAndTrangThai",
			new String[] { String.class.getName(), Integer.class.getName() },
			CorporationTeamModelImpl.CORPORATIONID_COLUMN_BITMASK |
			CorporationTeamModelImpl.MARKUPDELETE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONIDANDTRANGTHAI =
		new FinderPath(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByCorporationIdAndTrangThai",
			new String[] { String.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the corporation teams where corporationId = &#63; and markUpDelete = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param markUpDelete the mark up delete
	 * @return the matching corporation teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationTeam> findByCorporationIdAndTrangThai(
		String corporationId, int markUpDelete) throws SystemException {
		return findByCorporationIdAndTrangThai(corporationId, markUpDelete,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporation teams where corporationId = &#63; and markUpDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param markUpDelete the mark up delete
	 * @param start the lower bound of the range of corporation teams
	 * @param end the upper bound of the range of corporation teams (not inclusive)
	 * @return the range of matching corporation teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationTeam> findByCorporationIdAndTrangThai(
		String corporationId, int markUpDelete, int start, int end)
		throws SystemException {
		return findByCorporationIdAndTrangThai(corporationId, markUpDelete,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporation teams where corporationId = &#63; and markUpDelete = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param markUpDelete the mark up delete
	 * @param start the lower bound of the range of corporation teams
	 * @param end the upper bound of the range of corporation teams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching corporation teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationTeam> findByCorporationIdAndTrangThai(
		String corporationId, int markUpDelete, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONIDANDTRANGTHAI;
			finderArgs = new Object[] { corporationId, markUpDelete };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONIDANDTRANGTHAI;
			finderArgs = new Object[] {
					corporationId, markUpDelete,
					
					start, end, orderByComparator
				};
		}

		List<CorporationTeam> list = (List<CorporationTeam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CorporationTeam corporationTeam : list) {
				if (!Validator.equals(corporationId,
							corporationTeam.getCorporationId()) ||
						(markUpDelete != corporationTeam.getMarkUpDelete())) {
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

			query.append(_SQL_SELECT_CORPORATIONTEAM_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_MARKUPDELETE_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CorporationTeamModelImpl.ORDER_BY_JPQL);
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

				qPos.add(markUpDelete);

				if (!pagination) {
					list = (List<CorporationTeam>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CorporationTeam>(list);
				}
				else {
					list = (List<CorporationTeam>)QueryUtil.list(q,
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
	 * Returns the first corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param markUpDelete the mark up delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation team
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a matching corporation team could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam findByCorporationIdAndTrangThai_First(
		String corporationId, int markUpDelete,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationTeamException, SystemException {
		CorporationTeam corporationTeam = fetchByCorporationIdAndTrangThai_First(corporationId,
				markUpDelete, orderByComparator);

		if (corporationTeam != null) {
			return corporationTeam;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(", markUpDelete=");
		msg.append(markUpDelete);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationTeamException(msg.toString());
	}

	/**
	 * Returns the first corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param markUpDelete the mark up delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation team, or <code>null</code> if a matching corporation team could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam fetchByCorporationIdAndTrangThai_First(
		String corporationId, int markUpDelete,
		OrderByComparator orderByComparator) throws SystemException {
		List<CorporationTeam> list = findByCorporationIdAndTrangThai(corporationId,
				markUpDelete, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param markUpDelete the mark up delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation team
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a matching corporation team could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam findByCorporationIdAndTrangThai_Last(
		String corporationId, int markUpDelete,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationTeamException, SystemException {
		CorporationTeam corporationTeam = fetchByCorporationIdAndTrangThai_Last(corporationId,
				markUpDelete, orderByComparator);

		if (corporationTeam != null) {
			return corporationTeam;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(", markUpDelete=");
		msg.append(markUpDelete);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationTeamException(msg.toString());
	}

	/**
	 * Returns the last corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param markUpDelete the mark up delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation team, or <code>null</code> if a matching corporation team could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam fetchByCorporationIdAndTrangThai_Last(
		String corporationId, int markUpDelete,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCorporationIdAndTrangThai(corporationId, markUpDelete);

		if (count == 0) {
			return null;
		}

		List<CorporationTeam> list = findByCorporationIdAndTrangThai(corporationId,
				markUpDelete, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the corporation teams before and after the current corporation team in the ordered set where corporationId = &#63; and markUpDelete = &#63;.
	 *
	 * @param id the primary key of the current corporation team
	 * @param corporationId the corporation ID
	 * @param markUpDelete the mark up delete
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next corporation team
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam[] findByCorporationIdAndTrangThai_PrevAndNext(
		long id, String corporationId, int markUpDelete,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationTeamException, SystemException {
		CorporationTeam corporationTeam = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CorporationTeam[] array = new CorporationTeamImpl[3];

			array[0] = getByCorporationIdAndTrangThai_PrevAndNext(session,
					corporationTeam, corporationId, markUpDelete,
					orderByComparator, true);

			array[1] = corporationTeam;

			array[2] = getByCorporationIdAndTrangThai_PrevAndNext(session,
					corporationTeam, corporationId, markUpDelete,
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

	protected CorporationTeam getByCorporationIdAndTrangThai_PrevAndNext(
		Session session, CorporationTeam corporationTeam, String corporationId,
		int markUpDelete, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CORPORATIONTEAM_WHERE);

		boolean bindCorporationId = false;

		if (corporationId == null) {
			query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_1);
		}
		else if (corporationId.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_3);
		}
		else {
			bindCorporationId = true;

			query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_2);
		}

		query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_MARKUPDELETE_2);

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
			query.append(CorporationTeamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCorporationId) {
			qPos.add(corporationId);
		}

		qPos.add(markUpDelete);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(corporationTeam);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CorporationTeam> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the corporation teams where corporationId = &#63; and markUpDelete = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 * @param markUpDelete the mark up delete
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCorporationIdAndTrangThai(String corporationId,
		int markUpDelete) throws SystemException {
		for (CorporationTeam corporationTeam : findByCorporationIdAndTrangThai(
				corporationId, markUpDelete, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(corporationTeam);
		}
	}

	/**
	 * Returns the number of corporation teams where corporationId = &#63; and markUpDelete = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param markUpDelete the mark up delete
	 * @return the number of matching corporation teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCorporationIdAndTrangThai(String corporationId,
		int markUpDelete) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONIDANDTRANGTHAI;

		Object[] finderArgs = new Object[] { corporationId, markUpDelete };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CORPORATIONTEAM_WHERE);

			boolean bindCorporationId = false;

			if (corporationId == null) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_1);
			}
			else if (corporationId.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_3);
			}
			else {
				bindCorporationId = true;

				query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_2);
			}

			query.append(_FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_MARKUPDELETE_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationId) {
					qPos.add(corporationId);
				}

				qPos.add(markUpDelete);

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

	private static final String _FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_1 =
		"corporationTeam.corporationId IS NULL AND ";
	private static final String _FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_2 =
		"corporationTeam.corporationId = ? AND ";
	private static final String _FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_CORPORATIONID_3 =
		"(corporationTeam.corporationId IS NULL OR corporationTeam.corporationId = '') AND ";
	private static final String _FINDER_COLUMN_CORPORATIONIDANDTRANGTHAI_MARKUPDELETE_2 =
		"corporationTeam.markUpDelete = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamModelImpl.FINDER_CACHE_ENABLED,
			CorporationTeamImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCorporationId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamModelImpl.FINDER_CACHE_ENABLED,
			CorporationTeamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCorporationId",
			new String[] { String.class.getName() },
			CorporationTeamModelImpl.CORPORATIONID_COLUMN_BITMASK |
			CorporationTeamModelImpl.MARKUPDELETE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONID = new FinderPath(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCorporationId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the corporation teams where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the matching corporation teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationTeam> findByCorporationId(String corporationId)
		throws SystemException {
		return findByCorporationId(corporationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporation teams where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of corporation teams
	 * @param end the upper bound of the range of corporation teams (not inclusive)
	 * @return the range of matching corporation teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationTeam> findByCorporationId(String corporationId,
		int start, int end) throws SystemException {
		return findByCorporationId(corporationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporation teams where corporationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationId the corporation ID
	 * @param start the lower bound of the range of corporation teams
	 * @param end the upper bound of the range of corporation teams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching corporation teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationTeam> findByCorporationId(String corporationId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] { corporationId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] {
					corporationId,
					
					start, end, orderByComparator
				};
		}

		List<CorporationTeam> list = (List<CorporationTeam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CorporationTeam corporationTeam : list) {
				if (!Validator.equals(corporationId,
							corporationTeam.getCorporationId())) {
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

			query.append(_SQL_SELECT_CORPORATIONTEAM_WHERE);

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

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CorporationTeamModelImpl.ORDER_BY_JPQL);
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

				if (!pagination) {
					list = (List<CorporationTeam>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CorporationTeam>(list);
				}
				else {
					list = (List<CorporationTeam>)QueryUtil.list(q,
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
	 * Returns the first corporation team in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation team
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a matching corporation team could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam findByCorporationId_First(String corporationId,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationTeamException, SystemException {
		CorporationTeam corporationTeam = fetchByCorporationId_First(corporationId,
				orderByComparator);

		if (corporationTeam != null) {
			return corporationTeam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationTeamException(msg.toString());
	}

	/**
	 * Returns the first corporation team in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching corporation team, or <code>null</code> if a matching corporation team could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam fetchByCorporationId_First(String corporationId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CorporationTeam> list = findByCorporationId(corporationId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last corporation team in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation team
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a matching corporation team could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam findByCorporationId_Last(String corporationId,
		OrderByComparator orderByComparator)
		throws NoSuchCorporationTeamException, SystemException {
		CorporationTeam corporationTeam = fetchByCorporationId_Last(corporationId,
				orderByComparator);

		if (corporationTeam != null) {
			return corporationTeam;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationId=");
		msg.append(corporationId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCorporationTeamException(msg.toString());
	}

	/**
	 * Returns the last corporation team in the ordered set where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching corporation team, or <code>null</code> if a matching corporation team could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam fetchByCorporationId_Last(String corporationId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCorporationId(corporationId);

		if (count == 0) {
			return null;
		}

		List<CorporationTeam> list = findByCorporationId(corporationId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the corporation teams before and after the current corporation team in the ordered set where corporationId = &#63;.
	 *
	 * @param id the primary key of the current corporation team
	 * @param corporationId the corporation ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next corporation team
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam[] findByCorporationId_PrevAndNext(long id,
		String corporationId, OrderByComparator orderByComparator)
		throws NoSuchCorporationTeamException, SystemException {
		CorporationTeam corporationTeam = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CorporationTeam[] array = new CorporationTeamImpl[3];

			array[0] = getByCorporationId_PrevAndNext(session, corporationTeam,
					corporationId, orderByComparator, true);

			array[1] = corporationTeam;

			array[2] = getByCorporationId_PrevAndNext(session, corporationTeam,
					corporationId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CorporationTeam getByCorporationId_PrevAndNext(Session session,
		CorporationTeam corporationTeam, String corporationId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CORPORATIONTEAM_WHERE);

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
			query.append(CorporationTeamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCorporationId) {
			qPos.add(corporationId);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(corporationTeam);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CorporationTeam> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the corporation teams where corporationId = &#63; from the database.
	 *
	 * @param corporationId the corporation ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCorporationId(String corporationId)
		throws SystemException {
		for (CorporationTeam corporationTeam : findByCorporationId(
				corporationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(corporationTeam);
		}
	}

	/**
	 * Returns the number of corporation teams where corporationId = &#63;.
	 *
	 * @param corporationId the corporation ID
	 * @return the number of matching corporation teams
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

			query.append(_SQL_COUNT_CORPORATIONTEAM_WHERE);

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

	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1 = "corporationTeam.corporationId IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2 = "corporationTeam.corporationId = ?";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3 = "(corporationTeam.corporationId IS NULL OR corporationTeam.corporationId = '')";

	public CorporationTeamPersistenceImpl() {
		setModelClass(CorporationTeam.class);
	}

	/**
	 * Caches the corporation team in the entity cache if it is enabled.
	 *
	 * @param corporationTeam the corporation team
	 */
	@Override
	public void cacheResult(CorporationTeam corporationTeam) {
		EntityCacheUtil.putResult(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamImpl.class, corporationTeam.getPrimaryKey(),
			corporationTeam);

		corporationTeam.resetOriginalValues();
	}

	/**
	 * Caches the corporation teams in the entity cache if it is enabled.
	 *
	 * @param corporationTeams the corporation teams
	 */
	@Override
	public void cacheResult(List<CorporationTeam> corporationTeams) {
		for (CorporationTeam corporationTeam : corporationTeams) {
			if (EntityCacheUtil.getResult(
						CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
						CorporationTeamImpl.class,
						corporationTeam.getPrimaryKey()) == null) {
				cacheResult(corporationTeam);
			}
			else {
				corporationTeam.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all corporation teams.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CorporationTeamImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CorporationTeamImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the corporation team.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CorporationTeam corporationTeam) {
		EntityCacheUtil.removeResult(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamImpl.class, corporationTeam.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CorporationTeam> corporationTeams) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CorporationTeam corporationTeam : corporationTeams) {
			EntityCacheUtil.removeResult(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
				CorporationTeamImpl.class, corporationTeam.getPrimaryKey());
		}
	}

	/**
	 * Creates a new corporation team with the primary key. Does not add the corporation team to the database.
	 *
	 * @param id the primary key for the new corporation team
	 * @return the new corporation team
	 */
	@Override
	public CorporationTeam create(long id) {
		CorporationTeam corporationTeam = new CorporationTeamImpl();

		corporationTeam.setNew(true);
		corporationTeam.setPrimaryKey(id);

		return corporationTeam;
	}

	/**
	 * Removes the corporation team with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the corporation team
	 * @return the corporation team that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam remove(long id)
		throws NoSuchCorporationTeamException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the corporation team with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the corporation team
	 * @return the corporation team that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam remove(Serializable primaryKey)
		throws NoSuchCorporationTeamException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CorporationTeam corporationTeam = (CorporationTeam)session.get(CorporationTeamImpl.class,
					primaryKey);

			if (corporationTeam == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCorporationTeamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(corporationTeam);
		}
		catch (NoSuchCorporationTeamException nsee) {
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
	protected CorporationTeam removeImpl(CorporationTeam corporationTeam)
		throws SystemException {
		corporationTeam = toUnwrappedModel(corporationTeam);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(corporationTeam)) {
				corporationTeam = (CorporationTeam)session.get(CorporationTeamImpl.class,
						corporationTeam.getPrimaryKeyObj());
			}

			if (corporationTeam != null) {
				session.delete(corporationTeam);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (corporationTeam != null) {
			clearCache(corporationTeam);
		}

		return corporationTeam;
	}

	@Override
	public CorporationTeam updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam corporationTeam)
		throws SystemException {
		corporationTeam = toUnwrappedModel(corporationTeam);

		boolean isNew = corporationTeam.isNew();

		CorporationTeamModelImpl corporationTeamModelImpl = (CorporationTeamModelImpl)corporationTeam;

		Session session = null;

		try {
			session = openSession();

			if (corporationTeam.isNew()) {
				session.save(corporationTeam);

				corporationTeam.setNew(false);
			}
			else {
				session.merge(corporationTeam);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CorporationTeamModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((corporationTeamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONIDANDTRANGTHAI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						corporationTeamModelImpl.getOriginalCorporationId(),
						corporationTeamModelImpl.getOriginalMarkUpDelete()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONIDANDTRANGTHAI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONIDANDTRANGTHAI,
					args);

				args = new Object[] {
						corporationTeamModelImpl.getCorporationId(),
						corporationTeamModelImpl.getMarkUpDelete()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONIDANDTRANGTHAI,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONIDANDTRANGTHAI,
					args);
			}

			if ((corporationTeamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						corporationTeamModelImpl.getOriginalCorporationId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);

				args = new Object[] { corporationTeamModelImpl.getCorporationId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);
			}
		}

		EntityCacheUtil.putResult(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
			CorporationTeamImpl.class, corporationTeam.getPrimaryKey(),
			corporationTeam);

		return corporationTeam;
	}

	protected CorporationTeam toUnwrappedModel(CorporationTeam corporationTeam) {
		if (corporationTeam instanceof CorporationTeamImpl) {
			return corporationTeam;
		}

		CorporationTeamImpl corporationTeamImpl = new CorporationTeamImpl();

		corporationTeamImpl.setNew(corporationTeam.isNew());
		corporationTeamImpl.setPrimaryKey(corporationTeam.getPrimaryKey());

		corporationTeamImpl.setId(corporationTeam.getId());
		corporationTeamImpl.setCorporationId(corporationTeam.getCorporationId());
		corporationTeamImpl.setTeamName(corporationTeam.getTeamName());
		corporationTeamImpl.setMarkUpDelete(corporationTeam.getMarkUpDelete());

		return corporationTeamImpl;
	}

	/**
	 * Returns the corporation team with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the corporation team
	 * @return the corporation team
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCorporationTeamException, SystemException {
		CorporationTeam corporationTeam = fetchByPrimaryKey(primaryKey);

		if (corporationTeam == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCorporationTeamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return corporationTeam;
	}

	/**
	 * Returns the corporation team with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException} if it could not be found.
	 *
	 * @param id the primary key of the corporation team
	 * @return the corporation team
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchCorporationTeamException if a corporation team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam findByPrimaryKey(long id)
		throws NoSuchCorporationTeamException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the corporation team with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the corporation team
	 * @return the corporation team, or <code>null</code> if a corporation team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CorporationTeam corporationTeam = (CorporationTeam)EntityCacheUtil.getResult(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
				CorporationTeamImpl.class, primaryKey);

		if (corporationTeam == _nullCorporationTeam) {
			return null;
		}

		if (corporationTeam == null) {
			Session session = null;

			try {
				session = openSession();

				corporationTeam = (CorporationTeam)session.get(CorporationTeamImpl.class,
						primaryKey);

				if (corporationTeam != null) {
					cacheResult(corporationTeam);
				}
				else {
					EntityCacheUtil.putResult(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
						CorporationTeamImpl.class, primaryKey,
						_nullCorporationTeam);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CorporationTeamModelImpl.ENTITY_CACHE_ENABLED,
					CorporationTeamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return corporationTeam;
	}

	/**
	 * Returns the corporation team with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the corporation team
	 * @return the corporation team, or <code>null</code> if a corporation team with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CorporationTeam fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the corporation teams.
	 *
	 * @return the corporation teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationTeam> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the corporation teams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporation teams
	 * @param end the upper bound of the range of corporation teams (not inclusive)
	 * @return the range of corporation teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationTeam> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the corporation teams.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationTeamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporation teams
	 * @param end the upper bound of the range of corporation teams (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of corporation teams
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CorporationTeam> findAll(int start, int end,
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

		List<CorporationTeam> list = (List<CorporationTeam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CORPORATIONTEAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CORPORATIONTEAM;

				if (pagination) {
					sql = sql.concat(CorporationTeamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CorporationTeam>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CorporationTeam>(list);
				}
				else {
					list = (List<CorporationTeam>)QueryUtil.list(q,
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
	 * Removes all the corporation teams from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CorporationTeam corporationTeam : findAll()) {
			remove(corporationTeam);
		}
	}

	/**
	 * Returns the number of corporation teams.
	 *
	 * @return the number of corporation teams
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

				Query q = session.createQuery(_SQL_COUNT_CORPORATIONTEAM);

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
	 * Initializes the corporation team persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.CorporationTeam")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CorporationTeam>> listenersList = new ArrayList<ModelListener<CorporationTeam>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CorporationTeam>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CorporationTeamImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_CORPORATIONTEAM = "SELECT corporationTeam FROM CorporationTeam corporationTeam";
	private static final String _SQL_SELECT_CORPORATIONTEAM_WHERE = "SELECT corporationTeam FROM CorporationTeam corporationTeam WHERE ";
	private static final String _SQL_COUNT_CORPORATIONTEAM = "SELECT COUNT(corporationTeam) FROM CorporationTeam corporationTeam";
	private static final String _SQL_COUNT_CORPORATIONTEAM_WHERE = "SELECT COUNT(corporationTeam) FROM CorporationTeam corporationTeam WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "corporationTeam.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CorporationTeam exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CorporationTeam exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CorporationTeamPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"corporationId", "teamName", "markUpDelete"
			});
	private static CorporationTeam _nullCorporationTeam = new CorporationTeamImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CorporationTeam> toCacheModel() {
				return _nullCorporationTeamCacheModel;
			}
		};

	private static CacheModel<CorporationTeam> _nullCorporationTeamCacheModel = new CacheModel<CorporationTeam>() {
			@Override
			public CorporationTeam toEntityModel() {
				return _nullCorporationTeam;
			}
		};
}