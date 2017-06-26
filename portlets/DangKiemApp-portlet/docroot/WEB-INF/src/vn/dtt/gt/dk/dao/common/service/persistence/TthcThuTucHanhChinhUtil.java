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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh;

import java.util.List;

/**
 * The persistence utility for the tthc thu tuc hanh chinh service. This utility wraps {@link TthcThuTucHanhChinhPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcThuTucHanhChinhPersistence
 * @see TthcThuTucHanhChinhPersistenceImpl
 * @generated
 */
public class TthcThuTucHanhChinhUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(TthcThuTucHanhChinh tthcThuTucHanhChinh) {
		getPersistence().clearCache(tthcThuTucHanhChinh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TthcThuTucHanhChinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcThuTucHanhChinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcThuTucHanhChinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcThuTucHanhChinh update(
		TthcThuTucHanhChinh tthcThuTucHanhChinh) throws SystemException {
		return getPersistence().update(tthcThuTucHanhChinh);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcThuTucHanhChinh update(
		TthcThuTucHanhChinh tthcThuTucHanhChinh, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(tthcThuTucHanhChinh, serviceContext);
	}

	/**
	* Returns all the tthc thu tuc hanh chinhs where linhVucThuTucId = &#63;.
	*
	* @param linhVucThuTucId the linh vuc thu tuc ID
	* @return the matching tthc thu tuc hanh chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh> findByLinhVucThuTucId(
		long linhVucThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByLinhVucThuTucId(linhVucThuTucId);
	}

	/**
	* Returns a range of all the tthc thu tuc hanh chinhs where linhVucThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linhVucThuTucId the linh vuc thu tuc ID
	* @param start the lower bound of the range of tthc thu tuc hanh chinhs
	* @param end the upper bound of the range of tthc thu tuc hanh chinhs (not inclusive)
	* @return the range of matching tthc thu tuc hanh chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh> findByLinhVucThuTucId(
		long linhVucThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLinhVucThuTucId(linhVucThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc thu tuc hanh chinhs where linhVucThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linhVucThuTucId the linh vuc thu tuc ID
	* @param start the lower bound of the range of tthc thu tuc hanh chinhs
	* @param end the upper bound of the range of tthc thu tuc hanh chinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc thu tuc hanh chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh> findByLinhVucThuTucId(
		long linhVucThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByLinhVucThuTucId(linhVucThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc thu tuc hanh chinh in the ordered set where linhVucThuTucId = &#63;.
	*
	* @param linhVucThuTucId the linh vuc thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thu tuc hanh chinh
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a matching tthc thu tuc hanh chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh findByLinhVucThuTucId_First(
		long linhVucThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException {
		return getPersistence()
				   .findByLinhVucThuTucId_First(linhVucThuTucId,
			orderByComparator);
	}

	/**
	* Returns the first tthc thu tuc hanh chinh in the ordered set where linhVucThuTucId = &#63;.
	*
	* @param linhVucThuTucId the linh vuc thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc thu tuc hanh chinh, or <code>null</code> if a matching tthc thu tuc hanh chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh fetchByLinhVucThuTucId_First(
		long linhVucThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLinhVucThuTucId_First(linhVucThuTucId,
			orderByComparator);
	}

	/**
	* Returns the last tthc thu tuc hanh chinh in the ordered set where linhVucThuTucId = &#63;.
	*
	* @param linhVucThuTucId the linh vuc thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thu tuc hanh chinh
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a matching tthc thu tuc hanh chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh findByLinhVucThuTucId_Last(
		long linhVucThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException {
		return getPersistence()
				   .findByLinhVucThuTucId_Last(linhVucThuTucId,
			orderByComparator);
	}

	/**
	* Returns the last tthc thu tuc hanh chinh in the ordered set where linhVucThuTucId = &#63;.
	*
	* @param linhVucThuTucId the linh vuc thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc thu tuc hanh chinh, or <code>null</code> if a matching tthc thu tuc hanh chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh fetchByLinhVucThuTucId_Last(
		long linhVucThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByLinhVucThuTucId_Last(linhVucThuTucId,
			orderByComparator);
	}

	/**
	* Returns the tthc thu tuc hanh chinhs before and after the current tthc thu tuc hanh chinh in the ordered set where linhVucThuTucId = &#63;.
	*
	* @param Id the primary key of the current tthc thu tuc hanh chinh
	* @param linhVucThuTucId the linh vuc thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc thu tuc hanh chinh
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a tthc thu tuc hanh chinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh[] findByLinhVucThuTucId_PrevAndNext(
		long Id, long linhVucThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException {
		return getPersistence()
				   .findByLinhVucThuTucId_PrevAndNext(Id, linhVucThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the tthc thu tuc hanh chinhs where linhVucThuTucId = &#63; from the database.
	*
	* @param linhVucThuTucId the linh vuc thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByLinhVucThuTucId(long linhVucThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByLinhVucThuTucId(linhVucThuTucId);
	}

	/**
	* Returns the number of tthc thu tuc hanh chinhs where linhVucThuTucId = &#63;.
	*
	* @param linhVucThuTucId the linh vuc thu tuc ID
	* @return the number of matching tthc thu tuc hanh chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByLinhVucThuTucId(long linhVucThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByLinhVucThuTucId(linhVucThuTucId);
	}

	/**
	* Returns the tthc thu tuc hanh chinh where maThuTuc = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException} if it could not be found.
	*
	* @param maThuTuc the ma thu tuc
	* @return the matching tthc thu tuc hanh chinh
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a matching tthc thu tuc hanh chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh findByMaThuTuc(
		java.lang.String maThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException {
		return getPersistence().findByMaThuTuc(maThuTuc);
	}

	/**
	* Returns the tthc thu tuc hanh chinh where maThuTuc = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param maThuTuc the ma thu tuc
	* @return the matching tthc thu tuc hanh chinh, or <code>null</code> if a matching tthc thu tuc hanh chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh fetchByMaThuTuc(
		java.lang.String maThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaThuTuc(maThuTuc);
	}

	/**
	* Returns the tthc thu tuc hanh chinh where maThuTuc = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param maThuTuc the ma thu tuc
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc thu tuc hanh chinh, or <code>null</code> if a matching tthc thu tuc hanh chinh could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh fetchByMaThuTuc(
		java.lang.String maThuTuc, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMaThuTuc(maThuTuc, retrieveFromCache);
	}

	/**
	* Removes the tthc thu tuc hanh chinh where maThuTuc = &#63; from the database.
	*
	* @param maThuTuc the ma thu tuc
	* @return the tthc thu tuc hanh chinh that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh removeByMaThuTuc(
		java.lang.String maThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException {
		return getPersistence().removeByMaThuTuc(maThuTuc);
	}

	/**
	* Returns the number of tthc thu tuc hanh chinhs where maThuTuc = &#63;.
	*
	* @param maThuTuc the ma thu tuc
	* @return the number of matching tthc thu tuc hanh chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMaThuTuc(java.lang.String maThuTuc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMaThuTuc(maThuTuc);
	}

	/**
	* Caches the tthc thu tuc hanh chinh in the entity cache if it is enabled.
	*
	* @param tthcThuTucHanhChinh the tthc thu tuc hanh chinh
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh tthcThuTucHanhChinh) {
		getPersistence().cacheResult(tthcThuTucHanhChinh);
	}

	/**
	* Caches the tthc thu tuc hanh chinhs in the entity cache if it is enabled.
	*
	* @param tthcThuTucHanhChinhs the tthc thu tuc hanh chinhs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh> tthcThuTucHanhChinhs) {
		getPersistence().cacheResult(tthcThuTucHanhChinhs);
	}

	/**
	* Creates a new tthc thu tuc hanh chinh with the primary key. Does not add the tthc thu tuc hanh chinh to the database.
	*
	* @param Id the primary key for the new tthc thu tuc hanh chinh
	* @return the new tthc thu tuc hanh chinh
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh create(
		long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the tthc thu tuc hanh chinh with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc thu tuc hanh chinh
	* @return the tthc thu tuc hanh chinh that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a tthc thu tuc hanh chinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh remove(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException {
		return getPersistence().remove(Id);
	}

	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh tthcThuTucHanhChinh)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcThuTucHanhChinh);
	}

	/**
	* Returns the tthc thu tuc hanh chinh with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException} if it could not be found.
	*
	* @param Id the primary key of the tthc thu tuc hanh chinh
	* @return the tthc thu tuc hanh chinh
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException if a tthc thu tuc hanh chinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcThuTucHanhChinhException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the tthc thu tuc hanh chinh with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the tthc thu tuc hanh chinh
	* @return the tthc thu tuc hanh chinh, or <code>null</code> if a tthc thu tuc hanh chinh with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the tthc thu tuc hanh chinhs.
	*
	* @return the tthc thu tuc hanh chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc thu tuc hanh chinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thu tuc hanh chinhs
	* @param end the upper bound of the range of tthc thu tuc hanh chinhs (not inclusive)
	* @return the range of tthc thu tuc hanh chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc thu tuc hanh chinhs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcThuTucHanhChinhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc thu tuc hanh chinhs
	* @param end the upper bound of the range of tthc thu tuc hanh chinhs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc thu tuc hanh chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcThuTucHanhChinh> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc thu tuc hanh chinhs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc thu tuc hanh chinhs.
	*
	* @return the number of tthc thu tuc hanh chinhs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcThuTucHanhChinhPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcThuTucHanhChinhPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TthcThuTucHanhChinhPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcThuTucHanhChinhUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcThuTucHanhChinhPersistence persistence) {
	}

	private static TthcThuTucHanhChinhPersistence _persistence;
}