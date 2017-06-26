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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;

/**
 * The persistence interface for the vehicle record service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see VehicleRecordPersistenceImpl
 * @see VehicleRecordUtil
 * @generated
 */
public interface VehicleRecordPersistence extends BasePersistence<VehicleRecord> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VehicleRecordUtil} to access the vehicle record persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vehicle records where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByCertificateRecordId(
		long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle records where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByCertificateRecordId(
		long certificateRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle records where certificateRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param certificateRecordId the certificate record ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByCertificateRecordId(
		long certificateRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle record in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the first vehicle record in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle record in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the last vehicle record in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle records before and after the current vehicle record in the ordered set where certificateRecordId = &#63;.
	*
	* @param id the primary key of the current vehicle record
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Removes all the vehicle records where certificateRecordId = &#63; from the database.
	*
	* @param certificateRecordId the certificate record ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle records where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle record where codeNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException} if it could not be found.
	*
	* @param codeNumber the code number
	* @return the matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the vehicle record where codeNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param codeNumber the code number
	* @return the matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle record where codeNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param codeNumber the code number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCodeNumber(
		long codeNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the vehicle record where codeNumber = &#63; from the database.
	*
	* @param codeNumber the code number
	* @return the vehicle record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord removeByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the number of vehicle records where codeNumber = &#63;.
	*
	* @param codeNumber the code number
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countByCodeNumber(long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle records where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteId(
		long debitNoteId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle records where debitNoteId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param debitNoteId the debit note ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteId(
		long debitNoteId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle records where debitNoteId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param debitNoteId the debit note ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteId(
		long debitNoteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle record in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByDebitNoteId_First(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the first vehicle record in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByDebitNoteId_First(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle record in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByDebitNoteId_Last(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the last vehicle record in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByDebitNoteId_Last(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle records before and after the current vehicle record in the ordered set where debitNoteId = &#63;.
	*
	* @param id the primary key of the current vehicle record
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByDebitNoteId_PrevAndNext(
		long id, long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Removes all the vehicle records where debitNoteId = &#63; from the database.
	*
	* @param debitNoteId the debit note ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDebitNoteId(long debitNoteId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle records where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countByDebitNoteId(long debitNoteId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle records where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findBySafeTestRequirementId(
		long safeTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle records where safeTestRequirementId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findBySafeTestRequirementId(
		long safeTestRequirementId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle records where safeTestRequirementId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findBySafeTestRequirementId(
		long safeTestRequirementId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle record in the ordered set where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findBySafeTestRequirementId_First(
		long safeTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the first vehicle record in the ordered set where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchBySafeTestRequirementId_First(
		long safeTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle record in the ordered set where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findBySafeTestRequirementId_Last(
		long safeTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the last vehicle record in the ordered set where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchBySafeTestRequirementId_Last(
		long safeTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle records before and after the current vehicle record in the ordered set where safeTestRequirementId = &#63;.
	*
	* @param id the primary key of the current vehicle record
	* @param safeTestRequirementId the safe test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findBySafeTestRequirementId_PrevAndNext(
		long id, long safeTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Removes all the vehicle records where safeTestRequirementId = &#63; from the database.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySafeTestRequirementId(long safeTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle records where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countBySafeTestRequirementId(long safeTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle records where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByEmissionTestRequirementId(
		long emissionTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle records where emissionTestRequirementId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByEmissionTestRequirementId(
		long emissionTestRequirementId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle records where emissionTestRequirementId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByEmissionTestRequirementId(
		long emissionTestRequirementId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByEmissionTestRequirementId_First(
		long emissionTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the first vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByEmissionTestRequirementId_First(
		long emissionTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByEmissionTestRequirementId_Last(
		long emissionTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the last vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByEmissionTestRequirementId_Last(
		long emissionTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle records before and after the current vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	*
	* @param id the primary key of the current vehicle record
	* @param emissionTestRequirementId the emission test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByEmissionTestRequirementId_PrevAndNext(
		long id, long emissionTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Removes all the vehicle records where emissionTestRequirementId = &#63; from the database.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmissionTestRequirementId(
		long emissionTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle records where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmissionTestRequirementId(long emissionTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle records where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByControlRequirementId(
		long controlRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle records where controlRequirementId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param controlRequirementId the control requirement ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByControlRequirementId(
		long controlRequirementId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle records where controlRequirementId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param controlRequirementId the control requirement ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByControlRequirementId(
		long controlRequirementId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle record in the ordered set where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByControlRequirementId_First(
		long controlRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the first vehicle record in the ordered set where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByControlRequirementId_First(
		long controlRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle record in the ordered set where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByControlRequirementId_Last(
		long controlRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the last vehicle record in the ordered set where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByControlRequirementId_Last(
		long controlRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle records before and after the current vehicle record in the ordered set where controlRequirementId = &#63;.
	*
	* @param id the primary key of the current vehicle record
	* @param controlRequirementId the control requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByControlRequirementId_PrevAndNext(
		long id, long controlRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Removes all the vehicle records where controlRequirementId = &#63; from the database.
	*
	* @param controlRequirementId the control requirement ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByControlRequirementId(long controlRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle records where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countByControlRequirementId(long controlRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle records where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionId(
		long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle records where confirmedInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionId(
		long confirmedInspectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle records where confirmedInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionId(
		long confirmedInspectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByConfirmedInspectionId_First(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the first vehicle record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByConfirmedInspectionId_First(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByConfirmedInspectionId_Last(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the last vehicle record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByConfirmedInspectionId_Last(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle records before and after the current vehicle record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param id the primary key of the current vehicle record
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByConfirmedInspectionId_PrevAndNext(
		long id, long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Removes all the vehicle records where confirmedInspectionId = &#63; from the database.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByConfirmedInspectionId(long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle records where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countByConfirmedInspectionId(long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle records where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordId(
		long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle records where inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordId(
		long inspectionRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle records where inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordId(
		long inspectionRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle record in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByInspectionRecordId_First(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the first vehicle record in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByInspectionRecordId_First(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle record in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByInspectionRecordId_Last(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the last vehicle record in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByInspectionRecordId_Last(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle records before and after the current vehicle record in the ordered set where inspectionRecordId = &#63;.
	*
	* @param id the primary key of the current vehicle record
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByInspectionRecordId_PrevAndNext(
		long id, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Removes all the vehicle records where inspectionRecordId = &#63; from the database.
	*
	* @param inspectionRecordId the inspection record ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByInspectionRecordId(long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle records where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectionRecordId(long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle records where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle records where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByVehicleGroupId(
		long vehicleGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle records where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle record in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the first vehicle record in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle record in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the last vehicle record in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle records before and after the current vehicle record in the ordered set where vehicleGroupId = &#63;.
	*
	* @param id the primary key of the current vehicle record
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Removes all the vehicle records where vehicleGroupId = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle records where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle records where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDraftCertificateId(
		long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle records where draftCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param draftCertificateId the draft certificate ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDraftCertificateId(
		long draftCertificateId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle records where draftCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param draftCertificateId the draft certificate ID
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDraftCertificateId(
		long draftCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle record in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByDraftCertificateId_First(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the first vehicle record in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByDraftCertificateId_First(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle record in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByDraftCertificateId_Last(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the last vehicle record in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByDraftCertificateId_Last(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle records before and after the current vehicle record in the ordered set where draftCertificateId = &#63;.
	*
	* @param id the primary key of the current vehicle record
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByDraftCertificateId_PrevAndNext(
		long id, long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Removes all the vehicle records where draftCertificateId = &#63; from the database.
	*
	* @param draftCertificateId the draft certificate ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDraftCertificateId(long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle records where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countByDraftCertificateId(long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle record where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException} if it could not be found.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @return the matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the vehicle record where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @return the matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle record where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the vehicle record where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63; from the database.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @return the vehicle record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord removeByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the number of vehicle records where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63;.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countByCN_CHN_EN(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the vehicle record in the entity cache if it is enabled.
	*
	* @param vehicleRecord the vehicle record
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord);

	/**
	* Caches the vehicle records in the entity cache if it is enabled.
	*
	* @param vehicleRecords the vehicle records
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> vehicleRecords);

	/**
	* Creates a new vehicle record with the primary key. Does not add the vehicle record to the database.
	*
	* @param id the primary key for the new vehicle record
	* @return the new vehicle record
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord create(long id);

	/**
	* Removes the vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle record with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException} if it could not be found.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException;

	/**
	* Returns the vehicle record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record, or <code>null</code> if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle records.
	*
	* @return the vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vehicle records from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle records.
	*
	* @return the number of vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}