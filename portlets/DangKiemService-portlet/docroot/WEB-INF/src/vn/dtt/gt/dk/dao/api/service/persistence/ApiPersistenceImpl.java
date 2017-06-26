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

package vn.dtt.gt.dk.dao.api.service.persistence;

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

import vn.dtt.gt.dk.dao.api.NoSuchApiException;
import vn.dtt.gt.dk.dao.api.model.Api;
import vn.dtt.gt.dk.dao.api.model.impl.ApiImpl;
import vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the api service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see ApiPersistence
 * @see ApiUtil
 * @generated
 */
public class ApiPersistenceImpl extends BasePersistenceImpl<Api>
	implements ApiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ApiUtil} to access the api persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ApiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IP = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIP",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IP = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIP",
			new String[] { String.class.getName() },
			ApiModelImpl.IP_COLUMN_BITMASK |
			ApiModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IP = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIP",
			new String[] { String.class.getName() });

	/**
	 * Returns all the apis where ip = &#63;.
	 *
	 * @param ip the ip
	 * @return the matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByIP(String ip) throws SystemException {
		return findByIP(ip, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the apis where ip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ip the ip
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @return the range of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByIP(String ip, int start, int end)
		throws SystemException {
		return findByIP(ip, start, end, null);
	}

	/**
	 * Returns an ordered range of all the apis where ip = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ip the ip
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByIP(String ip, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IP;
			finderArgs = new Object[] { ip };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IP;
			finderArgs = new Object[] { ip, start, end, orderByComparator };
		}

		List<Api> list = (List<Api>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Api api : list) {
				if (!Validator.equals(ip, api.getIp())) {
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

			query.append(_SQL_SELECT_API_WHERE);

			boolean bindIp = false;

			if (ip == null) {
				query.append(_FINDER_COLUMN_IP_IP_1);
			}
			else if (ip.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IP_IP_3);
			}
			else {
				bindIp = true;

				query.append(_FINDER_COLUMN_IP_IP_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIp) {
					qPos.add(ip);
				}

				if (!pagination) {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Api>(list);
				}
				else {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first api in the ordered set where ip = &#63;.
	 *
	 * @param ip the ip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByIP_First(String ip, OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = fetchByIP_First(ip, orderByComparator);

		if (api != null) {
			return api;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ip=");
		msg.append(ip);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiException(msg.toString());
	}

	/**
	 * Returns the first api in the ordered set where ip = &#63;.
	 *
	 * @param ip the ip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api, or <code>null</code> if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByIP_First(String ip, OrderByComparator orderByComparator)
		throws SystemException {
		List<Api> list = findByIP(ip, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last api in the ordered set where ip = &#63;.
	 *
	 * @param ip the ip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByIP_Last(String ip, OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = fetchByIP_Last(ip, orderByComparator);

		if (api != null) {
			return api;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ip=");
		msg.append(ip);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiException(msg.toString());
	}

	/**
	 * Returns the last api in the ordered set where ip = &#63;.
	 *
	 * @param ip the ip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api, or <code>null</code> if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByIP_Last(String ip, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByIP(ip);

		if (count == 0) {
			return null;
		}

		List<Api> list = findByIP(ip, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the apis before and after the current api in the ordered set where ip = &#63;.
	 *
	 * @param id the primary key of the current api
	 * @param ip the ip
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api[] findByIP_PrevAndNext(long id, String ip,
		OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Api[] array = new ApiImpl[3];

			array[0] = getByIP_PrevAndNext(session, api, ip, orderByComparator,
					true);

			array[1] = api;

			array[2] = getByIP_PrevAndNext(session, api, ip, orderByComparator,
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

	protected Api getByIP_PrevAndNext(Session session, Api api, String ip,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_API_WHERE);

		boolean bindIp = false;

		if (ip == null) {
			query.append(_FINDER_COLUMN_IP_IP_1);
		}
		else if (ip.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IP_IP_3);
		}
		else {
			bindIp = true;

			query.append(_FINDER_COLUMN_IP_IP_2);
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
			query.append(ApiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindIp) {
			qPos.add(ip);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(api);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Api> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the apis where ip = &#63; from the database.
	 *
	 * @param ip the ip
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByIP(String ip) throws SystemException {
		for (Api api : findByIP(ip, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(api);
		}
	}

	/**
	 * Returns the number of apis where ip = &#63;.
	 *
	 * @param ip the ip
	 * @return the number of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByIP(String ip) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IP;

		Object[] finderArgs = new Object[] { ip };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_API_WHERE);

			boolean bindIp = false;

			if (ip == null) {
				query.append(_FINDER_COLUMN_IP_IP_1);
			}
			else if (ip.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IP_IP_3);
			}
			else {
				bindIp = true;

				query.append(_FINDER_COLUMN_IP_IP_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIp) {
					qPos.add(ip);
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

	private static final String _FINDER_COLUMN_IP_IP_1 = "api.ip IS NULL";
	private static final String _FINDER_COLUMN_IP_IP_2 = "api.ip = ?";
	private static final String _FINDER_COLUMN_IP_IP_3 = "(api.ip IS NULL OR api.ip = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CODE = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCode",
			new String[] { String.class.getName() },
			ApiModelImpl.CODE_COLUMN_BITMASK |
			ApiModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODE = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the apis where code = &#63;.
	 *
	 * @param code the code
	 * @return the matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByCode(String code) throws SystemException {
		return findByCode(code, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the apis where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @return the range of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByCode(String code, int start, int end)
		throws SystemException {
		return findByCode(code, start, end, null);
	}

	/**
	 * Returns an ordered range of all the apis where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByCode(String code, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE;
			finderArgs = new Object[] { code };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CODE;
			finderArgs = new Object[] { code, start, end, orderByComparator };
		}

		List<Api> list = (List<Api>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Api api : list) {
				if (!Validator.equals(code, api.getCode())) {
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

			query.append(_SQL_SELECT_API_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				if (!pagination) {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Api>(list);
				}
				else {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first api in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByCode_First(String code, OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = fetchByCode_First(code, orderByComparator);

		if (api != null) {
			return api;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiException(msg.toString());
	}

	/**
	 * Returns the first api in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api, or <code>null</code> if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByCode_First(String code,
		OrderByComparator orderByComparator) throws SystemException {
		List<Api> list = findByCode(code, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last api in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByCode_Last(String code, OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = fetchByCode_Last(code, orderByComparator);

		if (api != null) {
			return api;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiException(msg.toString());
	}

	/**
	 * Returns the last api in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api, or <code>null</code> if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByCode_Last(String code, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByCode(code);

		if (count == 0) {
			return null;
		}

		List<Api> list = findByCode(code, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the apis before and after the current api in the ordered set where code = &#63;.
	 *
	 * @param id the primary key of the current api
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api[] findByCode_PrevAndNext(long id, String code,
		OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Api[] array = new ApiImpl[3];

			array[0] = getByCode_PrevAndNext(session, api, code,
					orderByComparator, true);

			array[1] = api;

			array[2] = getByCode_PrevAndNext(session, api, code,
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

	protected Api getByCode_PrevAndNext(Session session, Api api, String code,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_API_WHERE);

		boolean bindCode = false;

		if (code == null) {
			query.append(_FINDER_COLUMN_CODE_CODE_1);
		}
		else if (code.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CODE_CODE_3);
		}
		else {
			bindCode = true;

			query.append(_FINDER_COLUMN_CODE_CODE_2);
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
			query.append(ApiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCode) {
			qPos.add(code);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(api);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Api> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the apis where code = &#63; from the database.
	 *
	 * @param code the code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCode(String code) throws SystemException {
		for (Api api : findByCode(code, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(api);
		}
	}

	/**
	 * Returns the number of apis where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCode(String code) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODE;

		Object[] finderArgs = new Object[] { code };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_API_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
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

	private static final String _FINDER_COLUMN_CODE_CODE_1 = "api.code IS NULL";
	private static final String _FINDER_COLUMN_CODE_CODE_2 = "api.code = ?";
	private static final String _FINDER_COLUMN_CODE_CODE_3 = "(api.code IS NULL OR api.code = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTEREDNUMBER =
		new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByRegisteredNumber",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDNUMBER =
		new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByRegisteredNumber", new String[] { String.class.getName() },
			ApiModelImpl.REGISTEREDNUMBER_COLUMN_BITMASK |
			ApiModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGISTEREDNUMBER = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByRegisteredNumber", new String[] { String.class.getName() });

	/**
	 * Returns all the apis where registeredNumber = &#63;.
	 *
	 * @param registeredNumber the registered number
	 * @return the matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByRegisteredNumber(String registeredNumber)
		throws SystemException {
		return findByRegisteredNumber(registeredNumber, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the apis where registeredNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registeredNumber the registered number
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @return the range of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByRegisteredNumber(String registeredNumber, int start,
		int end) throws SystemException {
		return findByRegisteredNumber(registeredNumber, start, end, null);
	}

	/**
	 * Returns an ordered range of all the apis where registeredNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param registeredNumber the registered number
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByRegisteredNumber(String registeredNumber, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDNUMBER;
			finderArgs = new Object[] { registeredNumber };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REGISTEREDNUMBER;
			finderArgs = new Object[] {
					registeredNumber,
					
					start, end, orderByComparator
				};
		}

		List<Api> list = (List<Api>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Api api : list) {
				if (!Validator.equals(registeredNumber,
							api.getRegisteredNumber())) {
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

			query.append(_SQL_SELECT_API_WHERE);

			boolean bindRegisteredNumber = false;

			if (registeredNumber == null) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_1);
			}
			else if (registeredNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisteredNumber = true;

				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegisteredNumber) {
					qPos.add(registeredNumber);
				}

				if (!pagination) {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Api>(list);
				}
				else {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first api in the ordered set where registeredNumber = &#63;.
	 *
	 * @param registeredNumber the registered number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByRegisteredNumber_First(String registeredNumber,
		OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = fetchByRegisteredNumber_First(registeredNumber,
				orderByComparator);

		if (api != null) {
			return api;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registeredNumber=");
		msg.append(registeredNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiException(msg.toString());
	}

	/**
	 * Returns the first api in the ordered set where registeredNumber = &#63;.
	 *
	 * @param registeredNumber the registered number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api, or <code>null</code> if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByRegisteredNumber_First(String registeredNumber,
		OrderByComparator orderByComparator) throws SystemException {
		List<Api> list = findByRegisteredNumber(registeredNumber, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last api in the ordered set where registeredNumber = &#63;.
	 *
	 * @param registeredNumber the registered number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByRegisteredNumber_Last(String registeredNumber,
		OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = fetchByRegisteredNumber_Last(registeredNumber,
				orderByComparator);

		if (api != null) {
			return api;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("registeredNumber=");
		msg.append(registeredNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiException(msg.toString());
	}

	/**
	 * Returns the last api in the ordered set where registeredNumber = &#63;.
	 *
	 * @param registeredNumber the registered number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api, or <code>null</code> if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByRegisteredNumber_Last(String registeredNumber,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByRegisteredNumber(registeredNumber);

		if (count == 0) {
			return null;
		}

		List<Api> list = findByRegisteredNumber(registeredNumber, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the apis before and after the current api in the ordered set where registeredNumber = &#63;.
	 *
	 * @param id the primary key of the current api
	 * @param registeredNumber the registered number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api[] findByRegisteredNumber_PrevAndNext(long id,
		String registeredNumber, OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Api[] array = new ApiImpl[3];

			array[0] = getByRegisteredNumber_PrevAndNext(session, api,
					registeredNumber, orderByComparator, true);

			array[1] = api;

			array[2] = getByRegisteredNumber_PrevAndNext(session, api,
					registeredNumber, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Api getByRegisteredNumber_PrevAndNext(Session session, Api api,
		String registeredNumber, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_API_WHERE);

		boolean bindRegisteredNumber = false;

		if (registeredNumber == null) {
			query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_1);
		}
		else if (registeredNumber.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_3);
		}
		else {
			bindRegisteredNumber = true;

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
			query.append(ApiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindRegisteredNumber) {
			qPos.add(registeredNumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(api);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Api> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the apis where registeredNumber = &#63; from the database.
	 *
	 * @param registeredNumber the registered number
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByRegisteredNumber(String registeredNumber)
		throws SystemException {
		for (Api api : findByRegisteredNumber(registeredNumber,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(api);
		}
	}

	/**
	 * Returns the number of apis where registeredNumber = &#63;.
	 *
	 * @param registeredNumber the registered number
	 * @return the number of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByRegisteredNumber(String registeredNumber)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGISTEREDNUMBER;

		Object[] finderArgs = new Object[] { registeredNumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_API_WHERE);

			boolean bindRegisteredNumber = false;

			if (registeredNumber == null) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_1);
			}
			else if (registeredNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisteredNumber = true;

				query.append(_FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegisteredNumber) {
					qPos.add(registeredNumber);
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
		"api.registeredNumber IS NULL";
	private static final String _FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_2 =
		"api.registeredNumber = ?";
	private static final String _FINDER_COLUMN_REGISTEREDNUMBER_REGISTEREDNUMBER_3 =
		"(api.registeredNumber IS NULL OR api.registeredNumber = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_R = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_R",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_R = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_R",
			new String[] { String.class.getName(), String.class.getName() },
			ApiModelImpl.CODE_COLUMN_BITMASK |
			ApiModelImpl.REGISTEREDNUMBER_COLUMN_BITMASK |
			ApiModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_R = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_R",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the apis where code = &#63; and registeredNumber = &#63;.
	 *
	 * @param code the code
	 * @param registeredNumber the registered number
	 * @return the matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByC_R(String code, String registeredNumber)
		throws SystemException {
		return findByC_R(code, registeredNumber, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the apis where code = &#63; and registeredNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param registeredNumber the registered number
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @return the range of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByC_R(String code, String registeredNumber, int start,
		int end) throws SystemException {
		return findByC_R(code, registeredNumber, start, end, null);
	}

	/**
	 * Returns an ordered range of all the apis where code = &#63; and registeredNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param registeredNumber the registered number
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByC_R(String code, String registeredNumber, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_R;
			finderArgs = new Object[] { code, registeredNumber };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_R;
			finderArgs = new Object[] {
					code, registeredNumber,
					
					start, end, orderByComparator
				};
		}

		List<Api> list = (List<Api>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Api api : list) {
				if (!Validator.equals(code, api.getCode()) ||
						!Validator.equals(registeredNumber,
							api.getRegisteredNumber())) {
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

			query.append(_SQL_SELECT_API_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_C_R_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_R_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_C_R_CODE_2);
			}

			boolean bindRegisteredNumber = false;

			if (registeredNumber == null) {
				query.append(_FINDER_COLUMN_C_R_REGISTEREDNUMBER_1);
			}
			else if (registeredNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_R_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisteredNumber = true;

				query.append(_FINDER_COLUMN_C_R_REGISTEREDNUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				if (bindRegisteredNumber) {
					qPos.add(registeredNumber);
				}

				if (!pagination) {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Api>(list);
				}
				else {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first api in the ordered set where code = &#63; and registeredNumber = &#63;.
	 *
	 * @param code the code
	 * @param registeredNumber the registered number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByC_R_First(String code, String registeredNumber,
		OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = fetchByC_R_First(code, registeredNumber, orderByComparator);

		if (api != null) {
			return api;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(", registeredNumber=");
		msg.append(registeredNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiException(msg.toString());
	}

	/**
	 * Returns the first api in the ordered set where code = &#63; and registeredNumber = &#63;.
	 *
	 * @param code the code
	 * @param registeredNumber the registered number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api, or <code>null</code> if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByC_R_First(String code, String registeredNumber,
		OrderByComparator orderByComparator) throws SystemException {
		List<Api> list = findByC_R(code, registeredNumber, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last api in the ordered set where code = &#63; and registeredNumber = &#63;.
	 *
	 * @param code the code
	 * @param registeredNumber the registered number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByC_R_Last(String code, String registeredNumber,
		OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = fetchByC_R_Last(code, registeredNumber, orderByComparator);

		if (api != null) {
			return api;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(", registeredNumber=");
		msg.append(registeredNumber);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiException(msg.toString());
	}

	/**
	 * Returns the last api in the ordered set where code = &#63; and registeredNumber = &#63;.
	 *
	 * @param code the code
	 * @param registeredNumber the registered number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api, or <code>null</code> if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByC_R_Last(String code, String registeredNumber,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_R(code, registeredNumber);

		if (count == 0) {
			return null;
		}

		List<Api> list = findByC_R(code, registeredNumber, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the apis before and after the current api in the ordered set where code = &#63; and registeredNumber = &#63;.
	 *
	 * @param id the primary key of the current api
	 * @param code the code
	 * @param registeredNumber the registered number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api[] findByC_R_PrevAndNext(long id, String code,
		String registeredNumber, OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Api[] array = new ApiImpl[3];

			array[0] = getByC_R_PrevAndNext(session, api, code,
					registeredNumber, orderByComparator, true);

			array[1] = api;

			array[2] = getByC_R_PrevAndNext(session, api, code,
					registeredNumber, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Api getByC_R_PrevAndNext(Session session, Api api, String code,
		String registeredNumber, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_API_WHERE);

		boolean bindCode = false;

		if (code == null) {
			query.append(_FINDER_COLUMN_C_R_CODE_1);
		}
		else if (code.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_R_CODE_3);
		}
		else {
			bindCode = true;

			query.append(_FINDER_COLUMN_C_R_CODE_2);
		}

		boolean bindRegisteredNumber = false;

		if (registeredNumber == null) {
			query.append(_FINDER_COLUMN_C_R_REGISTEREDNUMBER_1);
		}
		else if (registeredNumber.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_R_REGISTEREDNUMBER_3);
		}
		else {
			bindRegisteredNumber = true;

			query.append(_FINDER_COLUMN_C_R_REGISTEREDNUMBER_2);
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
			query.append(ApiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCode) {
			qPos.add(code);
		}

		if (bindRegisteredNumber) {
			qPos.add(registeredNumber);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(api);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Api> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the apis where code = &#63; and registeredNumber = &#63; from the database.
	 *
	 * @param code the code
	 * @param registeredNumber the registered number
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_R(String code, String registeredNumber)
		throws SystemException {
		for (Api api : findByC_R(code, registeredNumber, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(api);
		}
	}

	/**
	 * Returns the number of apis where code = &#63; and registeredNumber = &#63;.
	 *
	 * @param code the code
	 * @param registeredNumber the registered number
	 * @return the number of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_R(String code, String registeredNumber)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_R;

		Object[] finderArgs = new Object[] { code, registeredNumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_API_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_C_R_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_R_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_C_R_CODE_2);
			}

			boolean bindRegisteredNumber = false;

			if (registeredNumber == null) {
				query.append(_FINDER_COLUMN_C_R_REGISTEREDNUMBER_1);
			}
			else if (registeredNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_R_REGISTEREDNUMBER_3);
			}
			else {
				bindRegisteredNumber = true;

				query.append(_FINDER_COLUMN_C_R_REGISTEREDNUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				if (bindRegisteredNumber) {
					qPos.add(registeredNumber);
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

	private static final String _FINDER_COLUMN_C_R_CODE_1 = "api.code IS NULL AND ";
	private static final String _FINDER_COLUMN_C_R_CODE_2 = "api.code = ? AND ";
	private static final String _FINDER_COLUMN_C_R_CODE_3 = "(api.code IS NULL OR api.code = '') AND ";
	private static final String _FINDER_COLUMN_C_R_REGISTEREDNUMBER_1 = "api.registeredNumber IS NULL";
	private static final String _FINDER_COLUMN_C_R_REGISTEREDNUMBER_2 = "api.registeredNumber = ?";
	private static final String _FINDER_COLUMN_C_R_REGISTEREDNUMBER_3 = "(api.registeredNumber IS NULL OR api.registeredNumber = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_I_C = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByI_C",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_I_C = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, ApiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByI_C",
			new String[] { String.class.getName(), String.class.getName() },
			ApiModelImpl.IP_COLUMN_BITMASK | ApiModelImpl.CODE_COLUMN_BITMASK |
			ApiModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_I_C = new FinderPath(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByI_C",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the apis where ip = &#63; and code = &#63;.
	 *
	 * @param ip the ip
	 * @param code the code
	 * @return the matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByI_C(String ip, String code)
		throws SystemException {
		return findByI_C(ip, code, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the apis where ip = &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ip the ip
	 * @param code the code
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @return the range of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByI_C(String ip, String code, int start, int end)
		throws SystemException {
		return findByI_C(ip, code, start, end, null);
	}

	/**
	 * Returns an ordered range of all the apis where ip = &#63; and code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param ip the ip
	 * @param code the code
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findByI_C(String ip, String code, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_I_C;
			finderArgs = new Object[] { ip, code };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_I_C;
			finderArgs = new Object[] { ip, code, start, end, orderByComparator };
		}

		List<Api> list = (List<Api>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Api api : list) {
				if (!Validator.equals(ip, api.getIp()) ||
						!Validator.equals(code, api.getCode())) {
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

			query.append(_SQL_SELECT_API_WHERE);

			boolean bindIp = false;

			if (ip == null) {
				query.append(_FINDER_COLUMN_I_C_IP_1);
			}
			else if (ip.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_I_C_IP_3);
			}
			else {
				bindIp = true;

				query.append(_FINDER_COLUMN_I_C_IP_2);
			}

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_I_C_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_I_C_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_I_C_CODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ApiModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIp) {
					qPos.add(ip);
				}

				if (bindCode) {
					qPos.add(code);
				}

				if (!pagination) {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Api>(list);
				}
				else {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first api in the ordered set where ip = &#63; and code = &#63;.
	 *
	 * @param ip the ip
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByI_C_First(String ip, String code,
		OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = fetchByI_C_First(ip, code, orderByComparator);

		if (api != null) {
			return api;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ip=");
		msg.append(ip);

		msg.append(", code=");
		msg.append(code);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiException(msg.toString());
	}

	/**
	 * Returns the first api in the ordered set where ip = &#63; and code = &#63;.
	 *
	 * @param ip the ip
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching api, or <code>null</code> if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByI_C_First(String ip, String code,
		OrderByComparator orderByComparator) throws SystemException {
		List<Api> list = findByI_C(ip, code, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last api in the ordered set where ip = &#63; and code = &#63;.
	 *
	 * @param ip the ip
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByI_C_Last(String ip, String code,
		OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = fetchByI_C_Last(ip, code, orderByComparator);

		if (api != null) {
			return api;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ip=");
		msg.append(ip);

		msg.append(", code=");
		msg.append(code);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchApiException(msg.toString());
	}

	/**
	 * Returns the last api in the ordered set where ip = &#63; and code = &#63;.
	 *
	 * @param ip the ip
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching api, or <code>null</code> if a matching api could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByI_C_Last(String ip, String code,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByI_C(ip, code);

		if (count == 0) {
			return null;
		}

		List<Api> list = findByI_C(ip, code, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the apis before and after the current api in the ordered set where ip = &#63; and code = &#63;.
	 *
	 * @param id the primary key of the current api
	 * @param ip the ip
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api[] findByI_C_PrevAndNext(long id, String ip, String code,
		OrderByComparator orderByComparator)
		throws NoSuchApiException, SystemException {
		Api api = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Api[] array = new ApiImpl[3];

			array[0] = getByI_C_PrevAndNext(session, api, ip, code,
					orderByComparator, true);

			array[1] = api;

			array[2] = getByI_C_PrevAndNext(session, api, ip, code,
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

	protected Api getByI_C_PrevAndNext(Session session, Api api, String ip,
		String code, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_API_WHERE);

		boolean bindIp = false;

		if (ip == null) {
			query.append(_FINDER_COLUMN_I_C_IP_1);
		}
		else if (ip.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_I_C_IP_3);
		}
		else {
			bindIp = true;

			query.append(_FINDER_COLUMN_I_C_IP_2);
		}

		boolean bindCode = false;

		if (code == null) {
			query.append(_FINDER_COLUMN_I_C_CODE_1);
		}
		else if (code.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_I_C_CODE_3);
		}
		else {
			bindCode = true;

			query.append(_FINDER_COLUMN_I_C_CODE_2);
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
			query.append(ApiModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindIp) {
			qPos.add(ip);
		}

		if (bindCode) {
			qPos.add(code);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(api);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Api> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the apis where ip = &#63; and code = &#63; from the database.
	 *
	 * @param ip the ip
	 * @param code the code
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByI_C(String ip, String code) throws SystemException {
		for (Api api : findByI_C(ip, code, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(api);
		}
	}

	/**
	 * Returns the number of apis where ip = &#63; and code = &#63;.
	 *
	 * @param ip the ip
	 * @param code the code
	 * @return the number of matching apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByI_C(String ip, String code) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_I_C;

		Object[] finderArgs = new Object[] { ip, code };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_API_WHERE);

			boolean bindIp = false;

			if (ip == null) {
				query.append(_FINDER_COLUMN_I_C_IP_1);
			}
			else if (ip.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_I_C_IP_3);
			}
			else {
				bindIp = true;

				query.append(_FINDER_COLUMN_I_C_IP_2);
			}

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_I_C_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_I_C_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_I_C_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIp) {
					qPos.add(ip);
				}

				if (bindCode) {
					qPos.add(code);
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

	private static final String _FINDER_COLUMN_I_C_IP_1 = "api.ip IS NULL AND ";
	private static final String _FINDER_COLUMN_I_C_IP_2 = "api.ip = ? AND ";
	private static final String _FINDER_COLUMN_I_C_IP_3 = "(api.ip IS NULL OR api.ip = '') AND ";
	private static final String _FINDER_COLUMN_I_C_CODE_1 = "api.code IS NULL";
	private static final String _FINDER_COLUMN_I_C_CODE_2 = "api.code = ?";
	private static final String _FINDER_COLUMN_I_C_CODE_3 = "(api.code IS NULL OR api.code = '')";

	public ApiPersistenceImpl() {
		setModelClass(Api.class);
	}

	/**
	 * Caches the api in the entity cache if it is enabled.
	 *
	 * @param api the api
	 */
	@Override
	public void cacheResult(Api api) {
		EntityCacheUtil.putResult(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiImpl.class, api.getPrimaryKey(), api);

		api.resetOriginalValues();
	}

	/**
	 * Caches the apis in the entity cache if it is enabled.
	 *
	 * @param apis the apis
	 */
	@Override
	public void cacheResult(List<Api> apis) {
		for (Api api : apis) {
			if (EntityCacheUtil.getResult(ApiModelImpl.ENTITY_CACHE_ENABLED,
						ApiImpl.class, api.getPrimaryKey()) == null) {
				cacheResult(api);
			}
			else {
				api.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all apis.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ApiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ApiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the api.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Api api) {
		EntityCacheUtil.removeResult(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiImpl.class, api.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Api> apis) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Api api : apis) {
			EntityCacheUtil.removeResult(ApiModelImpl.ENTITY_CACHE_ENABLED,
				ApiImpl.class, api.getPrimaryKey());
		}
	}

	/**
	 * Creates a new api with the primary key. Does not add the api to the database.
	 *
	 * @param id the primary key for the new api
	 * @return the new api
	 */
	@Override
	public Api create(long id) {
		Api api = new ApiImpl();

		api.setNew(true);
		api.setPrimaryKey(id);

		return api;
	}

	/**
	 * Removes the api with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the api
	 * @return the api that was removed
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api remove(long id) throws NoSuchApiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the api with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the api
	 * @return the api that was removed
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api remove(Serializable primaryKey)
		throws NoSuchApiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Api api = (Api)session.get(ApiImpl.class, primaryKey);

			if (api == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchApiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(api);
		}
		catch (NoSuchApiException nsee) {
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
	protected Api removeImpl(Api api) throws SystemException {
		api = toUnwrappedModel(api);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(api)) {
				api = (Api)session.get(ApiImpl.class, api.getPrimaryKeyObj());
			}

			if (api != null) {
				session.delete(api);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (api != null) {
			clearCache(api);
		}

		return api;
	}

	@Override
	public Api updateImpl(vn.dtt.gt.dk.dao.api.model.Api api)
		throws SystemException {
		api = toUnwrappedModel(api);

		boolean isNew = api.isNew();

		ApiModelImpl apiModelImpl = (ApiModelImpl)api;

		Session session = null;

		try {
			session = openSession();

			if (api.isNew()) {
				session.save(api);

				api.setNew(false);
			}
			else {
				session.merge(api);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ApiModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((apiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IP.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { apiModelImpl.getOriginalIp() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IP, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IP,
					args);

				args = new Object[] { apiModelImpl.getIp() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IP, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IP,
					args);
			}

			if ((apiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { apiModelImpl.getOriginalCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE,
					args);

				args = new Object[] { apiModelImpl.getCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE,
					args);
			}

			if ((apiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDNUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						apiModelImpl.getOriginalRegisteredNumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDNUMBER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDNUMBER,
					args);

				args = new Object[] { apiModelImpl.getRegisteredNumber() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_REGISTEREDNUMBER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REGISTEREDNUMBER,
					args);
			}

			if ((apiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_R.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						apiModelImpl.getOriginalCode(),
						apiModelImpl.getOriginalRegisteredNumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_R,
					args);

				args = new Object[] {
						apiModelImpl.getCode(),
						apiModelImpl.getRegisteredNumber()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_R, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_R,
					args);
			}

			if ((apiModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_I_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						apiModelImpl.getOriginalIp(),
						apiModelImpl.getOriginalCode()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_I_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_I_C,
					args);

				args = new Object[] { apiModelImpl.getIp(), apiModelImpl.getCode() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_I_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_I_C,
					args);
			}
		}

		EntityCacheUtil.putResult(ApiModelImpl.ENTITY_CACHE_ENABLED,
			ApiImpl.class, api.getPrimaryKey(), api);

		return api;
	}

	protected Api toUnwrappedModel(Api api) {
		if (api instanceof ApiImpl) {
			return api;
		}

		ApiImpl apiImpl = new ApiImpl();

		apiImpl.setNew(api.isNew());
		apiImpl.setPrimaryKey(api.getPrimaryKey());

		apiImpl.setId(api.getId());
		apiImpl.setCreateDate(api.getCreateDate());
		apiImpl.setModifiedDate(api.getModifiedDate());
		apiImpl.setUserAgent(api.getUserAgent());
		apiImpl.setIp(api.getIp());
		apiImpl.setCode(api.getCode());
		apiImpl.setRegisteredNumber(api.getRegisteredNumber());
		apiImpl.setRequest(api.getRequest());
		apiImpl.setResponse(api.getResponse());

		return apiImpl;
	}

	/**
	 * Returns the api with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the api
	 * @return the api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByPrimaryKey(Serializable primaryKey)
		throws NoSuchApiException, SystemException {
		Api api = fetchByPrimaryKey(primaryKey);

		if (api == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchApiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return api;
	}

	/**
	 * Returns the api with the primary key or throws a {@link vn.dtt.gt.dk.dao.api.NoSuchApiException} if it could not be found.
	 *
	 * @param id the primary key of the api
	 * @return the api
	 * @throws vn.dtt.gt.dk.dao.api.NoSuchApiException if a api with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api findByPrimaryKey(long id)
		throws NoSuchApiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the api with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the api
	 * @return the api, or <code>null</code> if a api with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Api api = (Api)EntityCacheUtil.getResult(ApiModelImpl.ENTITY_CACHE_ENABLED,
				ApiImpl.class, primaryKey);

		if (api == _nullApi) {
			return null;
		}

		if (api == null) {
			Session session = null;

			try {
				session = openSession();

				api = (Api)session.get(ApiImpl.class, primaryKey);

				if (api != null) {
					cacheResult(api);
				}
				else {
					EntityCacheUtil.putResult(ApiModelImpl.ENTITY_CACHE_ENABLED,
						ApiImpl.class, primaryKey, _nullApi);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ApiModelImpl.ENTITY_CACHE_ENABLED,
					ApiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return api;
	}

	/**
	 * Returns the api with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the api
	 * @return the api, or <code>null</code> if a api with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Api fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the apis.
	 *
	 * @return the apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the apis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @return the range of apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the apis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.api.model.impl.ApiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of apis
	 * @param end the upper bound of the range of apis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of apis
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Api> findAll(int start, int end,
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

		List<Api> list = (List<Api>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_API);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_API;

				if (pagination) {
					sql = sql.concat(ApiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Api>(list);
				}
				else {
					list = (List<Api>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Removes all the apis from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Api api : findAll()) {
			remove(api);
		}
	}

	/**
	 * Returns the number of apis.
	 *
	 * @return the number of apis
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

				Query q = session.createQuery(_SQL_COUNT_API);

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
	 * Initializes the api persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.api.model.Api")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Api>> listenersList = new ArrayList<ModelListener<Api>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Api>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ApiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_API = "SELECT api FROM Api api";
	private static final String _SQL_SELECT_API_WHERE = "SELECT api FROM Api api WHERE ";
	private static final String _SQL_COUNT_API = "SELECT COUNT(api) FROM Api api";
	private static final String _SQL_COUNT_API_WHERE = "SELECT COUNT(api) FROM Api api WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "api.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Api exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Api exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ApiPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "code"
			});
	private static Api _nullApi = new ApiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Api> toCacheModel() {
				return _nullApiCacheModel;
			}
		};

	private static CacheModel<Api> _nullApiCacheModel = new CacheModel<Api>() {
			@Override
			public Api toEntityModel() {
				return _nullApi;
			}
		};
}