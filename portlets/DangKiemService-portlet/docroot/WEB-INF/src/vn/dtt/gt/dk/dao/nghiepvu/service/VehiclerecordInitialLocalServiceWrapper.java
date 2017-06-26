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
 * Provides a wrapper for {@link VehiclerecordInitialLocalService}.
 *
 * @author huymq
 * @see VehiclerecordInitialLocalService
 * @generated
 */
public class VehiclerecordInitialLocalServiceWrapper
	implements VehiclerecordInitialLocalService,
		ServiceWrapper<VehiclerecordInitialLocalService> {
	public VehiclerecordInitialLocalServiceWrapper(
		VehiclerecordInitialLocalService vehiclerecordInitialLocalService) {
		_vehiclerecordInitialLocalService = vehiclerecordInitialLocalService;
	}

	/**
	* Adds the vehiclerecord initial to the database. Also notifies the appropriate model listeners.
	*
	* @param vehiclerecordInitial the vehiclerecord initial
	* @return the vehiclerecord initial that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial addVehiclerecordInitial(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial vehiclerecordInitial)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehiclerecordInitialLocalService.addVehiclerecordInitial(vehiclerecordInitial);
	}

	/**
	* Creates a new vehiclerecord initial with the primary key. Does not add the vehiclerecord initial to the database.
	*
	* @param id the primary key for the new vehiclerecord initial
	* @return the new vehiclerecord initial
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial createVehiclerecordInitial(
		long id) {
		return _vehiclerecordInitialLocalService.createVehiclerecordInitial(id);
	}

	/**
	* Deletes the vehiclerecord initial with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vehiclerecord initial
	* @return the vehiclerecord initial that was removed
	* @throws PortalException if a vehiclerecord initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial deleteVehiclerecordInitial(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehiclerecordInitialLocalService.deleteVehiclerecordInitial(id);
	}

	/**
	* Deletes the vehiclerecord initial from the database. Also notifies the appropriate model listeners.
	*
	* @param vehiclerecordInitial the vehiclerecord initial
	* @return the vehiclerecord initial that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial deleteVehiclerecordInitial(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial vehiclerecordInitial)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehiclerecordInitialLocalService.deleteVehiclerecordInitial(vehiclerecordInitial);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vehiclerecordInitialLocalService.dynamicQuery();
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
		return _vehiclerecordInitialLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehiclerecordInitialLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.VehiclerecordInitialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vehiclerecordInitialLocalService.dynamicQuery(dynamicQuery,
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
		return _vehiclerecordInitialLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vehiclerecordInitialLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial fetchVehiclerecordInitial(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _vehiclerecordInitialLocalService.fetchVehiclerecordInitial(id);
	}

	/**
	* Returns the vehiclerecord initial with the primary key.
	*
	* @param id the primary key of the vehiclerecord initial
	* @return the vehiclerecord initial
	* @throws PortalException if a vehiclerecord initial with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial getVehiclerecordInitial(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehiclerecordInitialLocalService.getVehiclerecordInitial(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vehiclerecordInitialLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> getVehiclerecordInitials(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehiclerecordInitialLocalService.getVehiclerecordInitials(start,
			end);
	}

	/**
	* Returns the number of vehiclerecord initials.
	*
	* @return the number of vehiclerecord initials
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getVehiclerecordInitialsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehiclerecordInitialLocalService.getVehiclerecordInitialsCount();
	}

	/**
	* Updates the vehiclerecord initial in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vehiclerecordInitial the vehiclerecord initial
	* @return the vehiclerecord initial that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial updateVehiclerecordInitial(
		vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial vehiclerecordInitial)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vehiclerecordInitialLocalService.updateVehiclerecordInitial(vehiclerecordInitial);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _vehiclerecordInitialLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_vehiclerecordInitialLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _vehiclerecordInitialLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial findByCodeNumber(
		long codeNumber) {
		return _vehiclerecordInitialLocalService.findByCodeNumber(codeNumber);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByVehicleGroupId(
		long vehicleGroupId) {
		return _vehiclerecordInitialLocalService.findByVehicleGroupId(vehicleGroupId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.VehiclerecordInitial> findByArrayId(
		java.lang.String arrayId) {
		return _vehiclerecordInitialLocalService.findByArrayId(arrayId);
	}

	@Override
	public boolean deleteVehicleRecordInitialWithVehicleGroupId(
		long vehicleGroupId) {
		return _vehiclerecordInitialLocalService.deleteVehicleRecordInitialWithVehicleGroupId(vehicleGroupId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public VehiclerecordInitialLocalService getWrappedVehiclerecordInitialLocalService() {
		return _vehiclerecordInitialLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedVehiclerecordInitialLocalService(
		VehiclerecordInitialLocalService vehiclerecordInitialLocalService) {
		_vehiclerecordInitialLocalService = vehiclerecordInitialLocalService;
	}

	@Override
	public VehiclerecordInitialLocalService getWrappedService() {
		return _vehiclerecordInitialLocalService;
	}

	@Override
	public void setWrappedService(
		VehiclerecordInitialLocalService vehiclerecordInitialLocalService) {
		_vehiclerecordInitialLocalService = vehiclerecordInitialLocalService;
	}

	private VehiclerecordInitialLocalService _vehiclerecordInitialLocalService;
}