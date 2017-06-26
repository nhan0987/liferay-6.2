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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY;

import java.util.List;

/**
 * The persistence utility for the t h o n g s o c h u n g c h i x e m a y service. This utility wraps {@link THONGSOCHUNGCHIXEMAYPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXEMAYPersistence
 * @see THONGSOCHUNGCHIXEMAYPersistenceImpl
 * @generated
 */
public class THONGSOCHUNGCHIXEMAYUtil {
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
	public static void clearCache(THONGSOCHUNGCHIXEMAY thongsochungchixemay) {
		getPersistence().clearCache(thongsochungchixemay);
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
	public static List<THONGSOCHUNGCHIXEMAY> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<THONGSOCHUNGCHIXEMAY> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<THONGSOCHUNGCHIXEMAY> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static THONGSOCHUNGCHIXEMAY update(
		THONGSOCHUNGCHIXEMAY thongsochungchixemay) throws SystemException {
		return getPersistence().update(thongsochungchixemay);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static THONGSOCHUNGCHIXEMAY update(
		THONGSOCHUNGCHIXEMAY thongsochungchixemay, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(thongsochungchixemay, serviceContext);
	}

	/**
	* Returns all the t h o n g s o c h u n g c h i x e m a ies where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e m a ies where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	* @return the range of matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e m a ies where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucId(hoSoThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e m a y
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException {
		return getPersistence()
				   .findByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e m a y
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException {
		return getPersistence()
				   .findByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e m a ies before and after the current t h o n g s o c h u n g c h i x e m a y in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current t h o n g s o c h u n g c h i x e m a y
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g s o c h u n g c h i x e m a y
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException {
		return getPersistence()
				   .findByHoSoThuTucId_PrevAndNext(id, hoSoThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the t h o n g s o c h u n g c h i x e m a ies where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e m a ies where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns all the t h o n g s o c h u n g c h i x e m a ies where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findByCertificateRecordId(
		long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e m a ies where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	* @return the range of matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findByCertificateRecordId(
		long certificateRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateRecordId(certificateRecordId, start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e m a ies where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findByCertificateRecordId(
		long certificateRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateRecordId(certificateRecordId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e m a y
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY findByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException {
		return getPersistence()
				   .findByCertificateRecordId_First(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY fetchByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateRecordId_First(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e m a y
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY findByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException {
		return getPersistence()
				   .findByCertificateRecordId_Last(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY fetchByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateRecordId_Last(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e m a ies before and after the current t h o n g s o c h u n g c h i x e m a y in the ordered set where certificateRecordId = &#63;.
	*
	* @param id the primary key of the current t h o n g s o c h u n g c h i x e m a y
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g s o c h u n g c h i x e m a y
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException {
		return getPersistence()
				   .findByCertificateRecordId_PrevAndNext(id,
			certificateRecordId, orderByComparator);
	}

	/**
	* Removes all the t h o n g s o c h u n g c h i x e m a ies where certificateRecordId = &#63; from the database.
	*
	* @param certificateRecordId the certificate record ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e m a ies where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the number of matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns all the t h o n g s o c h u n g c h i x e m a ies where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e m a ies where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	* @return the range of matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findByVehicleGroupId(
		long vehicleGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVehicleGroupId(vehicleGroupId, start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e m a ies where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByVehicleGroupId(vehicleGroupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e m a y
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY findByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException {
		return getPersistence()
				   .findByVehicleGroupId_First(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e m a y in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY fetchByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupId_First(vehicleGroupId,
			orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e m a y
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY findByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException {
		return getPersistence()
				   .findByVehicleGroupId_Last(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e m a y in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e m a y could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY fetchByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupId_Last(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e m a ies before and after the current t h o n g s o c h u n g c h i x e m a y in the ordered set where vehicleGroupId = &#63;.
	*
	* @param id the primary key of the current t h o n g s o c h u n g c h i x e m a y
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g s o c h u n g c h i x e m a y
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException {
		return getPersistence()
				   .findByVehicleGroupId_PrevAndNext(id, vehicleGroupId,
			orderByComparator);
	}

	/**
	* Removes all the t h o n g s o c h u n g c h i x e m a ies where vehicleGroupId = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e m a ies where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the number of matching t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Caches the t h o n g s o c h u n g c h i x e m a y in the entity cache if it is enabled.
	*
	* @param thongsochungchixemay the t h o n g s o c h u n g c h i x e m a y
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY thongsochungchixemay) {
		getPersistence().cacheResult(thongsochungchixemay);
	}

	/**
	* Caches the t h o n g s o c h u n g c h i x e m a ies in the entity cache if it is enabled.
	*
	* @param thongsochungchixemaies the t h o n g s o c h u n g c h i x e m a ies
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> thongsochungchixemaies) {
		getPersistence().cacheResult(thongsochungchixemaies);
	}

	/**
	* Creates a new t h o n g s o c h u n g c h i x e m a y with the primary key. Does not add the t h o n g s o c h u n g c h i x e m a y to the database.
	*
	* @param id the primary key for the new t h o n g s o c h u n g c h i x e m a y
	* @return the new t h o n g s o c h u n g c h i x e m a y
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the t h o n g s o c h u n g c h i x e m a y with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e m a y
	* @return the t h o n g s o c h u n g c h i x e m a y that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY thongsochungchixemay)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(thongsochungchixemay);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e m a y with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException} if it could not be found.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e m a y
	* @return the t h o n g s o c h u n g c h i x e m a y
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXEMAYException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e m a y with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e m a y
	* @return the t h o n g s o c h u n g c h i x e m a y, or <code>null</code> if a t h o n g s o c h u n g c h i x e m a y with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the t h o n g s o c h u n g c h i x e m a ies.
	*
	* @return the t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e m a ies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	* @return the range of t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e m a ies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXEMAYModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e m a ies
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e m a ies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXEMAY> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the t h o n g s o c h u n g c h i x e m a ies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e m a ies.
	*
	* @return the number of t h o n g s o c h u n g c h i x e m a ies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static THONGSOCHUNGCHIXEMAYPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (THONGSOCHUNGCHIXEMAYPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					THONGSOCHUNGCHIXEMAYPersistence.class.getName());

			ReferenceRegistry.registerReference(THONGSOCHUNGCHIXEMAYUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(THONGSOCHUNGCHIXEMAYPersistence persistence) {
	}

	private static THONGSOCHUNGCHIXEMAYPersistence _persistence;
}