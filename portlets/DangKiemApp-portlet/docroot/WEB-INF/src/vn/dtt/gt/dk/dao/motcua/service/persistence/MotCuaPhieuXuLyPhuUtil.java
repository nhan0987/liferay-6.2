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

package vn.dtt.gt.dk.dao.motcua.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu;

import java.util.List;

/**
 * The persistence utility for the mot cua phieu xu ly phu service. This utility wraps {@link MotCuaPhieuXuLyPhuPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see MotCuaPhieuXuLyPhuPersistence
 * @see MotCuaPhieuXuLyPhuPersistenceImpl
 * @generated
 */
public class MotCuaPhieuXuLyPhuUtil {
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
	public static void clearCache(MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) {
		getPersistence().clearCache(motCuaPhieuXuLyPhu);
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
	public static List<MotCuaPhieuXuLyPhu> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MotCuaPhieuXuLyPhu> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MotCuaPhieuXuLyPhu> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static MotCuaPhieuXuLyPhu update(
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) throws SystemException {
		return getPersistence().update(motCuaPhieuXuLyPhu);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static MotCuaPhieuXuLyPhu update(
		MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(motCuaPhieuXuLyPhu, serviceContext);
	}

	/**
	* Returns the mot cua phieu xu ly phu where phieuXuLyChinhId = &#63; and noiDungHoSoId = &#63; or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException} if it could not be found.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param noiDungHoSoId the noi dung ho so ID
	* @return the matching mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPhieuXuLyChinhIdAndNoiDungHoSoId(
		long phieuXuLyChinhId, long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhieuXuLyChinhIdAndNoiDungHoSoId(phieuXuLyChinhId,
			noiDungHoSoId);
	}

	/**
	* Returns the mot cua phieu xu ly phu where phieuXuLyChinhId = &#63; and noiDungHoSoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param noiDungHoSoId the noi dung ho so ID
	* @return the matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhIdAndNoiDungHoSoId(
		long phieuXuLyChinhId, long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyChinhIdAndNoiDungHoSoId(phieuXuLyChinhId,
			noiDungHoSoId);
	}

	/**
	* Returns the mot cua phieu xu ly phu where phieuXuLyChinhId = &#63; and noiDungHoSoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param noiDungHoSoId the noi dung ho so ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhIdAndNoiDungHoSoId(
		long phieuXuLyChinhId, long noiDungHoSoId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyChinhIdAndNoiDungHoSoId(phieuXuLyChinhId,
			noiDungHoSoId, retrieveFromCache);
	}

	/**
	* Removes the mot cua phieu xu ly phu where phieuXuLyChinhId = &#63; and noiDungHoSoId = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param noiDungHoSoId the noi dung ho so ID
	* @return the mot cua phieu xu ly phu that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu removeByPhieuXuLyChinhIdAndNoiDungHoSoId(
		long phieuXuLyChinhId, long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .removeByPhieuXuLyChinhIdAndNoiDungHoSoId(phieuXuLyChinhId,
			noiDungHoSoId);
	}

	/**
	* Returns the number of mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and noiDungHoSoId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param noiDungHoSoId the noi dung ho so ID
	* @return the number of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhieuXuLyChinhIdAndNoiDungHoSoId(
		long phieuXuLyChinhId, long noiDungHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPhieuXuLyChinhIdAndNoiDungHoSoId(phieuXuLyChinhId,
			noiDungHoSoId);
	}

	/**
	* Returns all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns a range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of mot cua phieu xu ly phus
	* @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	* @return the range of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyChinhId(phieuXuLyChinhId, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of mot cua phieu xu ly phus
	* @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyChinhId(phieuXuLyChinhId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhieuXuLyChinhId_First(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyChinhId_First(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhieuXuLyChinhId_Last(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyChinhId_Last(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the mot cua phieu xu ly phus before and after the current mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param id the primary key of the current mot cua phieu xu ly phu
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu[] findByPhieuXuLyChinhId_PrevAndNext(
		long id, long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhieuXuLyChinhId_PrevAndNext(id, phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Removes all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the number of mot cua phieu xu ly phus where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the number of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param nhomPhieuXuLy the nhom phieu xu ly
	* @return the matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhIdAndNhomPhieuXuLy(
		long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
			nhomPhieuXuLy);
	}

	/**
	* Returns a range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param nhomPhieuXuLy the nhom phieu xu ly
	* @param start the lower bound of the range of mot cua phieu xu ly phus
	* @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	* @return the range of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhIdAndNhomPhieuXuLy(
		long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
			nhomPhieuXuLy, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param nhomPhieuXuLy the nhom phieu xu ly
	* @param start the lower bound of the range of mot cua phieu xu ly phus
	* @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhIdAndNhomPhieuXuLy(
		long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
			nhomPhieuXuLy, start, end, orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param nhomPhieuXuLy the nhom phieu xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPhieuXuLyChinhIdAndNhomPhieuXuLy_First(
		long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhieuXuLyChinhIdAndNhomPhieuXuLy_First(phieuXuLyChinhId,
			nhomPhieuXuLy, orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param nhomPhieuXuLy the nhom phieu xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhIdAndNhomPhieuXuLy_First(
		long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyChinhIdAndNhomPhieuXuLy_First(phieuXuLyChinhId,
			nhomPhieuXuLy, orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param nhomPhieuXuLy the nhom phieu xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPhieuXuLyChinhIdAndNhomPhieuXuLy_Last(
		long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhieuXuLyChinhIdAndNhomPhieuXuLy_Last(phieuXuLyChinhId,
			nhomPhieuXuLy, orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param nhomPhieuXuLy the nhom phieu xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhIdAndNhomPhieuXuLy_Last(
		long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyChinhIdAndNhomPhieuXuLy_Last(phieuXuLyChinhId,
			nhomPhieuXuLy, orderByComparator);
	}

	/**
	* Returns the mot cua phieu xu ly phus before and after the current mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	*
	* @param id the primary key of the current mot cua phieu xu ly phu
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param nhomPhieuXuLy the nhom phieu xu ly
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu[] findByPhieuXuLyChinhIdAndNhomPhieuXuLy_PrevAndNext(
		long id, long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhieuXuLyChinhIdAndNhomPhieuXuLy_PrevAndNext(id,
			phieuXuLyChinhId, nhomPhieuXuLy, orderByComparator);
	}

	/**
	* Removes all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param nhomPhieuXuLy the nhom phieu xu ly
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPhieuXuLyChinhIdAndNhomPhieuXuLy(
		long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
			nhomPhieuXuLy);
	}

	/**
	* Returns the number of mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and nhomPhieuXuLy = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param nhomPhieuXuLy the nhom phieu xu ly
	* @return the number of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhieuXuLyChinhIdAndNhomPhieuXuLy(
		long phieuXuLyChinhId, java.lang.String nhomPhieuXuLy)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPhieuXuLyChinhIdAndNhomPhieuXuLy(phieuXuLyChinhId,
			nhomPhieuXuLy);
	}

	/**
	* Returns all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiHienTaiId the trang thai hien tai ID
	* @return the matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhAndTrangThaiHienTai(
		long phieuXuLyChinhId, long trangThaiHienTaiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
			trangThaiHienTaiId);
	}

	/**
	* Returns a range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiHienTaiId the trang thai hien tai ID
	* @param start the lower bound of the range of mot cua phieu xu ly phus
	* @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	* @return the range of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhAndTrangThaiHienTai(
		long phieuXuLyChinhId, long trangThaiHienTaiId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
			trangThaiHienTaiId, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiHienTaiId the trang thai hien tai ID
	* @param start the lower bound of the range of mot cua phieu xu ly phus
	* @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhieuXuLyChinhAndTrangThaiHienTai(
		long phieuXuLyChinhId, long trangThaiHienTaiId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
			trangThaiHienTaiId, start, end, orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiHienTaiId the trang thai hien tai ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPhieuXuLyChinhAndTrangThaiHienTai_First(
		long phieuXuLyChinhId, long trangThaiHienTaiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhieuXuLyChinhAndTrangThaiHienTai_First(phieuXuLyChinhId,
			trangThaiHienTaiId, orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiHienTaiId the trang thai hien tai ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhAndTrangThaiHienTai_First(
		long phieuXuLyChinhId, long trangThaiHienTaiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyChinhAndTrangThaiHienTai_First(phieuXuLyChinhId,
			trangThaiHienTaiId, orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiHienTaiId the trang thai hien tai ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPhieuXuLyChinhAndTrangThaiHienTai_Last(
		long phieuXuLyChinhId, long trangThaiHienTaiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhieuXuLyChinhAndTrangThaiHienTai_Last(phieuXuLyChinhId,
			trangThaiHienTaiId, orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiHienTaiId the trang thai hien tai ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchByPhieuXuLyChinhAndTrangThaiHienTai_Last(
		long phieuXuLyChinhId, long trangThaiHienTaiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyChinhAndTrangThaiHienTai_Last(phieuXuLyChinhId,
			trangThaiHienTaiId, orderByComparator);
	}

	/**
	* Returns the mot cua phieu xu ly phus before and after the current mot cua phieu xu ly phu in the ordered set where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	*
	* @param id the primary key of the current mot cua phieu xu ly phu
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiHienTaiId the trang thai hien tai ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu[] findByPhieuXuLyChinhAndTrangThaiHienTai_PrevAndNext(
		long id, long phieuXuLyChinhId, long trangThaiHienTaiId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhieuXuLyChinhAndTrangThaiHienTai_PrevAndNext(id,
			phieuXuLyChinhId, trangThaiHienTaiId, orderByComparator);
	}

	/**
	* Removes all the mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiHienTaiId the trang thai hien tai ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPhieuXuLyChinhAndTrangThaiHienTai(
		long phieuXuLyChinhId, long trangThaiHienTaiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
			trangThaiHienTaiId);
	}

	/**
	* Returns the number of mot cua phieu xu ly phus where phieuXuLyChinhId = &#63; and trangThaiHienTaiId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param trangThaiHienTaiId the trang thai hien tai ID
	* @return the number of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhieuXuLyChinhAndTrangThaiHienTai(
		long phieuXuLyChinhId, long trangThaiHienTaiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByPhieuXuLyChinhAndTrangThaiHienTai(phieuXuLyChinhId,
			trangThaiHienTaiId);
	}

	/**
	* Returns all the mot cua phieu xu ly phus where phanNhomHoSoId = &#63;.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @return the matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhanNhomHoSoId(
		long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Returns a range of all the mot cua phieu xu ly phus where phanNhomHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param start the lower bound of the range of mot cua phieu xu ly phus
	* @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	* @return the range of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhanNhomHoSoId(
		long phanNhomHoSoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPhanNhomHoSoId(phanNhomHoSoId, start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phieu xu ly phus where phanNhomHoSoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param start the lower bound of the range of mot cua phieu xu ly phus
	* @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findByPhanNhomHoSoId(
		long phanNhomHoSoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhanNhomHoSoId(phanNhomHoSoId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly phu in the ordered set where phanNhomHoSoId = &#63;.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPhanNhomHoSoId_First(
		long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhanNhomHoSoId_First(phanNhomHoSoId, orderByComparator);
	}

	/**
	* Returns the first mot cua phieu xu ly phu in the ordered set where phanNhomHoSoId = &#63;.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchByPhanNhomHoSoId_First(
		long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhanNhomHoSoId_First(phanNhomHoSoId,
			orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly phu in the ordered set where phanNhomHoSoId = &#63;.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPhanNhomHoSoId_Last(
		long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhanNhomHoSoId_Last(phanNhomHoSoId, orderByComparator);
	}

	/**
	* Returns the last mot cua phieu xu ly phu in the ordered set where phanNhomHoSoId = &#63;.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching mot cua phieu xu ly phu, or <code>null</code> if a matching mot cua phieu xu ly phu could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchByPhanNhomHoSoId_Last(
		long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhanNhomHoSoId_Last(phanNhomHoSoId, orderByComparator);
	}

	/**
	* Returns the mot cua phieu xu ly phus before and after the current mot cua phieu xu ly phu in the ordered set where phanNhomHoSoId = &#63;.
	*
	* @param id the primary key of the current mot cua phieu xu ly phu
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu[] findByPhanNhomHoSoId_PrevAndNext(
		long id, long phanNhomHoSoId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence()
				   .findByPhanNhomHoSoId_PrevAndNext(id, phanNhomHoSoId,
			orderByComparator);
	}

	/**
	* Removes all the mot cua phieu xu ly phus where phanNhomHoSoId = &#63; from the database.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPhanNhomHoSoId(long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Returns the number of mot cua phieu xu ly phus where phanNhomHoSoId = &#63;.
	*
	* @param phanNhomHoSoId the phan nhom ho so ID
	* @return the number of matching mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhanNhomHoSoId(long phanNhomHoSoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPhanNhomHoSoId(phanNhomHoSoId);
	}

	/**
	* Caches the mot cua phieu xu ly phu in the entity cache if it is enabled.
	*
	* @param motCuaPhieuXuLyPhu the mot cua phieu xu ly phu
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu) {
		getPersistence().cacheResult(motCuaPhieuXuLyPhu);
	}

	/**
	* Caches the mot cua phieu xu ly phus in the entity cache if it is enabled.
	*
	* @param motCuaPhieuXuLyPhus the mot cua phieu xu ly phus
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> motCuaPhieuXuLyPhus) {
		getPersistence().cacheResult(motCuaPhieuXuLyPhus);
	}

	/**
	* Creates a new mot cua phieu xu ly phu with the primary key. Does not add the mot cua phieu xu ly phu to the database.
	*
	* @param id the primary key for the new mot cua phieu xu ly phu
	* @return the new mot cua phieu xu ly phu
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the mot cua phieu xu ly phu with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu that was removed
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu updateImpl(
		vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu motCuaPhieuXuLyPhu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(motCuaPhieuXuLyPhu);
	}

	/**
	* Returns the mot cua phieu xu ly phu with the primary key or throws a {@link vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException} if it could not be found.
	*
	* @param id the primary key of the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu
	* @throws vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException if a mot cua phieu xu ly phu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.motcua.NoSuchMotCuaPhieuXuLyPhuException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the mot cua phieu xu ly phu with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the mot cua phieu xu ly phu
	* @return the mot cua phieu xu ly phu, or <code>null</code> if a mot cua phieu xu ly phu with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the mot cua phieu xu ly phus.
	*
	* @return the mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the mot cua phieu xu ly phus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phieu xu ly phus
	* @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	* @return the range of mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the mot cua phieu xu ly phus.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.motcua.model.impl.MotCuaPhieuXuLyPhuModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of mot cua phieu xu ly phus
	* @param end the upper bound of the range of mot cua phieu xu ly phus (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.motcua.model.MotCuaPhieuXuLyPhu> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the mot cua phieu xu ly phus from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of mot cua phieu xu ly phus.
	*
	* @return the number of mot cua phieu xu ly phus
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MotCuaPhieuXuLyPhuPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MotCuaPhieuXuLyPhuPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.motcua.service.ClpSerializer.getServletContextName(),
					MotCuaPhieuXuLyPhuPersistence.class.getName());

			ReferenceRegistry.registerReference(MotCuaPhieuXuLyPhuUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(MotCuaPhieuXuLyPhuPersistence persistence) {
	}

	private static MotCuaPhieuXuLyPhuPersistence _persistence;
}