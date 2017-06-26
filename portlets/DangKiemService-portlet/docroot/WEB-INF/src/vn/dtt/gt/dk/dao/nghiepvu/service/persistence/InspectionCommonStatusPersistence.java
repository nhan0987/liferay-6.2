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

import vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus;

/**
 * The persistence interface for the inspection common status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see InspectionCommonStatusPersistenceImpl
 * @see InspectionCommonStatusUtil
 * @generated
 */
public interface InspectionCommonStatusPersistence extends BasePersistence<InspectionCommonStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InspectionCommonStatusUtil} to access the inspection common status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the inspection common statuses where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByInspectionRecordId(
		long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the inspection common statuses where inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of inspection common statuses
	* @param end the upper bound of the range of inspection common statuses (not inclusive)
	* @return the range of matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByInspectionRecordId(
		long inspectionRecordId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the inspection common statuses where inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of inspection common statuses
	* @param end the upper bound of the range of inspection common statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByInspectionRecordId(
		long inspectionRecordId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first inspection common status in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection common status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus findByInspectionRecordId_First(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;

	/**
	* Returns the first inspection common status in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus fetchByInspectionRecordId_First(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last inspection common status in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection common status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus findByInspectionRecordId_Last(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;

	/**
	* Returns the last inspection common status in the ordered set where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus fetchByInspectionRecordId_Last(
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the inspection common statuses before and after the current inspection common status in the ordered set where inspectionRecordId = &#63;.
	*
	* @param id the primary key of the current inspection common status
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next inspection common status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus[] findByInspectionRecordId_PrevAndNext(
		long id, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;

	/**
	* Removes all the inspection common statuses where inspectionRecordId = &#63; from the database.
	*
	* @param inspectionRecordId the inspection record ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByInspectionRecordId(long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of inspection common statuses where inspectionRecordId = &#63;.
	*
	* @param inspectionRecordId the inspection record ID
	* @return the number of matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByInspectionRecordId(long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the inspection common statuses where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param type the type
	* @param inspectionRecordId the inspection record ID
	* @return the matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByVehicleClassAndTypeAndInspectionRecordId(
		java.lang.String vehicleClass, long type, long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the inspection common statuses where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param type the type
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of inspection common statuses
	* @param end the upper bound of the range of inspection common statuses (not inclusive)
	* @return the range of matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByVehicleClassAndTypeAndInspectionRecordId(
		java.lang.String vehicleClass, long type, long inspectionRecordId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the inspection common statuses where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param type the type
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of inspection common statuses
	* @param end the upper bound of the range of inspection common statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByVehicleClassAndTypeAndInspectionRecordId(
		java.lang.String vehicleClass, long type, long inspectionRecordId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first inspection common status in the ordered set where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param type the type
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection common status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus findByVehicleClassAndTypeAndInspectionRecordId_First(
		java.lang.String vehicleClass, long type, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;

	/**
	* Returns the first inspection common status in the ordered set where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param type the type
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus fetchByVehicleClassAndTypeAndInspectionRecordId_First(
		java.lang.String vehicleClass, long type, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last inspection common status in the ordered set where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param type the type
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection common status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus findByVehicleClassAndTypeAndInspectionRecordId_Last(
		java.lang.String vehicleClass, long type, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;

	/**
	* Returns the last inspection common status in the ordered set where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param type the type
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus fetchByVehicleClassAndTypeAndInspectionRecordId_Last(
		java.lang.String vehicleClass, long type, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the inspection common statuses before and after the current inspection common status in the ordered set where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	*
	* @param id the primary key of the current inspection common status
	* @param vehicleClass the vehicle class
	* @param type the type
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next inspection common status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus[] findByVehicleClassAndTypeAndInspectionRecordId_PrevAndNext(
		long id, java.lang.String vehicleClass, long type,
		long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;

	/**
	* Removes all the inspection common statuses where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param type the type
	* @param inspectionRecordId the inspection record ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByVehicleClassAndTypeAndInspectionRecordId(
		java.lang.String vehicleClass, long type, long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of inspection common statuses where vehicleClass = &#63; and type = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param type the type
	* @param inspectionRecordId the inspection record ID
	* @return the number of matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByVehicleClassAndTypeAndInspectionRecordId(
		java.lang.String vehicleClass, long type, long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the inspection common statuses where vehicleClass = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param inspectionRecordId the inspection record ID
	* @return the matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByVehicleClassAndInspectionRecordId(
		java.lang.String vehicleClass, long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the inspection common statuses where vehicleClass = &#63; and inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of inspection common statuses
	* @param end the upper bound of the range of inspection common statuses (not inclusive)
	* @return the range of matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByVehicleClassAndInspectionRecordId(
		java.lang.String vehicleClass, long inspectionRecordId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the inspection common statuses where vehicleClass = &#63; and inspectionRecordId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleClass the vehicle class
	* @param inspectionRecordId the inspection record ID
	* @param start the lower bound of the range of inspection common statuses
	* @param end the upper bound of the range of inspection common statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByVehicleClassAndInspectionRecordId(
		java.lang.String vehicleClass, long inspectionRecordId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first inspection common status in the ordered set where vehicleClass = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection common status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus findByVehicleClassAndInspectionRecordId_First(
		java.lang.String vehicleClass, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;

	/**
	* Returns the first inspection common status in the ordered set where vehicleClass = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus fetchByVehicleClassAndInspectionRecordId_First(
		java.lang.String vehicleClass, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last inspection common status in the ordered set where vehicleClass = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection common status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus findByVehicleClassAndInspectionRecordId_Last(
		java.lang.String vehicleClass, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;

	/**
	* Returns the last inspection common status in the ordered set where vehicleClass = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching inspection common status, or <code>null</code> if a matching inspection common status could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus fetchByVehicleClassAndInspectionRecordId_Last(
		java.lang.String vehicleClass, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the inspection common statuses before and after the current inspection common status in the ordered set where vehicleClass = &#63; and inspectionRecordId = &#63;.
	*
	* @param id the primary key of the current inspection common status
	* @param vehicleClass the vehicle class
	* @param inspectionRecordId the inspection record ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next inspection common status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus[] findByVehicleClassAndInspectionRecordId_PrevAndNext(
		long id, java.lang.String vehicleClass, long inspectionRecordId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;

	/**
	* Removes all the inspection common statuses where vehicleClass = &#63; and inspectionRecordId = &#63; from the database.
	*
	* @param vehicleClass the vehicle class
	* @param inspectionRecordId the inspection record ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByVehicleClassAndInspectionRecordId(
		java.lang.String vehicleClass, long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of inspection common statuses where vehicleClass = &#63; and inspectionRecordId = &#63;.
	*
	* @param vehicleClass the vehicle class
	* @param inspectionRecordId the inspection record ID
	* @return the number of matching inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countByVehicleClassAndInspectionRecordId(
		java.lang.String vehicleClass, long inspectionRecordId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the inspection common status in the entity cache if it is enabled.
	*
	* @param inspectionCommonStatus the inspection common status
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus inspectionCommonStatus);

	/**
	* Caches the inspection common statuses in the entity cache if it is enabled.
	*
	* @param inspectionCommonStatuses the inspection common statuses
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> inspectionCommonStatuses);

	/**
	* Creates a new inspection common status with the primary key. Does not add the inspection common status to the database.
	*
	* @param id the primary key for the new inspection common status
	* @return the new inspection common status
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus create(
		long id);

	/**
	* Removes the inspection common status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the inspection common status
	* @return the inspection common status that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus remove(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus inspectionCommonStatus)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the inspection common status with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException} if it could not be found.
	*
	* @param id the primary key of the inspection common status
	* @return the inspection common status
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException if a inspection common status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchInspectionCommonStatusException;

	/**
	* Returns the inspection common status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the inspection common status
	* @return the inspection common status, or <code>null</code> if a inspection common status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the inspection common statuses.
	*
	* @return the inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the inspection common statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of inspection common statuses
	* @param end the upper bound of the range of inspection common statuses (not inclusive)
	* @return the range of inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the inspection common statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of inspection common statuses
	* @param end the upper bound of the range of inspection common statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the inspection common statuses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of inspection common statuses.
	*
	* @return the number of inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}