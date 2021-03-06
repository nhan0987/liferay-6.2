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

import vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro;

import java.util.List;

/**
 * The persistence utility for the tthc phan nhom ho so vai tro service. This utility wraps {@link TthcPhanNhomHoSoVaiTroPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcPhanNhomHoSoVaiTroPersistence
 * @see TthcPhanNhomHoSoVaiTroPersistenceImpl
 * @generated
 */
public class TthcPhanNhomHoSoVaiTroUtil {
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
	public static void clearCache(TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro) {
		getPersistence().clearCache(tthcPhanNhomHoSoVaiTro);
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
	public static List<TthcPhanNhomHoSoVaiTro> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcPhanNhomHoSoVaiTro> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcPhanNhomHoSoVaiTro> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcPhanNhomHoSoVaiTro update(
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro)
		throws SystemException {
		return getPersistence().update(tthcPhanNhomHoSoVaiTro);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcPhanNhomHoSoVaiTro update(
		TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tthcPhanNhomHoSoVaiTro, serviceContext);
	}

	/**
	* Returns the tthc phan nhom ho so vai tro where PhanNhomHoSoId = &#63; and VaiTroXuLy = &#63; or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException} if it could not be found.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param VaiTroXuLy the vai tro xu ly
	* @return the matching tthc phan nhom ho so vai tro
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro findByPhanNhomHoSoIdAndVaiTroXuLy(
		long PhanNhomHoSoId, long VaiTroXuLy)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException {
		return getPersistence()
				   .findByPhanNhomHoSoIdAndVaiTroXuLy(PhanNhomHoSoId, VaiTroXuLy);
	}

	/**
	* Returns the tthc phan nhom ho so vai tro where PhanNhomHoSoId = &#63; and VaiTroXuLy = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param VaiTroXuLy the vai tro xu ly
	* @return the matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoIdAndVaiTroXuLy(
		long PhanNhomHoSoId, long VaiTroXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhanNhomHoSoIdAndVaiTroXuLy(PhanNhomHoSoId,
			VaiTroXuLy);
	}

	/**
	* Returns the tthc phan nhom ho so vai tro where PhanNhomHoSoId = &#63; and VaiTroXuLy = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param VaiTroXuLy the vai tro xu ly
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoIdAndVaiTroXuLy(
		long PhanNhomHoSoId, long VaiTroXuLy, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhanNhomHoSoIdAndVaiTroXuLy(PhanNhomHoSoId,
			VaiTroXuLy, retrieveFromCache);
	}

	/**
	* Removes the tthc phan nhom ho so vai tro where PhanNhomHoSoId = &#63; and VaiTroXuLy = &#63; from the database.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param VaiTroXuLy the vai tro xu ly
	* @return the tthc phan nhom ho so vai tro that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro removeByPhanNhomHoSoIdAndVaiTroXuLy(
		long PhanNhomHoSoId, long VaiTroXuLy)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException {
		return getPersistence()
				   .removeByPhanNhomHoSoIdAndVaiTroXuLy(PhanNhomHoSoId,
			VaiTroXuLy);
	}

	/**
	* Returns the number of tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63; and VaiTroXuLy = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param VaiTroXuLy the vai tro xu ly
	* @return the number of matching tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhanNhomHoSoIdAndVaiTroXuLy(long PhanNhomHoSoId,
		long VaiTroXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPhanNhomHoSoIdAndVaiTroXuLy(PhanNhomHoSoId,
			VaiTroXuLy);
	}

	/**
	* Returns all the tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @return the matching tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findByPhanNhomHoSoId(
		long PhanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPhanNhomHoSoId(PhanNhomHoSoId);
	}

	/**
	* Returns a range of all the tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param start the lower bound of the range of tthc phan nhom ho so vai tros
	* @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	* @return the range of matching tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findByPhanNhomHoSoId(
		long PhanNhomHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPhanNhomHoSoId(PhanNhomHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param start the lower bound of the range of tthc phan nhom ho so vai tros
	* @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findByPhanNhomHoSoId(
		long PhanNhomHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhanNhomHoSoId(PhanNhomHoSoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc phan nhom ho so vai tro in the ordered set where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc phan nhom ho so vai tro
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro findByPhanNhomHoSoId_First(
		long PhanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException {
		return getPersistence()
				   .findByPhanNhomHoSoId_First(PhanNhomHoSoId, orderByComparator);
	}

	/**
	* Returns the first tthc phan nhom ho so vai tro in the ordered set where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoId_First(
		long PhanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhanNhomHoSoId_First(PhanNhomHoSoId,
			orderByComparator);
	}

	/**
	* Returns the last tthc phan nhom ho so vai tro in the ordered set where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc phan nhom ho so vai tro
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro findByPhanNhomHoSoId_Last(
		long PhanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException {
		return getPersistence()
				   .findByPhanNhomHoSoId_Last(PhanNhomHoSoId, orderByComparator);
	}

	/**
	* Returns the last tthc phan nhom ho so vai tro in the ordered set where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc phan nhom ho so vai tro, or <code>null</code> if a matching tthc phan nhom ho so vai tro could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro fetchByPhanNhomHoSoId_Last(
		long PhanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhanNhomHoSoId_Last(PhanNhomHoSoId, orderByComparator);
	}

	/**
	* Returns the tthc phan nhom ho so vai tros before and after the current tthc phan nhom ho so vai tro in the ordered set where PhanNhomHoSoId = &#63;.
	*
	* @param Id the primary key of the current tthc phan nhom ho so vai tro
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc phan nhom ho so vai tro
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a tthc phan nhom ho so vai tro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro[] findByPhanNhomHoSoId_PrevAndNext(
		long Id, long PhanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException {
		return getPersistence()
				   .findByPhanNhomHoSoId_PrevAndNext(Id, PhanNhomHoSoId,
			orderByComparator);
	}

	/**
	* Removes all the tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63; from the database.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPhanNhomHoSoId(long PhanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPhanNhomHoSoId(PhanNhomHoSoId);
	}

	/**
	* Returns the number of tthc phan nhom ho so vai tros where PhanNhomHoSoId = &#63;.
	*
	* @param PhanNhomHoSoId the phan nhom ho so ID
	* @return the number of matching tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhanNhomHoSoId(long PhanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPhanNhomHoSoId(PhanNhomHoSoId);
	}

	/**
	* Caches the tthc phan nhom ho so vai tro in the entity cache if it is enabled.
	*
	* @param tthcPhanNhomHoSoVaiTro the tthc phan nhom ho so vai tro
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro) {
		getPersistence().cacheResult(tthcPhanNhomHoSoVaiTro);
	}

	/**
	* Caches the tthc phan nhom ho so vai tros in the entity cache if it is enabled.
	*
	* @param tthcPhanNhomHoSoVaiTros the tthc phan nhom ho so vai tros
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> tthcPhanNhomHoSoVaiTros) {
		getPersistence().cacheResult(tthcPhanNhomHoSoVaiTros);
	}

	/**
	* Creates a new tthc phan nhom ho so vai tro with the primary key. Does not add the tthc phan nhom ho so vai tro to the database.
	*
	* @param Id the primary key for the new tthc phan nhom ho so vai tro
	* @return the new tthc phan nhom ho so vai tro
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro create(
		long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the tthc phan nhom ho so vai tro with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc phan nhom ho so vai tro
	* @return the tthc phan nhom ho so vai tro that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a tthc phan nhom ho so vai tro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro remove(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException {
		return getPersistence().remove(Id);
	}

	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro tthcPhanNhomHoSoVaiTro)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcPhanNhomHoSoVaiTro);
	}

	/**
	* Returns the tthc phan nhom ho so vai tro with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException} if it could not be found.
	*
	* @param Id the primary key of the tthc phan nhom ho so vai tro
	* @return the tthc phan nhom ho so vai tro
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException if a tthc phan nhom ho so vai tro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro findByPrimaryKey(
		long Id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcPhanNhomHoSoVaiTroException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the tthc phan nhom ho so vai tro with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the tthc phan nhom ho so vai tro
	* @return the tthc phan nhom ho so vai tro, or <code>null</code> if a tthc phan nhom ho so vai tro with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro fetchByPrimaryKey(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	/**
	* Returns all the tthc phan nhom ho so vai tros.
	*
	* @return the tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc phan nhom ho so vai tros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc phan nhom ho so vai tros
	* @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	* @return the range of tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc phan nhom ho so vai tros.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcPhanNhomHoSoVaiTroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc phan nhom ho so vai tros
	* @param end the upper bound of the range of tthc phan nhom ho so vai tros (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcPhanNhomHoSoVaiTro> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc phan nhom ho so vai tros from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc phan nhom ho so vai tros.
	*
	* @return the number of tthc phan nhom ho so vai tros
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcPhanNhomHoSoVaiTroPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcPhanNhomHoSoVaiTroPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TthcPhanNhomHoSoVaiTroPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcPhanNhomHoSoVaiTroUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcPhanNhomHoSoVaiTroPersistence persistence) {
	}

	private static TthcPhanNhomHoSoVaiTroPersistence _persistence;
}