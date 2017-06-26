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
 * Provides a wrapper for {@link EmissionTestRequirementLocalService}.
 *
 * @author huymq
 * @see EmissionTestRequirementLocalService
 * @generated
 */
public class EmissionTestRequirementLocalServiceWrapper
	implements EmissionTestRequirementLocalService,
		ServiceWrapper<EmissionTestRequirementLocalService> {
	public EmissionTestRequirementLocalServiceWrapper(
		EmissionTestRequirementLocalService emissionTestRequirementLocalService) {
		_emissionTestRequirementLocalService = emissionTestRequirementLocalService;
	}

	/**
	* Adds the emission test requirement to the database. Also notifies the appropriate model listeners.
	*
	* @param emissionTestRequirement the emission test requirement
	* @return the emission test requirement that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement addEmissionTestRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement emissionTestRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestRequirementLocalService.addEmissionTestRequirement(emissionTestRequirement);
	}

	/**
	* Creates a new emission test requirement with the primary key. Does not add the emission test requirement to the database.
	*
	* @param id the primary key for the new emission test requirement
	* @return the new emission test requirement
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement createEmissionTestRequirement(
		long id) {
		return _emissionTestRequirementLocalService.createEmissionTestRequirement(id);
	}

	/**
	* Deletes the emission test requirement with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the emission test requirement
	* @return the emission test requirement that was removed
	* @throws PortalException if a emission test requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement deleteEmissionTestRequirement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestRequirementLocalService.deleteEmissionTestRequirement(id);
	}

	/**
	* Deletes the emission test requirement from the database. Also notifies the appropriate model listeners.
	*
	* @param emissionTestRequirement the emission test requirement
	* @return the emission test requirement that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement deleteEmissionTestRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement emissionTestRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestRequirementLocalService.deleteEmissionTestRequirement(emissionTestRequirement);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _emissionTestRequirementLocalService.dynamicQuery();
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
		return _emissionTestRequirementLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _emissionTestRequirementLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _emissionTestRequirementLocalService.dynamicQuery(dynamicQuery,
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
		return _emissionTestRequirementLocalService.dynamicQueryCount(dynamicQuery);
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
		return _emissionTestRequirementLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement fetchEmissionTestRequirement(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestRequirementLocalService.fetchEmissionTestRequirement(id);
	}

	/**
	* Returns the emission test requirement with the primary key.
	*
	* @param id the primary key of the emission test requirement
	* @return the emission test requirement
	* @throws PortalException if a emission test requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement getEmissionTestRequirement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestRequirementLocalService.getEmissionTestRequirement(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestRequirementLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the emission test requirements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.EmissionTestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emission test requirements
	* @param end the upper bound of the range of emission test requirements (not inclusive)
	* @return the range of emission test requirements
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement> getEmissionTestRequirements(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestRequirementLocalService.getEmissionTestRequirements(start,
			end);
	}

	/**
	* Returns the number of emission test requirements.
	*
	* @return the number of emission test requirements
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmissionTestRequirementsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestRequirementLocalService.getEmissionTestRequirementsCount();
	}

	/**
	* Updates the emission test requirement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param emissionTestRequirement the emission test requirement
	* @return the emission test requirement that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement updateEmissionTestRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement emissionTestRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _emissionTestRequirementLocalService.updateEmissionTestRequirement(emissionTestRequirement);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _emissionTestRequirementLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_emissionTestRequirementLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _emissionTestRequirementLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement findByInspectionRecordId(
		long inspectionRecordId) {
		return _emissionTestRequirementLocalService.findByInspectionRecordId(inspectionRecordId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.EmissionTestRequirement> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		return _emissionTestRequirementLocalService.findByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmissionTestRequirementLocalService getWrappedEmissionTestRequirementLocalService() {
		return _emissionTestRequirementLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmissionTestRequirementLocalService(
		EmissionTestRequirementLocalService emissionTestRequirementLocalService) {
		_emissionTestRequirementLocalService = emissionTestRequirementLocalService;
	}

	@Override
	public EmissionTestRequirementLocalService getWrappedService() {
		return _emissionTestRequirementLocalService;
	}

	@Override
	public void setWrappedService(
		EmissionTestRequirementLocalService emissionTestRequirementLocalService) {
		_emissionTestRequirementLocalService = emissionTestRequirementLocalService;
	}

	private EmissionTestRequirementLocalService _emissionTestRequirementLocalService;
}