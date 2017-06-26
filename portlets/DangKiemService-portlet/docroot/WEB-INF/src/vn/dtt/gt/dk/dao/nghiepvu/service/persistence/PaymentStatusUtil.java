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

import vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus;

import java.util.List;

/**
 * The persistence utility for the payment status service. This utility wraps {@link PaymentStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see PaymentStatusPersistence
 * @see PaymentStatusPersistenceImpl
 * @generated
 */
public class PaymentStatusUtil {
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
	public static void clearCache(PaymentStatus paymentStatus) {
		getPersistence().clearCache(paymentStatus);
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
	public static List<PaymentStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PaymentStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PaymentStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PaymentStatus update(PaymentStatus paymentStatus)
		throws SystemException {
		return getPersistence().update(paymentStatus);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PaymentStatus update(PaymentStatus paymentStatus,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(paymentStatus, serviceContext);
	}

	/**
	* Returns the payment status where vehicleRecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException} if it could not be found.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the matching payment status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus findByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException {
		return getPersistence().findByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns the payment status where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the matching payment status, or <code>null</code> if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus fetchByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns the payment status where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param vehicleRecordId the vehicle record ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching payment status, or <code>null</code> if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus fetchByVehicleRecordId(
		long vehicleRecordId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleRecordId(vehicleRecordId, retrieveFromCache);
	}

	/**
	* Removes the payment status where vehicleRecordId = &#63; from the database.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the payment status that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus removeByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException {
		return getPersistence().removeByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns the number of payment statuses where vehicleRecordId = &#63;.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the number of matching payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVehicleRecordId(long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns all the payment statuses where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @return the matching payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findByDebitNoteNumber(
		java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDebitNoteNumber(debitNoteNumber);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findByDebitNoteNumber(
		java.lang.String debitNoteNumber, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDebitNoteNumber(debitNoteNumber, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findByDebitNoteNumber(
		java.lang.String debitNoteNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDebitNoteNumber(debitNoteNumber, start, end,
			orderByComparator);
	}

	/**
	* Returns the first payment status in the ordered set where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus findByDebitNoteNumber_First(
		java.lang.String debitNoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException {
		return getPersistence()
				   .findByDebitNoteNumber_First(debitNoteNumber,
			orderByComparator);
	}

	/**
	* Returns the first payment status in the ordered set where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment status, or <code>null</code> if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus fetchByDebitNoteNumber_First(
		java.lang.String debitNoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDebitNoteNumber_First(debitNoteNumber,
			orderByComparator);
	}

	/**
	* Returns the last payment status in the ordered set where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus findByDebitNoteNumber_Last(
		java.lang.String debitNoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException {
		return getPersistence()
				   .findByDebitNoteNumber_Last(debitNoteNumber,
			orderByComparator);
	}

	/**
	* Returns the last payment status in the ordered set where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment status, or <code>null</code> if a matching payment status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus fetchByDebitNoteNumber_Last(
		java.lang.String debitNoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDebitNoteNumber_Last(debitNoteNumber,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus[] findByDebitNoteNumber_PrevAndNext(
		long id, java.lang.String debitNoteNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException {
		return getPersistence()
				   .findByDebitNoteNumber_PrevAndNext(id, debitNoteNumber,
			orderByComparator);
	}

	/**
	* Removes all the payment statuses where debitNoteNumber = &#63; from the database.
	*
	* @param debitNoteNumber the debit note number
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDebitNoteNumber(java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDebitNoteNumber(debitNoteNumber);
	}

	/**
	* Returns the number of payment statuses where debitNoteNumber = &#63;.
	*
	* @param debitNoteNumber the debit note number
	* @return the number of matching payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDebitNoteNumber(java.lang.String debitNoteNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDebitNoteNumber(debitNoteNumber);
	}

	/**
	* Caches the payment status in the entity cache if it is enabled.
	*
	* @param paymentStatus the payment status
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus paymentStatus) {
		getPersistence().cacheResult(paymentStatus);
	}

	/**
	* Caches the payment statuses in the entity cache if it is enabled.
	*
	* @param paymentStatuses the payment statuses
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> paymentStatuses) {
		getPersistence().cacheResult(paymentStatuses);
	}

	/**
	* Creates a new payment status with the primary key. Does not add the payment status to the database.
	*
	* @param id the primary key for the new payment status
	* @return the new payment status
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the payment status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the payment status
	* @return the payment status that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a payment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus paymentStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(paymentStatus);
	}

	/**
	* Returns the payment status with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException} if it could not be found.
	*
	* @param id the primary key of the payment status
	* @return the payment status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException if a payment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchPaymentStatusException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the payment status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the payment status
	* @return the payment status, or <code>null</code> if a payment status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the payment statuses.
	*
	* @return the payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.PaymentStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the payment statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of payment statuses.
	*
	* @return the number of payment statuses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PaymentStatusPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PaymentStatusPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					PaymentStatusPersistence.class.getName());

			ReferenceRegistry.registerReference(PaymentStatusUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PaymentStatusPersistence persistence) {
	}

	private static PaymentStatusPersistence _persistence;
}