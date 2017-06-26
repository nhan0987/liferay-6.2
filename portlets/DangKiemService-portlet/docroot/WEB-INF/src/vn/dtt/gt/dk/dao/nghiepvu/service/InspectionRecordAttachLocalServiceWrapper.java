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
 * Provides a wrapper for {@link InspectionRecordAttachLocalService}.
 *
 * @author huymq
 * @see InspectionRecordAttachLocalService
 * @generated
 */
public class InspectionRecordAttachLocalServiceWrapper
	implements InspectionRecordAttachLocalService,
		ServiceWrapper<InspectionRecordAttachLocalService> {
	public InspectionRecordAttachLocalServiceWrapper(
		InspectionRecordAttachLocalService inspectionRecordAttachLocalService) {
		_inspectionRecordAttachLocalService = inspectionRecordAttachLocalService;
	}

	/**
	* Adds the inspection record attach to the database. Also notifies the appropriate model listeners.
	*
	* @param inspectionRecordAttach the inspection record attach
	* @return the inspection record attach that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach addInspectionRecordAttach(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach inspectionRecordAttach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordAttachLocalService.addInspectionRecordAttach(inspectionRecordAttach);
	}

	/**
	* Creates a new inspection record attach with the primary key. Does not add the inspection record attach to the database.
	*
	* @param id the primary key for the new inspection record attach
	* @return the new inspection record attach
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach createInspectionRecordAttach(
		long id) {
		return _inspectionRecordAttachLocalService.createInspectionRecordAttach(id);
	}

	/**
	* Deletes the inspection record attach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the inspection record attach
	* @return the inspection record attach that was removed
	* @throws PortalException if a inspection record attach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach deleteInspectionRecordAttach(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordAttachLocalService.deleteInspectionRecordAttach(id);
	}

	/**
	* Deletes the inspection record attach from the database. Also notifies the appropriate model listeners.
	*
	* @param inspectionRecordAttach the inspection record attach
	* @return the inspection record attach that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach deleteInspectionRecordAttach(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach inspectionRecordAttach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordAttachLocalService.deleteInspectionRecordAttach(inspectionRecordAttach);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _inspectionRecordAttachLocalService.dynamicQuery();
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
		return _inspectionRecordAttachLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _inspectionRecordAttachLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _inspectionRecordAttachLocalService.dynamicQuery(dynamicQuery,
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
		return _inspectionRecordAttachLocalService.dynamicQueryCount(dynamicQuery);
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
		return _inspectionRecordAttachLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach fetchInspectionRecordAttach(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordAttachLocalService.fetchInspectionRecordAttach(id);
	}

	/**
	* Returns the inspection record attach with the primary key.
	*
	* @param id the primary key of the inspection record attach
	* @return the inspection record attach
	* @throws PortalException if a inspection record attach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach getInspectionRecordAttach(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordAttachLocalService.getInspectionRecordAttach(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordAttachLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the inspection record attachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of inspection record attachs
	* @param end the upper bound of the range of inspection record attachs (not inclusive)
	* @return the range of inspection record attachs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> getInspectionRecordAttachs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordAttachLocalService.getInspectionRecordAttachs(start,
			end);
	}

	/**
	* Returns the number of inspection record attachs.
	*
	* @return the number of inspection record attachs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInspectionRecordAttachsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordAttachLocalService.getInspectionRecordAttachsCount();
	}

	/**
	* Updates the inspection record attach in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param inspectionRecordAttach the inspection record attach
	* @return the inspection record attach that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach updateInspectionRecordAttach(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach inspectionRecordAttach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordAttachLocalService.updateInspectionRecordAttach(inspectionRecordAttach);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _inspectionRecordAttachLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_inspectionRecordAttachLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _inspectionRecordAttachLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordAttach> findByInspectionRecordAttach(
		long inspectionRecordId) {
		return _inspectionRecordAttachLocalService.findByInspectionRecordAttach(inspectionRecordId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InspectionRecordAttachLocalService getWrappedInspectionRecordAttachLocalService() {
		return _inspectionRecordAttachLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInspectionRecordAttachLocalService(
		InspectionRecordAttachLocalService inspectionRecordAttachLocalService) {
		_inspectionRecordAttachLocalService = inspectionRecordAttachLocalService;
	}

	@Override
	public InspectionRecordAttachLocalService getWrappedService() {
		return _inspectionRecordAttachLocalService;
	}

	@Override
	public void setWrappedService(
		InspectionRecordAttachLocalService inspectionRecordAttachLocalService) {
		_inspectionRecordAttachLocalService = inspectionRecordAttachLocalService;
	}

	private InspectionRecordAttachLocalService _inspectionRecordAttachLocalService;
}