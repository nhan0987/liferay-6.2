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
 * Provides a wrapper for {@link VehicleGroupSpecLocalService}.
 *
 * @author huymq
 * @see VehicleGroupSpecLocalService
 * @generated
 */
public class VehicleGroupSpecLocalServiceWrapper
	implements VehicleGroupSpecLocalService,
		ServiceWrapper<VehicleGroupSpecLocalService> {
	public VehicleGroupSpecLocalServiceWrapper(
		VehicleGroupSpecLocalService vehicleGroupSpecLocalService) {
		_vehicleGroupSpecLocalService = vehicleGroupSpecLocalService;
	}

	/**
	* Adds the vehicle group spec to the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleGroupSpec the vehicle group spec
	* @return the vehicle group spec that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec addVehicleGroupSpec(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec vehicleGroupSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupSpecLocalService.addVehicleGroupSpec(vehicleGroupSpec);
	}

	/**
	* Creates a new vehicle group spec with the primary key. Does not add the vehicle group spec to the database.
	*
	* @param id the primary key for the new vehicle group spec
	* @return the new vehicle group spec
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec createVehicleGroupSpec(
		long id) {
		return _vehicleGroupSpecLocalService.createVehicleGroupSpec(id);
	}

	/**
	* Deletes the vehicle group spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle group spec
	* @return the vehicle group spec that was removed
	* @throws PortalException if a vehicle group spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec deleteVehicleGroupSpec(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupSpecLocalService.deleteVehicleGroupSpec(id);
	}

	/**
	* Deletes the vehicle group spec from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleGroupSpec the vehicle group spec
	* @return the vehicle group spec that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec deleteVehicleGroupSpec(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec vehicleGroupSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupSpecLocalService.deleteVehicleGroupSpec(vehicleGroupSpec);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vehicleGroupSpecLocalService.dynamicQuery();
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
		return _vehicleGroupSpecLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehicleGroupSpecLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehicleGroupSpecLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _vehicleGroupSpecLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vehicleGroupSpecLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec fetchVehicleGroupSpec(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupSpecLocalService.fetchVehicleGroupSpec(id);
	}

	/**
	* Returns the vehicle group spec with the primary key.
	*
	* @param id the primary key of the vehicle group spec
	* @return the vehicle group spec
	* @throws PortalException if a vehicle group spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec getVehicleGroupSpec(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupSpecLocalService.getVehicleGroupSpec(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupSpecLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vehicle group specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle group specs
	* @param end the upper bound of the range of vehicle group specs (not inclusive)
	* @return the range of vehicle group specs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec> getVehicleGroupSpecs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupSpecLocalService.getVehicleGroupSpecs(start, end);
	}

	/**
	* Returns the number of vehicle group specs.
	*
	* @return the number of vehicle group specs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVehicleGroupSpecsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupSpecLocalService.getVehicleGroupSpecsCount();
	}

	/**
	* Updates the vehicle group spec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehicleGroupSpec the vehicle group spec
	* @return the vehicle group spec that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec updateVehicleGroupSpec(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroupSpec vehicleGroupSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupSpecLocalService.updateVehicleGroupSpec(vehicleGroupSpec);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vehicleGroupSpecLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vehicleGroupSpecLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vehicleGroupSpecLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VehicleGroupSpecLocalService getWrappedVehicleGroupSpecLocalService() {
		return _vehicleGroupSpecLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVehicleGroupSpecLocalService(
		VehicleGroupSpecLocalService vehicleGroupSpecLocalService) {
		_vehicleGroupSpecLocalService = vehicleGroupSpecLocalService;
	}

	@Override
	public VehicleGroupSpecLocalService getWrappedService() {
		return _vehicleGroupSpecLocalService;
	}

	@Override
	public void setWrappedService(
		VehicleGroupSpecLocalService vehicleGroupSpecLocalService) {
		_vehicleGroupSpecLocalService = vehicleGroupSpecLocalService;
	}

	private VehicleGroupSpecLocalService _vehicleGroupSpecLocalService;
}