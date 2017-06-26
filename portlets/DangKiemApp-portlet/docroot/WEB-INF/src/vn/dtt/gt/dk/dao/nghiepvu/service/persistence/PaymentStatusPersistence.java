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

import vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus;

/**
 * The persistence interface for the payment status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see PaymentStatusPersistenceImpl
 * @see PaymentStatusUtil
 * @generated
 */
public interface PaymentStatusPersistence extends BasePersistence<PaymentStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PaymentStatusUtil} to access the payment status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the payment status where vehicleRecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException} if it could not be found.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the matching payment status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus findByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException;

	/**
	* Returns the payment status where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the matching payment status, or <code>null</code> if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus fetchByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment status where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param vehicleRecordId the vehicle record ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching payment status, or <code>null</code> if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus fetchByVehicleRecordId(
		long vehicleRecordId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the payment status where vehicleRecordId = &#63; from the database.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the payment status that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus removeByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException;

	/**
	* Returns the number of payment statuses where vehicleRecordId = &#63;.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the number of matching payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByVehicleRecordId(long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the payment statuses where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @return the matching payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findByDebitNoteNumber(
		java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the payment statuses where debitNoteNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param debitNoteNumber the debit note number
	* @param start the lower bound of the range of payment statuses
	* @param end the upper bound of the range of payment statuses (not inclusive)
	* @return the range of matching payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findByDebitNoteNumber(
		java.lang.String debitNoteNumber, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the payment statuses where debitNoteNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param debitNoteNumber the debit note number
	* @param start the lower bound of the range of payment statuses
	* @param end the upper bound of the range of payment statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findByDebitNoteNumber(
		java.lang.String debitNoteNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first payment status in the ordered set where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus findByDebitNoteNumber_First(
		java.lang.String debitNoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException;

	/**
	* Returns the first payment status in the ordered set where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment status, or <code>null</code> if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus fetchByDebitNoteNumber_First(
		java.lang.String debitNoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last payment status in the ordered set where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus findByDebitNoteNumber_Last(
		java.lang.String debitNoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException;

	/**
	* Returns the last payment status in the ordered set where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment status, or <code>null</code> if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus fetchByDebitNoteNumber_Last(
		java.lang.String debitNoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment statuses before and after the current payment status in the ordered set where debitNoteNumber = &#63;.
	*
	* @param id the primary key of the current payment status
	* @param debitNoteNumber the debit note number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a payment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus[] findByDebitNoteNumber_PrevAndNext(
		long id, java.lang.String debitNoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException;

	/**
	* Removes all the payment statuses where debitNoteNumber = &#63; from the database.
	*
	* @param debitNoteNumber the debit note number
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDebitNoteNumber(java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of payment statuses where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @return the number of matching payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByDebitNoteNumber(java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the payment status in the entity cache if it is enabled.
	*
	* @param paymentStatus the payment status
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus paymentStatus);

	/**
	* Caches the payment statuses in the entity cache if it is enabled.
	*
	* @param paymentStatuses the payment statuses
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> paymentStatuses);

	/**
	* Creates a new payment status with the primary key. Does not add the payment status to the database.
	*
	* @param id the primary key for the new payment status
	* @return the new payment status
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus create(long id);

	/**
	* Removes the payment status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the payment status
	* @return the payment status that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a payment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus paymentStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the payment status with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException} if it could not be found.
	*
	* @param id the primary key of the payment status
	* @return the payment status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a payment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException;

	/**
	* Returns the payment status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the payment status
	* @return the payment status, or <code>null</code> if a payment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the payment statuses.
	*
	* @return the payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the payment statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment statuses
	* @param end the upper bound of the range of payment statuses (not inclusive)
	* @return the range of payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the payment statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.PaymentStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment statuses
	* @param end the upper bound of the range of payment statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the payment statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of payment statuses.
	*
	* @return the number of payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}