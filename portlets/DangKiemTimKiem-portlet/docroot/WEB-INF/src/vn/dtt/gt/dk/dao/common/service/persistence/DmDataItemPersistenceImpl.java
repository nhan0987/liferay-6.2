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

package vn.dtt.gt.dk.dao.common.service.persistence;

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

import vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException;
import vn.dtt.gt.dk.dao.common.model.DmDataItem;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataItemImpl;
import vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the dm data item service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see DmDataItemPersistence
 * @see DmDataItemUtil
 * @generated
 */
public class DmDataItemPersistenceImpl extends BasePersistenceImpl<DmDataItem>
	implements DmDataItemPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmDataItemUtil} to access the dm data item persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmDataItemImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CODE0 = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByCode0",
			new String[] { String.class.getName() },
			DmDataItemModelImpl.CODE0_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODE0 = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCode0",
			new String[] { String.class.getName() });

	/**
	 * Returns the dm data item where Code0 = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException} if it could not be found.
	 *
	 * @param Code0 the code0
	 * @return the matching dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByCode0(String Code0)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByCode0(Code0);

		if (dmDataItem == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("Code0=");
			msg.append(Code0);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDmDataItemException(msg.toString());
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item where Code0 = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param Code0 the code0
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCode0(String Code0) throws SystemException {
		return fetchByCode0(Code0, true);
	}

	/**
	 * Returns the dm data item where Code0 = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param Code0 the code0
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByCode0(String Code0, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { Code0 };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODE0,
					finderArgs, this);
		}

		if (result instanceof DmDataItem) {
			DmDataItem dmDataItem = (DmDataItem)result;

			if (!Validator.equals(Code0, dmDataItem.getCode0())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			boolean bindCode0 = false;

			if (Code0 == null) {
				query.append(_FINDER_COLUMN_CODE0_CODE0_1);
			}
			else if (Code0.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE0_CODE0_3);
			}
			else {
				bindCode0 = true;

				query.append(_FINDER_COLUMN_CODE0_CODE0_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode0) {
					qPos.add(Code0);
				}

				List<DmDataItem> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE0,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DmDataItemPersistenceImpl.fetchByCode0(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					DmDataItem dmDataItem = list.get(0);

					result = dmDataItem;

					cacheResult(dmDataItem);

					if ((dmDataItem.getCode0() == null) ||
							!dmDataItem.getCode0().equals(Code0)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE0,
							finderArgs, dmDataItem);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE0,
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
			return (DmDataItem)result;
		}
	}

	/**
	 * Removes the dm data item where Code0 = &#63; from the database.
	 *
	 * @param Code0 the code0
	 * @return the dm data item that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem removeByCode0(String Code0)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByCode0(Code0);

		return remove(dmDataItem);
	}

	/**
	 * Returns the number of dm data items where Code0 = &#63;.
	 *
	 * @param Code0 the code0
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCode0(String Code0) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODE0;

		Object[] finderArgs = new Object[] { Code0 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			boolean bindCode0 = false;

			if (Code0 == null) {
				query.append(_FINDER_COLUMN_CODE0_CODE0_1);
			}
			else if (Code0.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE0_CODE0_3);
			}
			else {
				bindCode0 = true;

				query.append(_FINDER_COLUMN_CODE0_CODE0_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode0) {
					qPos.add(Code0);
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

	private static final String _FINDER_COLUMN_CODE0_CODE0_1 = "dmDataItem.Code0 IS NULL";
	private static final String _FINDER_COLUMN_CODE0_CODE0_2 = "dmDataItem.Code0 = ?";
	private static final String _FINDER_COLUMN_CODE0_CODE0_3 = "(dmDataItem.Code0 IS NULL OR dmDataItem.Code0 = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDCODE0 =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDataGroupIdAndCode0",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDCODE0 =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDataGroupIdAndCode0",
			new String[] { Long.class.getName(), String.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.CODE0_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE0 = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndCode0",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dm data items where DataGroupId = &#63; and Code0 = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndCode0(long DataGroupId,
		String Code0) throws SystemException {
		return findByDataGroupIdAndCode0(DataGroupId, Code0, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where DataGroupId = &#63; and Code0 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndCode0(long DataGroupId,
		String Code0, int start, int end) throws SystemException {
		return findByDataGroupIdAndCode0(DataGroupId, Code0, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where DataGroupId = &#63; and Code0 = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndCode0(long DataGroupId,
		String Code0, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDCODE0;
			finderArgs = new Object[] { DataGroupId, Code0 };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDCODE0;
			finderArgs = new Object[] {
					DataGroupId, Code0,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmDataItem dmDataItem : list) {
				if ((DataGroupId != dmDataItem.getDataGroupId()) ||
						!Validator.equals(Code0, dmDataItem.getCode0())) {
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

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_DATAGROUPID_2);

			boolean bindCode0 = false;

			if (Code0 == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_1);
			}
			else if (Code0.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_3);
			}
			else {
				bindCode0 = true;

				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (bindCode0) {
					qPos.add(Code0);
				}

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and Code0 = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndCode0_First(long DataGroupId,
		String Code0, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndCode0_First(DataGroupId,
				Code0, orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("DataGroupId=");
		msg.append(DataGroupId);

		msg.append(", Code0=");
		msg.append(Code0);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and Code0 = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndCode0_First(long DataGroupId,
		String Code0, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmDataItem> list = findByDataGroupIdAndCode0(DataGroupId, Code0,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and Code0 = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndCode0_Last(long DataGroupId,
		String Code0, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndCode0_Last(DataGroupId,
				Code0, orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("DataGroupId=");
		msg.append(DataGroupId);

		msg.append(", Code0=");
		msg.append(Code0);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and Code0 = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndCode0_Last(long DataGroupId,
		String Code0, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDataGroupIdAndCode0(DataGroupId, Code0);

		if (count == 0) {
			return null;
		}

		List<DmDataItem> list = findByDataGroupIdAndCode0(DataGroupId, Code0,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Code0 = &#63;.
	 *
	 * @param Id the primary key of the current dm data item
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem[] findByDataGroupIdAndCode0_PrevAndNext(long Id,
		long DataGroupId, String Code0, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupIdAndCode0_PrevAndNext(session,
					dmDataItem, DataGroupId, Code0, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupIdAndCode0_PrevAndNext(session,
					dmDataItem, DataGroupId, Code0, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByDataGroupIdAndCode0_PrevAndNext(Session session,
		DmDataItem dmDataItem, long DataGroupId, String Code0,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_DATAGROUPID_2);

		boolean bindCode0 = false;

		if (Code0 == null) {
			query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_1);
		}
		else if (Code0.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_3);
		}
		else {
			bindCode0 = true;

			query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_2);
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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(DataGroupId);

		if (bindCode0) {
			qPos.add(Code0);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm data items where DataGroupId = &#63; and Code0 = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDataGroupIdAndCode0(long DataGroupId, String Code0)
		throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupIdAndCode0(DataGroupId,
				Code0, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63; and Code0 = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Code0 the code0
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDataGroupIdAndCode0(long DataGroupId, String Code0)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE0;

		Object[] finderArgs = new Object[] { DataGroupId, Code0 };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_DATAGROUPID_2);

			boolean bindCode0 = false;

			if (Code0 == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_1);
			}
			else if (Code0.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_3);
			}
			else {
				bindCode0 = true;

				query.append(_FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (bindCode0) {
					qPos.add(Code0);
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

	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE0_DATAGROUPID_2 =
		"dmDataItem.DataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_1 = "dmDataItem.Code0 IS NULL";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_2 = "dmDataItem.Code0 = ?";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDCODE0_CODE0_3 = "(dmDataItem.Code0 IS NULL OR dmDataItem.Code0 = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELALTERNAME =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDataGroupIdAndLevelAlterName",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELALTERNAME =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDataGroupIdAndLevelAlterName",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			},
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.LEVEL_COLUMN_BITMASK |
			DmDataItemModelImpl.ALTERNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVELALTERNAME =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndLevelAlterName",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the dm data items where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param AlterName the alter name
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndLevelAlterName(
		long DataGroupId, int Level, String AlterName)
		throws SystemException {
		return findByDataGroupIdAndLevelAlterName(DataGroupId, Level,
			AlterName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param AlterName the alter name
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndLevelAlterName(
		long DataGroupId, int Level, String AlterName, int start, int end)
		throws SystemException {
		return findByDataGroupIdAndLevelAlterName(DataGroupId, Level,
			AlterName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param AlterName the alter name
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndLevelAlterName(
		long DataGroupId, int Level, String AlterName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELALTERNAME;
			finderArgs = new Object[] { DataGroupId, Level, AlterName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELALTERNAME;
			finderArgs = new Object[] {
					DataGroupId, Level, AlterName,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmDataItem dmDataItem : list) {
				if ((DataGroupId != dmDataItem.getDataGroupId()) ||
						(Level != dmDataItem.getLevel()) ||
						!Validator.equals(AlterName, dmDataItem.getAlterName())) {
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

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_LEVEL_2);

			boolean bindAlterName = false;

			if (AlterName == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_1);
			}
			else if (AlterName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_3);
			}
			else {
				bindAlterName = true;

				query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				qPos.add(Level);

				if (bindAlterName) {
					qPos.add(AlterName);
				}

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param AlterName the alter name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndLevelAlterName_First(
		long DataGroupId, int Level, String AlterName,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndLevelAlterName_First(DataGroupId,
				Level, AlterName, orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("DataGroupId=");
		msg.append(DataGroupId);

		msg.append(", Level=");
		msg.append(Level);

		msg.append(", AlterName=");
		msg.append(AlterName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param AlterName the alter name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndLevelAlterName_First(
		long DataGroupId, int Level, String AlterName,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmDataItem> list = findByDataGroupIdAndLevelAlterName(DataGroupId,
				Level, AlterName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param AlterName the alter name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndLevelAlterName_Last(
		long DataGroupId, int Level, String AlterName,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndLevelAlterName_Last(DataGroupId,
				Level, AlterName, orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("DataGroupId=");
		msg.append(DataGroupId);

		msg.append(", Level=");
		msg.append(Level);

		msg.append(", AlterName=");
		msg.append(AlterName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param AlterName the alter name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndLevelAlterName_Last(
		long DataGroupId, int Level, String AlterName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDataGroupIdAndLevelAlterName(DataGroupId, Level,
				AlterName);

		if (count == 0) {
			return null;
		}

		List<DmDataItem> list = findByDataGroupIdAndLevelAlterName(DataGroupId,
				Level, AlterName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	 *
	 * @param Id the primary key of the current dm data item
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param AlterName the alter name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem[] findByDataGroupIdAndLevelAlterName_PrevAndNext(
		long Id, long DataGroupId, int Level, String AlterName,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupIdAndLevelAlterName_PrevAndNext(session,
					dmDataItem, DataGroupId, Level, AlterName,
					orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupIdAndLevelAlterName_PrevAndNext(session,
					dmDataItem, DataGroupId, Level, AlterName,
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

	protected DmDataItem getByDataGroupIdAndLevelAlterName_PrevAndNext(
		Session session, DmDataItem dmDataItem, long DataGroupId, int Level,
		String AlterName, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_DATAGROUPID_2);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_LEVEL_2);

		boolean bindAlterName = false;

		if (AlterName == null) {
			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_1);
		}
		else if (AlterName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_3);
		}
		else {
			bindAlterName = true;

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_2);
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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(DataGroupId);

		qPos.add(Level);

		if (bindAlterName) {
			qPos.add(AlterName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm data items where DataGroupId = &#63; and Level = &#63; and AlterName = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param AlterName the alter name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDataGroupIdAndLevelAlterName(long DataGroupId,
		int Level, String AlterName) throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupIdAndLevelAlterName(
				DataGroupId, Level, AlterName, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63; and Level = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param AlterName the alter name
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDataGroupIdAndLevelAlterName(long DataGroupId, int Level,
		String AlterName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVELALTERNAME;

		Object[] finderArgs = new Object[] { DataGroupId, Level, AlterName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_LEVEL_2);

			boolean bindAlterName = false;

			if (AlterName == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_1);
			}
			else if (AlterName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_3);
			}
			else {
				bindAlterName = true;

				query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				qPos.add(Level);

				if (bindAlterName) {
					qPos.add(AlterName);
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

	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_DATAGROUPID_2 =
		"dmDataItem.DataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_LEVEL_2 =
		"dmDataItem.Level = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_1 =
		"dmDataItem.AlterName IS NULL";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_2 =
		"dmDataItem.AlterName = ?";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVELALTERNAME_ALTERNAME_3 =
		"(dmDataItem.AlterName IS NULL OR dmDataItem.AlterName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDataGroupIdAndLevel",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDataGroupIdAndLevel",
			new String[] { Long.class.getName(), Integer.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.LEVEL_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndLevel",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the dm data items where DataGroupId = &#63; and Level = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndLevel(long DataGroupId,
		int Level) throws SystemException {
		return findByDataGroupIdAndLevel(DataGroupId, Level, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where DataGroupId = &#63; and Level = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndLevel(long DataGroupId,
		int Level, int start, int end) throws SystemException {
		return findByDataGroupIdAndLevel(DataGroupId, Level, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where DataGroupId = &#63; and Level = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndLevel(long DataGroupId,
		int Level, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL;
			finderArgs = new Object[] { DataGroupId, Level };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL;
			finderArgs = new Object[] {
					DataGroupId, Level,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmDataItem dmDataItem : list) {
				if ((DataGroupId != dmDataItem.getDataGroupId()) ||
						(Level != dmDataItem.getLevel())) {
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

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				qPos.add(Level);

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndLevel_First(long DataGroupId,
		int Level, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndLevel_First(DataGroupId,
				Level, orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("DataGroupId=");
		msg.append(DataGroupId);

		msg.append(", Level=");
		msg.append(Level);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndLevel_First(long DataGroupId,
		int Level, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmDataItem> list = findByDataGroupIdAndLevel(DataGroupId, Level,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndLevel_Last(long DataGroupId,
		int Level, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndLevel_Last(DataGroupId,
				Level, orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("DataGroupId=");
		msg.append(DataGroupId);

		msg.append(", Level=");
		msg.append(Level);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndLevel_Last(long DataGroupId,
		int Level, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDataGroupIdAndLevel(DataGroupId, Level);

		if (count == 0) {
			return null;
		}

		List<DmDataItem> list = findByDataGroupIdAndLevel(DataGroupId, Level,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and Level = &#63;.
	 *
	 * @param Id the primary key of the current dm data item
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem[] findByDataGroupIdAndLevel_PrevAndNext(long Id,
		long DataGroupId, int Level, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupIdAndLevel_PrevAndNext(session,
					dmDataItem, DataGroupId, Level, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupIdAndLevel_PrevAndNext(session,
					dmDataItem, DataGroupId, Level, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByDataGroupIdAndLevel_PrevAndNext(Session session,
		DmDataItem dmDataItem, long DataGroupId, int Level,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2);

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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(DataGroupId);

		qPos.add(Level);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm data items where DataGroupId = &#63; and Level = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDataGroupIdAndLevel(long DataGroupId, int Level)
		throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupIdAndLevel(DataGroupId,
				Level, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63; and Level = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param Level the level
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDataGroupIdAndLevel(long DataGroupId, int Level)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL;

		Object[] finderArgs = new Object[] { DataGroupId, Level };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				qPos.add(Level);

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

	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVEL_DATAGROUPID_2 =
		"dmDataItem.DataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDLEVEL_LEVEL_2 = "dmDataItem.Level = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPID =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDataGroupId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDataGroupId",
			new String[] { Long.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPID = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDataGroupId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the dm data items where DataGroupId = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupId(long DataGroupId)
		throws SystemException {
		return findByDataGroupId(DataGroupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where DataGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupId(long DataGroupId, int start,
		int end) throws SystemException {
		return findByDataGroupId(DataGroupId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where DataGroupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupId(long DataGroupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID;
			finderArgs = new Object[] { DataGroupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPID;
			finderArgs = new Object[] { DataGroupId, start, end, orderByComparator };
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmDataItem dmDataItem : list) {
				if ((DataGroupId != dmDataItem.getDataGroupId())) {
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

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupId_First(long DataGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupId_First(DataGroupId,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("DataGroupId=");
		msg.append(DataGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupId_First(long DataGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<DmDataItem> list = findByDataGroupId(DataGroupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupId_Last(long DataGroupId,
		OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupId_Last(DataGroupId,
				orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("DataGroupId=");
		msg.append(DataGroupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupId_Last(long DataGroupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByDataGroupId(DataGroupId);

		if (count == 0) {
			return null;
		}

		List<DmDataItem> list = findByDataGroupId(DataGroupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63;.
	 *
	 * @param Id the primary key of the current dm data item
	 * @param DataGroupId the data group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem[] findByDataGroupId_PrevAndNext(long Id,
		long DataGroupId, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupId_PrevAndNext(session, dmDataItem,
					DataGroupId, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupId_PrevAndNext(session, dmDataItem,
					DataGroupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByDataGroupId_PrevAndNext(Session session,
		DmDataItem dmDataItem, long DataGroupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2);

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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(DataGroupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm data items where DataGroupId = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDataGroupId(long DataGroupId) throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupId(DataGroupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDataGroupId(long DataGroupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DATAGROUPID;

		Object[] finderArgs = new Object[] { DataGroupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

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

	private static final String _FINDER_COLUMN_DATAGROUPID_DATAGROUPID_2 = "dmDataItem.DataGroupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDALTERNAME =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByDataGroupIdAndAlterName",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDALTERNAME =
		new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, DmDataItemImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByDataGroupIdAndAlterName",
			new String[] { Long.class.getName(), String.class.getName() },
			DmDataItemModelImpl.DATAGROUPID_COLUMN_BITMASK |
			DmDataItemModelImpl.ALTERNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATAGROUPIDANDALTERNAME = new FinderPath(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByDataGroupIdAndAlterName",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the dm data items where DataGroupId = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param AlterName the alter name
	 * @return the matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndAlterName(long DataGroupId,
		String AlterName) throws SystemException {
		return findByDataGroupIdAndAlterName(DataGroupId, AlterName,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items where DataGroupId = &#63; and AlterName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param AlterName the alter name
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndAlterName(long DataGroupId,
		String AlterName, int start, int end) throws SystemException {
		return findByDataGroupIdAndAlterName(DataGroupId, AlterName, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items where DataGroupId = &#63; and AlterName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param DataGroupId the data group ID
	 * @param AlterName the alter name
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findByDataGroupIdAndAlterName(long DataGroupId,
		String AlterName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDALTERNAME;
			finderArgs = new Object[] { DataGroupId, AlterName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATAGROUPIDANDALTERNAME;
			finderArgs = new Object[] {
					DataGroupId, AlterName,
					
					start, end, orderByComparator
				};
		}

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (DmDataItem dmDataItem : list) {
				if ((DataGroupId != dmDataItem.getDataGroupId()) ||
						!Validator.equals(AlterName, dmDataItem.getAlterName())) {
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

			query.append(_SQL_SELECT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_DATAGROUPID_2);

			boolean bindAlterName = false;

			if (AlterName == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_1);
			}
			else if (AlterName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_3);
			}
			else {
				bindAlterName = true;

				query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (bindAlterName) {
					qPos.add(AlterName);
				}

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param AlterName the alter name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndAlterName_First(long DataGroupId,
		String AlterName, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndAlterName_First(DataGroupId,
				AlterName, orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("DataGroupId=");
		msg.append(DataGroupId);

		msg.append(", AlterName=");
		msg.append(AlterName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the first dm data item in the ordered set where DataGroupId = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param AlterName the alter name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndAlterName_First(long DataGroupId,
		String AlterName, OrderByComparator orderByComparator)
		throws SystemException {
		List<DmDataItem> list = findByDataGroupIdAndAlterName(DataGroupId,
				AlterName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param AlterName the alter name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByDataGroupIdAndAlterName_Last(long DataGroupId,
		String AlterName, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByDataGroupIdAndAlterName_Last(DataGroupId,
				AlterName, orderByComparator);

		if (dmDataItem != null) {
			return dmDataItem;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("DataGroupId=");
		msg.append(DataGroupId);

		msg.append(", AlterName=");
		msg.append(AlterName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDmDataItemException(msg.toString());
	}

	/**
	 * Returns the last dm data item in the ordered set where DataGroupId = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param AlterName the alter name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dm data item, or <code>null</code> if a matching dm data item could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByDataGroupIdAndAlterName_Last(long DataGroupId,
		String AlterName, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByDataGroupIdAndAlterName(DataGroupId, AlterName);

		if (count == 0) {
			return null;
		}

		List<DmDataItem> list = findByDataGroupIdAndAlterName(DataGroupId,
				AlterName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dm data items before and after the current dm data item in the ordered set where DataGroupId = &#63; and AlterName = &#63;.
	 *
	 * @param Id the primary key of the current dm data item
	 * @param DataGroupId the data group ID
	 * @param AlterName the alter name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem[] findByDataGroupIdAndAlterName_PrevAndNext(long Id,
		long DataGroupId, String AlterName, OrderByComparator orderByComparator)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = findByPrimaryKey(Id);

		Session session = null;

		try {
			session = openSession();

			DmDataItem[] array = new DmDataItemImpl[3];

			array[0] = getByDataGroupIdAndAlterName_PrevAndNext(session,
					dmDataItem, DataGroupId, AlterName, orderByComparator, true);

			array[1] = dmDataItem;

			array[2] = getByDataGroupIdAndAlterName_PrevAndNext(session,
					dmDataItem, DataGroupId, AlterName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmDataItem getByDataGroupIdAndAlterName_PrevAndNext(
		Session session, DmDataItem dmDataItem, long DataGroupId,
		String AlterName, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMDATAITEM_WHERE);

		query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_DATAGROUPID_2);

		boolean bindAlterName = false;

		if (AlterName == null) {
			query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_1);
		}
		else if (AlterName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_3);
		}
		else {
			bindAlterName = true;

			query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_2);
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
			query.append(DmDataItemModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(DataGroupId);

		if (bindAlterName) {
			qPos.add(AlterName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmDataItem);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmDataItem> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dm data items where DataGroupId = &#63; and AlterName = &#63; from the database.
	 *
	 * @param DataGroupId the data group ID
	 * @param AlterName the alter name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByDataGroupIdAndAlterName(long DataGroupId,
		String AlterName) throws SystemException {
		for (DmDataItem dmDataItem : findByDataGroupIdAndAlterName(
				DataGroupId, AlterName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items where DataGroupId = &#63; and AlterName = &#63;.
	 *
	 * @param DataGroupId the data group ID
	 * @param AlterName the alter name
	 * @return the number of matching dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByDataGroupIdAndAlterName(long DataGroupId, String AlterName)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DATAGROUPIDANDALTERNAME;

		Object[] finderArgs = new Object[] { DataGroupId, AlterName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMDATAITEM_WHERE);

			query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_DATAGROUPID_2);

			boolean bindAlterName = false;

			if (AlterName == null) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_1);
			}
			else if (AlterName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_3);
			}
			else {
				bindAlterName = true;

				query.append(_FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(DataGroupId);

				if (bindAlterName) {
					qPos.add(AlterName);
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

	private static final String _FINDER_COLUMN_DATAGROUPIDANDALTERNAME_DATAGROUPID_2 =
		"dmDataItem.DataGroupId = ? AND ";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_1 =
		"dmDataItem.AlterName IS NULL";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_2 =
		"dmDataItem.AlterName = ?";
	private static final String _FINDER_COLUMN_DATAGROUPIDANDALTERNAME_ALTERNAME_3 =
		"(dmDataItem.AlterName IS NULL OR dmDataItem.AlterName = '')";

	public DmDataItemPersistenceImpl() {
		setModelClass(DmDataItem.class);
	}

	/**
	 * Caches the dm data item in the entity cache if it is enabled.
	 *
	 * @param dmDataItem the dm data item
	 */
	@Override
	public void cacheResult(DmDataItem dmDataItem) {
		EntityCacheUtil.putResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemImpl.class, dmDataItem.getPrimaryKey(), dmDataItem);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE0,
			new Object[] { dmDataItem.getCode0() }, dmDataItem);

		dmDataItem.resetOriginalValues();
	}

	/**
	 * Caches the dm data items in the entity cache if it is enabled.
	 *
	 * @param dmDataItems the dm data items
	 */
	@Override
	public void cacheResult(List<DmDataItem> dmDataItems) {
		for (DmDataItem dmDataItem : dmDataItems) {
			if (EntityCacheUtil.getResult(
						DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
						DmDataItemImpl.class, dmDataItem.getPrimaryKey()) == null) {
				cacheResult(dmDataItem);
			}
			else {
				dmDataItem.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dm data items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DmDataItemImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DmDataItemImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dm data item.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmDataItem dmDataItem) {
		EntityCacheUtil.removeResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemImpl.class, dmDataItem.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(dmDataItem);
	}

	@Override
	public void clearCache(List<DmDataItem> dmDataItems) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmDataItem dmDataItem : dmDataItems) {
			EntityCacheUtil.removeResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
				DmDataItemImpl.class, dmDataItem.getPrimaryKey());

			clearUniqueFindersCache(dmDataItem);
		}
	}

	protected void cacheUniqueFindersCache(DmDataItem dmDataItem) {
		if (dmDataItem.isNew()) {
			Object[] args = new Object[] { dmDataItem.getCode0() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE0, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE0, args,
				dmDataItem);
		}
		else {
			DmDataItemModelImpl dmDataItemModelImpl = (DmDataItemModelImpl)dmDataItem;

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CODE0.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmDataItem.getCode0() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE0, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE0, args,
					dmDataItem);
			}
		}
	}

	protected void clearUniqueFindersCache(DmDataItem dmDataItem) {
		DmDataItemModelImpl dmDataItemModelImpl = (DmDataItemModelImpl)dmDataItem;

		Object[] args = new Object[] { dmDataItem.getCode0() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE0, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE0, args);

		if ((dmDataItemModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CODE0.getColumnBitmask()) != 0) {
			args = new Object[] { dmDataItemModelImpl.getOriginalCode0() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE0, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE0, args);
		}
	}

	/**
	 * Creates a new dm data item with the primary key. Does not add the dm data item to the database.
	 *
	 * @param Id the primary key for the new dm data item
	 * @return the new dm data item
	 */
	@Override
	public DmDataItem create(long Id) {
		DmDataItem dmDataItem = new DmDataItemImpl();

		dmDataItem.setNew(true);
		dmDataItem.setPrimaryKey(Id);

		return dmDataItem;
	}

	/**
	 * Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param Id the primary key of the dm data item
	 * @return the dm data item that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem remove(long Id)
		throws NoSuchDmDataItemException, SystemException {
		return remove((Serializable)Id);
	}

	/**
	 * Removes the dm data item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item that was removed
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem remove(Serializable primaryKey)
		throws NoSuchDmDataItemException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DmDataItem dmDataItem = (DmDataItem)session.get(DmDataItemImpl.class,
					primaryKey);

			if (dmDataItem == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmDataItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmDataItem);
		}
		catch (NoSuchDmDataItemException nsee) {
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
	protected DmDataItem removeImpl(DmDataItem dmDataItem)
		throws SystemException {
		dmDataItem = toUnwrappedModel(dmDataItem);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmDataItem)) {
				dmDataItem = (DmDataItem)session.get(DmDataItemImpl.class,
						dmDataItem.getPrimaryKeyObj());
			}

			if (dmDataItem != null) {
				session.delete(dmDataItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmDataItem != null) {
			clearCache(dmDataItem);
		}

		return dmDataItem;
	}

	@Override
	public DmDataItem updateImpl(
		vn.dtt.gt.dk.dao.common.model.DmDataItem dmDataItem)
		throws SystemException {
		dmDataItem = toUnwrappedModel(dmDataItem);

		boolean isNew = dmDataItem.isNew();

		DmDataItemModelImpl dmDataItemModelImpl = (DmDataItemModelImpl)dmDataItem;

		Session session = null;

		try {
			session = openSession();

			if (dmDataItem.isNew()) {
				session.save(dmDataItem);

				dmDataItem.setNew(false);
			}
			else {
				session.merge(dmDataItem);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DmDataItemModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDCODE0.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItemModelImpl.getOriginalDataGroupId(),
						dmDataItemModelImpl.getOriginalCode0()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE0,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDCODE0,
					args);

				args = new Object[] {
						dmDataItemModelImpl.getDataGroupId(),
						dmDataItemModelImpl.getCode0()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDCODE0,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDCODE0,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELALTERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItemModelImpl.getOriginalDataGroupId(),
						dmDataItemModelImpl.getOriginalLevel(),
						dmDataItemModelImpl.getOriginalAlterName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVELALTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELALTERNAME,
					args);

				args = new Object[] {
						dmDataItemModelImpl.getDataGroupId(),
						dmDataItemModelImpl.getLevel(),
						dmDataItemModelImpl.getAlterName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVELALTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVELALTERNAME,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItemModelImpl.getOriginalDataGroupId(),
						dmDataItemModelImpl.getOriginalLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL,
					args);

				args = new Object[] {
						dmDataItemModelImpl.getDataGroupId(),
						dmDataItemModelImpl.getLevel()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDLEVEL,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDLEVEL,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItemModelImpl.getOriginalDataGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID,
					args);

				args = new Object[] { dmDataItemModelImpl.getDataGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPID,
					args);
			}

			if ((dmDataItemModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDALTERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmDataItemModelImpl.getOriginalDataGroupId(),
						dmDataItemModelImpl.getOriginalAlterName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDALTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDALTERNAME,
					args);

				args = new Object[] {
						dmDataItemModelImpl.getDataGroupId(),
						dmDataItemModelImpl.getAlterName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATAGROUPIDANDALTERNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATAGROUPIDANDALTERNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
			DmDataItemImpl.class, dmDataItem.getPrimaryKey(), dmDataItem);

		clearUniqueFindersCache(dmDataItem);
		cacheUniqueFindersCache(dmDataItem);

		return dmDataItem;
	}

	protected DmDataItem toUnwrappedModel(DmDataItem dmDataItem) {
		if (dmDataItem instanceof DmDataItemImpl) {
			return dmDataItem;
		}

		DmDataItemImpl dmDataItemImpl = new DmDataItemImpl();

		dmDataItemImpl.setNew(dmDataItem.isNew());
		dmDataItemImpl.setPrimaryKey(dmDataItem.getPrimaryKey());

		dmDataItemImpl.setId(dmDataItem.getId());
		dmDataItemImpl.setDataGroupId(dmDataItem.getDataGroupId());
		dmDataItemImpl.setCode0(dmDataItem.getCode0());
		dmDataItemImpl.setCode1(dmDataItem.getCode1());
		dmDataItemImpl.setCode2(dmDataItem.getCode2());
		dmDataItemImpl.setCode3(dmDataItem.getCode3());
		dmDataItemImpl.setLevel(dmDataItem.getLevel());
		dmDataItemImpl.setName(dmDataItem.getName());
		dmDataItemImpl.setAlterName(dmDataItem.getAlterName());
		dmDataItemImpl.setDescription(dmDataItem.getDescription());
		dmDataItemImpl.setValidatedFrom(dmDataItem.getValidatedFrom());
		dmDataItemImpl.setValidatedTo(dmDataItem.getValidatedTo());
		dmDataItemImpl.setStatus(dmDataItem.getStatus());

		return dmDataItemImpl;
	}

	/**
	 * Returns the dm data item with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmDataItemException, SystemException {
		DmDataItem dmDataItem = fetchByPrimaryKey(primaryKey);

		if (dmDataItem == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmDataItemException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException} if it could not be found.
	 *
	 * @param Id the primary key of the dm data item
	 * @return the dm data item
	 * @throws vn.dtt.gt.dk.dao.common.NoSuchDmDataItemException if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem findByPrimaryKey(long Id)
		throws NoSuchDmDataItemException, SystemException {
		return findByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dm data item
	 * @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DmDataItem dmDataItem = (DmDataItem)EntityCacheUtil.getResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
				DmDataItemImpl.class, primaryKey);

		if (dmDataItem == _nullDmDataItem) {
			return null;
		}

		if (dmDataItem == null) {
			Session session = null;

			try {
				session = openSession();

				dmDataItem = (DmDataItem)session.get(DmDataItemImpl.class,
						primaryKey);

				if (dmDataItem != null) {
					cacheResult(dmDataItem);
				}
				else {
					EntityCacheUtil.putResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
						DmDataItemImpl.class, primaryKey, _nullDmDataItem);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DmDataItemModelImpl.ENTITY_CACHE_ENABLED,
					DmDataItemImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmDataItem;
	}

	/**
	 * Returns the dm data item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param Id the primary key of the dm data item
	 * @return the dm data item, or <code>null</code> if a dm data item with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DmDataItem fetchByPrimaryKey(long Id) throws SystemException {
		return fetchByPrimaryKey((Serializable)Id);
	}

	/**
	 * Returns all the dm data items.
	 *
	 * @return the dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dm data items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @return the range of dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dm data items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.DmDataItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of dm data items
	 * @param end the upper bound of the range of dm data items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dm data items
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DmDataItem> findAll(int start, int end,
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

		List<DmDataItem> list = (List<DmDataItem>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DMDATAITEM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMDATAITEM;

				if (pagination) {
					sql = sql.concat(DmDataItemModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DmDataItem>(list);
				}
				else {
					list = (List<DmDataItem>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the dm data items from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DmDataItem dmDataItem : findAll()) {
			remove(dmDataItem);
		}
	}

	/**
	 * Returns the number of dm data items.
	 *
	 * @return the number of dm data items
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

				Query q = session.createQuery(_SQL_COUNT_DMDATAITEM);

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
	 * Initializes the dm data item persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.common.model.DmDataItem")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DmDataItem>> listenersList = new ArrayList<ModelListener<DmDataItem>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DmDataItem>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DmDataItemImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DMDATAITEM = "SELECT dmDataItem FROM DmDataItem dmDataItem";
	private static final String _SQL_SELECT_DMDATAITEM_WHERE = "SELECT dmDataItem FROM DmDataItem dmDataItem WHERE ";
	private static final String _SQL_COUNT_DMDATAITEM = "SELECT COUNT(dmDataItem) FROM DmDataItem dmDataItem";
	private static final String _SQL_COUNT_DMDATAITEM_WHERE = "SELECT COUNT(dmDataItem) FROM DmDataItem dmDataItem WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmDataItem.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmDataItem exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmDataItem exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DmDataItemPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"Id", "DataGroupId", "Code0", "Code1", "Code2", "Code3", "Level",
				"Name", "AlterName", "Description", "ValidatedFrom",
				"ValidatedTo", "Status"
			});
	private static DmDataItem _nullDmDataItem = new DmDataItemImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DmDataItem> toCacheModel() {
				return _nullDmDataItemCacheModel;
			}
		};

	private static CacheModel<DmDataItem> _nullDmDataItemCacheModel = new CacheModel<DmDataItem>() {
			@Override
			public DmDataItem toEntityModel() {
				return _nullDmDataItem;
			}
		};
}