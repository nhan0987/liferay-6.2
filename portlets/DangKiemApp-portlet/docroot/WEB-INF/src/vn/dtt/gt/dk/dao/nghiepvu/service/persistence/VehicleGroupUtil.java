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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup;

import java.util.List;

/**
 * The persistence utility for the vehicle group service. This utility wraps {@link VehicleGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see VehicleGroupPersistence
 * @see VehicleGroupPersistenceImpl
 * @generated
 */
public class VehicleGroupUtil {
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
	public static void clearCache(VehicleGroup vehicleGroup) {
		getPersistence().clearCache(vehicleGroup);
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
	public static List<VehicleGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VehicleGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VehicleGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static VehicleGroup update(VehicleGroup vehicleGroup)
		throws SystemException {
		return getPersistence().update(vehicleGroup);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static VehicleGroup update(VehicleGroup vehicleGroup,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(vehicleGroup, serviceContext);
	}

	/**
	* Returns all the vehicle groups where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByRegisteredInspectionId(
		long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns a range of all the vehicle groups where registeredInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registeredInspectionId the registered inspection ID
	* @param start the lower bound of the range of vehicle groups
	* @param end the upper bound of the range of vehicle groups (not inclusive)
	* @return the range of matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredInspectionId(registeredInspectionId, start,
			end);
	}

	/**
	* Returns an ordered range of all the vehicle groups where registeredInspectionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param registeredInspectionId the registered inspection ID
	* @param start the lower bound of the range of vehicle groups
	* @param end the upper bound of the range of vehicle groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByRegisteredInspectionId(
		long registeredInspectionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByRegisteredInspectionId(registeredInspectionId, start,
			end, orderByComparator);
	}

	/**
	* Returns the first vehicle group in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle group
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findByRegisteredInspectionId_First(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence()
				   .findByRegisteredInspectionId_First(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the first vehicle group in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup fetchByRegisteredInspectionId_First(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredInspectionId_First(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle group in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle group
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findByRegisteredInspectionId_Last(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence()
				   .findByRegisteredInspectionId_Last(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the last vehicle group in the ordered set where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup fetchByRegisteredInspectionId_Last(
		long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByRegisteredInspectionId_Last(registeredInspectionId,
			orderByComparator);
	}

	/**
	* Returns the vehicle groups before and after the current vehicle group in the ordered set where registeredInspectionId = &#63;.
	*
	* @param id the primary key of the current vehicle group
	* @param registeredInspectionId the registered inspection ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle group
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup[] findByRegisteredInspectionId_PrevAndNext(
		long id, long registeredInspectionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence()
				   .findByRegisteredInspectionId_PrevAndNext(id,
			registeredInspectionId, orderByComparator);
	}

	/**
	* Removes all the vehicle groups where registeredInspectionId = &#63; from the database.
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
	* Returns the number of vehicle groups where registeredInspectionId = &#63;.
	*
	* @param registeredInspectionId the registered inspection ID
	* @return the number of matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByRegisteredInspectionId(long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByRegisteredInspectionId(registeredInspectionId);
	}

	/**
	* Returns all the vehicle groups where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByHoSoThuTucId(
		long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns a range of all the vehicle groups where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of vehicle groups
	* @param end the upper bound of the range of vehicle groups (not inclusive)
	* @return the range of matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByHoSoThuTucId(hoSoThuTucId, start, end);
	}

	/**
	* Returns an ordered range of all the vehicle groups where hoSoThuTucId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param start the lower bound of the range of vehicle groups
	* @param end the upper bound of the range of vehicle groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByHoSoThuTucId(
		long hoSoThuTucId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByHoSoThuTucId(hoSoThuTucId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first vehicle group in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle group
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence()
				   .findByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the first vehicle group in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup fetchByHoSoThuTucId_First(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_First(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last vehicle group in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle group
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence()
				   .findByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the last vehicle group in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup fetchByHoSoThuTucId_Last(
		long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByHoSoThuTucId_Last(hoSoThuTucId, orderByComparator);
	}

	/**
	* Returns the vehicle groups before and after the current vehicle group in the ordered set where hoSoThuTucId = &#63;.
	*
	* @param id the primary key of the current vehicle group
	* @param hoSoThuTucId the ho so thu tuc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle group
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup[] findByHoSoThuTucId_PrevAndNext(
		long id, long hoSoThuTucId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence()
				   .findByHoSoThuTucId_PrevAndNext(id, hoSoThuTucId,
			orderByComparator);
	}

	/**
	* Removes all the vehicle groups where hoSoThuTucId = &#63; from the database.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns the number of vehicle groups where hoSoThuTucId = &#63;.
	*
	* @param hoSoThuTucId the ho so thu tuc ID
	* @return the number of matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByHoSoThuTucId(long hoSoThuTucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	* Returns all the vehicle groups where technicalSpecCode = &#63;.
	*
	* @param technicalSpecCode the technical spec code
	* @return the matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByTechnicalSpecCode(
		java.lang.String technicalSpecCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTechnicalSpecCode(technicalSpecCode);
	}

	/**
	* Returns a range of all the vehicle groups where technicalSpecCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param technicalSpecCode the technical spec code
	* @param start the lower bound of the range of vehicle groups
	* @param end the upper bound of the range of vehicle groups (not inclusive)
	* @return the range of matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByTechnicalSpecCode(
		java.lang.String technicalSpecCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTechnicalSpecCode(technicalSpecCode, start, end);
	}

	/**
	* Returns an ordered range of all the vehicle groups where technicalSpecCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param technicalSpecCode the technical spec code
	* @param start the lower bound of the range of vehicle groups
	* @param end the upper bound of the range of vehicle groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByTechnicalSpecCode(
		java.lang.String technicalSpecCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTechnicalSpecCode(technicalSpecCode, start, end,
			orderByComparator);
	}

	/**
	* Returns the first vehicle group in the ordered set where technicalSpecCode = &#63;.
	*
	* @param technicalSpecCode the technical spec code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle group
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findByTechnicalSpecCode_First(
		java.lang.String technicalSpecCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence()
				   .findByTechnicalSpecCode_First(technicalSpecCode,
			orderByComparator);
	}

	/**
	* Returns the first vehicle group in the ordered set where technicalSpecCode = &#63;.
	*
	* @param technicalSpecCode the technical spec code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup fetchByTechnicalSpecCode_First(
		java.lang.String technicalSpecCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTechnicalSpecCode_First(technicalSpecCode,
			orderByComparator);
	}

	/**
	* Returns the last vehicle group in the ordered set where technicalSpecCode = &#63;.
	*
	* @param technicalSpecCode the technical spec code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle group
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findByTechnicalSpecCode_Last(
		java.lang.String technicalSpecCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence()
				   .findByTechnicalSpecCode_Last(technicalSpecCode,
			orderByComparator);
	}

	/**
	* Returns the last vehicle group in the ordered set where technicalSpecCode = &#63;.
	*
	* @param technicalSpecCode the technical spec code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup fetchByTechnicalSpecCode_Last(
		java.lang.String technicalSpecCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTechnicalSpecCode_Last(technicalSpecCode,
			orderByComparator);
	}

	/**
	* Returns the vehicle groups before and after the current vehicle group in the ordered set where technicalSpecCode = &#63;.
	*
	* @param id the primary key of the current vehicle group
	* @param technicalSpecCode the technical spec code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle group
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup[] findByTechnicalSpecCode_PrevAndNext(
		long id, java.lang.String technicalSpecCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence()
				   .findByTechnicalSpecCode_PrevAndNext(id, technicalSpecCode,
			orderByComparator);
	}

	/**
	* Removes all the vehicle groups where technicalSpecCode = &#63; from the database.
	*
	* @param technicalSpecCode the technical spec code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTechnicalSpecCode(
		java.lang.String technicalSpecCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTechnicalSpecCode(technicalSpecCode);
	}

	/**
	* Returns the number of vehicle groups where technicalSpecCode = &#63;.
	*
	* @param technicalSpecCode the technical spec code
	* @return the number of matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTechnicalSpecCode(
		java.lang.String technicalSpecCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTechnicalSpecCode(technicalSpecCode);
	}

	/**
	* Returns the vehicle group where technicalSpecCode = &#63; and registeredInspectionId = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException} if it could not be found.
	*
	* @param technicalSpecCode the technical spec code
	* @param registeredInspectionId the registered inspection ID
	* @return the matching vehicle group
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findByTechnicalSpecCodeAndRegisteredInspectionId(
		java.lang.String technicalSpecCode, long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence()
				   .findByTechnicalSpecCodeAndRegisteredInspectionId(technicalSpecCode,
			registeredInspectionId);
	}

	/**
	* Returns the vehicle group where technicalSpecCode = &#63; and registeredInspectionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param technicalSpecCode the technical spec code
	* @param registeredInspectionId the registered inspection ID
	* @return the matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup fetchByTechnicalSpecCodeAndRegisteredInspectionId(
		java.lang.String technicalSpecCode, long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTechnicalSpecCodeAndRegisteredInspectionId(technicalSpecCode,
			registeredInspectionId);
	}

	/**
	* Returns the vehicle group where technicalSpecCode = &#63; and registeredInspectionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param technicalSpecCode the technical spec code
	* @param registeredInspectionId the registered inspection ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching vehicle group, or <code>null</code> if a matching vehicle group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup fetchByTechnicalSpecCodeAndRegisteredInspectionId(
		java.lang.String technicalSpecCode, long registeredInspectionId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByTechnicalSpecCodeAndRegisteredInspectionId(technicalSpecCode,
			registeredInspectionId, retrieveFromCache);
	}

	/**
	* Removes the vehicle group where technicalSpecCode = &#63; and registeredInspectionId = &#63; from the database.
	*
	* @param technicalSpecCode the technical spec code
	* @param registeredInspectionId the registered inspection ID
	* @return the vehicle group that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup removeByTechnicalSpecCodeAndRegisteredInspectionId(
		java.lang.String technicalSpecCode, long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence()
				   .removeByTechnicalSpecCodeAndRegisteredInspectionId(technicalSpecCode,
			registeredInspectionId);
	}

	/**
	* Returns the number of vehicle groups where technicalSpecCode = &#63; and registeredInspectionId = &#63;.
	*
	* @param technicalSpecCode the technical spec code
	* @param registeredInspectionId the registered inspection ID
	* @return the number of matching vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTechnicalSpecCodeAndRegisteredInspectionId(
		java.lang.String technicalSpecCode, long registeredInspectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .countByTechnicalSpecCodeAndRegisteredInspectionId(technicalSpecCode,
			registeredInspectionId);
	}

	/**
	* Caches the vehicle group in the entity cache if it is enabled.
	*
	* @param vehicleGroup the vehicle group
	*/
	public static void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup vehicleGroup) {
		getPersistence().cacheResult(vehicleGroup);
	}

	/**
	* Caches the vehicle groups in the entity cache if it is enabled.
	*
	* @param vehicleGroups the vehicle groups
	*/
	public static void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> vehicleGroups) {
		getPersistence().cacheResult(vehicleGroups);
	}

	/**
	* Creates a new vehicle group with the primary key. Does not add the vehicle group to the database.
	*
	* @param id the primary key for the new vehicle group
	* @return the new vehicle group
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vehicle group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle group
	* @return the vehicle group that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence().remove(id);
	}

	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup vehicleGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(vehicleGroup);
	}

	/**
	* Returns the vehicle group with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException} if it could not be found.
	*
	* @param id the primary key of the vehicle group
	* @return the vehicle group
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException if a vehicle group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vehicle group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vehicle group
	* @return the vehicle group, or <code>null</code> if a vehicle group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the vehicle groups.
	*
	* @return the vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vehicle groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle groups
	* @param end the upper bound of the range of vehicle groups (not inclusive)
	* @return the range of vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vehicle groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle groups
	* @param end the upper bound of the range of vehicle groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the vehicle groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vehicle groups.
	*
	* @return the number of vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static VehicleGroupPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (VehicleGroupPersistence)PortletBeanLocatorUtil.locate(vn.dtt.gt.dk.dao.nghiepvu.service.ClpSerializer.getServletContextName(),
					VehicleGroupPersistence.class.getName());

			ReferenceRegistry.registerReference(VehicleGroupUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(VehicleGroupPersistence persistence) {
	}

	private static VehicleGroupPersistence _persistence;
}