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
 * Provides a wrapper for {@link VehicleRecordLocalService}.
 *
 * @author win_64
 * @see VehicleRecordLocalService
 * @generated
 */
public class VehicleRecordLocalServiceWrapper
	implements VehicleRecordLocalService,
		ServiceWrapper<VehicleRecordLocalService> {
	public VehicleRecordLocalServiceWrapper(
		VehicleRecordLocalService vehicleRecordLocalService) {
		_vehicleRecordLocalService = vehicleRecordLocalService;
	}

	/**
	* Adds the vehicle record to the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleRecord the vehicle record
	* @return the vehicle record that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord addVehicleRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleRecordLocalService.addVehicleRecord(vehicleRecord);
	}

	/**
	* Creates a new vehicle record with the primary key. Does not add the vehicle record to the database.
	*
	* @param id the primary key for the new vehicle record
	* @return the new vehicle record
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord createVehicleRecord(
		long id) {
		return _vehicleRecordLocalService.createVehicleRecord(id);
	}

	/**
	* Deletes the vehicle record with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record that was removed
	* @throws PortalException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord deleteVehicleRecord(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleRecordLocalService.deleteVehicleRecord(id);
	}

	/**
	* Deletes the vehicle record from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleRecord the vehicle record
	* @return the vehicle record that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord deleteVehicleRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleRecordLocalService.deleteVehicleRecord(vehicleRecord);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vehicleRecordLocalService.dynamicQuery();
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
		return _vehicleRecordLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehicleRecordLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehicleRecordLocalService.dynamicQuery(dynamicQuery, start,
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
		return _vehicleRecordLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vehicleRecordLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord fetchVehicleRecord(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleRecordLocalService.fetchVehicleRecord(id);
	}

	/**
	* Returns the vehicle record with the primary key.
	*
	* @param id the primary key of the vehicle record
	* @return the vehicle record
	* @throws PortalException if a vehicle record with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord getVehicleRecord(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleRecordLocalService.getVehicleRecord(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleRecordLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the vehicle records.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleRecordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vehicle records
	* @param end the upper bound of the range of vehicle records (not inclusive)
	* @return the range of vehicle records
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord> getVehicleRecords(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleRecordLocalService.getVehicleRecords(start, end);
	}

	/**
	* Returns the number of vehicle records.
	*
	* @return the number of vehicle records
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVehicleRecordsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleRecordLocalService.getVehicleRecordsCount();
	}

	/**
	* Updates the vehicle record in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehicleRecord the vehicle record
	* @return the vehicle record that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord updateVehicleRecord(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleRecord vehicleRecord)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleRecordLocalService.updateVehicleRecord(vehicleRecord);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vehicleRecordLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vehicleRecordLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vehicleRecordLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VehicleRecordLocalService getWrappedVehicleRecordLocalService() {
		return _vehicleRecordLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVehicleRecordLocalService(
		VehicleRecordLocalService vehicleRecordLocalService) {
		_vehicleRecordLocalService = vehicleRecordLocalService;
	}

	@Override
	public VehicleRecordLocalService getWrappedService() {
		return _vehicleRecordLocalService;
	}

	@Override
	public void setWrappedService(
		VehicleRecordLocalService vehicleRecordLocalService) {
		_vehicleRecordLocalService = vehicleRecordLocalService;
	}

	private VehicleRecordLocalService _vehicleRecordLocalService;
}