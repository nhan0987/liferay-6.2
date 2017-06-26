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
 * Provides a wrapper for {@link InspectionCommonStatusLocalService}.
 *
 * @author win_64
 * @see InspectionCommonStatusLocalService
 * @generated
 */
public class InspectionCommonStatusLocalServiceWrapper
	implements InspectionCommonStatusLocalService,
		ServiceWrapper<InspectionCommonStatusLocalService> {
	public InspectionCommonStatusLocalServiceWrapper(
		InspectionCommonStatusLocalService inspectionCommonStatusLocalService) {
		_inspectionCommonStatusLocalService = inspectionCommonStatusLocalService;
	}

	/**
	* Adds the inspection common status to the database. Also notifies the appropriate model listeners.
	*
	* @param inspectionCommonStatus the inspection common status
	* @return the inspection common status that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus addInspectionCommonStatus(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus inspectionCommonStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionCommonStatusLocalService.addInspectionCommonStatus(inspectionCommonStatus);
	}

	/**
	* Creates a new inspection common status with the primary key. Does not add the inspection common status to the database.
	*
	* @param id the primary key for the new inspection common status
	* @return the new inspection common status
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus createInspectionCommonStatus(
		long id) {
		return _inspectionCommonStatusLocalService.createInspectionCommonStatus(id);
	}

	/**
	* Deletes the inspection common status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the inspection common status
	* @return the inspection common status that was removed
	* @throws PortalException if a inspection common status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus deleteInspectionCommonStatus(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inspectionCommonStatusLocalService.deleteInspectionCommonStatus(id);
	}

	/**
	* Deletes the inspection common status from the database. Also notifies the appropriate model listeners.
	*
	* @param inspectionCommonStatus the inspection common status
	* @return the inspection common status that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus deleteInspectionCommonStatus(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus inspectionCommonStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionCommonStatusLocalService.deleteInspectionCommonStatus(inspectionCommonStatus);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _inspectionCommonStatusLocalService.dynamicQuery();
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
		return _inspectionCommonStatusLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _inspectionCommonStatusLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionCommonStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _inspectionCommonStatusLocalService.dynamicQuery(dynamicQuery,
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
		return _inspectionCommonStatusLocalService.dynamicQueryCount(dynamicQuery);
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
		return _inspectionCommonStatusLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus fetchInspectionCommonStatus(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionCommonStatusLocalService.fetchInspectionCommonStatus(id);
	}

	/**
	* Returns the inspection common status with the primary key.
	*
	* @param id the primary key of the inspection common status
	* @return the inspection common status
	* @throws PortalException if a inspection common status with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus getInspectionCommonStatus(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inspectionCommonStatusLocalService.getInspectionCommonStatus(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inspectionCommonStatusLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> getInspectionCommonStatuses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionCommonStatusLocalService.getInspectionCommonStatuses(start,
			end);
	}

	/**
	* Returns the number of inspection common statuses.
	*
	* @return the number of inspection common statuses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInspectionCommonStatusesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionCommonStatusLocalService.getInspectionCommonStatusesCount();
	}

	/**
	* Updates the inspection common status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param inspectionCommonStatus the inspection common status
	* @return the inspection common status that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus updateInspectionCommonStatus(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus inspectionCommonStatus)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionCommonStatusLocalService.updateInspectionCommonStatus(inspectionCommonStatus);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _inspectionCommonStatusLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_inspectionCommonStatusLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _inspectionCommonStatusLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByInspectionRecordId(
		long inspectionRecordId) {
		return _inspectionCommonStatusLocalService.findByInspectionRecordId(inspectionRecordId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByVehicleClassAndTypeAndInspectionRecordId(
		java.lang.String vehicleClass, long type, long inspectionRecordId) {
		return _inspectionCommonStatusLocalService.findByVehicleClassAndTypeAndInspectionRecordId(vehicleClass,
			type, inspectionRecordId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByVehicleClassAndInspectionRecordId(
		java.lang.String vehicleClass, long inspectionRecordId) {
		return _inspectionCommonStatusLocalService.findByVehicleClassAndInspectionRecordId(vehicleClass,
			inspectionRecordId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionCommonStatus> findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(
		java.lang.String vehicleClass, long type, long inspectionRecordId) {
		return _inspectionCommonStatusLocalService.findByVehicleClassAndTypeAndInspecRecordIdOderBySequenceNo(vehicleClass,
			type, inspectionRecordId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InspectionCommonStatusLocalService getWrappedInspectionCommonStatusLocalService() {
		return _inspectionCommonStatusLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInspectionCommonStatusLocalService(
		InspectionCommonStatusLocalService inspectionCommonStatusLocalService) {
		_inspectionCommonStatusLocalService = inspectionCommonStatusLocalService;
	}

	@Override
	public InspectionCommonStatusLocalService getWrappedService() {
		return _inspectionCommonStatusLocalService;
	}

	@Override
	public void setWrappedService(
		InspectionCommonStatusLocalService inspectionCommonStatusLocalService) {
		_inspectionCommonStatusLocalService = inspectionCommonStatusLocalService;
	}

	private InspectionCommonStatusLocalService _inspectionCommonStatusLocalService;
}