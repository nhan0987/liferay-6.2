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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification;

/**
 * The persistence interface for the vehicle specification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see VehicleSpecificationPersistenceImpl
 * @see VehicleSpecificationUtil
 * @generated
 */
public interface VehicleSpecificationPersistence extends BasePersistence<VehicleSpecification> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VehicleSpecificationUtil} to access the vehicle specification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vehicle specifications where specificationCode = &#63;.
	*
	* @param specificationCode the specification code
	* @return the matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findBySpecificationCode(
		java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle specifications where specificationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationCode the specification code
	* @param start the lower bound of the range of vehicle specifications
	* @param end the upper bound of the range of vehicle specifications (not inclusive)
	* @return the range of matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findBySpecificationCode(
		java.lang.String specificationCode, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle specifications where specificationCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param specificationCode the specification code
	* @param start the lower bound of the range of vehicle specifications
	* @param end the upper bound of the range of vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findBySpecificationCode(
		java.lang.String specificationCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle specification in the ordered set where specificationCode = &#63;.
	*
	* @param specificationCode the specification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification findBySpecificationCode_First(
		java.lang.String specificationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Returns the first vehicle specification in the ordered set where specificationCode = &#63;.
	*
	* @param specificationCode the specification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification fetchBySpecificationCode_First(
		java.lang.String specificationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle specification in the ordered set where specificationCode = &#63;.
	*
	* @param specificationCode the specification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification findBySpecificationCode_Last(
		java.lang.String specificationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Returns the last vehicle specification in the ordered set where specificationCode = &#63;.
	*
	* @param specificationCode the specification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification fetchBySpecificationCode_Last(
		java.lang.String specificationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle specifications before and after the current vehicle specification in the ordered set where specificationCode = &#63;.
	*
	* @param id the primary key of the current vehicle specification
	* @param specificationCode the specification code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification[] findBySpecificationCode_PrevAndNext(
		long id, java.lang.String specificationCode,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Removes all the vehicle specifications where specificationCode = &#63; from the database.
	*
	* @param specificationCode the specification code
	* @throws SystemException if a system exception occurred
	*/
	public void removeBySpecificationCode(java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle specifications where specificationCode = &#63;.
	*
	* @param specificationCode the specification code
	* @return the number of matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public int countBySpecificationCode(java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle specifications where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findByInspectionRecordId(
		long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle specifications where inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of vehicle specifications
	* @param end the upper bound of the range of vehicle specifications (not inclusive)
	* @return the range of matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findByInspectionRecordId(
		long inspectionRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle specifications where inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of vehicle specifications
	* @param end the upper bound of the range of vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findByInspectionRecordId(
		long inspectionRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle specification in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification findByInspectionRecordId_First(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Returns the first vehicle specification in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification fetchByInspectionRecordId_First(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle specification in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification findByInspectionRecordId_Last(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Returns the last vehicle specification in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification fetchByInspectionRecordId_Last(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle specifications before and after the current vehicle specification in the ordered set where inspectionRecordId = &#63;.
	*
	* @param id the primary key of the current vehicle specification
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification[] findByInspectionRecordId_PrevAndNext(
		long id, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Removes all the vehicle specifications where inspectionRecordId = &#63; from the database.
	*
	* @param inspectionRecordId the inspection record ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByInspectionRecordId(long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle specifications where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the number of matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectionRecordId(long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle specifications where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle specifications where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of vehicle specifications
	* @param end the upper bound of the range of vehicle specifications (not inclusive)
	* @return the range of matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findByVehicleGroupId(
		long vehicleGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle specifications where vehicleGroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleGroupId the vehicle group ID
	* @param start the lower bound of the range of vehicle specifications
	* @param end the upper bound of the range of vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehicle specification in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification findByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Returns the first vehicle specification in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification fetchByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehicle specification in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification findByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Returns the last vehicle specification in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification fetchByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle specifications before and after the current vehicle specification in the ordered set where vehicleGroupId = &#63;.
	*
	* @param id the primary key of the current vehicle specification
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vehicle specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Removes all the vehicle specifications where vehicleGroupId = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle specifications where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the number of matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public int countByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle specification where vehicleGroupId = &#63; and specificationCode = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException} if it could not be found.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param specificationCode the specification code
	* @return the matching vehicle specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification findByVehicleGroupIdSpecificationCode(
		long vehicleGroupId, java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Returns the vehicle specification where vehicleGroupId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param specificationCode the specification code
	* @return the matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification fetchByVehicleGroupIdSpecificationCode(
		long vehicleGroupId, java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle specification where vehicleGroupId = &#63; and specificationCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param specificationCode the specification code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching vehicle specification, or <code>null</code> if a matching vehicle specification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification fetchByVehicleGroupIdSpecificationCode(
		long vehicleGroupId, java.lang.String specificationCode,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the vehicle specification where vehicleGroupId = &#63; and specificationCode = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param specificationCode the specification code
	* @return the vehicle specification that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification removeByVehicleGroupIdSpecificationCode(
		long vehicleGroupId, java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Returns the number of vehicle specifications where vehicleGroupId = &#63; and specificationCode = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param specificationCode the specification code
	* @return the number of matching vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public int countByVehicleGroupIdSpecificationCode(long vehicleGroupId,
		java.lang.String specificationCode)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the vehicle specification in the entity cache if it is enabled.
	*
	* @param vehicleSpecification the vehicle specification
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification vehicleSpecification);

	/**
	* Caches the vehicle specifications in the entity cache if it is enabled.
	*
	* @param vehicleSpecifications the vehicle specifications
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> vehicleSpecifications);

	/**
	* Creates a new vehicle specification with the primary key. Does not add the vehicle specification to the database.
	*
	* @param id the primary key for the new vehicle specification
	* @return the new vehicle specification
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification create(long id);

	/**
	* Removes the vehicle specification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle specification
	* @return the vehicle specification that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification vehicleSpecification)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle specification with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException} if it could not be found.
	*
	* @param id the primary key of the vehicle specification
	* @return the vehicle specification
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException if a vehicle specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleSpecificationException;

	/**
	* Returns the vehicle specification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vehicle specification
	* @return the vehicle specification, or <code>null</code> if a vehicle specification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle specifications.
	*
	* @return the vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle specifications
	* @param end the upper bound of the range of vehicle specifications (not inclusive)
	* @return the range of vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle specifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleSpecificationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle specifications
	* @param end the upper bound of the range of vehicle specifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleSpecification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vehicle specifications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle specifications.
	*
	* @return the number of vehicle specifications
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}