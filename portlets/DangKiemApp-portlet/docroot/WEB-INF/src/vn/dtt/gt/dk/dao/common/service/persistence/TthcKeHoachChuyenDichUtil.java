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

import vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich;

import java.util.List;

/**
 * The persistence utility for the tthc ke hoach chuyen dich service. This utility wraps {@link TthcKeHoachChuyenDichPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see TthcKeHoachChuyenDichPersistence
 * @see TthcKeHoachChuyenDichPersistenceImpl
 * @generated
 */
public class TthcKeHoachChuyenDichUtil {
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
	public static void clearCache(TthcKeHoachChuyenDich tthcKeHoachChuyenDich) {
		getPersistence().clearCache(tthcKeHoachChuyenDich);
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
	public static List<TthcKeHoachChuyenDich> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TthcKeHoachChuyenDich> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TthcKeHoachChuyenDich> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static TthcKeHoachChuyenDich update(
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich) throws SystemException {
		return getPersistence().update(tthcKeHoachChuyenDich);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static TthcKeHoachChuyenDich update(
		TthcKeHoachChuyenDich tthcKeHoachChuyenDich,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(tthcKeHoachChuyenDich, serviceContext);
	}

	/**
	* Returns all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns a range of all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @return the range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyChinhId(phieuXuLyChinhId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyChinhId(
		long phieuXuLyChinhId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyChinhId(phieuXuLyChinhId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByPhieuXuLyChinhId_First(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByPhieuXuLyChinhId_First(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyChinhId_First(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByPhieuXuLyChinhId_Last(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByPhieuXuLyChinhId_Last(
		long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyChinhId_Last(phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where phieuXuLyChinhId = &#63;.
	*
	* @param id the primary key of the current tthc ke hoach chuyen dich
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich[] findByPhieuXuLyChinhId_PrevAndNext(
		long id, long phieuXuLyChinhId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByPhieuXuLyChinhId_PrevAndNext(id, phieuXuLyChinhId,
			orderByComparator);
	}

	/**
	* Removes all the tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63; from the database.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns the number of tthc ke hoach chuyen dichs where phieuXuLyChinhId = &#63;.
	*
	* @param phieuXuLyChinhId the phieu xu ly chinh ID
	* @return the number of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhieuXuLyChinhId(long phieuXuLyChinhId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPhieuXuLyChinhId(phieuXuLyChinhId);
	}

	/**
	* Returns all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns a range of all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @return the range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPhieuXuLyPhuId(phieuXuLyPhuId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPhieuXuLyPhuId(phieuXuLyPhuId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByPhieuXuLyPhuId_First(phieuXuLyPhuId, orderByComparator);
	}

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByPhieuXuLyPhuId_First(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyPhuId_First(phieuXuLyPhuId,
			orderByComparator);
	}

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByPhieuXuLyPhuId_Last(phieuXuLyPhuId, orderByComparator);
	}

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByPhieuXuLyPhuId_Last(
		long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyPhuId_Last(phieuXuLyPhuId, orderByComparator);
	}

	/**
	* Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where phieuXuLyPhuId = &#63;.
	*
	* @param id the primary key of the current tthc ke hoach chuyen dich
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich[] findByPhieuXuLyPhuId_PrevAndNext(
		long id, long phieuXuLyPhuId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByPhieuXuLyPhuId_PrevAndNext(id, phieuXuLyPhuId,
			orderByComparator);
	}

	/**
	* Removes all the tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the number of tthc ke hoach chuyen dichs where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns all the tthc ke hoach chuyen dichs where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByMessageId(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMessageId(messageId);
	}

	/**
	* Returns a range of all the tthc ke hoach chuyen dichs where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param messageId the message ID
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @return the range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByMessageId(
		java.lang.String messageId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByMessageId(messageId, start, end);
	}

	/**
	* Returns an ordered range of all the tthc ke hoach chuyen dichs where messageId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param messageId the message ID
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByMessageId(
		java.lang.String messageId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByMessageId(messageId, start, end, orderByComparator);
	}

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByMessageId_First(messageId, orderByComparator);
	}

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByMessageId_First(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMessageId_First(messageId, orderByComparator);
	}

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByMessageId_Last(messageId, orderByComparator);
	}

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where messageId = &#63;.
	*
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByMessageId_Last(
		java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMessageId_Last(messageId, orderByComparator);
	}

	/**
	* Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where messageId = &#63;.
	*
	* @param id the primary key of the current tthc ke hoach chuyen dich
	* @param messageId the message ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich[] findByMessageId_PrevAndNext(
		long id, java.lang.String messageId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByMessageId_PrevAndNext(id, messageId, orderByComparator);
	}

	/**
	* Removes all the tthc ke hoach chuyen dichs where messageId = &#63; from the database.
	*
	* @param messageId the message ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByMessageId(messageId);
	}

	/**
	* Returns the number of tthc ke hoach chuyen dichs where messageId = &#63;.
	*
	* @param messageId the message ID
	* @return the number of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMessageId(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMessageId(messageId);
	}

	/**
	* Returns all the tthc ke hoach chuyen dichs where debitnoteNumber = &#63;.
	*
	* @param debitnoteNumber the debitnote number
	* @return the matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByDebitnoteNumber(
		java.lang.String debitnoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDebitnoteNumber(debitnoteNumber);
	}

	/**
	* Returns a range of all the tthc ke hoach chuyen dichs where debitnoteNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param debitnoteNumber the debitnote number
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @return the range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByDebitnoteNumber(
		java.lang.String debitnoteNumber, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDebitnoteNumber(debitnoteNumber, start, end);
	}

	/**
	* Returns an ordered range of all the tthc ke hoach chuyen dichs where debitnoteNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param debitnoteNumber the debitnote number
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByDebitnoteNumber(
		java.lang.String debitnoteNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDebitnoteNumber(debitnoteNumber, start, end,
			orderByComparator);
	}

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where debitnoteNumber = &#63;.
	*
	* @param debitnoteNumber the debitnote number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByDebitnoteNumber_First(
		java.lang.String debitnoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByDebitnoteNumber_First(debitnoteNumber,
			orderByComparator);
	}

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where debitnoteNumber = &#63;.
	*
	* @param debitnoteNumber the debitnote number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByDebitnoteNumber_First(
		java.lang.String debitnoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDebitnoteNumber_First(debitnoteNumber,
			orderByComparator);
	}

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where debitnoteNumber = &#63;.
	*
	* @param debitnoteNumber the debitnote number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByDebitnoteNumber_Last(
		java.lang.String debitnoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByDebitnoteNumber_Last(debitnoteNumber,
			orderByComparator);
	}

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where debitnoteNumber = &#63;.
	*
	* @param debitnoteNumber the debitnote number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByDebitnoteNumber_Last(
		java.lang.String debitnoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDebitnoteNumber_Last(debitnoteNumber,
			orderByComparator);
	}

	/**
	* Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where debitnoteNumber = &#63;.
	*
	* @param id the primary key of the current tthc ke hoach chuyen dich
	* @param debitnoteNumber the debitnote number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich[] findByDebitnoteNumber_PrevAndNext(
		long id, java.lang.String debitnoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByDebitnoteNumber_PrevAndNext(id, debitnoteNumber,
			orderByComparator);
	}

	/**
	* Removes all the tthc ke hoach chuyen dichs where debitnoteNumber = &#63; from the database.
	*
	* @param debitnoteNumber the debitnote number
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDebitnoteNumber(java.lang.String debitnoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDebitnoteNumber(debitnoteNumber);
	}

	/**
	* Returns the number of tthc ke hoach chuyen dichs where debitnoteNumber = &#63;.
	*
	* @param debitnoteNumber the debitnote number
	* @return the number of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDebitnoteNumber(java.lang.String debitnoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDebitnoteNumber(debitnoteNumber);
	}

	/**
	* Returns all the tthc ke hoach chuyen dichs where ghiChu = &#63;.
	*
	* @param ghiChu the ghi chu
	* @return the matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByCertificateId(
		java.lang.String ghiChu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCertificateId(ghiChu);
	}

	/**
	* Returns a range of all the tthc ke hoach chuyen dichs where ghiChu = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ghiChu the ghi chu
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @return the range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByCertificateId(
		java.lang.String ghiChu, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCertificateId(ghiChu, start, end);
	}

	/**
	* Returns an ordered range of all the tthc ke hoach chuyen dichs where ghiChu = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ghiChu the ghi chu
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findByCertificateId(
		java.lang.String ghiChu, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateId(ghiChu, start, end, orderByComparator);
	}

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where ghiChu = &#63;.
	*
	* @param ghiChu the ghi chu
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByCertificateId_First(
		java.lang.String ghiChu,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByCertificateId_First(ghiChu, orderByComparator);
	}

	/**
	* Returns the first tthc ke hoach chuyen dich in the ordered set where ghiChu = &#63;.
	*
	* @param ghiChu the ghi chu
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByCertificateId_First(
		java.lang.String ghiChu,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateId_First(ghiChu, orderByComparator);
	}

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where ghiChu = &#63;.
	*
	* @param ghiChu the ghi chu
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByCertificateId_Last(
		java.lang.String ghiChu,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByCertificateId_Last(ghiChu, orderByComparator);
	}

	/**
	* Returns the last tthc ke hoach chuyen dich in the ordered set where ghiChu = &#63;.
	*
	* @param ghiChu the ghi chu
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching tthc ke hoach chuyen dich, or <code>null</code> if a matching tthc ke hoach chuyen dich could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByCertificateId_Last(
		java.lang.String ghiChu,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateId_Last(ghiChu, orderByComparator);
	}

	/**
	* Returns the tthc ke hoach chuyen dichs before and after the current tthc ke hoach chuyen dich in the ordered set where ghiChu = &#63;.
	*
	* @param id the primary key of the current tthc ke hoach chuyen dich
	* @param ghiChu the ghi chu
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich[] findByCertificateId_PrevAndNext(
		long id, java.lang.String ghiChu,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence()
				   .findByCertificateId_PrevAndNext(id, ghiChu,
			orderByComparator);
	}

	/**
	* Removes all the tthc ke hoach chuyen dichs where ghiChu = &#63; from the database.
	*
	* @param ghiChu the ghi chu
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCertificateId(java.lang.String ghiChu)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCertificateId(ghiChu);
	}

	/**
	* Returns the number of tthc ke hoach chuyen dichs where ghiChu = &#63;.
	*
	* @param ghiChu the ghi chu
	* @return the number of matching tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCertificateId(java.lang.String ghiChu)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCertificateId(ghiChu);
	}

	/**
	* Caches the tthc ke hoach chuyen dich in the entity cache if it is enabled.
	*
	* @param tthcKeHoachChuyenDich the tthc ke hoach chuyen dich
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich tthcKeHoachChuyenDich) {
		getPersistence().cacheResult(tthcKeHoachChuyenDich);
	}

	/**
	* Caches the tthc ke hoach chuyen dichs in the entity cache if it is enabled.
	*
	* @param tthcKeHoachChuyenDichs the tthc ke hoach chuyen dichs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> tthcKeHoachChuyenDichs) {
		getPersistence().cacheResult(tthcKeHoachChuyenDichs);
	}

	/**
	* Creates a new tthc ke hoach chuyen dich with the primary key. Does not add the tthc ke hoach chuyen dich to the database.
	*
	* @param id the primary key for the new tthc ke hoach chuyen dich
	* @return the new tthc ke hoach chuyen dich
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the tthc ke hoach chuyen dich with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc ke hoach chuyen dich
	* @return the tthc ke hoach chuyen dich that was removed
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich updateImpl(
		vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich tthcKeHoachChuyenDich)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(tthcKeHoachChuyenDich);
	}

	/**
	* Returns the tthc ke hoach chuyen dich with the primary key or throws a {@link vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException} if it could not be found.
	*
	* @param id the primary key of the tthc ke hoach chuyen dich
	* @return the tthc ke hoach chuyen dich
	* @throws vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.common.NoSuchTthcKeHoachChuyenDichException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the tthc ke hoach chuyen dich with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the tthc ke hoach chuyen dich
	* @return the tthc ke hoach chuyen dich, or <code>null</code> if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the tthc ke hoach chuyen dichs.
	*
	* @return the tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tthc ke hoach chuyen dichs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @return the range of tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tthc ke hoach chuyen dichs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the tthc ke hoach chuyen dichs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tthc ke hoach chuyen dichs.
	*
	* @return the number of tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TthcKeHoachChuyenDichPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TthcKeHoachChuyenDichPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.common.service.ClpSerializer.getServletContextName(),
					TthcKeHoachChuyenDichPersistence.class.getName());

			ReferenceRegistry.registerReference(TthcKeHoachChuyenDichUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(TthcKeHoachChuyenDichPersistence persistence) {
	}

	private static TthcKeHoachChuyenDichPersistence _persistence;
}