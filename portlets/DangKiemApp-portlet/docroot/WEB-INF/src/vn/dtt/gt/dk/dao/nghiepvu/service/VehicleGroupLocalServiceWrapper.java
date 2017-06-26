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
 * Provides a wrapper for {@link VehicleGroupLocalService}.
 *
 * @author win_64
 * @see VehicleGroupLocalService
 * @generated
 */
public class VehicleGroupLocalServiceWrapper implements VehicleGroupLocalService,
	ServiceWrapper<VehicleGroupLocalService> {
	public VehicleGroupLocalServiceWrapper(
		VehicleGroupLocalService vehicleGroupLocalService) {
		_vehicleGroupLocalService = vehicleGroupLocalService;
	}

	/**
	* Adds the vehicle group to the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleGroup the vehicle group
	* @return the vehicle group that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup addVehicleGroup(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup vehicleGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupLocalService.addVehicleGroup(vehicleGroup);
	}

	/**
	* Creates a new vehicle group with the primary key. Does not add the vehicle group to the database.
	*
	* @param id the primary key for the new vehicle group
	* @return the new vehicle group
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup createVehicleGroup(
		long id) {
		return _vehicleGroupLocalService.createVehicleGroup(id);
	}

	/**
	* Deletes the vehicle group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehicle group
	* @return the vehicle group that was removed
	* @throws PortalException if a vehicle group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup deleteVehicleGroup(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupLocalService.deleteVehicleGroup(id);
	}

	/**
	* Deletes the vehicle group from the database. Also notifies the appropriate model listeners.
	*
	* @param vehicleGroup the vehicle group
	* @return the vehicle group that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup deleteVehicleGroup(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup vehicleGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupLocalService.deleteVehicleGroup(vehicleGroup);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vehicleGroupLocalService.dynamicQuery();
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
		return _vehicleGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehicleGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehicleGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehicleGroupLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _vehicleGroupLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vehicleGroupLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup fetchVehicleGroup(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupLocalService.fetchVehicleGroup(id);
	}

	/**
	* Returns the vehicle group with the primary key.
	*
	* @param id the primary key of the vehicle group
	* @return the vehicle group
	* @throws PortalException if a vehicle group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup getVehicleGroup(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupLocalService.getVehicleGroup(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> getVehicleGroups(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupLocalService.getVehicleGroups(start, end);
	}

	/**
	* Returns the number of vehicle groups.
	*
	* @return the number of vehicle groups
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVehicleGroupsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupLocalService.getVehicleGroupsCount();
	}

	/**
	* Updates the vehicle group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehicleGroup the vehicle group
	* @return the vehicle group that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup updateVehicleGroup(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup vehicleGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehicleGroupLocalService.updateVehicleGroup(vehicleGroup);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vehicleGroupLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vehicleGroupLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vehicleGroupLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByRegisteredInspectionId(
		long registeredInspectionId) {
		return _vehicleGroupLocalService.findByRegisteredInspectionId(registeredInspectionId);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo getThtcNoiDungHoSoByVehicleGroupId(
		long vehicleGroupId) {
		return _vehicleGroupLocalService.getThtcNoiDungHoSoByVehicleGroupId(vehicleGroupId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByTechnicalSpecCode(
		java.lang.String technicalSpecCode) {
		return _vehicleGroupLocalService.findByTechnicalSpecCode(technicalSpecCode);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup findByTechnicalSpecCodeAndRegisteredInspectionId(
		java.lang.String technicalSpecCode, long registeredInspectionId) {
		return _vehicleGroupLocalService.findByTechnicalSpecCodeAndRegisteredInspectionId(technicalSpecCode,
			registeredInspectionId);
	}

	@Override
	public boolean deleteVehicleGroupWithRegisteredInspectionId(
		long registeredInspectionId) {
		return _vehicleGroupLocalService.deleteVehicleGroupWithRegisteredInspectionId(registeredInspectionId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehicleGroup> findByIdHoSoThuTuc(
		long idHoSoThuTuc) {
		return _vehicleGroupLocalService.findByIdHoSoThuTuc(idHoSoThuTuc);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VehicleGroupLocalService getWrappedVehicleGroupLocalService() {
		return _vehicleGroupLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVehicleGroupLocalService(
		VehicleGroupLocalService vehicleGroupLocalService) {
		_vehicleGroupLocalService = vehicleGroupLocalService;
	}

	@Override
	public VehicleGroupLocalService getWrappedService() {
		return _vehicleGroupLocalService;
	}

	@Override
	public void setWrappedService(
		VehicleGroupLocalService vehicleGroupLocalService) {
		_vehicleGroupLocalService = vehicleGroupLocalService;
	}

	private VehicleGroupLocalService _vehicleGroupLocalService;
}