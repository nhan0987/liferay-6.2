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

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG;

import java.util.List;

/**
 * The persistence utility for the t h o n g s o c h u n g c h i x e c h u y e n d u n g service. This utility wraps {@link THONGSOCHUNGCHIXECHUYENDUNGPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECHUYENDUNGPersistence
 * @see THONGSOCHUNGCHIXECHUYENDUNGPersistenceImpl
 * @generated
 */
public class THONGSOCHUNGCHIXECHUYENDUNGUtil {
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
	public static void clearCache(
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung) {
		getPersistence().clearCache(thongsochungchixechuyendung);
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
	public static List<THONGSOCHUNGCHIXECHUYENDUNG> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<THONGSOCHUNGCHIXECHUYENDUNG> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<THONGSOCHUNGCHIXECHUYENDUNG> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static THONGSOCHUNGCHIXECHUYENDUNG update(
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung)
		throws SystemException {
		return getPersistence().update(thongsochungchixechuyendung);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static THONGSOCHUNGCHIXECHUYENDUNG update(
		THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(thongsochungchixechuyendung, serviceContext);
	}

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	* @return the range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucId(hoSoThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence()
				   .findByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence()
				   .findByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n gs before and after the current t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence()
				   .findByHoSoThuTucId_PrevAndNext(id, hoSoThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordId(
		long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	* @return the range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordId(
		long certificateRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateRecordId(certificateRecordId, start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordId(
		long certificateRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateRecordId(certificateRecordId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence()
				   .findByCertificateRecordId_First(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateRecordId_First(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence()
				   .findByCertificateRecordId_Last(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateRecordId_Last(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n gs before and after the current t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	*
	* @param id the primary key of the current t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence()
				   .findByCertificateRecordId_PrevAndNext(id,
			certificateRecordId, orderByComparator);
	}

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63; from the database.
	*
	* @param certificateRecordId the certificate record ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	* @return the range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupId(
		long vehicleGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVehicleGroupId(vehicleGroupId, start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByVehicleGroupId(vehicleGroupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence()
				   .findByVehicleGroupId_First(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupId_First(vehicleGroupId,
			orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence()
				   .findByVehicleGroupId_Last(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupId_Last(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n gs before and after the current t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	*
	* @param id the primary key of the current t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence()
				   .findByVehicleGroupId_PrevAndNext(id, vehicleGroupId,
			orderByComparator);
	}

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByXCD0009(
		java.lang.String XCD0009)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByXCD0009(XCD0009);
	}

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param XCD0009 the x c d0009
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	* @return the range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByXCD0009(
		java.lang.String XCD0009, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByXCD0009(XCD0009, start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param XCD0009 the x c d0009
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByXCD0009(
		java.lang.String XCD0009, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByXCD0009(XCD0009, start, end, orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByXCD0009_First(
		java.lang.String XCD0009,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence().findByXCD0009_First(XCD0009, orderByComparator);
	}

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByXCD0009_First(
		java.lang.String XCD0009,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByXCD0009_First(XCD0009, orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByXCD0009_Last(
		java.lang.String XCD0009,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence().findByXCD0009_Last(XCD0009, orderByComparator);
	}

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByXCD0009_Last(
		java.lang.String XCD0009,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByXCD0009_Last(XCD0009, orderByComparator);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n gs before and after the current t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	*
	* @param id the primary key of the current t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @param XCD0009 the x c d0009
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG[] findByXCD0009_PrevAndNext(
		long id, java.lang.String XCD0009,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence()
				   .findByXCD0009_PrevAndNext(id, XCD0009, orderByComparator);
	}

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63; from the database.
	*
	* @param XCD0009 the x c d0009
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByXCD0009(java.lang.String XCD0009)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByXCD0009(XCD0009);
	}

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByXCD0009(java.lang.String XCD0009)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByXCD0009(XCD0009);
	}

	/**
	* Caches the t h o n g s o c h u n g c h i x e c h u y e n d u n g in the entity cache if it is enabled.
	*
	* @param thongsochungchixechuyendung the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung) {
		getPersistence().cacheResult(thongsochungchixechuyendung);
	}

	/**
	* Caches the t h o n g s o c h u n g c h i x e c h u y e n d u n gs in the entity cache if it is enabled.
	*
	* @param thongsochungchixechuyendungs the t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> thongsochungchixechuyendungs) {
		getPersistence().cacheResult(thongsochungchixechuyendungs);
	}

	/**
	* Creates a new t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key. Does not add the t h o n g s o c h u n g c h i x e c h u y e n d u n g to the database.
	*
	* @param id the primary key for the new t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @return the new t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(thongsochungchixechuyendung);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException} if it could not be found.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs.
	*
	* @return the t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	* @return the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECHUYENDUNGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs.
	*
	* @return the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static THONGSOCHUNGCHIXECHUYENDUNGPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (THONGSOCHUNGCHIXECHUYENDUNGPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					THONGSOCHUNGCHIXECHUYENDUNGPersistence.class.getName());

			ReferenceRegistry.registerReference(THONGSOCHUNGCHIXECHUYENDUNGUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(
		THONGSOCHUNGCHIXECHUYENDUNGPersistence persistence) {
	}

	private static THONGSOCHUNGCHIXECHUYENDUNGPersistence _persistence;
}