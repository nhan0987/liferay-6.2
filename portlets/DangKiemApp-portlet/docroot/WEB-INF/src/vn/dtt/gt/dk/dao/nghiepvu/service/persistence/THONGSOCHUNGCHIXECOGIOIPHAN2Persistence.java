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

import vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2;

/**
 * The persistence interface for the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECOGIOIPHAN2PersistenceImpl
 * @see THONGSOCHUNGCHIXECOGIOIPHAN2Util
 * @generated
 */
public interface THONGSOCHUNGCHIXECOGIOIPHAN2Persistence extends BasePersistence<THONGSOCHUNGCHIXECOGIOIPHAN2> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link THONGSOCHUNGCHIXECOGIOIPHAN2Util} to access the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	* @return the range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s before and after the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByCertificateRecordId(
		long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	* @return the range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByCertificateRecordId(
		long certificateRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByCertificateRecordId(
		long certificateRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 findByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 findByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s before and after the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where certificateRecordId = &#63;.
	*
	* @param id the primary key of the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where certificateRecordId = &#63; from the database.
	*
	* @param certificateRecordId the certificate record ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the number of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public int countByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	* @return the range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByVehicleGroupId(
		long vehicleGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 findByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;

	/**
	* Returns the first t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 findByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;

	/**
	* Returns the last t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2 could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s before and after the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the ordered set where vehicleGroupId = &#63;.
	*
	* @param id the primary key of the current t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where vehicleGroupId = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the number of matching t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public int countByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 in the entity cache if it is enabled.
	*
	* @param thongsochungchixecogioiphan2 the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2);

	/**
	* Caches the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s in the entity cache if it is enabled.
	*
	* @param thongsochungchixecogioiphan2s the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> thongsochungchixecogioiphan2s);

	/**
	* Creates a new t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key. Does not add the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 to the database.
	*
	* @param id the primary key for the new t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @return the new t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 create(
		long id);

	/**
	* Removes the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;

	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 thongsochungchixecogioiphan2)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception} if it could not be found.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchTHONGSOCHUNGCHIXECOGIOIPHAN2Exception;

	/**
	* Returns the t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e c o g i o i p h a n2
	* @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2, or <code>null</code> if a t h o n g s o c h u n g c h i x e c o g i o i p h a n2 with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2 fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s.
	*
	* @return the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	* @return the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIPHAN2ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the t h o n g s o c h u n g c h i x e c o g i o i p h a n2s from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s.
	*
	* @return the number of t h o n g s o c h u n g c h i x e c o g i o i p h a n2s
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}