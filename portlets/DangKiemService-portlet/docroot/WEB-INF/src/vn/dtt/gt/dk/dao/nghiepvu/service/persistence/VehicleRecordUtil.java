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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord;

import java.util.List;

/**
 * The persistence utility for the vehicle record service. This utility wraps {@link VehicleRecordPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see VehicleRecordPersistence
 * @see VehicleRecordPersistenceImpl
 * @generated
 */
public class VehicleRecordUtil {
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
	public static void clearCache(VehicleRecord vehicleRecord) {
		getPersistence().clearCache(vehicleRecord);
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
	public static List<VehicleRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VehicleRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VehicleRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static VehicleRecord update(VehicleRecord vehicleRecord)
		throws SystemException {
		return getPersistence().update(vehicleRecord);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static VehicleRecord update(VehicleRecord vehicleRecord,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vehicleRecord, serviceContext);
	}

	/**
	* Returns all the vehicle records where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByCertificateRecordId(
		long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCertificateRecordId(certificateRecordId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByCertificateRecordId(
		long certificateRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateRecordId(certificateRecordId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByCertificateRecordId(
		long certificateRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCertificateRecordId(certificateRecordId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByCertificateRecordId_First(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCertificateRecordId_First(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateRecordId_First(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByCertificateRecordId_Last(certificateRecordId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCertificateRecordId_Last(
		long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCertificateRecordId_Last(certificateRecordId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByCertificateRecordId_PrevAndNext(
		long id, long certificateRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByCertificateRecordId_PrevAndNext(id,
			certificateRecordId, orderByComparator);
	}

	/**
	* Removes all the vehicle records where certificateRecordId = &#63; from the database.
	*
	* @param certificateRecordId the certificate record ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the number of vehicle records where certificateRecordId = &#63;.
	*
	* @param certificateRecordId the certificate record ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCertificateRecordId(long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCertificateRecordId(certificateRecordId);
	}

	/**
	* Returns the vehicle record where codeNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException} if it could not be found.
	*
	* @param codeNumber the code number
	* @return the matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence().findByCodeNumber(codeNumber);
	}

	/**
	* Returns the vehicle record where codeNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param codeNumber the code number
	* @return the matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCodeNumber(codeNumber);
	}

	/**
	* Returns the vehicle record where codeNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param codeNumber the code number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCodeNumber(
		long codeNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCodeNumber(codeNumber, retrieveFromCache);
	}

	/**
	* Removes the vehicle record where codeNumber = &#63; from the database.
	*
	* @param codeNumber the code number
	* @return the vehicle record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord removeByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence().removeByCodeNumber(codeNumber);
	}

	/**
	* Returns the number of vehicle records where codeNumber = &#63;.
	*
	* @param codeNumber the code number
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCodeNumber(long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCodeNumber(codeNumber);
	}

	/**
	* Returns all the vehicle records where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteId(
		long debitNoteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDebitNoteId(debitNoteId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteId(
		long debitNoteId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDebitNoteId(debitNoteId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDebitNoteId(
		long debitNoteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDebitNoteId(debitNoteId, start, end, orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByDebitNoteId_First(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByDebitNoteId_First(debitNoteId, orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByDebitNoteId_First(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDebitNoteId_First(debitNoteId, orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByDebitNoteId_Last(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByDebitNoteId_Last(debitNoteId, orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByDebitNoteId_Last(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDebitNoteId_Last(debitNoteId, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByDebitNoteId_PrevAndNext(
		long id, long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByDebitNoteId_PrevAndNext(id, debitNoteId,
			orderByComparator);
	}

	/**
	* Removes all the vehicle records where debitNoteId = &#63; from the database.
	*
	* @param debitNoteId the debit note ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDebitNoteId(long debitNoteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDebitNoteId(debitNoteId);
	}

	/**
	* Returns the number of vehicle records where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDebitNoteId(long debitNoteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDebitNoteId(debitNoteId);
	}

	/**
	* Returns all the vehicle records where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findBySafeTestRequirementId(
		long safeTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySafeTestRequirementId(safeTestRequirementId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findBySafeTestRequirementId(
		long safeTestRequirementId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySafeTestRequirementId(safeTestRequirementId, start,
			end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findBySafeTestRequirementId(
		long safeTestRequirementId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBySafeTestRequirementId(safeTestRequirementId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findBySafeTestRequirementId_First(
		long safeTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findBySafeTestRequirementId_First(safeTestRequirementId,
			orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchBySafeTestRequirementId_First(
		long safeTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySafeTestRequirementId_First(safeTestRequirementId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findBySafeTestRequirementId_Last(
		long safeTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findBySafeTestRequirementId_Last(safeTestRequirementId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchBySafeTestRequirementId_Last(
		long safeTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBySafeTestRequirementId_Last(safeTestRequirementId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findBySafeTestRequirementId_PrevAndNext(
		long id, long safeTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findBySafeTestRequirementId_PrevAndNext(id,
			safeTestRequirementId, orderByComparator);
	}

	/**
	* Removes all the vehicle records where safeTestRequirementId = &#63; from the database.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBySafeTestRequirementId(long safeTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBySafeTestRequirementId(safeTestRequirementId);
	}

	/**
	* Returns the number of vehicle records where safeTestRequirementId = &#63;.
	*
	* @param safeTestRequirementId the safe test requirement ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countBySafeTestRequirementId(long safeTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countBySafeTestRequirementId(safeTestRequirementId);
	}

	/**
	* Returns all the vehicle records where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByEmissionTestRequirementId(
		long emissionTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEmissionTestRequirementId(emissionTestRequirementId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByEmissionTestRequirementId(
		long emissionTestRequirementId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEmissionTestRequirementId(emissionTestRequirementId,
			start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByEmissionTestRequirementId(
		long emissionTestRequirementId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByEmissionTestRequirementId(emissionTestRequirementId,
			start, end, orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByEmissionTestRequirementId_First(
		long emissionTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByEmissionTestRequirementId_First(emissionTestRequirementId,
			orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByEmissionTestRequirementId_First(
		long emissionTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmissionTestRequirementId_First(emissionTestRequirementId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByEmissionTestRequirementId_Last(
		long emissionTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByEmissionTestRequirementId_Last(emissionTestRequirementId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByEmissionTestRequirementId_Last(
		long emissionTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByEmissionTestRequirementId_Last(emissionTestRequirementId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByEmissionTestRequirementId_PrevAndNext(
		long id, long emissionTestRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByEmissionTestRequirementId_PrevAndNext(id,
			emissionTestRequirementId, orderByComparator);
	}

	/**
	* Removes all the vehicle records where emissionTestRequirementId = &#63; from the database.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByEmissionTestRequirementId(
		long emissionTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence()
			.removeByEmissionTestRequirementId(emissionTestRequirementId);
	}

	/**
	* Returns the number of vehicle records where emissionTestRequirementId = &#63;.
	*
	* @param emissionTestRequirementId the emission test requirement ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByEmissionTestRequirementId(
		long emissionTestRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByEmissionTestRequirementId(emissionTestRequirementId);
	}

	/**
	* Returns all the vehicle records where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByControlRequirementId(
		long controlRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByControlRequirementId(controlRequirementId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByControlRequirementId(
		long controlRequirementId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByControlRequirementId(controlRequirementId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByControlRequirementId(
		long controlRequirementId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByControlRequirementId(controlRequirementId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByControlRequirementId_First(
		long controlRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByControlRequirementId_First(controlRequirementId,
			orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByControlRequirementId_First(
		long controlRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByControlRequirementId_First(controlRequirementId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByControlRequirementId_Last(
		long controlRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByControlRequirementId_Last(controlRequirementId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByControlRequirementId_Last(
		long controlRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByControlRequirementId_Last(controlRequirementId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByControlRequirementId_PrevAndNext(
		long id, long controlRequirementId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByControlRequirementId_PrevAndNext(id,
			controlRequirementId, orderByComparator);
	}

	/**
	* Removes all the vehicle records where controlRequirementId = &#63; from the database.
	*
	* @param controlRequirementId the control requirement ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByControlRequirementId(long controlRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByControlRequirementId(controlRequirementId);
	}

	/**
	* Returns the number of vehicle records where controlRequirementId = &#63;.
	*
	* @param controlRequirementId the control requirement ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByControlRequirementId(long controlRequirementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByControlRequirementId(controlRequirementId);
	}

	/**
	* Returns all the vehicle records where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionId(
		long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedInspectionId(confirmedInspectionId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionId(
		long confirmedInspectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedInspectionId(confirmedInspectionId, start,
			end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByConfirmedInspectionId(
		long confirmedInspectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedInspectionId(confirmedInspectionId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByConfirmedInspectionId_First(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByConfirmedInspectionId_First(confirmedInspectionId,
			orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByConfirmedInspectionId_First(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByConfirmedInspectionId_First(confirmedInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByConfirmedInspectionId_Last(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByConfirmedInspectionId_Last(confirmedInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByConfirmedInspectionId_Last(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByConfirmedInspectionId_Last(confirmedInspectionId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByConfirmedInspectionId_PrevAndNext(
		long id, long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByConfirmedInspectionId_PrevAndNext(id,
			confirmedInspectionId, orderByComparator);
	}

	/**
	* Removes all the vehicle records where confirmedInspectionId = &#63; from the database.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByConfirmedInspectionId(long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns the number of vehicle records where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByConfirmedInspectionId(long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByConfirmedInspectionId(confirmedInspectionId);
	}

	/**
	* Returns all the vehicle records where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordId(
		long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByInspectionRecordId(inspectionRecordId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordId(
		long inspectionRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectionRecordId(inspectionRecordId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByInspectionRecordId(
		long inspectionRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByInspectionRecordId(inspectionRecordId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByInspectionRecordId_First(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByInspectionRecordId_First(inspectionRecordId,
			orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByInspectionRecordId_First(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionRecordId_First(inspectionRecordId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByInspectionRecordId_Last(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByInspectionRecordId_Last(inspectionRecordId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByInspectionRecordId_Last(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionRecordId_Last(inspectionRecordId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByInspectionRecordId_PrevAndNext(
		long id, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByInspectionRecordId_PrevAndNext(id,
			inspectionRecordId, orderByComparator);
	}

	/**
	* Removes all the vehicle records where inspectionRecordId = &#63; from the database.
	*
	* @param inspectionRecordId the inspection record ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByInspectionRecordId(long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns the number of vehicle records where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectionRecordId(long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByInspectionRecordId(inspectionRecordId);
	}

	/**
	* Returns all the vehicle records where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVehicleGroupId(vehicleGroupId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByVehicleGroupId(
		long vehicleGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVehicleGroupId(vehicleGroupId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByVehicleGroupId(vehicleGroupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByVehicleGroupId_First(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupId_First(vehicleGroupId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByVehicleGroupId_Last(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupId_Last(vehicleGroupId, orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByVehicleGroupId_PrevAndNext(id, vehicleGroupId,
			orderByComparator);
	}

	/**
	* Removes all the vehicle records where vehicleGroupId = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the number of vehicle records where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns all the vehicle records where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @return the matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDraftCertificateId(
		long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDraftCertificateId(draftCertificateId);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDraftCertificateId(
		long draftCertificateId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDraftCertificateId(draftCertificateId, start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findByDraftCertificateId(
		long draftCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDraftCertificateId(draftCertificateId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByDraftCertificateId_First(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByDraftCertificateId_First(draftCertificateId,
			orderByComparator);
	}

	/**
	* Returns the first vehicle record in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByDraftCertificateId_First(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDraftCertificateId_First(draftCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByDraftCertificateId_Last(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByDraftCertificateId_Last(draftCertificateId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle record in the ordered set where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByDraftCertificateId_Last(
		long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDraftCertificateId_Last(draftCertificateId,
			orderByComparator);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord[] findByDraftCertificateId_PrevAndNext(
		long id, long draftCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByDraftCertificateId_PrevAndNext(id,
			draftCertificateId, orderByComparator);
	}

	/**
	* Removes all the vehicle records where draftCertificateId = &#63; from the database.
	*
	* @param draftCertificateId the draft certificate ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDraftCertificateId(long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDraftCertificateId(draftCertificateId);
	}

	/**
	* Returns the number of vehicle records where draftCertificateId = &#63;.
	*
	* @param draftCertificateId the draft certificate ID
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDraftCertificateId(long draftCertificateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDraftCertificateId(draftCertificateId);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .findByCN_CHN_EN(codeNumber, chassisNumber, engineNumber);
	}

	/**
	* Returns the vehicle record where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @return the matching vehicle record, or <code>null</code> if a matching vehicle record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCN_CHN_EN(codeNumber, chassisNumber, engineNumber);
	}

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
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCN_CHN_EN(codeNumber, chassisNumber, engineNumber,
			retrieveFromCache);
	}

	/**
	* Removes the vehicle record where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63; from the database.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @return the vehicle record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord removeByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence()
				   .removeByCN_CHN_EN(codeNumber, chassisNumber, engineNumber);
	}

	/**
	* Returns the number of vehicle records where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63;.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @return the number of matching vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCN_CHN_EN(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByCN_CHN_EN(codeNumber, chassisNumber, engineNumber);
	}

	/**
	* Caches the vehicle record in the entity cache if it is enabled.
	*
	* @param vehicleRecord the vehicle record
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord) {
		getPersistence().cacheResult(vehicleRecord);
	}

	/**
	* Caches the vehicle records in the entity cache if it is enabled.
	*
	* @param vehicleRecords the vehicle records
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> vehicleRecords) {
		getPersistence().cacheResult(vehicleRecords);
	}

	/**
	* Creates a new vehicle record with the primary key. Does not add the vehicle record to the database.
	*
	* @param id the primary key for the new vehicle record
	* @return the new vehicle record
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vehicleRecord);
	}

	/**
	* Returns the vehicle record with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException} if it could not be found.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleRecordException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vehicle record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record, or <code>null</code> if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the vehicle records.
	*
	* @return the vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vehicle records from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vehicle records.
	*
	* @return the number of vehicle records
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VehicleRecordPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VehicleRecordPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					VehicleRecordPersistence.class.getName());

			ReferenceRegistry.registerReference(VehicleRecordUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(VehicleRecordPersistence persistence) {
	}

	private static VehicleRecordPersistence _persistence;
}