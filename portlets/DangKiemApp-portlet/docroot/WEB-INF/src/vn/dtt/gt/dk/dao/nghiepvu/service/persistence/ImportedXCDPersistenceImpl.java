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

import vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException;
import vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDImpl;
import vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the imported x c d service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see ImportedXCDPersistence
 * @see ImportedXCDUtil
 * @generated
 */
public class ImportedXCDPersistenceImpl extends BasePersistenceImpl<ImportedXCD>
	implements ImportedXCDPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ImportedXCDUtil} to access the imported x c d persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ImportedXCDImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, ImportedXCDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, ImportedXCDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_IDGCN = new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, ImportedXCDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByIDGCN",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDGCN = new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, ImportedXCDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByIDGCN",
			new String[] { String.class.getName(), Long.class.getName() },
			ImportedXCDModelImpl.IDGCN_COLUMN_BITMASK |
			ImportedXCDModelImpl.TRANGTHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_IDGCN = new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByIDGCN",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	 *
	 * @param IDGCN the i d g c n
	 * @param trangthai the trangthai
	 * @return the matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findByIDGCN(String IDGCN, long trangthai)
		throws SystemException {
		return findByIDGCN(IDGCN, trangthai, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param IDGCN the i d g c n
	 * @param trangthai the trangthai
	 * @param start the lower bound of the range of imported x c ds
	 * @param end the upper bound of the range of imported x c ds (not inclusive)
	 * @return the range of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findByIDGCN(String IDGCN, long trangthai,
		int start, int end) throws SystemException {
		return findByIDGCN(IDGCN, trangthai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param IDGCN the i d g c n
	 * @param trangthai the trangthai
	 * @param start the lower bound of the range of imported x c ds
	 * @param end the upper bound of the range of imported x c ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findByIDGCN(String IDGCN, long trangthai,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDGCN;
			finderArgs = new Object[] { IDGCN, trangthai };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_IDGCN;
			finderArgs = new Object[] {
					IDGCN, trangthai,
					
					start, end, orderByComparator
				};
		}

		List<ImportedXCD> list = (List<ImportedXCD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ImportedXCD importedXCD : list) {
				if (!Validator.equals(IDGCN, importedXCD.getIDGCN()) ||
						(trangthai != importedXCD.getTrangthai())) {
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

			query.append(_SQL_SELECT_IMPORTEDXCD_WHERE);

			boolean bindIDGCN = false;

			if (IDGCN == null) {
				query.append(_FINDER_COLUMN_IDGCN_IDGCN_1);
			}
			else if (IDGCN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IDGCN_IDGCN_3);
			}
			else {
				bindIDGCN = true;

				query.append(_FINDER_COLUMN_IDGCN_IDGCN_2);
			}

			query.append(_FINDER_COLUMN_IDGCN_TRANGTHAI_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ImportedXCDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIDGCN) {
					qPos.add(IDGCN);
				}

				qPos.add(trangthai);

				if (!pagination) {
					list = (List<ImportedXCD>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ImportedXCD>(list);
				}
				else {
					list = (List<ImportedXCD>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	 *
	 * @param IDGCN the i d g c n
	 * @param trangthai the trangthai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD findByIDGCN_First(String IDGCN, long trangthai,
		OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = fetchByIDGCN_First(IDGCN, trangthai,
				orderByComparator);

		if (importedXCD != null) {
			return importedXCD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("IDGCN=");
		msg.append(IDGCN);

		msg.append(", trangthai=");
		msg.append(trangthai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchImportedXCDException(msg.toString());
	}

	/**
	 * Returns the first imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	 *
	 * @param IDGCN the i d g c n
	 * @param trangthai the trangthai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD fetchByIDGCN_First(String IDGCN, long trangthai,
		OrderByComparator orderByComparator) throws SystemException {
		List<ImportedXCD> list = findByIDGCN(IDGCN, trangthai, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	 *
	 * @param IDGCN the i d g c n
	 * @param trangthai the trangthai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD findByIDGCN_Last(String IDGCN, long trangthai,
		OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = fetchByIDGCN_Last(IDGCN, trangthai,
				orderByComparator);

		if (importedXCD != null) {
			return importedXCD;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("IDGCN=");
		msg.append(IDGCN);

		msg.append(", trangthai=");
		msg.append(trangthai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchImportedXCDException(msg.toString());
	}

	/**
	 * Returns the last imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	 *
	 * @param IDGCN the i d g c n
	 * @param trangthai the trangthai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD fetchByIDGCN_Last(String IDGCN, long trangthai,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByIDGCN(IDGCN, trangthai);

		if (count == 0) {
			return null;
		}

		List<ImportedXCD> list = findByIDGCN(IDGCN, trangthai, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the imported x c ds before and after the current imported x c d in the ordered set where IDGCN = &#63; and trangthai = &#63;.
	 *
	 * @param id the primary key of the current imported x c d
	 * @param IDGCN the i d g c n
	 * @param trangthai the trangthai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD[] findByIDGCN_PrevAndNext(long id, String IDGCN,
		long trangthai, OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ImportedXCD[] array = new ImportedXCDImpl[3];

			array[0] = getByIDGCN_PrevAndNext(session, importedXCD, IDGCN,
					trangthai, orderByComparator, true);

			array[1] = importedXCD;

			array[2] = getByIDGCN_PrevAndNext(session, importedXCD, IDGCN,
					trangthai, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ImportedXCD getByIDGCN_PrevAndNext(Session session,
		ImportedXCD importedXCD, String IDGCN, long trangthai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_IMPORTEDXCD_WHERE);

		boolean bindIDGCN = false;

		if (IDGCN == null) {
			query.append(_FINDER_COLUMN_IDGCN_IDGCN_1);
		}
		else if (IDGCN.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_IDGCN_IDGCN_3);
		}
		else {
			bindIDGCN = true;

			query.append(_FINDER_COLUMN_IDGCN_IDGCN_2);
		}

		query.append(_FINDER_COLUMN_IDGCN_TRANGTHAI_2);

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
			query.append(ImportedXCDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindIDGCN) {
			qPos.add(IDGCN);
		}

		qPos.add(trangthai);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(importedXCD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ImportedXCD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the imported x c ds where IDGCN = &#63; and trangthai = &#63; from the database.
	 *
	 * @param IDGCN the i d g c n
	 * @param trangthai the trangthai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByIDGCN(String IDGCN, long trangthai)
		throws SystemException {
		for (ImportedXCD importedXCD : findByIDGCN(IDGCN, trangthai,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(importedXCD);
		}
	}

	/**
	 * Returns the number of imported x c ds where IDGCN = &#63; and trangthai = &#63;.
	 *
	 * @param IDGCN the i d g c n
	 * @param trangthai the trangthai
	 * @return the number of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByIDGCN(String IDGCN, long trangthai)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_IDGCN;

		Object[] finderArgs = new Object[] { IDGCN, trangthai };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_IMPORTEDXCD_WHERE);

			boolean bindIDGCN = false;

			if (IDGCN == null) {
				query.append(_FINDER_COLUMN_IDGCN_IDGCN_1);
			}
			else if (IDGCN.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_IDGCN_IDGCN_3);
			}
			else {
				bindIDGCN = true;

				query.append(_FINDER_COLUMN_IDGCN_IDGCN_2);
			}

			query.append(_FINDER_COLUMN_IDGCN_TRANGTHAI_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIDGCN) {
					qPos.add(IDGCN);
				}

				qPos.add(trangthai);

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

	private static final String _FINDER_COLUMN_IDGCN_IDGCN_1 = "importedXCD.IDGCN IS NULL AND ";
	private static final String _FINDER_COLUMN_IDGCN_IDGCN_2 = "importedXCD.IDGCN = ? AND ";
	private static final String _FINDER_COLUMN_IDGCN_IDGCN_3 = "(importedXCD.IDGCN IS NULL OR importedXCD.IDGCN = '') AND ";
	private static final String _FINDER_COLUMN_IDGCN_TRANGTHAI_2 = "importedXCD.trangthai = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SODANGKY = new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, ImportedXCDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySoDangKy",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SODANGKY =
		new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, ImportedXCDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySoDangKy",
			new String[] { String.class.getName() },
			ImportedXCDModelImpl.SODANGKY_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SODANGKY = new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySoDangKy",
			new String[] { String.class.getName() });

	/**
	 * Returns all the imported x c ds where SoDangKy = &#63;.
	 *
	 * @param SoDangKy the so dang ky
	 * @return the matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findBySoDangKy(String SoDangKy)
		throws SystemException {
		return findBySoDangKy(SoDangKy, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the imported x c ds where SoDangKy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param SoDangKy the so dang ky
	 * @param start the lower bound of the range of imported x c ds
	 * @param end the upper bound of the range of imported x c ds (not inclusive)
	 * @return the range of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findBySoDangKy(String SoDangKy, int start, int end)
		throws SystemException {
		return findBySoDangKy(SoDangKy, start, end, null);
	}

	/**
	 * Returns an ordered range of all the imported x c ds where SoDangKy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param SoDangKy the so dang ky
	 * @param start the lower bound of the range of imported x c ds
	 * @param end the upper bound of the range of imported x c ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findBySoDangKy(String SoDangKy, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SODANGKY;
			finderArgs = new Object[] { SoDangKy };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SODANGKY;
			finderArgs = new Object[] { SoDangKy, start, end, orderByComparator };
		}

		List<ImportedXCD> list = (List<ImportedXCD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ImportedXCD importedXCD : list) {
				if (!Validator.equals(SoDangKy, importedXCD.getSoDangKy())) {
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

			query.append(_SQL_SELECT_IMPORTEDXCD_WHERE);

			boolean bindSoDangKy = false;

			if (SoDangKy == null) {
				query.append(_FINDER_COLUMN_SODANGKY_SODANGKY_1);
			}
			else if (SoDangKy.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SODANGKY_SODANGKY_3);
			}
			else {
				bindSoDangKy = true;

				query.append(_FINDER_COLUMN_SODANGKY_SODANGKY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ImportedXCDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSoDangKy) {
					qPos.add(SoDangKy);
				}

				if (!pagination) {
					list = (List<ImportedXCD>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ImportedXCD>(list);
				}
				else {
					list = (List<ImportedXCD>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first imported x c d in the ordered set where SoDangKy = &#63;.
	 *
	 * @param SoDangKy the so dang ky
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD findBySoDangKy_First(String SoDangKy,
		OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = fetchBySoDangKy_First(SoDangKy,
				orderByComparator);

		if (importedXCD != null) {
			return importedXCD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SoDangKy=");
		msg.append(SoDangKy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchImportedXCDException(msg.toString());
	}

	/**
	 * Returns the first imported x c d in the ordered set where SoDangKy = &#63;.
	 *
	 * @param SoDangKy the so dang ky
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD fetchBySoDangKy_First(String SoDangKy,
		OrderByComparator orderByComparator) throws SystemException {
		List<ImportedXCD> list = findBySoDangKy(SoDangKy, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last imported x c d in the ordered set where SoDangKy = &#63;.
	 *
	 * @param SoDangKy the so dang ky
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD findBySoDangKy_Last(String SoDangKy,
		OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = fetchBySoDangKy_Last(SoDangKy,
				orderByComparator);

		if (importedXCD != null) {
			return importedXCD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SoDangKy=");
		msg.append(SoDangKy);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchImportedXCDException(msg.toString());
	}

	/**
	 * Returns the last imported x c d in the ordered set where SoDangKy = &#63;.
	 *
	 * @param SoDangKy the so dang ky
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD fetchBySoDangKy_Last(String SoDangKy,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySoDangKy(SoDangKy);

		if (count == 0) {
			return null;
		}

		List<ImportedXCD> list = findBySoDangKy(SoDangKy, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the imported x c ds before and after the current imported x c d in the ordered set where SoDangKy = &#63;.
	 *
	 * @param id the primary key of the current imported x c d
	 * @param SoDangKy the so dang ky
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD[] findBySoDangKy_PrevAndNext(long id, String SoDangKy,
		OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ImportedXCD[] array = new ImportedXCDImpl[3];

			array[0] = getBySoDangKy_PrevAndNext(session, importedXCD,
					SoDangKy, orderByComparator, true);

			array[1] = importedXCD;

			array[2] = getBySoDangKy_PrevAndNext(session, importedXCD,
					SoDangKy, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ImportedXCD getBySoDangKy_PrevAndNext(Session session,
		ImportedXCD importedXCD, String SoDangKy,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_IMPORTEDXCD_WHERE);

		boolean bindSoDangKy = false;

		if (SoDangKy == null) {
			query.append(_FINDER_COLUMN_SODANGKY_SODANGKY_1);
		}
		else if (SoDangKy.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SODANGKY_SODANGKY_3);
		}
		else {
			bindSoDangKy = true;

			query.append(_FINDER_COLUMN_SODANGKY_SODANGKY_2);
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
			query.append(ImportedXCDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSoDangKy) {
			qPos.add(SoDangKy);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(importedXCD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ImportedXCD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the imported x c ds where SoDangKy = &#63; from the database.
	 *
	 * @param SoDangKy the so dang ky
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySoDangKy(String SoDangKy) throws SystemException {
		for (ImportedXCD importedXCD : findBySoDangKy(SoDangKy,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(importedXCD);
		}
	}

	/**
	 * Returns the number of imported x c ds where SoDangKy = &#63;.
	 *
	 * @param SoDangKy the so dang ky
	 * @return the number of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySoDangKy(String SoDangKy) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SODANGKY;

		Object[] finderArgs = new Object[] { SoDangKy };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_IMPORTEDXCD_WHERE);

			boolean bindSoDangKy = false;

			if (SoDangKy == null) {
				query.append(_FINDER_COLUMN_SODANGKY_SODANGKY_1);
			}
			else if (SoDangKy.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SODANGKY_SODANGKY_3);
			}
			else {
				bindSoDangKy = true;

				query.append(_FINDER_COLUMN_SODANGKY_SODANGKY_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSoDangKy) {
					qPos.add(SoDangKy);
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

	private static final String _FINDER_COLUMN_SODANGKY_SODANGKY_1 = "importedXCD.SoDangKy IS NULL";
	private static final String _FINDER_COLUMN_SODANGKY_SODANGKY_2 = "importedXCD.SoDangKy = ?";
	private static final String _FINDER_COLUMN_SODANGKY_SODANGKY_3 = "(importedXCD.SoDangKy IS NULL OR importedXCD.SoDangKy = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SOBIENBAN =
		new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, ImportedXCDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySoBienBan",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOBIENBAN =
		new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, ImportedXCDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySoBienBan",
			new String[] { String.class.getName() },
			ImportedXCDModelImpl.SOBIENBAN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SOBIENBAN = new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySoBienBan",
			new String[] { String.class.getName() });

	/**
	 * Returns all the imported x c ds where SoBienBan = &#63;.
	 *
	 * @param SoBienBan the so bien ban
	 * @return the matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findBySoBienBan(String SoBienBan)
		throws SystemException {
		return findBySoBienBan(SoBienBan, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the imported x c ds where SoBienBan = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param SoBienBan the so bien ban
	 * @param start the lower bound of the range of imported x c ds
	 * @param end the upper bound of the range of imported x c ds (not inclusive)
	 * @return the range of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findBySoBienBan(String SoBienBan, int start,
		int end) throws SystemException {
		return findBySoBienBan(SoBienBan, start, end, null);
	}

	/**
	 * Returns an ordered range of all the imported x c ds where SoBienBan = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param SoBienBan the so bien ban
	 * @param start the lower bound of the range of imported x c ds
	 * @param end the upper bound of the range of imported x c ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findBySoBienBan(String SoBienBan, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOBIENBAN;
			finderArgs = new Object[] { SoBienBan };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SOBIENBAN;
			finderArgs = new Object[] { SoBienBan, start, end, orderByComparator };
		}

		List<ImportedXCD> list = (List<ImportedXCD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ImportedXCD importedXCD : list) {
				if (!Validator.equals(SoBienBan, importedXCD.getSoBienBan())) {
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

			query.append(_SQL_SELECT_IMPORTEDXCD_WHERE);

			boolean bindSoBienBan = false;

			if (SoBienBan == null) {
				query.append(_FINDER_COLUMN_SOBIENBAN_SOBIENBAN_1);
			}
			else if (SoBienBan.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SOBIENBAN_SOBIENBAN_3);
			}
			else {
				bindSoBienBan = true;

				query.append(_FINDER_COLUMN_SOBIENBAN_SOBIENBAN_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ImportedXCDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSoBienBan) {
					qPos.add(SoBienBan);
				}

				if (!pagination) {
					list = (List<ImportedXCD>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ImportedXCD>(list);
				}
				else {
					list = (List<ImportedXCD>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first imported x c d in the ordered set where SoBienBan = &#63;.
	 *
	 * @param SoBienBan the so bien ban
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD findBySoBienBan_First(String SoBienBan,
		OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = fetchBySoBienBan_First(SoBienBan,
				orderByComparator);

		if (importedXCD != null) {
			return importedXCD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SoBienBan=");
		msg.append(SoBienBan);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchImportedXCDException(msg.toString());
	}

	/**
	 * Returns the first imported x c d in the ordered set where SoBienBan = &#63;.
	 *
	 * @param SoBienBan the so bien ban
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD fetchBySoBienBan_First(String SoBienBan,
		OrderByComparator orderByComparator) throws SystemException {
		List<ImportedXCD> list = findBySoBienBan(SoBienBan, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last imported x c d in the ordered set where SoBienBan = &#63;.
	 *
	 * @param SoBienBan the so bien ban
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD findBySoBienBan_Last(String SoBienBan,
		OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = fetchBySoBienBan_Last(SoBienBan,
				orderByComparator);

		if (importedXCD != null) {
			return importedXCD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SoBienBan=");
		msg.append(SoBienBan);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchImportedXCDException(msg.toString());
	}

	/**
	 * Returns the last imported x c d in the ordered set where SoBienBan = &#63;.
	 *
	 * @param SoBienBan the so bien ban
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD fetchBySoBienBan_Last(String SoBienBan,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySoBienBan(SoBienBan);

		if (count == 0) {
			return null;
		}

		List<ImportedXCD> list = findBySoBienBan(SoBienBan, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the imported x c ds before and after the current imported x c d in the ordered set where SoBienBan = &#63;.
	 *
	 * @param id the primary key of the current imported x c d
	 * @param SoBienBan the so bien ban
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD[] findBySoBienBan_PrevAndNext(long id, String SoBienBan,
		OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ImportedXCD[] array = new ImportedXCDImpl[3];

			array[0] = getBySoBienBan_PrevAndNext(session, importedXCD,
					SoBienBan, orderByComparator, true);

			array[1] = importedXCD;

			array[2] = getBySoBienBan_PrevAndNext(session, importedXCD,
					SoBienBan, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ImportedXCD getBySoBienBan_PrevAndNext(Session session,
		ImportedXCD importedXCD, String SoBienBan,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_IMPORTEDXCD_WHERE);

		boolean bindSoBienBan = false;

		if (SoBienBan == null) {
			query.append(_FINDER_COLUMN_SOBIENBAN_SOBIENBAN_1);
		}
		else if (SoBienBan.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SOBIENBAN_SOBIENBAN_3);
		}
		else {
			bindSoBienBan = true;

			query.append(_FINDER_COLUMN_SOBIENBAN_SOBIENBAN_2);
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
			query.append(ImportedXCDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSoBienBan) {
			qPos.add(SoBienBan);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(importedXCD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ImportedXCD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the imported x c ds where SoBienBan = &#63; from the database.
	 *
	 * @param SoBienBan the so bien ban
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySoBienBan(String SoBienBan) throws SystemException {
		for (ImportedXCD importedXCD : findBySoBienBan(SoBienBan,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(importedXCD);
		}
	}

	/**
	 * Returns the number of imported x c ds where SoBienBan = &#63;.
	 *
	 * @param SoBienBan the so bien ban
	 * @return the number of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySoBienBan(String SoBienBan) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SOBIENBAN;

		Object[] finderArgs = new Object[] { SoBienBan };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_IMPORTEDXCD_WHERE);

			boolean bindSoBienBan = false;

			if (SoBienBan == null) {
				query.append(_FINDER_COLUMN_SOBIENBAN_SOBIENBAN_1);
			}
			else if (SoBienBan.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SOBIENBAN_SOBIENBAN_3);
			}
			else {
				bindSoBienBan = true;

				query.append(_FINDER_COLUMN_SOBIENBAN_SOBIENBAN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSoBienBan) {
					qPos.add(SoBienBan);
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

	private static final String _FINDER_COLUMN_SOBIENBAN_SOBIENBAN_1 = "importedXCD.SoBienBan IS NULL";
	private static final String _FINDER_COLUMN_SOBIENBAN_SOBIENBAN_2 = "importedXCD.SoBienBan = ?";
	private static final String _FINDER_COLUMN_SOBIENBAN_SOBIENBAN_3 = "(importedXCD.SoBienBan IS NULL OR importedXCD.SoBienBan = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SOTOKHAI = new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, ImportedXCDImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySoToKhai",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOTOKHAI =
		new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, ImportedXCDImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySoToKhai",
			new String[] { String.class.getName() },
			ImportedXCDModelImpl.SOTOKHAI_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SOTOKHAI = new FinderPath(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySoToKhai",
			new String[] { String.class.getName() });

	/**
	 * Returns all the imported x c ds where SoToKhai = &#63;.
	 *
	 * @param SoToKhai the so to khai
	 * @return the matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findBySoToKhai(String SoToKhai)
		throws SystemException {
		return findBySoToKhai(SoToKhai, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the imported x c ds where SoToKhai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param SoToKhai the so to khai
	 * @param start the lower bound of the range of imported x c ds
	 * @param end the upper bound of the range of imported x c ds (not inclusive)
	 * @return the range of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findBySoToKhai(String SoToKhai, int start, int end)
		throws SystemException {
		return findBySoToKhai(SoToKhai, start, end, null);
	}

	/**
	 * Returns an ordered range of all the imported x c ds where SoToKhai = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param SoToKhai the so to khai
	 * @param start the lower bound of the range of imported x c ds
	 * @param end the upper bound of the range of imported x c ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findBySoToKhai(String SoToKhai, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOTOKHAI;
			finderArgs = new Object[] { SoToKhai };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SOTOKHAI;
			finderArgs = new Object[] { SoToKhai, start, end, orderByComparator };
		}

		List<ImportedXCD> list = (List<ImportedXCD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ImportedXCD importedXCD : list) {
				if (!Validator.equals(SoToKhai, importedXCD.getSoToKhai())) {
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

			query.append(_SQL_SELECT_IMPORTEDXCD_WHERE);

			boolean bindSoToKhai = false;

			if (SoToKhai == null) {
				query.append(_FINDER_COLUMN_SOTOKHAI_SOTOKHAI_1);
			}
			else if (SoToKhai.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SOTOKHAI_SOTOKHAI_3);
			}
			else {
				bindSoToKhai = true;

				query.append(_FINDER_COLUMN_SOTOKHAI_SOTOKHAI_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ImportedXCDModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSoToKhai) {
					qPos.add(SoToKhai);
				}

				if (!pagination) {
					list = (List<ImportedXCD>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ImportedXCD>(list);
				}
				else {
					list = (List<ImportedXCD>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first imported x c d in the ordered set where SoToKhai = &#63;.
	 *
	 * @param SoToKhai the so to khai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD findBySoToKhai_First(String SoToKhai,
		OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = fetchBySoToKhai_First(SoToKhai,
				orderByComparator);

		if (importedXCD != null) {
			return importedXCD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SoToKhai=");
		msg.append(SoToKhai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchImportedXCDException(msg.toString());
	}

	/**
	 * Returns the first imported x c d in the ordered set where SoToKhai = &#63;.
	 *
	 * @param SoToKhai the so to khai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD fetchBySoToKhai_First(String SoToKhai,
		OrderByComparator orderByComparator) throws SystemException {
		List<ImportedXCD> list = findBySoToKhai(SoToKhai, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last imported x c d in the ordered set where SoToKhai = &#63;.
	 *
	 * @param SoToKhai the so to khai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD findBySoToKhai_Last(String SoToKhai,
		OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = fetchBySoToKhai_Last(SoToKhai,
				orderByComparator);

		if (importedXCD != null) {
			return importedXCD;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("SoToKhai=");
		msg.append(SoToKhai);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchImportedXCDException(msg.toString());
	}

	/**
	 * Returns the last imported x c d in the ordered set where SoToKhai = &#63;.
	 *
	 * @param SoToKhai the so to khai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching imported x c d, or <code>null</code> if a matching imported x c d could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD fetchBySoToKhai_Last(String SoToKhai,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBySoToKhai(SoToKhai);

		if (count == 0) {
			return null;
		}

		List<ImportedXCD> list = findBySoToKhai(SoToKhai, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the imported x c ds before and after the current imported x c d in the ordered set where SoToKhai = &#63;.
	 *
	 * @param id the primary key of the current imported x c d
	 * @param SoToKhai the so to khai
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD[] findBySoToKhai_PrevAndNext(long id, String SoToKhai,
		OrderByComparator orderByComparator)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ImportedXCD[] array = new ImportedXCDImpl[3];

			array[0] = getBySoToKhai_PrevAndNext(session, importedXCD,
					SoToKhai, orderByComparator, true);

			array[1] = importedXCD;

			array[2] = getBySoToKhai_PrevAndNext(session, importedXCD,
					SoToKhai, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ImportedXCD getBySoToKhai_PrevAndNext(Session session,
		ImportedXCD importedXCD, String SoToKhai,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_IMPORTEDXCD_WHERE);

		boolean bindSoToKhai = false;

		if (SoToKhai == null) {
			query.append(_FINDER_COLUMN_SOTOKHAI_SOTOKHAI_1);
		}
		else if (SoToKhai.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SOTOKHAI_SOTOKHAI_3);
		}
		else {
			bindSoToKhai = true;

			query.append(_FINDER_COLUMN_SOTOKHAI_SOTOKHAI_2);
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
			query.append(ImportedXCDModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSoToKhai) {
			qPos.add(SoToKhai);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(importedXCD);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ImportedXCD> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the imported x c ds where SoToKhai = &#63; from the database.
	 *
	 * @param SoToKhai the so to khai
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBySoToKhai(String SoToKhai) throws SystemException {
		for (ImportedXCD importedXCD : findBySoToKhai(SoToKhai,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(importedXCD);
		}
	}

	/**
	 * Returns the number of imported x c ds where SoToKhai = &#63;.
	 *
	 * @param SoToKhai the so to khai
	 * @return the number of matching imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBySoToKhai(String SoToKhai) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SOTOKHAI;

		Object[] finderArgs = new Object[] { SoToKhai };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_IMPORTEDXCD_WHERE);

			boolean bindSoToKhai = false;

			if (SoToKhai == null) {
				query.append(_FINDER_COLUMN_SOTOKHAI_SOTOKHAI_1);
			}
			else if (SoToKhai.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SOTOKHAI_SOTOKHAI_3);
			}
			else {
				bindSoToKhai = true;

				query.append(_FINDER_COLUMN_SOTOKHAI_SOTOKHAI_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSoToKhai) {
					qPos.add(SoToKhai);
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

	private static final String _FINDER_COLUMN_SOTOKHAI_SOTOKHAI_1 = "importedXCD.SoToKhai IS NULL";
	private static final String _FINDER_COLUMN_SOTOKHAI_SOTOKHAI_2 = "importedXCD.SoToKhai = ?";
	private static final String _FINDER_COLUMN_SOTOKHAI_SOTOKHAI_3 = "(importedXCD.SoToKhai IS NULL OR importedXCD.SoToKhai = '')";

	public ImportedXCDPersistenceImpl() {
		setModelClass(ImportedXCD.class);
	}

	/**
	 * Caches the imported x c d in the entity cache if it is enabled.
	 *
	 * @param importedXCD the imported x c d
	 */
	@Override
	public void cacheResult(ImportedXCD importedXCD) {
		EntityCacheUtil.putResult(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDImpl.class, importedXCD.getPrimaryKey(), importedXCD);

		importedXCD.resetOriginalValues();
	}

	/**
	 * Caches the imported x c ds in the entity cache if it is enabled.
	 *
	 * @param importedXCDs the imported x c ds
	 */
	@Override
	public void cacheResult(List<ImportedXCD> importedXCDs) {
		for (ImportedXCD importedXCD : importedXCDs) {
			if (EntityCacheUtil.getResult(
						ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
						ImportedXCDImpl.class, importedXCD.getPrimaryKey()) == null) {
				cacheResult(importedXCD);
			}
			else {
				importedXCD.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all imported x c ds.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ImportedXCDImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ImportedXCDImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the imported x c d.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ImportedXCD importedXCD) {
		EntityCacheUtil.removeResult(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDImpl.class, importedXCD.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ImportedXCD> importedXCDs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ImportedXCD importedXCD : importedXCDs) {
			EntityCacheUtil.removeResult(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
				ImportedXCDImpl.class, importedXCD.getPrimaryKey());
		}
	}

	/**
	 * Creates a new imported x c d with the primary key. Does not add the imported x c d to the database.
	 *
	 * @param id the primary key for the new imported x c d
	 * @return the new imported x c d
	 */
	@Override
	public ImportedXCD create(long id) {
		ImportedXCD importedXCD = new ImportedXCDImpl();

		importedXCD.setNew(true);
		importedXCD.setPrimaryKey(id);

		return importedXCD;
	}

	/**
	 * Removes the imported x c d with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the imported x c d
	 * @return the imported x c d that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD remove(long id)
		throws NoSuchImportedXCDException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the imported x c d with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the imported x c d
	 * @return the imported x c d that was removed
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD remove(Serializable primaryKey)
		throws NoSuchImportedXCDException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ImportedXCD importedXCD = (ImportedXCD)session.get(ImportedXCDImpl.class,
					primaryKey);

			if (importedXCD == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchImportedXCDException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(importedXCD);
		}
		catch (NoSuchImportedXCDException nsee) {
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
	protected ImportedXCD removeImpl(ImportedXCD importedXCD)
		throws SystemException {
		importedXCD = toUnwrappedModel(importedXCD);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(importedXCD)) {
				importedXCD = (ImportedXCD)session.get(ImportedXCDImpl.class,
						importedXCD.getPrimaryKeyObj());
			}

			if (importedXCD != null) {
				session.delete(importedXCD);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (importedXCD != null) {
			clearCache(importedXCD);
		}

		return importedXCD;
	}

	@Override
	public ImportedXCD updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD importedXCD)
		throws SystemException {
		importedXCD = toUnwrappedModel(importedXCD);

		boolean isNew = importedXCD.isNew();

		ImportedXCDModelImpl importedXCDModelImpl = (ImportedXCDModelImpl)importedXCD;

		Session session = null;

		try {
			session = openSession();

			if (importedXCD.isNew()) {
				session.save(importedXCD);

				importedXCD.setNew(false);
			}
			else {
				session.merge(importedXCD);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ImportedXCDModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((importedXCDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDGCN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						importedXCDModelImpl.getOriginalIDGCN(),
						importedXCDModelImpl.getOriginalTrangthai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDGCN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDGCN,
					args);

				args = new Object[] {
						importedXCDModelImpl.getIDGCN(),
						importedXCDModelImpl.getTrangthai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_IDGCN, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_IDGCN,
					args);
			}

			if ((importedXCDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SODANGKY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						importedXCDModelImpl.getOriginalSoDangKy()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SODANGKY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SODANGKY,
					args);

				args = new Object[] { importedXCDModelImpl.getSoDangKy() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SODANGKY, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SODANGKY,
					args);
			}

			if ((importedXCDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOBIENBAN.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						importedXCDModelImpl.getOriginalSoBienBan()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SOBIENBAN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOBIENBAN,
					args);

				args = new Object[] { importedXCDModelImpl.getSoBienBan() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SOBIENBAN,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOBIENBAN,
					args);
			}

			if ((importedXCDModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOTOKHAI.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						importedXCDModelImpl.getOriginalSoToKhai()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SOTOKHAI, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOTOKHAI,
					args);

				args = new Object[] { importedXCDModelImpl.getSoToKhai() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SOTOKHAI, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SOTOKHAI,
					args);
			}
		}

		EntityCacheUtil.putResult(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
			ImportedXCDImpl.class, importedXCD.getPrimaryKey(), importedXCD);

		return importedXCD;
	}

	protected ImportedXCD toUnwrappedModel(ImportedXCD importedXCD) {
		if (importedXCD instanceof ImportedXCDImpl) {
			return importedXCD;
		}

		ImportedXCDImpl importedXCDImpl = new ImportedXCDImpl();

		importedXCDImpl.setNew(importedXCD.isNew());
		importedXCDImpl.setPrimaryKey(importedXCD.getPrimaryKey());

		importedXCDImpl.setId(importedXCD.getId());
		importedXCDImpl.setTrangthai(importedXCD.getTrangthai());
		importedXCDImpl.setIDGCN(importedXCD.getIDGCN());
		importedXCDImpl.setSoToKhai(importedXCD.getSoToKhai());
		importedXCDImpl.setSoDangKy(importedXCD.getSoDangKy());
		importedXCDImpl.setSoBienBan(importedXCD.getSoBienBan());
		importedXCDImpl.setNguoiKT(importedXCD.getNguoiKT());
		importedXCDImpl.setNgayKiemTra(importedXCD.getNgayKiemTra());
		importedXCDImpl.setNoiKiemTra(importedXCD.getNoiKiemTra());
		importedXCDImpl.setMaChu(importedXCD.getMaChu());
		importedXCDImpl.setTenChu(importedXCD.getTenChu());
		importedXCDImpl.setDiaChi(importedXCD.getDiaChi());
		importedXCDImpl.setDienThoai(importedXCD.getDienThoai());
		importedXCDImpl.setSoFAX(importedXCD.getSoFAX());
		importedXCDImpl.setMaChungLoai(importedXCD.getMaChungLoai());
		importedXCDImpl.setMaTenXe(importedXCD.getMaTenXe());
		importedXCDImpl.setNhanHieu(importedXCD.getNhanHieu());
		importedXCDImpl.setSoLoai(importedXCD.getSoLoai());
		importedXCDImpl.setTenThuongMai(importedXCD.getTenThuongMai());
		importedXCDImpl.setSoDongCo(importedXCD.getSoDongCo());
		importedXCDImpl.setSoKhung(importedXCD.getSoKhung());
		importedXCDImpl.setNamSx(importedXCD.getNamSx());
		importedXCDImpl.setNoiSx(importedXCD.getNoiSx());
		importedXCDImpl.setNgayDenHan(importedXCD.getNgayDenHan());
		importedXCDImpl.setNgayCapGCN(importedXCD.getNgayCapGCN());
		importedXCDImpl.setNgayNhap(importedXCD.getNgayNhap());
		importedXCDImpl.setNote(importedXCD.getNote());
		importedXCDImpl.setLoginName(importedXCD.getLoginName());
		importedXCDImpl.setMADV(importedXCD.getMADV());
		importedXCDImpl.setTinhTrang(importedXCD.getTinhTrang());
		importedXCDImpl.setGhiChu(importedXCD.getGhiChu());
		importedXCDImpl.setNguoiSoat(importedXCD.getNguoiSoat());
		importedXCDImpl.setNgaySoat(importedXCD.getNgaySoat());
		importedXCDImpl.setKetQua(importedXCD.getKetQua());
		importedXCDImpl.setSTT(importedXCD.getSTT());
		importedXCDImpl.setTenXe(importedXCD.getTenXe());
		importedXCDImpl.setTenChungLoai(importedXCD.getTenChungLoai());
		importedXCDImpl.setMaTSKT(importedXCD.getMaTSKT());
		importedXCDImpl.setTenDacTinhV(importedXCD.getTenDacTinhV());
		importedXCDImpl.setTenDacTinhA(importedXCD.getTenDacTinhA());
		importedXCDImpl.setMaNhomDacTinh(importedXCD.getMaNhomDacTinh());
		importedXCDImpl.setThuNguyen(importedXCD.getThuNguyen());
		importedXCDImpl.setGiaTri(importedXCD.getGiaTri());

		return importedXCDImpl;
	}

	/**
	 * Returns the imported x c d with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the imported x c d
	 * @return the imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD findByPrimaryKey(Serializable primaryKey)
		throws NoSuchImportedXCDException, SystemException {
		ImportedXCD importedXCD = fetchByPrimaryKey(primaryKey);

		if (importedXCD == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchImportedXCDException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return importedXCD;
	}

	/**
	 * Returns the imported x c d with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException} if it could not be found.
	 *
	 * @param id the primary key of the imported x c d
	 * @return the imported x c d
	 * @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchImportedXCDException if a imported x c d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD findByPrimaryKey(long id)
		throws NoSuchImportedXCDException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the imported x c d with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the imported x c d
	 * @return the imported x c d, or <code>null</code> if a imported x c d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ImportedXCD importedXCD = (ImportedXCD)EntityCacheUtil.getResult(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
				ImportedXCDImpl.class, primaryKey);

		if (importedXCD == _nullImportedXCD) {
			return null;
		}

		if (importedXCD == null) {
			Session session = null;

			try {
				session = openSession();

				importedXCD = (ImportedXCD)session.get(ImportedXCDImpl.class,
						primaryKey);

				if (importedXCD != null) {
					cacheResult(importedXCD);
				}
				else {
					EntityCacheUtil.putResult(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
						ImportedXCDImpl.class, primaryKey, _nullImportedXCD);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ImportedXCDModelImpl.ENTITY_CACHE_ENABLED,
					ImportedXCDImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return importedXCD;
	}

	/**
	 * Returns the imported x c d with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the imported x c d
	 * @return the imported x c d, or <code>null</code> if a imported x c d with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ImportedXCD fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the imported x c ds.
	 *
	 * @return the imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the imported x c ds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of imported x c ds
	 * @param end the upper bound of the range of imported x c ds (not inclusive)
	 * @return the range of imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the imported x c ds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ImportedXCDModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of imported x c ds
	 * @param end the upper bound of the range of imported x c ds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of imported x c ds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ImportedXCD> findAll(int start, int end,
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

		List<ImportedXCD> list = (List<ImportedXCD>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_IMPORTEDXCD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_IMPORTEDXCD;

				if (pagination) {
					sql = sql.concat(ImportedXCDModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ImportedXCD>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ImportedXCD>(list);
				}
				else {
					list = (List<ImportedXCD>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the imported x c ds from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ImportedXCD importedXCD : findAll()) {
			remove(importedXCD);
		}
	}

	/**
	 * Returns the number of imported x c ds.
	 *
	 * @return the number of imported x c ds
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

				Query q = session.createQuery(_SQL_COUNT_IMPORTEDXCD);

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
	 * Initializes the imported x c d persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.dtt.gt.dk.dao.nghiepvu.model.ImportedXCD")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ImportedXCD>> listenersList = new ArrayList<ModelListener<ImportedXCD>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ImportedXCD>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ImportedXCDImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_IMPORTEDXCD = "SELECT importedXCD FROM ImportedXCD importedXCD";
	private static final String _SQL_SELECT_IMPORTEDXCD_WHERE = "SELECT importedXCD FROM ImportedXCD importedXCD WHERE ";
	private static final String _SQL_COUNT_IMPORTEDXCD = "SELECT COUNT(importedXCD) FROM ImportedXCD importedXCD";
	private static final String _SQL_COUNT_IMPORTEDXCD_WHERE = "SELECT COUNT(importedXCD) FROM ImportedXCD importedXCD WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "importedXCD.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ImportedXCD exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ImportedXCD exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ImportedXCDPersistenceImpl.class);
	private static ImportedXCD _nullImportedXCD = new ImportedXCDImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ImportedXCD> toCacheModel() {
				return _nullImportedXCDCacheModel;
			}
		};

	private static CacheModel<ImportedXCD> _nullImportedXCDCacheModel = new CacheModel<ImportedXCD>() {
			@Override
			public ImportedXCD toEntityModel() {
				return _nullImportedXCD;
			}
		};
}