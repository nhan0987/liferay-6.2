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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial;

/**
 * The persistence interface for the vehiclerecord initial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author win_64
 * @see VehiclerecordInitialPersistenceImpl
 * @see VehiclerecordInitialUtil
 * @generated
 */
public interface VehiclerecordInitialPersistence extends BasePersistence<VehiclerecordInitial> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VehiclerecordInitialUtil} to access the vehiclerecord initial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vehiclerecord initials where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the matching vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByVehicleGroupId(
		long vehicleGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByVehicleGroupId(
		long vehicleGroupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehiclerecord initial
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException;

	/**
	* Returns the first vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByVehicleGroupId_First(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehiclerecord initial
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException;

	/**
	* Returns the last vehiclerecord initial in the ordered set where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByVehicleGroupId_Last(
		long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial[] findByVehicleGroupId_PrevAndNext(
		long id, long vehicleGroupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException;

	/**
	* Removes all the vehiclerecord initials where vehicleGroupId = &#63; from the database.
	*
	* @param vehicleGroupId the vehicle group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehiclerecord initials where vehicleGroupId = &#63;.
	*
	* @param vehicleGroupId the vehicle group ID
	* @return the number of matching vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public int countByVehicleGroupId(long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehiclerecord initial where codeNumber = &#63; or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException} if it could not be found.
	*
	* @param codeNumber the code number
	* @return the matching vehiclerecord initial
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException;

	/**
	* Returns the vehiclerecord initial where codeNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param codeNumber the code number
	* @return the matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehiclerecord initial where codeNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param codeNumber the code number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching vehiclerecord initial, or <code>null</code> if a matching vehiclerecord initial could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByCodeNumber(
		long codeNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the vehiclerecord initial where codeNumber = &#63; from the database.
	*
	* @param codeNumber the code number
	* @return the vehiclerecord initial that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial removeByCodeNumber(
		long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException;

	/**
	* Returns the number of vehiclerecord initials where codeNumber = &#63;.
	*
	* @param codeNumber the code number
	* @return the number of matching vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public int countByCodeNumber(long codeNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the vehiclerecord initial in the entity cache if it is enabled.
	*
	* @param vehiclerecordInitial the vehiclerecord initial
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial vehiclerecordInitial);

	/**
	* Caches the vehiclerecord initials in the entity cache if it is enabled.
	*
	* @param vehiclerecordInitials the vehiclerecord initials
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> vehiclerecordInitials);

	/**
	* Creates a new vehiclerecord initial with the primary key. Does not add the vehiclerecord initial to the database.
	*
	* @param id the primary key for the new vehiclerecord initial
	* @return the new vehiclerecord initial
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial create(long id);

	/**
	* Removes the vehiclerecord initial with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehiclerecord initial
	* @return the vehiclerecord initial that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a vehiclerecord initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial vehiclerecordInitial)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehiclerecord initial with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException} if it could not be found.
	*
	* @param id the primary key of the vehiclerecord initial
	* @return the vehiclerecord initial
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException if a vehiclerecord initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehiclerecordInitialException;

	/**
	* Returns the vehiclerecord initial with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vehiclerecord initial
	* @return the vehiclerecord initial, or <code>null</code> if a vehiclerecord initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehiclerecord initials.
	*
	* @return the vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vehiclerecord initials from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehiclerecord initials.
	*
	* @return the number of vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}