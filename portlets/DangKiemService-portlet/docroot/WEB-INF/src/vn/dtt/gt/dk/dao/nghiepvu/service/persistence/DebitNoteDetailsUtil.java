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

import vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails;

import java.util.List;

/**
 * The persistence utility for the debit note details service. This utility wraps {@link DebitNoteDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see DebitNoteDetailsPersistence
 * @see DebitNoteDetailsPersistenceImpl
 * @generated
 */
public class DebitNoteDetailsUtil {
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
	public static void clearCache(DebitNoteDetails debitNoteDetails) {
		getPersistence().clearCache(debitNoteDetails);
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
	public static List<DebitNoteDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DebitNoteDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DebitNoteDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static DebitNoteDetails update(DebitNoteDetails debitNoteDetails)
		throws SystemException {
		return getPersistence().update(debitNoteDetails);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static DebitNoteDetails update(DebitNoteDetails debitNoteDetails,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(debitNoteDetails, serviceContext);
	}

	/**
	* Returns the debit note details where vehicleRecordId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException} if it could not be found.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the matching debit note details
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a matching debit note details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails findByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException {
		return getPersistence().findByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns the debit note details where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the matching debit note details, or <code>null</code> if a matching debit note details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails fetchByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns the debit note details where vehicleRecordId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param vehicleRecordId the vehicle record ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching debit note details, or <code>null</code> if a matching debit note details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails fetchByVehicleRecordId(
		long vehicleRecordId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleRecordId(vehicleRecordId, retrieveFromCache);
	}

	/**
	* Removes the debit note details where vehicleRecordId = &#63; from the database.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the debit note details that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails removeByVehicleRecordId(
		long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException {
		return getPersistence().removeByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns the number of debit note detailses where vehicleRecordId = &#63;.
	*
	* @param vehicleRecordId the vehicle record ID
	* @return the number of matching debit note detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVehicleRecordId(long vehicleRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVehicleRecordId(vehicleRecordId);
	}

	/**
	* Returns all the debit note detailses where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @return the matching debit note detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails> findByDebitNoteId(
		long debitNoteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDebitNoteId(debitNoteId);
	}

	/**
	* Returns a range of all the debit note detailses where debitNoteId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param debitNoteId the debit note ID
	* @param start the lower bound of the range of debit note detailses
	* @param end the upper bound of the range of debit note detailses (not inclusive)
	* @return the range of matching debit note detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails> findByDebitNoteId(
		long debitNoteId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByDebitNoteId(debitNoteId, start, end);
	}

	/**
	* Returns an ordered range of all the debit note detailses where debitNoteId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param debitNoteId the debit note ID
	* @param start the lower bound of the range of debit note detailses
	* @param end the upper bound of the range of debit note detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching debit note detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails> findByDebitNoteId(
		long debitNoteId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByDebitNoteId(debitNoteId, start, end, orderByComparator);
	}

	/**
	* Returns the first debit note details in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching debit note details
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a matching debit note details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails findByDebitNoteId_First(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException {
		return getPersistence()
				   .findByDebitNoteId_First(debitNoteId, orderByComparator);
	}

	/**
	* Returns the first debit note details in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching debit note details, or <code>null</code> if a matching debit note details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails fetchByDebitNoteId_First(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDebitNoteId_First(debitNoteId, orderByComparator);
	}

	/**
	* Returns the last debit note details in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching debit note details
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a matching debit note details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails findByDebitNoteId_Last(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException {
		return getPersistence()
				   .findByDebitNoteId_Last(debitNoteId, orderByComparator);
	}

	/**
	* Returns the last debit note details in the ordered set where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching debit note details, or <code>null</code> if a matching debit note details could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails fetchByDebitNoteId_Last(
		long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByDebitNoteId_Last(debitNoteId, orderByComparator);
	}

	/**
	* Returns the debit note detailses before and after the current debit note details in the ordered set where debitNoteId = &#63;.
	*
	* @param id the primary key of the current debit note details
	* @param debitNoteId the debit note ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next debit note details
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a debit note details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails[] findByDebitNoteId_PrevAndNext(
		long id, long debitNoteId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException {
		return getPersistence()
				   .findByDebitNoteId_PrevAndNext(id, debitNoteId,
			orderByComparator);
	}

	/**
	* Removes all the debit note detailses where debitNoteId = &#63; from the database.
	*
	* @param debitNoteId the debit note ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByDebitNoteId(long debitNoteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByDebitNoteId(debitNoteId);
	}

	/**
	* Returns the number of debit note detailses where debitNoteId = &#63;.
	*
	* @param debitNoteId the debit note ID
	* @return the number of matching debit note detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDebitNoteId(long debitNoteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByDebitNoteId(debitNoteId);
	}

	/**
	* Caches the debit note details in the entity cache if it is enabled.
	*
	* @param debitNoteDetails the debit note details
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails debitNoteDetails) {
		getPersistence().cacheResult(debitNoteDetails);
	}

	/**
	* Caches the debit note detailses in the entity cache if it is enabled.
	*
	* @param debitNoteDetailses the debit note detailses
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails> debitNoteDetailses) {
		getPersistence().cacheResult(debitNoteDetailses);
	}

	/**
	* Creates a new debit note details with the primary key. Does not add the debit note details to the database.
	*
	* @param id the primary key for the new debit note details
	* @return the new debit note details
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the debit note details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the debit note details
	* @return the debit note details that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a debit note details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails debitNoteDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(debitNoteDetails);
	}

	/**
	* Returns the debit note details with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException} if it could not be found.
	*
	* @param id the primary key of the debit note details
	* @return the debit note details
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException if a debit note details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchDebitNoteDetailsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the debit note details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the debit note details
	* @return the debit note details, or <code>null</code> if a debit note details with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the debit note detailses.
	*
	* @return the debit note detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the debit note detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of debit note detailses
	* @param end the upper bound of the range of debit note detailses (not inclusive)
	* @return the range of debit note detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the debit note detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.DebitNoteDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of debit note detailses
	* @param end the upper bound of the range of debit note detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of debit note detailses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.DebitNoteDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the debit note detailses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of debit note detailses.
	*
	* @return the number of debit note detailses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static DebitNoteDetailsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (DebitNoteDetailsPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					DebitNoteDetailsPersistence.class.getName());

			ReferenceRegistry.registerReference(DebitNoteDetailsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(DebitNoteDetailsPersistence persistence) {
	}

	private static DebitNoteDetailsPersistence _persistence;
}