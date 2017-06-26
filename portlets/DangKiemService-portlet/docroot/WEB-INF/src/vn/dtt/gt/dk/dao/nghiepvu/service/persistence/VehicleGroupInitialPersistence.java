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

import vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial;

/**
 * The persistence interface for the vehicle group initial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see VehicleGroupInitialPersistenceImpl
 * @see VehicleGroupInitialUtil
 * @generated
 */
public interface VehicleGroupInitialPersistence extends BasePersistence<VehicleGroupInitial> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VehicleGroupInitialUtil} to access the vehicle group initial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the vehicle group initial in the entity cache if it is enabled.
	*
	* @param vehicleGroupInitial the vehicle group initial
	*/
	public void cacheResult(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial vehicleGroupInitial);

	/**
	* Caches the vehicle group initials in the entity cache if it is enabled.
	*
	* @param vehicleGroupInitials the vehicle group initials
	*/
	public void cacheResult(
		java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial> vehicleGroupInitials);

	/**
	* Creates a new vehicle group initial with the primary key. Does not add the vehicle group initial to the database.
	*
	* @param id the primary key for the new vehicle group initial
	* @return the new vehicle group initial
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial create(long id);

	/**
	* Removes the vehicle group initial with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle group initial
	* @return the vehicle group initial that was removed
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException if a vehicle group initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException;

	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial updateImpl(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial vehicleGroupInitial)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the vehicle group initial with the primary key or throws a {@link vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException} if it could not be found.
	*
	* @param id the primary key of the vehicle group initial
	* @return the vehicle group initial
	* @throws vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException if a vehicle group initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial findByPrimaryKey(
		long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.dtt.gt.dk.dao.nghiepvu.NoSuchVehicleGroupInitialException;

	/**
	* Returns the vehicle group initial with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vehicle group initial
	* @return the vehicle group initial, or <code>null</code> if a vehicle group initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the vehicle group initials.
	*
	* @return the vehicle group initials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the vehicle group initials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle group initials
	* @param end the upper bound of the range of vehicle group initials (not inclusive)
	* @return the range of vehicle group initials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the vehicle group initials.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle group initials
	* @param end the upper bound of the range of vehicle group initials (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vehicle group initials
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the vehicle group initials from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of vehicle group initials.
	*
	* @return the number of vehicle group initials
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}