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

package vn.dtt.gt.dk.dao.nghiepvu.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VehicleGroupInitialLocalService}.
 *
 * @author huymq
 * @see VehicleGroupInitialLocalService
 * @generated
 */
public class VehicleGroupInitialLocalServiceWrapper
	implements VehicleGroupInitialLocalService,
		ServiceWrapper<VehicleGroupInitialLocalService> {
	public VehicleGroupInitialLocalServiceWrapper(
		VehicleGroupInitialLocalService vehicleGroupInitialLocalService) {
		_vehicleGroupInitialLocalService = vehicleGroupInitialLocalService;
	}

	/**
	* Adds the vehicle group initial to the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleGroupInitial the vehicle group initial
	* @return the vehicle group initial that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial addVehicleGroupInitial(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial vehicleGroupInitial)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.addVehicleGroupInitial(vehicleGroupInitial);
	}

	/**
	* Creates a new vehicle group initial with the primary key. Does not add the vehicle group initial to the database.
	*
	* @param id the primary key for the new vehicle group initial
	* @return the new vehicle group initial
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial createVehicleGroupInitial(
		long id) {
		return _vehicleGroupInitialLocalService.createVehicleGroupInitial(id);
	}

	/**
	* Deletes the vehicle group initial with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle group initial
	* @return the vehicle group initial that was removed
	* @throws PortalException if a vehicle group initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial deleteVehicleGroupInitial(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.deleteVehicleGroupInitial(id);
	}

	/**
	* Deletes the vehicle group initial from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleGroupInitial the vehicle group initial
	* @return the vehicle group initial that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial deleteVehicleGroupInitial(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial vehicleGroupInitial)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.deleteVehicleGroupInitial(vehicleGroupInitial);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vehicleGroupInitialLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial fetchVehicleGroupInitial(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.fetchVehicleGroupInitial(id);
	}

	/**
	* Returns the vehicle group initial with the primary key.
	*
	* @param id the primary key of the vehicle group initial
	* @return the vehicle group initial
	* @throws PortalException if a vehicle group initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial getVehicleGroupInitial(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.getVehicleGroupInitial(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial> getVehicleGroupInitials(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.getVehicleGroupInitials(start,
			end);
	}

	/**
	* Returns the number of vehicle group initials.
	*
	* @return the number of vehicle group initials
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVehicleGroupInitialsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.getVehicleGroupInitialsCount();
	}

	/**
	* Updates the vehicle group initial in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehicleGroupInitial the vehicle group initial
	* @return the vehicle group initial that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial updateVehicleGroupInitial(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupInitial vehicleGroupInitial)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupInitialLocalService.updateVehicleGroupInitial(vehicleGroupInitial);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vehicleGroupInitialLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vehicleGroupInitialLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vehicleGroupInitialLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public boolean deleteVehicleGroupInitialWithRegisteredInspectionId(
		long registeredInspectionId) {
		return _vehicleGroupInitialLocalService.deleteVehicleGroupInitialWithRegisteredInspectionId(registeredInspectionId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VehicleGroupInitialLocalService getWrappedVehicleGroupInitialLocalService() {
		return _vehicleGroupInitialLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVehicleGroupInitialLocalService(
		VehicleGroupInitialLocalService vehicleGroupInitialLocalService) {
		_vehicleGroupInitialLocalService = vehicleGroupInitialLocalService;
	}

	@Override
	public VehicleGroupInitialLocalService getWrappedService() {
		return _vehicleGroupInitialLocalService;
	}

	@Override
	public void setWrappedService(
		VehicleGroupInitialLocalService vehicleGroupInitialLocalService) {
		_vehicleGroupInitialLocalService = vehicleGroupInitialLocalService;
	}

	private VehicleGroupInitialLocalService _vehicleGroupInitialLocalService;
}