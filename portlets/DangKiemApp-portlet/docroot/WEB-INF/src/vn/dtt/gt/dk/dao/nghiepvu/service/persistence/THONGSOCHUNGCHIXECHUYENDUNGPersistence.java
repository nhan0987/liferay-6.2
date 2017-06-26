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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG;

/**
 * The persistence interface for the t h o n g s o c h u n g c h i x e c h u y e n d u n g service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECHUYENDUNGPersistenceImpl
 * @see THONGSOCHUNGCHIXECHUYENDUNGUtil
 * @generated
 */
public interface THONGSOCHUNGCHIXECHUYENDUNGPersistence extends BasePersistence<THONGSOCHUNGCHIXECHUYENDUNG> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link THONGSOCHUNGCHIXECHUYENDUNGUtil} to access the t h o n g s o c h u n g c h i x e c h u y e n d u n g persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordId(
		long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordId(
		long certificateRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByCertificateRecordId(
		long certificateRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63; from the database.
	*
	* @param certificateRecordId the certificate record ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public int countByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupId(
		long vehicleGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public int countByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @return the matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByXCD0009(
		java.lang.String XCD0009)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByXCD0009(
		java.lang.String XCD0009, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findByXCD0009(
		java.lang.String XCD0009, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByXCD0009_First(
		java.lang.String XCD0009,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByXCD0009_First(
		java.lang.String XCD0009,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByXCD0009_Last(
		java.lang.String XCD0009,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c h u y e n d u n g in the ordered set where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c h u y e n d u n g could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByXCD0009_Last(
		java.lang.String XCD0009,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG[] findByXCD0009_PrevAndNext(
		long id, java.lang.String XCD0009,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63; from the database.
	*
	* @param XCD0009 the x c d0009
	* @throws SystemException if a system exception occurred
	*/
	public void removeByXCD0009(java.lang.String XCD0009)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs where XCD0009 = &#63;.
	*
	* @param XCD0009 the x c d0009
	* @return the number of matching t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public int countByXCD0009(java.lang.String XCD0009)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the t h o n g s o c h u n g c h i x e c h u y e n d u n g in the entity cache if it is enabled.
	*
	* @param thongsochungchixechuyendung the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung);

	/**
	* Caches the t h o n g s o c h u n g c h i x e c h u y e n d u n gs in the entity cache if it is enabled.
	*
	* @param thongsochungchixechuyendungs the t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> thongsochungchixechuyendungs);

	/**
	* Creates a new t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key. Does not add the t h o n g s o c h u n g c h i x e c h u y e n d u n g to the database.
	*
	* @param id the primary key for the new t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @return the new t h o n g s o c h u n g c h i x e c h u y e n d u n g
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG create(
		long id);

	/**
	* Removes the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG thongsochungchixechuyendung)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException} if it could not be found.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECHUYENDUNGException;

	/**
	* Returns the t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e c h u y e n d u n g
	* @return the t h o n g s o c h u n g c h i x e c h u y e n d u n g, or <code>null</code> if a t h o n g s o c h u n g c h i x e c h u y e n d u n g with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs.
	*
	* @return the t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECHUYENDUNG> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c h u y e n d u n gs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs.
	*
	* @return the number of t h o n g s o c h u n g c h i x e c h u y e n d u n gs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}