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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException;
import vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the action log service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ActionLogPersistence
 * @see ActionLogUtil
 * @generated
 */
public class ActionLogPersistenceImpl extends BasePersistenceImpl<ActionLog>
	implements ActionLogPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ActionLogUtil} to access the action log persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ActionLogImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByhosothutucid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByhosothutucid",
			new String[] { Long.class.getName() },
			ActionLogModelImpl.HOSOTHUTUCID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOSOTHUTUCID = new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByhosothutucid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the action logs where hosothutucid = &#63;.
	 *
	 * @param hosothutucid the hosothutucid
	 * @return the matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByhosothutucid(long hosothutucid)
		throws SystemException {
		return findByhosothutucid(hosothutucid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the action logs where hosothutucid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hosothutucid the hosothutucid
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @return the range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByhosothutucid(long hosothutucid, int start,
		int end) throws SystemException {
		return findByhosothutucid(hosothutucid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the action logs where hosothutucid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param hosothutucid the hosothutucid
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByhosothutucid(long hosothutucid, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] { hosothutucid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOSOTHUTUCID;
			finderArgs = new Object[] {
					hosothutucid,
					
					start, end, orderByComparator
				};
		}

		List<ActionLog> list = (List<ActionLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ActionLog actionLog : list) {
				if ((hosothutucid != actionLog.getHosothutucid())) {
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

			query.append(_SQL_SELECT_ACTIONLOG_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ActionLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hosothutucid);

				if (!pagination) {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActionLog>(list);
				}
				else {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first action log in the ordered set where hosothutucid = &#63;.
	 *
	 * @param hosothutucid the hosothutucid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByhosothutucid_First(long hosothutucid,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByhosothutucid_First(hosothutucid,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hosothutucid=");
		msg.append(hosothutucid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the first action log in the ordered set where hosothutucid = &#63;.
	 *
	 * @param hosothutucid the hosothutucid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByhosothutucid_First(long hosothutucid,
		OrderByComparator orderByComparator) throws SystemException {
		List<ActionLog> list = findByhosothutucid(hosothutucid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last action log in the ordered set where hosothutucid = &#63;.
	 *
	 * @param hosothutucid the hosothutucid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByhosothutucid_Last(long hosothutucid,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByhosothutucid_Last(hosothutucid,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("hosothutucid=");
		msg.append(hosothutucid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the last action log in the ordered set where hosothutucid = &#63;.
	 *
	 * @param hosothutucid the hosothutucid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByhosothutucid_Last(long hosothutucid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByhosothutucid(hosothutucid);

		if (count == 0) {
			return null;
		}

		List<ActionLog> list = findByhosothutucid(hosothutucid, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the action logs before and after the current action log in the ordered set where hosothutucid = &#63;.
	 *
	 * @param id the primary key of the current action log
	 * @param hosothutucid the hosothutucid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog[] findByhosothutucid_PrevAndNext(long id,
		long hosothutucid, OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ActionLog[] array = new ActionLogImpl[3];

			array[0] = getByhosothutucid_PrevAndNext(session, actionLog,
					hosothutucid, orderByComparator, true);

			array[1] = actionLog;

			array[2] = getByhosothutucid_PrevAndNext(session, actionLog,
					hosothutucid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ActionLog getByhosothutucid_PrevAndNext(Session session,
		ActionLog actionLog, long hosothutucid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIONLOG_WHERE);

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
			query.append(ActionLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(hosothutucid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(actionLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ActionLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the action logs where hosothutucid = &#63; from the database.
	 *
	 * @param hosothutucid the hosothutucid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByhosothutucid(long hosothutucid)
		throws SystemException {
		for (ActionLog actionLog : findByhosothutucid(hosothutucid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(actionLog);
		}
	}

	/**
	 * Returns the number of action logs where hosothutucid = &#63;.
	 *
	 * @param hosothutucid the hosothutucid
	 * @return the number of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByhosothutucid(long hosothutucid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOSOTHUTUCID;

		Object[] finderArgs = new Object[] { hosothutucid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACTIONLOG_WHERE);

			query.append(_FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(hosothutucid);

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

	private static final String _FINDER_COLUMN_HOSOTHUTUCID_HOSOTHUTUCID_2 = "actionLog.hosothutucid = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MASOHOSO = new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMaSoHoSo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASOHOSO =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMaSoHoSo",
			new String[] { String.class.getName() },
			ActionLogModelImpl.MASOHOSO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MASOHOSO = new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaSoHoSo",
			new String[] { String.class.getName() });

	/**
	 * Returns all the action logs where masohoso = &#63;.
	 *
	 * @param masohoso the masohoso
	 * @return the matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByMaSoHoSo(String masohoso)
		throws SystemException {
		return findByMaSoHoSo(masohoso, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the action logs where masohoso = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param masohoso the masohoso
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @return the range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByMaSoHoSo(String masohoso, int start, int end)
		throws SystemException {
		return findByMaSoHoSo(masohoso, start, end, null);
	}

	/**
	 * Returns an ordered range of all the action logs where masohoso = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param masohoso the masohoso
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByMaSoHoSo(String masohoso, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASOHOSO;
			finderArgs = new Object[] { masohoso };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MASOHOSO;
			finderArgs = new Object[] { masohoso, start, end, orderByComparator };
		}

		List<ActionLog> list = (List<ActionLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ActionLog actionLog : list) {
				if (!Validator.equals(masohoso, actionLog.getMasohoso())) {
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

			query.append(_SQL_SELECT_ACTIONLOG_WHERE);

			boolean bindMasohoso = false;

			if (masohoso == null) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_1);
			}
			else if (masohoso.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_3);
			}
			else {
				bindMasohoso = true;

				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ActionLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMasohoso) {
					qPos.add(masohoso);
				}

				if (!pagination) {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActionLog>(list);
				}
				else {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first action log in the ordered set where masohoso = &#63;.
	 *
	 * @param masohoso the masohoso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByMaSoHoSo_First(String masohoso,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByMaSoHoSo_First(masohoso, orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("masohoso=");
		msg.append(masohoso);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the first action log in the ordered set where masohoso = &#63;.
	 *
	 * @param masohoso the masohoso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByMaSoHoSo_First(String masohoso,
		OrderByComparator orderByComparator) throws SystemException {
		List<ActionLog> list = findByMaSoHoSo(masohoso, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last action log in the ordered set where masohoso = &#63;.
	 *
	 * @param masohoso the masohoso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByMaSoHoSo_Last(String masohoso,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByMaSoHoSo_Last(masohoso, orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("masohoso=");
		msg.append(masohoso);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the last action log in the ordered set where masohoso = &#63;.
	 *
	 * @param masohoso the masohoso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByMaSoHoSo_Last(String masohoso,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMaSoHoSo(masohoso);

		if (count == 0) {
			return null;
		}

		List<ActionLog> list = findByMaSoHoSo(masohoso, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the action logs before and after the current action log in the ordered set where masohoso = &#63;.
	 *
	 * @param id the primary key of the current action log
	 * @param masohoso the masohoso
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog[] findByMaSoHoSo_PrevAndNext(long id, String masohoso,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ActionLog[] array = new ActionLogImpl[3];

			array[0] = getByMaSoHoSo_PrevAndNext(session, actionLog, masohoso,
					orderByComparator, true);

			array[1] = actionLog;

			array[2] = getByMaSoHoSo_PrevAndNext(session, actionLog, masohoso,
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

	protected ActionLog getByMaSoHoSo_PrevAndNext(Session session,
		ActionLog actionLog, String masohoso,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIONLOG_WHERE);

		boolean bindMasohoso = false;

		if (masohoso == null) {
			query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_1);
		}
		else if (masohoso.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_3);
		}
		else {
			bindMasohoso = true;

			query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_2);
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
			query.append(ActionLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMasohoso) {
			qPos.add(masohoso);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(actionLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ActionLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the action logs where masohoso = &#63; from the database.
	 *
	 * @param masohoso the masohoso
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMaSoHoSo(String masohoso) throws SystemException {
		for (ActionLog actionLog : findByMaSoHoSo(masohoso, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(actionLog);
		}
	}

	/**
	 * Returns the number of action logs where masohoso = &#63;.
	 *
	 * @param masohoso the masohoso
	 * @return the number of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaSoHoSo(String masohoso) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MASOHOSO;

		Object[] finderArgs = new Object[] { masohoso };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACTIONLOG_WHERE);

			boolean bindMasohoso = false;

			if (masohoso == null) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_1);
			}
			else if (masohoso.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_3);
			}
			else {
				bindMasohoso = true;

				query.append(_FINDER_COLUMN_MASOHOSO_MASOHOSO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMasohoso) {
					qPos.add(masohoso);
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

	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_1 = "actionLog.masohoso IS NULL";
	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_2 = "actionLog.masohoso = ?";
	private static final String _FINDER_COLUMN_MASOHOSO_MASOHOSO_3 = "(actionLog.masohoso IS NULL OR actionLog.masohoso = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_MABIENNHAN =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByMaBienNhan",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MABIENNHAN =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByMaBienNhan",
			new String[] { String.class.getName() },
			ActionLogModelImpl.MABIENNHAN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_MABIENNHAN = new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByMaBienNhan",
			new String[] { String.class.getName() });

	/**
	 * Returns all the action logs where mabiennhan = &#63;.
	 *
	 * @param mabiennhan the mabiennhan
	 * @return the matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByMaBienNhan(String mabiennhan)
		throws SystemException {
		return findByMaBienNhan(mabiennhan, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the action logs where mabiennhan = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mabiennhan the mabiennhan
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @return the range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByMaBienNhan(String mabiennhan, int start,
		int end) throws SystemException {
		return findByMaBienNhan(mabiennhan, start, end, null);
	}

	/**
	 * Returns an ordered range of all the action logs where mabiennhan = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param mabiennhan the mabiennhan
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByMaBienNhan(String mabiennhan, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MABIENNHAN;
			finderArgs = new Object[] { mabiennhan };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_MABIENNHAN;
			finderArgs = new Object[] { mabiennhan, start, end, orderByComparator };
		}

		List<ActionLog> list = (List<ActionLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ActionLog actionLog : list) {
				if (!Validator.equals(mabiennhan, actionLog.getMabiennhan())) {
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

			query.append(_SQL_SELECT_ACTIONLOG_WHERE);

			boolean bindMabiennhan = false;

			if (mabiennhan == null) {
				query.append(_FINDER_COLUMN_MABIENNHAN_MABIENNHAN_1);
			}
			else if (mabiennhan.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MABIENNHAN_MABIENNHAN_3);
			}
			else {
				bindMabiennhan = true;

				query.append(_FINDER_COLUMN_MABIENNHAN_MABIENNHAN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ActionLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMabiennhan) {
					qPos.add(mabiennhan);
				}

				if (!pagination) {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActionLog>(list);
				}
				else {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first action log in the ordered set where mabiennhan = &#63;.
	 *
	 * @param mabiennhan the mabiennhan
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByMaBienNhan_First(String mabiennhan,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByMaBienNhan_First(mabiennhan,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mabiennhan=");
		msg.append(mabiennhan);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the first action log in the ordered set where mabiennhan = &#63;.
	 *
	 * @param mabiennhan the mabiennhan
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByMaBienNhan_First(String mabiennhan,
		OrderByComparator orderByComparator) throws SystemException {
		List<ActionLog> list = findByMaBienNhan(mabiennhan, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last action log in the ordered set where mabiennhan = &#63;.
	 *
	 * @param mabiennhan the mabiennhan
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByMaBienNhan_Last(String mabiennhan,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByMaBienNhan_Last(mabiennhan,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("mabiennhan=");
		msg.append(mabiennhan);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the last action log in the ordered set where mabiennhan = &#63;.
	 *
	 * @param mabiennhan the mabiennhan
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByMaBienNhan_Last(String mabiennhan,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByMaBienNhan(mabiennhan);

		if (count == 0) {
			return null;
		}

		List<ActionLog> list = findByMaBienNhan(mabiennhan, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the action logs before and after the current action log in the ordered set where mabiennhan = &#63;.
	 *
	 * @param id the primary key of the current action log
	 * @param mabiennhan the mabiennhan
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog[] findByMaBienNhan_PrevAndNext(long id, String mabiennhan,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ActionLog[] array = new ActionLogImpl[3];

			array[0] = getByMaBienNhan_PrevAndNext(session, actionLog,
					mabiennhan, orderByComparator, true);

			array[1] = actionLog;

			array[2] = getByMaBienNhan_PrevAndNext(session, actionLog,
					mabiennhan, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ActionLog getByMaBienNhan_PrevAndNext(Session session,
		ActionLog actionLog, String mabiennhan,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIONLOG_WHERE);

		boolean bindMabiennhan = false;

		if (mabiennhan == null) {
			query.append(_FINDER_COLUMN_MABIENNHAN_MABIENNHAN_1);
		}
		else if (mabiennhan.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_MABIENNHAN_MABIENNHAN_3);
		}
		else {
			bindMabiennhan = true;

			query.append(_FINDER_COLUMN_MABIENNHAN_MABIENNHAN_2);
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
			query.append(ActionLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindMabiennhan) {
			qPos.add(mabiennhan);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(actionLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ActionLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the action logs where mabiennhan = &#63; from the database.
	 *
	 * @param mabiennhan the mabiennhan
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByMaBienNhan(String mabiennhan) throws SystemException {
		for (ActionLog actionLog : findByMaBienNhan(mabiennhan,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(actionLog);
		}
	}

	/**
	 * Returns the number of action logs where mabiennhan = &#63;.
	 *
	 * @param mabiennhan the mabiennhan
	 * @return the number of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByMaBienNhan(String mabiennhan) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_MABIENNHAN;

		Object[] finderArgs = new Object[] { mabiennhan };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACTIONLOG_WHERE);

			boolean bindMabiennhan = false;

			if (mabiennhan == null) {
				query.append(_FINDER_COLUMN_MABIENNHAN_MABIENNHAN_1);
			}
			else if (mabiennhan.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_MABIENNHAN_MABIENNHAN_3);
			}
			else {
				bindMabiennhan = true;

				query.append(_FINDER_COLUMN_MABIENNHAN_MABIENNHAN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindMabiennhan) {
					qPos.add(mabiennhan);
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

	private static final String _FINDER_COLUMN_MABIENNHAN_MABIENNHAN_1 = "actionLog.mabiennhan IS NULL";
	private static final String _FINDER_COLUMN_MABIENNHAN_MABIENNHAN_2 = "actionLog.mabiennhan = ?";
	private static final String _FINDER_COLUMN_MABIENNHAN_MABIENNHAN_3 = "(actionLog.mabiennhan IS NULL OR actionLog.mabiennhan = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IMPORTERNAME =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByImporterName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByImporterName",
			new String[] { String.class.getName() },
			ActionLogModelImpl.IMPORTERNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IMPORTERNAME = new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByImporterName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the action logs where importername = &#63;.
	 *
	 * @param importername the importername
	 * @return the matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByImporterName(String importername)
		throws SystemException {
		return findByImporterName(importername, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the action logs where importername = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @return the range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByImporterName(String importername, int start,
		int end) throws SystemException {
		return findByImporterName(importername, start, end, null);
	}

	/**
	 * Returns an ordered range of all the action logs where importername = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param importername the importername
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByImporterName(String importername, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<ActionLog> list = (List<ActionLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ActionLog actionLog : list) {
				if (!Validator.equals(importername, actionLog.getImportername())) {
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

			query.append(_SQL_SELECT_ACTIONLOG_WHERE);

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
				query.append(ActionLogModelImpl.ORDER_BY_JPQL);
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
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActionLog>(list);
				}
				else {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first action log in the ordered set where importername = &#63;.
	 *
	 * @param importername the importername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByImporterName_First(String importername,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByImporterName_First(importername,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importername=");
		msg.append(importername);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the first action log in the ordered set where importername = &#63;.
	 *
	 * @param importername the importername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByImporterName_First(String importername,
		OrderByComparator orderByComparator) throws SystemException {
		List<ActionLog> list = findByImporterName(importername, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last action log in the ordered set where importername = &#63;.
	 *
	 * @param importername the importername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByImporterName_Last(String importername,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByImporterName_Last(importername,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("importername=");
		msg.append(importername);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the last action log in the ordered set where importername = &#63;.
	 *
	 * @param importername the importername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByImporterName_Last(String importername,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByImporterName(importername);

		if (count == 0) {
			return null;
		}

		List<ActionLog> list = findByImporterName(importername, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the action logs before and after the current action log in the ordered set where importername = &#63;.
	 *
	 * @param id the primary key of the current action log
	 * @param importername the importername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog[] findByImporterName_PrevAndNext(long id,
		String importername, OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ActionLog[] array = new ActionLogImpl[3];

			array[0] = getByImporterName_PrevAndNext(session, actionLog,
					importername, orderByComparator, true);

			array[1] = actionLog;

			array[2] = getByImporterName_PrevAndNext(session, actionLog,
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

	protected ActionLog getByImporterName_PrevAndNext(Session session,
		ActionLog actionLog, String importername,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIONLOG_WHERE);

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
			query.append(ActionLogModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(actionLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ActionLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the action logs where importername = &#63; from the database.
	 *
	 * @param importername the importername
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByImporterName(String importername)
		throws SystemException {
		for (ActionLog actionLog : findByImporterName(importername,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(actionLog);
		}
	}

	/**
	 * Returns the number of action logs where importername = &#63;.
	 *
	 * @param importername the importername
	 * @return the number of matching action logs
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

			query.append(_SQL_COUNT_ACTIONLOG_WHERE);

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

	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_1 = "actionLog.importername IS NULL";
	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_2 = "actionLog.importername = ?";
	private static final String _FINDER_COLUMN_IMPORTERNAME_IMPORTERNAME_3 = "(actionLog.importername IS NULL OR actionLog.importername = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCorporationId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCorporationId",
			new String[] { String.class.getName() },
			ActionLogModelImpl.CORPORATIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CORPORATIONID = new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCorporationId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the action logs where corporationid = &#63;.
	 *
	 * @param corporationid the corporationid
	 * @return the matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByCorporationId(String corporationid)
		throws SystemException {
		return findByCorporationId(corporationid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the action logs where corporationid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationid the corporationid
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @return the range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByCorporationId(String corporationid, int start,
		int end) throws SystemException {
		return findByCorporationId(corporationid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the action logs where corporationid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param corporationid the corporationid
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByCorporationId(String corporationid, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] { corporationid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CORPORATIONID;
			finderArgs = new Object[] {
					corporationid,
					
					start, end, orderByComparator
				};
		}

		List<ActionLog> list = (List<ActionLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ActionLog actionLog : list) {
				if (!Validator.equals(corporationid,
							actionLog.getCorporationid())) {
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

			query.append(_SQL_SELECT_ACTIONLOG_WHERE);

			boolean bindCorporationid = false;

			if (corporationid == null) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationid = true;

				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ActionLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationid) {
					qPos.add(corporationid);
				}

				if (!pagination) {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActionLog>(list);
				}
				else {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first action log in the ordered set where corporationid = &#63;.
	 *
	 * @param corporationid the corporationid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByCorporationId_First(String corporationid,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByCorporationId_First(corporationid,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationid=");
		msg.append(corporationid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the first action log in the ordered set where corporationid = &#63;.
	 *
	 * @param corporationid the corporationid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByCorporationId_First(String corporationid,
		OrderByComparator orderByComparator) throws SystemException {
		List<ActionLog> list = findByCorporationId(corporationid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last action log in the ordered set where corporationid = &#63;.
	 *
	 * @param corporationid the corporationid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByCorporationId_Last(String corporationid,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByCorporationId_Last(corporationid,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("corporationid=");
		msg.append(corporationid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the last action log in the ordered set where corporationid = &#63;.
	 *
	 * @param corporationid the corporationid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByCorporationId_Last(String corporationid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCorporationId(corporationid);

		if (count == 0) {
			return null;
		}

		List<ActionLog> list = findByCorporationId(corporationid, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the action logs before and after the current action log in the ordered set where corporationid = &#63;.
	 *
	 * @param id the primary key of the current action log
	 * @param corporationid the corporationid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog[] findByCorporationId_PrevAndNext(long id,
		String corporationid, OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ActionLog[] array = new ActionLogImpl[3];

			array[0] = getByCorporationId_PrevAndNext(session, actionLog,
					corporationid, orderByComparator, true);

			array[1] = actionLog;

			array[2] = getByCorporationId_PrevAndNext(session, actionLog,
					corporationid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ActionLog getByCorporationId_PrevAndNext(Session session,
		ActionLog actionLog, String corporationid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIONLOG_WHERE);

		boolean bindCorporationid = false;

		if (corporationid == null) {
			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
		}
		else if (corporationid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
		}
		else {
			bindCorporationid = true;

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
			query.append(ActionLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCorporationid) {
			qPos.add(corporationid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(actionLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ActionLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the action logs where corporationid = &#63; from the database.
	 *
	 * @param corporationid the corporationid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCorporationId(String corporationid)
		throws SystemException {
		for (ActionLog actionLog : findByCorporationId(corporationid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(actionLog);
		}
	}

	/**
	 * Returns the number of action logs where corporationid = &#63;.
	 *
	 * @param corporationid the corporationid
	 * @return the number of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCorporationId(String corporationid)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CORPORATIONID;

		Object[] finderArgs = new Object[] { corporationid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACTIONLOG_WHERE);

			boolean bindCorporationid = false;

			if (corporationid == null) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1);
			}
			else if (corporationid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3);
			}
			else {
				bindCorporationid = true;

				query.append(_FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCorporationid) {
					qPos.add(corporationid);
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

	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_1 = "actionLog.corporationid IS NULL";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_2 = "actionLog.corporationid = ?";
	private static final String _FINDER_COLUMN_CORPORATIONID_CORPORATIONID_3 = "(actionLog.corporationid IS NULL OR actionLog.corporationid = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORID =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByInspectorId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByInspectorId",
			new String[] { Long.class.getName() },
			ActionLogModelImpl.INSPECTORID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_INSPECTORID = new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByInspectorId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the action logs where inspectorid = &#63;.
	 *
	 * @param inspectorid the inspectorid
	 * @return the matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByInspectorId(long inspectorid)
		throws SystemException {
		return findByInspectorId(inspectorid, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the action logs where inspectorid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorid the inspectorid
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @return the range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByInspectorId(long inspectorid, int start,
		int end) throws SystemException {
		return findByInspectorId(inspectorid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the action logs where inspectorid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param inspectorid the inspectorid
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByInspectorId(long inspectorid, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID;
			finderArgs = new Object[] { inspectorid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_INSPECTORID;
			finderArgs = new Object[] { inspectorid, start, end, orderByComparator };
		}

		List<ActionLog> list = (List<ActionLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ActionLog actionLog : list) {
				if ((inspectorid != actionLog.getInspectorid())) {
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

			query.append(_SQL_SELECT_ACTIONLOG_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ActionLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorid);

				if (!pagination) {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActionLog>(list);
				}
				else {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first action log in the ordered set where inspectorid = &#63;.
	 *
	 * @param inspectorid the inspectorid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByInspectorId_First(long inspectorid,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByInspectorId_First(inspectorid,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorid=");
		msg.append(inspectorid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the first action log in the ordered set where inspectorid = &#63;.
	 *
	 * @param inspectorid the inspectorid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByInspectorId_First(long inspectorid,
		OrderByComparator orderByComparator) throws SystemException {
		List<ActionLog> list = findByInspectorId(inspectorid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last action log in the ordered set where inspectorid = &#63;.
	 *
	 * @param inspectorid the inspectorid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByInspectorId_Last(long inspectorid,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByInspectorId_Last(inspectorid,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("inspectorid=");
		msg.append(inspectorid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the last action log in the ordered set where inspectorid = &#63;.
	 *
	 * @param inspectorid the inspectorid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByInspectorId_Last(long inspectorid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByInspectorId(inspectorid);

		if (count == 0) {
			return null;
		}

		List<ActionLog> list = findByInspectorId(inspectorid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the action logs before and after the current action log in the ordered set where inspectorid = &#63;.
	 *
	 * @param id the primary key of the current action log
	 * @param inspectorid the inspectorid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog[] findByInspectorId_PrevAndNext(long id, long inspectorid,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ActionLog[] array = new ActionLogImpl[3];

			array[0] = getByInspectorId_PrevAndNext(session, actionLog,
					inspectorid, orderByComparator, true);

			array[1] = actionLog;

			array[2] = getByInspectorId_PrevAndNext(session, actionLog,
					inspectorid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ActionLog getByInspectorId_PrevAndNext(Session session,
		ActionLog actionLog, long inspectorid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIONLOG_WHERE);

		query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

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
			query.append(ActionLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(inspectorid);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(actionLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ActionLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the action logs where inspectorid = &#63; from the database.
	 *
	 * @param inspectorid the inspectorid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByInspectorId(long inspectorid) throws SystemException {
		for (ActionLog actionLog : findByInspectorId(inspectorid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(actionLog);
		}
	}

	/**
	 * Returns the number of action logs where inspectorid = &#63;.
	 *
	 * @param inspectorid the inspectorid
	 * @return the number of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByInspectorId(long inspectorid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_INSPECTORID;

		Object[] finderArgs = new Object[] { inspectorid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACTIONLOG_WHERE);

			query.append(_FINDER_COLUMN_INSPECTORID_INSPECTORID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(inspectorid);

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

	private static final String _FINDER_COLUMN_INSPECTORID_INSPECTORID_2 = "actionLog.inspectorid = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTACTCODE =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByContactCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTACTCODE =
		new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, ActionLogImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByContactCode",
			new String[] { String.class.getName() },
			ActionLogModelImpl.CONTACTCODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CONTACTCODE = new FinderPath(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByContactCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the action logs where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @return the matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByContactCode(String contactcode)
		throws SystemException {
		return findByContactCode(contactcode, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the action logs where contactcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contactcode the contactcode
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @return the range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByContactCode(String contactcode, int start,
		int end) throws SystemException {
		return findByContactCode(contactcode, start, end, null);
	}

	/**
	 * Returns an ordered range of all the action logs where contactcode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param contactcode the contactcode
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findByContactCode(String contactcode, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTACTCODE;
			finderArgs = new Object[] { contactcode };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONTACTCODE;
			finderArgs = new Object[] { contactcode, start, end, orderByComparator };
		}

		List<ActionLog> list = (List<ActionLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ActionLog actionLog : list) {
				if (!Validator.equals(contactcode, actionLog.getContactcode())) {
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

			query.append(_SQL_SELECT_ACTIONLOG_WHERE);

			boolean bindContactcode = false;

			if (contactcode == null) {
				query.append(_FINDER_COLUMN_CONTACTCODE_CONTACTCODE_1);
			}
			else if (contactcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CONTACTCODE_CONTACTCODE_3);
			}
			else {
				bindContactcode = true;

				query.append(_FINDER_COLUMN_CONTACTCODE_CONTACTCODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ActionLogModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContactcode) {
					qPos.add(contactcode);
				}

				if (!pagination) {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActionLog>(list);
				}
				else {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first action log in the ordered set where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByContactCode_First(String contactcode,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByContactCode_First(contactcode,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contactcode=");
		msg.append(contactcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the first action log in the ordered set where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByContactCode_First(String contactcode,
		OrderByComparator orderByComparator) throws SystemException {
		List<ActionLog> list = findByContactCode(contactcode, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last action log in the ordered set where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByContactCode_Last(String contactcode,
		OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByContactCode_Last(contactcode,
				orderByComparator);

		if (actionLog != null) {
			return actionLog;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("contactcode=");
		msg.append(contactcode);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchActionLogException(msg.toString());
	}

	/**
	 * Returns the last action log in the ordered set where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching action log, or <code>null</code> if a matching action log could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByContactCode_Last(String contactcode,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByContactCode(contactcode);

		if (count == 0) {
			return null;
		}

		List<ActionLog> list = findByContactCode(contactcode, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the action logs before and after the current action log in the ordered set where contactcode = &#63;.
	 *
	 * @param id the primary key of the current action log
	 * @param contactcode the contactcode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog[] findByContactCode_PrevAndNext(long id,
		String contactcode, OrderByComparator orderByComparator)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ActionLog[] array = new ActionLogImpl[3];

			array[0] = getByContactCode_PrevAndNext(session, actionLog,
					contactcode, orderByComparator, true);

			array[1] = actionLog;

			array[2] = getByContactCode_PrevAndNext(session, actionLog,
					contactcode, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ActionLog getByContactCode_PrevAndNext(Session session,
		ActionLog actionLog, String contactcode,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIONLOG_WHERE);

		boolean bindContactcode = false;

		if (contactcode == null) {
			query.append(_FINDER_COLUMN_CONTACTCODE_CONTACTCODE_1);
		}
		else if (contactcode.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CONTACTCODE_CONTACTCODE_3);
		}
		else {
			bindContactcode = true;

			query.append(_FINDER_COLUMN_CONTACTCODE_CONTACTCODE_2);
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
			query.append(ActionLogModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindContactcode) {
			qPos.add(contactcode);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(actionLog);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ActionLog> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the action logs where contactcode = &#63; from the database.
	 *
	 * @param contactcode the contactcode
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByContactCode(String contactcode)
		throws SystemException {
		for (ActionLog actionLog : findByContactCode(contactcode,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(actionLog);
		}
	}

	/**
	 * Returns the number of action logs where contactcode = &#63;.
	 *
	 * @param contactcode the contactcode
	 * @return the number of matching action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByContactCode(String contactcode) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CONTACTCODE;

		Object[] finderArgs = new Object[] { contactcode };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACTIONLOG_WHERE);

			boolean bindContactcode = false;

			if (contactcode == null) {
				query.append(_FINDER_COLUMN_CONTACTCODE_CONTACTCODE_1);
			}
			else if (contactcode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CONTACTCODE_CONTACTCODE_3);
			}
			else {
				bindContactcode = true;

				query.append(_FINDER_COLUMN_CONTACTCODE_CONTACTCODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindContactcode) {
					qPos.add(contactcode);
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

	private static final String _FINDER_COLUMN_CONTACTCODE_CONTACTCODE_1 = "actionLog.contactcode IS NULL";
	private static final String _FINDER_COLUMN_CONTACTCODE_CONTACTCODE_2 = "actionLog.contactcode = ?";
	private static final String _FINDER_COLUMN_CONTACTCODE_CONTACTCODE_3 = "(actionLog.contactcode IS NULL OR actionLog.contactcode = '')";

	public ActionLogPersistenceImpl() {
		setModelClass(ActionLog.class);
	}

	/**
	 * Caches the action log in the entity cache if it is enabled.
	 *
	 * @param actionLog the action log
	 */
	@Override
	public void cacheResult(ActionLog actionLog) {
		EntityCacheUtil.putResult(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogImpl.class, actionLog.getPrimaryKey(), actionLog);

		actionLog.resetOriginalValues();
	}

	/**
	 * Caches the action logs in the entity cache if it is enabled.
	 *
	 * @param actionLogs the action logs
	 */
	@Override
	public void cacheResult(List<ActionLog> actionLogs) {
		for (ActionLog actionLog : actionLogs) {
			if (EntityCacheUtil.getResult(
						ActionLogModelImpl.ENTITY_CACHE_ENABLED,
						ActionLogImpl.class, actionLog.getPrimaryKey()) == null) {
				cacheResult(actionLog);
			}
			else {
				actionLog.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all action logs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ActionLogImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ActionLogImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the action log.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ActionLog actionLog) {
		EntityCacheUtil.removeResult(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogImpl.class, actionLog.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ActionLog> actionLogs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ActionLog actionLog : actionLogs) {
			EntityCacheUtil.removeResult(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
				ActionLogImpl.class, actionLog.getPrimaryKey());
		}
	}

	/**
	 * Creates a new action log with the primary key. Does not add the action log to the database.
	 *
	 * @param id the primary key for the new action log
	 * @return the new action log
	 */
	@Override
	public ActionLog create(long id) {
		ActionLog actionLog = new ActionLogImpl();

		actionLog.setNew(true);
		actionLog.setPrimaryKey(id);

		return actionLog;
	}

	/**
	 * Removes the action log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the action log
	 * @return the action log that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog remove(long id)
		throws NoSuchActionLogException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the action log with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the action log
	 * @return the action log that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog remove(Serializable primaryKey)
		throws NoSuchActionLogException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ActionLog actionLog = (ActionLog)session.get(ActionLogImpl.class,
					primaryKey);

			if (actionLog == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchActionLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(actionLog);
		}
		catch (NoSuchActionLogException nsee) {
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
	protected ActionLog removeImpl(ActionLog actionLog)
		throws SystemException {
		actionLog = toUnwrappedModel(actionLog);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(actionLog)) {
				actionLog = (ActionLog)session.get(ActionLogImpl.class,
						actionLog.getPrimaryKeyObj());
			}

			if (actionLog != null) {
				session.delete(actionLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (actionLog != null) {
			clearCache(actionLog);
		}

		return actionLog;
	}

	@Override
	public ActionLog updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog actionLog)
		throws SystemException {
		actionLog = toUnwrappedModel(actionLog);

		boolean isNew = actionLog.isNew();

		ActionLogModelImpl actionLogModelImpl = (ActionLogModelImpl)actionLog;

		Session session = null;

		try {
			session = openSession();

			if (actionLog.isNew()) {
				session.save(actionLog);

				actionLog.setNew(false);
			}
			else {
				session.merge(actionLog);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ActionLogModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((actionLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						actionLogModelImpl.getOriginalHosothutucid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);

				args = new Object[] { actionLogModelImpl.getHosothutucid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOSOTHUTUCID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOSOTHUTUCID,
					args);
			}

			if ((actionLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASOHOSO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						actionLogModelImpl.getOriginalMasohoso()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASOHOSO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASOHOSO,
					args);

				args = new Object[] { actionLogModelImpl.getMasohoso() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MASOHOSO, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MASOHOSO,
					args);
			}

			if ((actionLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MABIENNHAN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						actionLogModelImpl.getOriginalMabiennhan()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MABIENNHAN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MABIENNHAN,
					args);

				args = new Object[] { actionLogModelImpl.getMabiennhan() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_MABIENNHAN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_MABIENNHAN,
					args);
			}

			if ((actionLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						actionLogModelImpl.getOriginalImportername()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME,
					args);

				args = new Object[] { actionLogModelImpl.getImportername() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IMPORTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IMPORTERNAME,
					args);
			}

			if ((actionLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						actionLogModelImpl.getOriginalCorporationid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);

				args = new Object[] { actionLogModelImpl.getCorporationid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CORPORATIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CORPORATIONID,
					args);
			}

			if ((actionLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						actionLogModelImpl.getOriginalInspectorid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID,
					args);

				args = new Object[] { actionLogModelImpl.getInspectorid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_INSPECTORID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_INSPECTORID,
					args);
			}

			if ((actionLogModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTACTCODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						actionLogModelImpl.getOriginalContactcode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTACTCODE,
					args);

				args = new Object[] { actionLogModelImpl.getContactcode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONTACTCODE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONTACTCODE,
					args);
			}
		}

		EntityCacheUtil.putResult(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
			ActionLogImpl.class, actionLog.getPrimaryKey(), actionLog);

		return actionLog;
	}

	protected ActionLog toUnwrappedModel(ActionLog actionLog) {
		if (actionLog instanceof ActionLogImpl) {
			return actionLog;
		}

		ActionLogImpl actionLogImpl = new ActionLogImpl();

		actionLogImpl.setNew(actionLog.isNew());
		actionLogImpl.setPrimaryKey(actionLog.getPrimaryKey());

		actionLogImpl.setId(actionLog.getId());
		actionLogImpl.setHosothutucid(actionLog.getHosothutucid());
		actionLogImpl.setMasohoso(actionLog.getMasohoso());
		actionLogImpl.setMabiennhan(actionLog.getMabiennhan());
		actionLogImpl.setNgayxemhoso(actionLog.getNgayxemhoso());
		actionLogImpl.setNoidungmanhinh(actionLog.getNoidungmanhinh());
		actionLogImpl.setImportername(actionLog.getImportername());
		actionLogImpl.setCorporationid(actionLog.getCorporationid());
		actionLogImpl.setInspectorid(actionLog.getInspectorid());
		actionLogImpl.setInspectorname(actionLog.getInspectorname());
		actionLogImpl.setInspectorphone(actionLog.getInspectorphone());
		actionLogImpl.setInspectoremail(actionLog.getInspectoremail());
		actionLogImpl.setTitle(actionLog.getTitle());
		actionLogImpl.setContactcode(actionLog.getContactcode());

		return actionLogImpl;
	}

	/**
	 * Returns the action log with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the action log
	 * @return the action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchActionLogException, SystemException {
		ActionLog actionLog = fetchByPrimaryKey(primaryKey);

		if (actionLog == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchActionLogException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return actionLog;
	}

	/**
	 * Returns the action log with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException} if it could not be found.
	 *
	 * @param id the primary key of the action log
	 * @return the action log
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchActionLogException if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog findByPrimaryKey(long id)
		throws NoSuchActionLogException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the action log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the action log
	 * @return the action log, or <code>null</code> if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ActionLog actionLog = (ActionLog)EntityCacheUtil.getResult(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
				ActionLogImpl.class, primaryKey);

		if (actionLog == _nullActionLog) {
			return null;
		}

		if (actionLog == null) {
			Session session = null;

			try {
				session = openSession();

				actionLog = (ActionLog)session.get(ActionLogImpl.class,
						primaryKey);

				if (actionLog != null) {
					cacheResult(actionLog);
				}
				else {
					EntityCacheUtil.putResult(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
						ActionLogImpl.class, primaryKey, _nullActionLog);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ActionLogModelImpl.ENTITY_CACHE_ENABLED,
					ActionLogImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return actionLog;
	}

	/**
	 * Returns the action log with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the action log
	 * @return the action log, or <code>null</code> if a action log with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ActionLog fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the action logs.
	 *
	 * @return the action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the action logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @return the range of action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the action logs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ActionLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of action logs
	 * @param end the upper bound of the range of action logs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of action logs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ActionLog> findAll(int start, int end,
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

		List<ActionLog> list = (List<ActionLog>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ACTIONLOG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIONLOG;

				if (pagination) {
					sql = sql.concat(ActionLogModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ActionLog>(list);
				}
				else {
					list = (List<ActionLog>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the action logs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ActionLog actionLog : findAll()) {
			remove(actionLog);
		}
	}

	/**
	 * Returns the number of action logs.
	 *
	 * @return the number of action logs
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

				Query q = session.createQuery(_SQL_COUNT_ACTIONLOG);

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
	 * Initializes the action log persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.ActionLog")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ActionLog>> listenersList = new ArrayList<ModelListener<ActionLog>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ActionLog>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ActionLogImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ACTIONLOG = "SELECT actionLog FROM ActionLog actionLog";
	private static final String _SQL_SELECT_ACTIONLOG_WHERE = "SELECT actionLog FROM ActionLog actionLog WHERE ";
	private static final String _SQL_COUNT_ACTIONLOG = "SELECT COUNT(actionLog) FROM ActionLog actionLog";
	private static final String _SQL_COUNT_ACTIONLOG_WHERE = "SELECT COUNT(actionLog) FROM ActionLog actionLog WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "actionLog.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ActionLog exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ActionLog exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ActionLogPersistenceImpl.class);
	private static ActionLog _nullActionLog = new ActionLogImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ActionLog> toCacheModel() {
				return _nullActionLogCacheModel;
			}
		};

	private static CacheModel<ActionLog> _nullActionLogCacheModel = new CacheModel<ActionLog>() {
			@Override
			public ActionLog toEntityModel() {
				return _nullActionLog;
			}
		};
}