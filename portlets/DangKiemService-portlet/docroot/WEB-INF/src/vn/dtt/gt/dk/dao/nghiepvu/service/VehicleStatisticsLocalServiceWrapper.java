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
 * Provides a wrapper for {@link VehicleStatisticsLocalService}.
 *
 * @author huymq
 * @see VehicleStatisticsLocalService
 * @generated
 */
public class VehicleStatisticsLocalServiceWrapper
	implements VehicleStatisticsLocalService,
		ServiceWrapper<VehicleStatisticsLocalService> {
	public VehicleStatisticsLocalServiceWrapper(
		VehicleStatisticsLocalService vehicleStatisticsLocalService) {
		_vehicleStatisticsLocalService = vehicleStatisticsLocalService;
	}

	/**
	* Adds the vehicle statistics to the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleStatistics the vehicle statistics
	* @return the vehicle statistics that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics addVehicleStatistics(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics vehicleStatistics)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleStatisticsLocalService.addVehicleStatistics(vehicleStatistics);
	}

	/**
	* Creates a new vehicle statistics with the primary key. Does not add the vehicle statistics to the database.
	*
	* @param id the primary key for the new vehicle statistics
	* @return the new vehicle statistics
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics createVehicleStatistics(
		long id) {
		return _vehicleStatisticsLocalService.createVehicleStatistics(id);
	}

	/**
	* Deletes the vehicle statistics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle statistics
	* @return the vehicle statistics that was removed
	* @throws PortalException if a vehicle statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics deleteVehicleStatistics(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleStatisticsLocalService.deleteVehicleStatistics(id);
	}

	/**
	* Deletes the vehicle statistics from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleStatistics the vehicle statistics
	* @return the vehicle statistics that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics deleteVehicleStatistics(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics vehicleStatistics)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleStatisticsLocalService.deleteVehicleStatistics(vehicleStatistics);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vehicleStatisticsLocalService.dynamicQuery();
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
		return _vehicleStatisticsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehicleStatisticsLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleStatisticsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehicleStatisticsLocalService.dynamicQuery(dynamicQuery, start,
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
		return _vehicleStatisticsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vehicleStatisticsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics fetchVehicleStatistics(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleStatisticsLocalService.fetchVehicleStatistics(id);
	}

	/**
	* Returns the vehicle statistics with the primary key.
	*
	* @param id the primary key of the vehicle statistics
	* @return the vehicle statistics
	* @throws PortalException if a vehicle statistics with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics getVehicleStatistics(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleStatisticsLocalService.getVehicleStatistics(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleStatisticsLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics> getVehicleStatisticses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleStatisticsLocalService.getVehicleStatisticses(start, end);
	}

	/**
	* Returns the number of vehicle statisticses.
	*
	* @return the number of vehicle statisticses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVehicleStatisticsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleStatisticsLocalService.getVehicleStatisticsesCount();
	}

	/**
	* Updates the vehicle statistics in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehicleStatistics the vehicle statistics
	* @return the vehicle statistics that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics updateVehicleStatistics(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics vehicleStatistics)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleStatisticsLocalService.updateVehicleStatistics(vehicleStatistics);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vehicleStatisticsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vehicleStatisticsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vehicleStatisticsLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleStatistics findByRegisteredInspectionId(
		long registeredInspectionId) {
		return _vehicleStatisticsLocalService.findByRegisteredInspectionId(registeredInspectionId);
	}

	@Override
	public boolean deleteVehicleStatisticsWithRegisteredInspectionId(
		long registeredInspectionId) {
		return _vehicleStatisticsLocalService.deleteVehicleStatisticsWithRegisteredInspectionId(registeredInspectionId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VehicleStatisticsLocalService getWrappedVehicleStatisticsLocalService() {
		return _vehicleStatisticsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVehicleStatisticsLocalService(
		VehicleStatisticsLocalService vehicleStatisticsLocalService) {
		_vehicleStatisticsLocalService = vehicleStatisticsLocalService;
	}

	@Override
	public VehicleStatisticsLocalService getWrappedService() {
		return _vehicleStatisticsLocalService;
	}

	@Override
	public void setWrappedService(
		VehicleStatisticsLocalService vehicleStatisticsLocalService) {
		_vehicleStatisticsLocalService = vehicleStatisticsLocalService;
	}

	private VehicleStatisticsLocalService _vehicleStatisticsLocalService;
}