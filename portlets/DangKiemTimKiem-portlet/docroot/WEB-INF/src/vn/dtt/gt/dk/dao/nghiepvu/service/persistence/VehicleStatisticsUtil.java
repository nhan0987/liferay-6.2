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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics;

import java.util.List;

/**
 * The persistence utility for the vehicle statistics service. This utility wraps {@link VehicleStatisticsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see VehicleStatisticsPersistence
 * @see VehicleStatisticsPersistenceImpl
 * @generated
 */
public class VehicleStatisticsUtil {
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
	public static void clearCache(VehicleStatistics vehicleStatistics) {
		getPersistence().clearCache(vehicleStatistics);
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
	public static List<VehicleStatistics> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VehicleStatistics> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VehicleStatistics> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static VehicleStatistics update(VehicleStatistics vehicleStatistics)
		throws SystemException {
		return getPersistence().update(vehicleStatistics);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static VehicleStatistics update(
		VehicleStatistics vehicleStatistics, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(vehicleStatistics, serviceContext);
	}

	/**
	* Returns the vehicle statistics where registeredInspectionId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException} if it could not be found.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the matching vehicle statistics
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException if a matching vehicle statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics findByRegisteredInspectionId(
		long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException {
		return getPersistence()
				   .findByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the vehicle statistics where registeredInspectionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the matching vehicle statistics, or <code>null</code> if a matching vehicle statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics fetchByRegisteredInspectionId(
		long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the vehicle statistics where registeredInspectionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching vehicle statistics, or <code>null</code> if a matching vehicle statistics could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics fetchByRegisteredInspectionId(
		long registeredInspectionId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredInspectionId(registeredInspectionId,
			retrieveFromCache);
	}

	/**
	* Removes the vehicle statistics where registeredInspectionId = &#63; from the database.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the vehicle statistics that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics removeByRegisteredInspectionId(
		long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException {
		return getPersistence()
				   .removeByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns the number of vehicle statisticses where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the number of matching vehicle statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRegisteredInspectionId(long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Caches the vehicle statistics in the entity cache if it is enabled.
	*
	* @param vehicleStatistics the vehicle statistics
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics vehicleStatistics) {
		getPersistence().cacheResult(vehicleStatistics);
	}

	/**
	* Caches the vehicle statisticses in the entity cache if it is enabled.
	*
	* @param vehicleStatisticses the vehicle statisticses
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics> vehicleStatisticses) {
		getPersistence().cacheResult(vehicleStatisticses);
	}

	/**
	* Creates a new vehicle statistics with the primary key. Does not add the vehicle statistics to the database.
	*
	* @param id the primary key for the new vehicle statistics
	* @return the new vehicle statistics
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vehicle statistics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle statistics
	* @return the vehicle statistics that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException if a vehicle statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics vehicleStatistics)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vehicleStatistics);
	}

	/**
	* Returns the vehicle statistics with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException} if it could not be found.
	*
	* @param id the primary key of the vehicle statistics
	* @return the vehicle statistics
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException if a vehicle statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleStatisticsException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vehicle statistics with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vehicle statistics
	* @return the vehicle statistics, or <code>null</code> if a vehicle statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the vehicle statisticses.
	*
	* @return the vehicle statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vehicle statisticses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle statisticses
	* @param end the upper bound of the range of vehicle statisticses (not inclusive)
	* @return the range of vehicle statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vehicle statisticses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle statisticses
	* @param end the upper bound of the range of vehicle statisticses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vehicle statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vehicle statisticses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vehicle statisticses.
	*
	* @return the number of vehicle statisticses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VehicleStatisticsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VehicleStatisticsPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					VehicleStatisticsPersistence.class.getName());

			ReferenceRegistry.registerReference(VehicleStatisticsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(VehicleStatisticsPersistence persistence) {
	}

	private static VehicleStatisticsPersistence _persistence;
}