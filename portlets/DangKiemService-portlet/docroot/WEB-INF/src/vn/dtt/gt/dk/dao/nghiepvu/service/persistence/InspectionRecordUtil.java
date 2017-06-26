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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord;

import java.util.List;

/**
 * The persistence utility for the inspection record service. This utility wraps {@link InspectionRecordPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see InspectionRecordPersistence
 * @see InspectionRecordPersistenceImpl
 * @generated
 */
public class InspectionRecordUtil {
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
	public static void clearCache(InspectionRecord inspectionRecord) {
		getPersistence().clearCache(inspectionRecord);
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
	public static List<InspectionRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InspectionRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InspectionRecord> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static InspectionRecord update(InspectionRecord inspectionRecord)
		throws SystemException {
		return getPersistence().update(inspectionRecord);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static InspectionRecord update(InspectionRecord inspectionRecord,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(inspectionRecord, serviceContext);
	}

	/**
	* Returns all the inspection records where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByRegisteredInspectionId(
		long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns a range of all the inspection records where registeredInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registeredInspectionId the registered inspection ID
	* @param start the lower bound of the range of inspection records
	* @param end the upper bound of the range of inspection records (not inclusive)
	* @return the range of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredInspectionId(registeredInspectionId, start,
			end);
	}

	/**
	* Returns an ordered range of all the inspection records where registeredInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registeredInspectionId the registered inspection ID
	* @param start the lower bound of the range of inspection records
	* @param end the upper bound of the range of inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredInspectionId(registeredInspectionId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first inspection record in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord findByRegisteredInspectionId_First(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence()
				   .findByRegisteredInspectionId_First(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the first inspection record in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByRegisteredInspectionId_First(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredInspectionId_First(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last inspection record in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord findByRegisteredInspectionId_Last(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence()
				   .findByRegisteredInspectionId_Last(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last inspection record in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByRegisteredInspectionId_Last(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredInspectionId_Last(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the inspection records before and after the current inspection record in the ordered set where registeredInspectionId = &#63;.
	*
	* @param id the primary key of the current inspection record
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord[] findByRegisteredInspectionId_PrevAndNext(
		long id, long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence()
				   .findByRegisteredInspectionId_PrevAndNext(id,
			registeredInspectionId, orderByComparator);
	}

	/**
	* Removes all the inspection records where registeredInspectionId = &#63; from the database.
	*
	* @param registeredInspectionId the registered inspection ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByRegisteredInspectionId(
		long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the number of inspection records where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the number of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRegisteredInspectionId(long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the inspection record where phieuXuLyPhuId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException} if it could not be found.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord findByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence().findByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the inspection record where phieuXuLyPhuId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the inspection record where phieuXuLyPhuId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByPhieuXuLyPhuId(
		long phieuXuLyPhuId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPhieuXuLyPhuId(phieuXuLyPhuId, retrieveFromCache);
	}

	/**
	* Removes the inspection record where phieuXuLyPhuId = &#63; from the database.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the inspection record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord removeByPhieuXuLyPhuId(
		long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence().removeByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns the number of inspection records where phieuXuLyPhuId = &#63;.
	*
	* @param phieuXuLyPhuId the phieu xu ly phu ID
	* @return the number of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPhieuXuLyPhuId(long phieuXuLyPhuId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	* Returns all the inspection records where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @return the matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByConfirmedinspectionid(
		long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedinspectionid(confirmedInspectionId);
	}

	/**
	* Returns a range of all the inspection records where confirmedInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param start the lower bound of the range of inspection records
	* @param end the upper bound of the range of inspection records (not inclusive)
	* @return the range of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByConfirmedinspectionid(
		long confirmedInspectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedinspectionid(confirmedInspectionId, start,
			end);
	}

	/**
	* Returns an ordered range of all the inspection records where confirmedInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param start the lower bound of the range of inspection records
	* @param end the upper bound of the range of inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByConfirmedinspectionid(
		long confirmedInspectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByConfirmedinspectionid(confirmedInspectionId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first inspection record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord findByConfirmedinspectionid_First(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence()
				   .findByConfirmedinspectionid_First(confirmedInspectionId,
			orderByComparator);
	}

	/**
	* Returns the first inspection record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByConfirmedinspectionid_First(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByConfirmedinspectionid_First(confirmedInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last inspection record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord findByConfirmedinspectionid_Last(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence()
				   .findByConfirmedinspectionid_Last(confirmedInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last inspection record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByConfirmedinspectionid_Last(
		long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByConfirmedinspectionid_Last(confirmedInspectionId,
			orderByComparator);
	}

	/**
	* Returns the inspection records before and after the current inspection record in the ordered set where confirmedInspectionId = &#63;.
	*
	* @param id the primary key of the current inspection record
	* @param confirmedInspectionId the confirmed inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord[] findByConfirmedinspectionid_PrevAndNext(
		long id, long confirmedInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence()
				   .findByConfirmedinspectionid_PrevAndNext(id,
			confirmedInspectionId, orderByComparator);
	}

	/**
	* Removes all the inspection records where confirmedInspectionId = &#63; from the database.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByConfirmedinspectionid(long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByConfirmedinspectionid(confirmedInspectionId);
	}

	/**
	* Returns the number of inspection records where confirmedInspectionId = &#63;.
	*
	* @param confirmedInspectionId the confirmed inspection ID
	* @return the number of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByConfirmedinspectionid(long confirmedInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByConfirmedinspectionid(confirmedInspectionId);
	}

	/**
	* Returns the inspection record where inspectionRecordNo = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException} if it could not be found.
	*
	* @param inspectionRecordNo the inspection record no
	* @return the matching inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord findByInspectionRecordNo(
		java.lang.String inspectionRecordNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence().findByInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Returns the inspection record where inspectionRecordNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param inspectionRecordNo the inspection record no
	* @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByInspectionRecordNo(
		java.lang.String inspectionRecordNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Returns the inspection record where inspectionRecordNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param inspectionRecordNo the inspection record no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByInspectionRecordNo(
		java.lang.String inspectionRecordNo, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByInspectionRecordNo(inspectionRecordNo,
			retrieveFromCache);
	}

	/**
	* Removes the inspection record where inspectionRecordNo = &#63; from the database.
	*
	* @param inspectionRecordNo the inspection record no
	* @return the inspection record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord removeByInspectionRecordNo(
		java.lang.String inspectionRecordNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence().removeByInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Returns the number of inspection records where inspectionRecordNo = &#63;.
	*
	* @param inspectionRecordNo the inspection record no
	* @return the number of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByInspectionRecordNo(
		java.lang.String inspectionRecordNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByInspectionRecordNo(inspectionRecordNo);
	}

	/**
	* Returns the inspection record where registeredInspectionId = &#63; and inspectionRecordNo = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException} if it could not be found.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param inspectionRecordNo the inspection record no
	* @return the matching inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord findByR_I(
		long registeredInspectionId, java.lang.String inspectionRecordNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence()
				   .findByR_I(registeredInspectionId, inspectionRecordNo);
	}

	/**
	* Returns the inspection record where registeredInspectionId = &#63; and inspectionRecordNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param inspectionRecordNo the inspection record no
	* @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByR_I(
		long registeredInspectionId, java.lang.String inspectionRecordNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByR_I(registeredInspectionId, inspectionRecordNo);
	}

	/**
	* Returns the inspection record where registeredInspectionId = &#63; and inspectionRecordNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param inspectionRecordNo the inspection record no
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByR_I(
		long registeredInspectionId, java.lang.String inspectionRecordNo,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByR_I(registeredInspectionId, inspectionRecordNo,
			retrieveFromCache);
	}

	/**
	* Removes the inspection record where registeredInspectionId = &#63; and inspectionRecordNo = &#63; from the database.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param inspectionRecordNo the inspection record no
	* @return the inspection record that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord removeByR_I(
		long registeredInspectionId, java.lang.String inspectionRecordNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence()
				   .removeByR_I(registeredInspectionId, inspectionRecordNo);
	}

	/**
	* Returns the number of inspection records where registeredInspectionId = &#63; and inspectionRecordNo = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param inspectionRecordNo the inspection record no
	* @return the number of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByR_I(long registeredInspectionId,
		java.lang.String inspectionRecordNo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByR_I(registeredInspectionId, inspectionRecordNo);
	}

	/**
	* Returns all the inspection records where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns a range of all the inspection records where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of inspection records
	* @param end the upper bound of the range of inspection records (not inclusive)
	* @return the range of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the inspection records where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of inspection records
	* @param end the upper bound of the range of inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucId(hoSoThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first inspection record in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence()
				   .findByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the first inspection record in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last inspection record in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence()
				   .findByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last inspection record in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection record, or <code>null</code> if a matching inspection record could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the inspection records before and after the current inspection record in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current inspection record
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence()
				   .findByHoSoThuTucId_PrevAndNext(id, hoSoThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the inspection records where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the number of inspection records where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Caches the inspection record in the entity cache if it is enabled.
	*
	* @param inspectionRecord the inspection record
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord inspectionRecord) {
		getPersistence().cacheResult(inspectionRecord);
	}

	/**
	* Caches the inspection records in the entity cache if it is enabled.
	*
	* @param inspectionRecords the inspection records
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> inspectionRecords) {
		getPersistence().cacheResult(inspectionRecords);
	}

	/**
	* Creates a new inspection record with the primary key. Does not add the inspection record to the database.
	*
	* @param id the primary key for the new inspection record
	* @return the new inspection record
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the inspection record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the inspection record
	* @return the inspection record that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord inspectionRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(inspectionRecord);
	}

	/**
	* Returns the inspection record with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException} if it could not be found.
	*
	* @param id the primary key of the inspection record
	* @return the inspection record
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException if a inspection record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionRecordException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the inspection record with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the inspection record
	* @return the inspection record, or <code>null</code> if a inspection record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the inspection records.
	*
	* @return the inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the inspection records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of inspection records
	* @param end the upper bound of the range of inspection records (not inclusive)
	* @return the range of inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the inspection records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of inspection records
	* @param end the upper bound of the range of inspection records (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecord> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the inspection records from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of inspection records.
	*
	* @return the number of inspection records
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InspectionRecordPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InspectionRecordPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					InspectionRecordPersistence.class.getName());

			ReferenceRegistry.registerReference(InspectionRecordUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(InspectionRecordPersistence persistence) {
	}

	private static InspectionRecordPersistence _persistence;
}