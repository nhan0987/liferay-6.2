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
 * Provides a wrapper for {@link ControlRequirementLocalService}.
 *
 * @author huymq
 * @see ControlRequirementLocalService
 * @generated
 */
public class ControlRequirementLocalServiceWrapper
	implements ControlRequirementLocalService,
		ServiceWrapper<ControlRequirementLocalService> {
	public ControlRequirementLocalServiceWrapper(
		ControlRequirementLocalService controlRequirementLocalService) {
		_controlRequirementLocalService = controlRequirementLocalService;
	}

	/**
	* Adds the control requirement to the database. Also notifies the appropriate model listeners.
	*
	* @param controlRequirement the control requirement
	* @return the control requirement that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement addControlRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement controlRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _controlRequirementLocalService.addControlRequirement(controlRequirement);
	}

	/**
	* Creates a new control requirement with the primary key. Does not add the control requirement to the database.
	*
	* @param id the primary key for the new control requirement
	* @return the new control requirement
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement createControlRequirement(
		long id) {
		return _controlRequirementLocalService.createControlRequirement(id);
	}

	/**
	* Deletes the control requirement with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the control requirement
	* @return the control requirement that was removed
	* @throws PortalException if a control requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement deleteControlRequirement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _controlRequirementLocalService.deleteControlRequirement(id);
	}

	/**
	* Deletes the control requirement from the database. Also notifies the appropriate model listeners.
	*
	* @param controlRequirement the control requirement
	* @return the control requirement that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement deleteControlRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement controlRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _controlRequirementLocalService.deleteControlRequirement(controlRequirement);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _controlRequirementLocalService.dynamicQuery();
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
		return _controlRequirementLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _controlRequirementLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _controlRequirementLocalService.dynamicQuery(dynamicQuery,
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
		return _controlRequirementLocalService.dynamicQueryCount(dynamicQuery);
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
		return _controlRequirementLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement fetchControlRequirement(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _controlRequirementLocalService.fetchControlRequirement(id);
	}

	/**
	* Returns the control requirement with the primary key.
	*
	* @param id the primary key of the control requirement
	* @return the control requirement
	* @throws PortalException if a control requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement getControlRequirement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _controlRequirementLocalService.getControlRequirement(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _controlRequirementLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the control requirements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ControlRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of control requirements
	* @param end the upper bound of the range of control requirements (not inclusive)
	* @return the range of control requirements
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> getControlRequirements(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _controlRequirementLocalService.getControlRequirements(start, end);
	}

	/**
	* Returns the number of control requirements.
	*
	* @return the number of control requirements
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getControlRequirementsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _controlRequirementLocalService.getControlRequirementsCount();
	}

	/**
	* Updates the control requirement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param controlRequirement the control requirement
	* @return the control requirement that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement updateControlRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement controlRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _controlRequirementLocalService.updateControlRequirement(controlRequirement);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _controlRequirementLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_controlRequirementLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _controlRequirementLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findByRegisteredInspectionId(
		long registeredInspectionId) {
		return _controlRequirementLocalService.findByRegisteredInspectionId(registeredInspectionId);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement findByInspectionrecordId(
		long inspectionrecordId) {
		return _controlRequirementLocalService.findByInspectionrecordId(inspectionrecordId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ControlRequirement> findByPhieuxulyphuId(
		long phieuxulyphuId) {
		return _controlRequirementLocalService.findByPhieuxulyphuId(phieuxulyphuId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ControlRequirementLocalService getWrappedControlRequirementLocalService() {
		return _controlRequirementLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedControlRequirementLocalService(
		ControlRequirementLocalService controlRequirementLocalService) {
		_controlRequirementLocalService = controlRequirementLocalService;
	}

	@Override
	public ControlRequirementLocalService getWrappedService() {
		return _controlRequirementLocalService;
	}

	@Override
	public void setWrappedService(
		ControlRequirementLocalService controlRequirementLocalService) {
		_controlRequirementLocalService = controlRequirementLocalService;
	}

	private ControlRequirementLocalService _controlRequirementLocalService;
}