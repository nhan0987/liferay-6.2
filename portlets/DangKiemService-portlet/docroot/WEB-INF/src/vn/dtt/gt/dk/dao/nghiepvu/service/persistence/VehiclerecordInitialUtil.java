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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;

import java.util.List;

/**
 * The persistence utility for the vehiclerecord initial service. This utility wraps {@link VehiclerecordInitialPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see VehiclerecordInitialPersistence
 * @see VehiclerecordInitialPersistenceImpl
 * @generated
 */
public class VehiclerecordInitialUtil {
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
	public static void clearCache(VehiclerecordInitial vehiclerecordInitial) {
		getPersistence().clearCache(vehiclerecordInitial);
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
	public static List<VehiclerecordInitial> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VehiclerecordInitial> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VehiclerecordInitial> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static VehiclerecordInitial update(
		VehiclerecordInitial vehiclerecordInitial) throws SystemException {
		return getPersistence().update(vehiclerecordInitial);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static VehiclerecordInitial update(
		VehiclerecordInitial vehiclerecordInitial, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(vehiclerecordInitial, serviceContext);
	}

	/**
	* Returns all the vehiclerecord initials where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the matching vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns a range of all the vehiclerecord initials where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of vehiclerecord initials
	* @param end the upper bound of the range of vehiclerecord initials (not inclusive)
	* @return the range of matching vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByVehicleGroupId(
		long vehicleGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByVehicleGroupId(vehicleGroupId, start, end);
	}

	/**
	* Returns an ordered range of all the vehiclerecord initials where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of vehiclerecord initials
	* @param end the upper bound of the range of vehiclerecord initials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByVehicleGroupId(vehicleGroupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehiclerecord initial
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException {
		return getPersistence()
				   .findByVehicleGroupId_First(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the first vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupId_First(vehicleGroupId,
			orderByComparator);
	}

	/**
	* Returns the last vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehiclerecord initial
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException {
		return getPersistence()
				   .findByVehicleGroupId_Last(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the last vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByVehicleGroupId_Last(vehicleGroupId, orderByComparator);
	}

	/**
	* Returns the vehiclerecord initials before and after the current vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	*
	* @param id the primary key of the current vehiclerecord initial
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehiclerecord initial
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a vehiclerecord initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException {
		return getPersistence()
				   .findByVehicleGroupId_PrevAndNext(id, vehicleGroupId,
			orderByComparator);
	}

	/**
	* Removes all the vehiclerecord initials where vehicleGroupId = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the number of vehiclerecord initials where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the number of matching vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public static int countByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByVehicleGroupId(vehicleGroupId);
	}

	/**
	* Returns the vehiclerecord initial where codeNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException} if it could not be found.
	*
	* @param codeNumber the code number
	* @return the matching vehiclerecord initial
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException {
		return getPersistence().findByCodeNumber(codeNumber);
	}

	/**
	* Returns the vehiclerecord initial where codeNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param codeNumber the code number
	* @return the matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCodeNumber(codeNumber);
	}

	/**
	* Returns the vehiclerecord initial where codeNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param codeNumber the code number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByCodeNumber(
		long codeNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCodeNumber(codeNumber, retrieveFromCache);
	}

	/**
	* Removes the vehiclerecord initial where codeNumber = &#63; from the database.
	*
	* @param codeNumber the code number
	* @return the vehiclerecord initial that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial removeByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException {
		return getPersistence().removeByCodeNumber(codeNumber);
	}

	/**
	* Returns the number of vehiclerecord initials where codeNumber = &#63;.
	*
	* @param codeNumber the code number
	* @return the number of matching vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCodeNumber(long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCodeNumber(codeNumber);
	}

	/**
	* Returns the vehiclerecord initial where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException} if it could not be found.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @return the matching vehiclerecord initial
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException {
		return getPersistence()
				   .findByCN_CHN_EN(codeNumber, chassisNumber, engineNumber);
	}

	/**
	* Returns the vehiclerecord initial where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @return the matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCN_CHN_EN(codeNumber, chassisNumber, engineNumber);
	}

	/**
	* Returns the vehiclerecord initial where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCN_CHN_EN(codeNumber, chassisNumber, engineNumber,
			retrieveFromCache);
	}

	/**
	* Removes the vehiclerecord initial where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63; from the database.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @return the vehiclerecord initial that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial removeByCN_CHN_EN(
		long codeNumber, java.lang.String chassisNumber,
		java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException {
		return getPersistence()
				   .removeByCN_CHN_EN(codeNumber, chassisNumber, engineNumber);
	}

	/**
	* Returns the number of vehiclerecord initials where codeNumber = &#63; and chassisNumber = &#63; and engineNumber = &#63;.
	*
	* @param codeNumber the code number
	* @param chassisNumber the chassis number
	* @param engineNumber the engine number
	* @return the number of matching vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCN_CHN_EN(long codeNumber,
		java.lang.String chassisNumber, java.lang.String engineNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByCN_CHN_EN(codeNumber, chassisNumber, engineNumber);
	}

	/**
	* Caches the vehiclerecord initial in the entity cache if it is enabled.
	*
	* @param vehiclerecordInitial the vehiclerecord initial
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial vehiclerecordInitial) {
		getPersistence().cacheResult(vehiclerecordInitial);
	}

	/**
	* Caches the vehiclerecord initials in the entity cache if it is enabled.
	*
	* @param vehiclerecordInitials the vehiclerecord initials
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> vehiclerecordInitials) {
		getPersistence().cacheResult(vehiclerecordInitials);
	}

	/**
	* Creates a new vehiclerecord initial with the primary key. Does not add the vehiclerecord initial to the database.
	*
	* @param id the primary key for the new vehiclerecord initial
	* @return the new vehiclerecord initial
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vehiclerecord initial with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehiclerecord initial
	* @return the vehiclerecord initial that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a vehiclerecord initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial vehiclerecordInitial)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vehiclerecordInitial);
	}

	/**
	* Returns the vehiclerecord initial with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException} if it could not be found.
	*
	* @param id the primary key of the vehiclerecord initial
	* @return the vehiclerecord initial
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a vehiclerecord initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vehiclerecord initial with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vehiclerecord initial
	* @return the vehiclerecord initial, or <code>null</code> if a vehiclerecord initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the vehiclerecord initials.
	*
	* @return the vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vehiclerecord initials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehiclerecord initials
	* @param end the upper bound of the range of vehiclerecord initials (not inclusive)
	* @return the range of vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vehiclerecord initials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehiclerecord initials
	* @param end the upper bound of the range of vehiclerecord initials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vehiclerecord initials from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vehiclerecord initials.
	*
	* @return the number of vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VehiclerecordInitialPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VehiclerecordInitialPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					VehiclerecordInitialPersistence.class.getName());

			ReferenceRegistry.registerReference(VehiclerecordInitialUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(VehiclerecordInitialPersistence persistence) {
	}

	private static VehiclerecordInitialPersistence _persistence;
}