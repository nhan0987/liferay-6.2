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
 * Provides a wrapper for {@link SafetestRequirementLocalService}.
 *
 * @author huymq
 * @see SafetestRequirementLocalService
 * @generated
 */
public class SafetestRequirementLocalServiceWrapper
	implements SafetestRequirementLocalService,
		ServiceWrapper<SafetestRequirementLocalService> {
	public SafetestRequirementLocalServiceWrapper(
		SafetestRequirementLocalService safetestRequirementLocalService) {
		_safetestRequirementLocalService = safetestRequirementLocalService;
	}

	/**
	* Adds the safetest requirement to the database. Also notifies the appropriate model listeners.
	*
	* @param safetestRequirement the safetest requirement
	* @return the safetest requirement that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement addSafetestRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement safetestRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _safetestRequirementLocalService.addSafetestRequirement(safetestRequirement);
	}

	/**
	* Creates a new safetest requirement with the primary key. Does not add the safetest requirement to the database.
	*
	* @param id the primary key for the new safetest requirement
	* @return the new safetest requirement
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement createSafetestRequirement(
		long id) {
		return _safetestRequirementLocalService.createSafetestRequirement(id);
	}

	/**
	* Deletes the safetest requirement with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the safetest requirement
	* @return the safetest requirement that was removed
	* @throws PortalException if a safetest requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement deleteSafetestRequirement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _safetestRequirementLocalService.deleteSafetestRequirement(id);
	}

	/**
	* Deletes the safetest requirement from the database. Also notifies the appropriate model listeners.
	*
	* @param safetestRequirement the safetest requirement
	* @return the safetest requirement that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement deleteSafetestRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement safetestRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _safetestRequirementLocalService.deleteSafetestRequirement(safetestRequirement);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _safetestRequirementLocalService.dynamicQuery();
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
		return _safetestRequirementLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _safetestRequirementLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _safetestRequirementLocalService.dynamicQuery(dynamicQuery,
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
		return _safetestRequirementLocalService.dynamicQueryCount(dynamicQuery);
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
		return _safetestRequirementLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement fetchSafetestRequirement(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _safetestRequirementLocalService.fetchSafetestRequirement(id);
	}

	/**
	* Returns the safetest requirement with the primary key.
	*
	* @param id the primary key of the safetest requirement
	* @return the safetest requirement
	* @throws PortalException if a safetest requirement with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement getSafetestRequirement(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _safetestRequirementLocalService.getSafetestRequirement(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _safetestRequirementLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the safetest requirements.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.SafetestRequirementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of safetest requirements
	* @param end the upper bound of the range of safetest requirements (not inclusive)
	* @return the range of safetest requirements
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement> getSafetestRequirements(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _safetestRequirementLocalService.getSafetestRequirements(start,
			end);
	}

	/**
	* Returns the number of safetest requirements.
	*
	* @return the number of safetest requirements
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSafetestRequirementsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _safetestRequirementLocalService.getSafetestRequirementsCount();
	}

	/**
	* Updates the safetest requirement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param safetestRequirement the safetest requirement
	* @return the safetest requirement that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement updateSafetestRequirement(
		vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement safetestRequirement)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _safetestRequirementLocalService.updateSafetestRequirement(safetestRequirement);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _safetestRequirementLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_safetestRequirementLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _safetestRequirementLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement findByInspectionRecordId(
		long inspectionRecordId) {
		return _safetestRequirementLocalService.findByInspectionRecordId(inspectionRecordId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.SafetestRequirement> findByPhieuXuLyPhuId(
		long phieuXuLyPhuId) {
		return _safetestRequirementLocalService.findByPhieuXuLyPhuId(phieuXuLyPhuId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SafetestRequirementLocalService getWrappedSafetestRequirementLocalService() {
		return _safetestRequirementLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSafetestRequirementLocalService(
		SafetestRequirementLocalService safetestRequirementLocalService) {
		_safetestRequirementLocalService = safetestRequirementLocalService;
	}

	@Override
	public SafetestRequirementLocalService getWrappedService() {
		return _safetestRequirementLocalService;
	}

	@Override
	public void setWrappedService(
		SafetestRequirementLocalService safetestRequirementLocalService) {
		_safetestRequirementLocalService = safetestRequirementLocalService;
	}

	private SafetestRequirementLocalService _safetestRequirementLocalService;
}