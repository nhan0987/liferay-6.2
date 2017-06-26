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
 * Provides a wrapper for {@link InspectionRecordSpecLocalService}.
 *
 * @author win_64
 * @see InspectionRecordSpecLocalService
 * @generated
 */
public class InspectionRecordSpecLocalServiceWrapper
	implements InspectionRecordSpecLocalService,
		ServiceWrapper<InspectionRecordSpecLocalService> {
	public InspectionRecordSpecLocalServiceWrapper(
		InspectionRecordSpecLocalService inspectionRecordSpecLocalService) {
		_inspectionRecordSpecLocalService = inspectionRecordSpecLocalService;
	}

	/**
	* Adds the inspection record spec to the database. Also notifies the appropriate model listeners.
	*
	* @param inspectionRecordSpec the inspection record spec
	* @return the inspection record spec that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec addInspectionRecordSpec(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec inspectionRecordSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordSpecLocalService.addInspectionRecordSpec(inspectionRecordSpec);
	}

	/**
	* Creates a new inspection record spec with the primary key. Does not add the inspection record spec to the database.
	*
	* @param id the primary key for the new inspection record spec
	* @return the new inspection record spec
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec createInspectionRecordSpec(
		long id) {
		return _inspectionRecordSpecLocalService.createInspectionRecordSpec(id);
	}

	/**
	* Deletes the inspection record spec with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the inspection record spec
	* @return the inspection record spec that was removed
	* @throws PortalException if a inspection record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec deleteInspectionRecordSpec(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordSpecLocalService.deleteInspectionRecordSpec(id);
	}

	/**
	* Deletes the inspection record spec from the database. Also notifies the appropriate model listeners.
	*
	* @param inspectionRecordSpec the inspection record spec
	* @return the inspection record spec that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec deleteInspectionRecordSpec(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec inspectionRecordSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordSpecLocalService.deleteInspectionRecordSpec(inspectionRecordSpec);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _inspectionRecordSpecLocalService.dynamicQuery();
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
		return _inspectionRecordSpecLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _inspectionRecordSpecLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _inspectionRecordSpecLocalService.dynamicQuery(dynamicQuery,
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
		return _inspectionRecordSpecLocalService.dynamicQueryCount(dynamicQuery);
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
		return _inspectionRecordSpecLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec fetchInspectionRecordSpec(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordSpecLocalService.fetchInspectionRecordSpec(id);
	}

	/**
	* Returns the inspection record spec with the primary key.
	*
	* @param id the primary key of the inspection record spec
	* @return the inspection record spec
	* @throws PortalException if a inspection record spec with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec getInspectionRecordSpec(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordSpecLocalService.getInspectionRecordSpec(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordSpecLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the inspection record specs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.InspectionRecordSpecModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of inspection record specs
	* @param end the upper bound of the range of inspection record specs (not inclusive)
	* @return the range of inspection record specs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec> getInspectionRecordSpecs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordSpecLocalService.getInspectionRecordSpecs(start,
			end);
	}

	/**
	* Returns the number of inspection record specs.
	*
	* @return the number of inspection record specs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInspectionRecordSpecsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordSpecLocalService.getInspectionRecordSpecsCount();
	}

	/**
	* Updates the inspection record spec in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param inspectionRecordSpec the inspection record spec
	* @return the inspection record spec that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec updateInspectionRecordSpec(
		vn.dtt.gt.dk.dao.nghiepvu.model.InspectionRecordSpec inspectionRecordSpec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _inspectionRecordSpecLocalService.updateInspectionRecordSpec(inspectionRecordSpec);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _inspectionRecordSpecLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_inspectionRecordSpecLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _inspectionRecordSpecLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InspectionRecordSpecLocalService getWrappedInspectionRecordSpecLocalService() {
		return _inspectionRecordSpecLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInspectionRecordSpecLocalService(
		InspectionRecordSpecLocalService inspectionRecordSpecLocalService) {
		_inspectionRecordSpecLocalService = inspectionRecordSpecLocalService;
	}

	@Override
	public InspectionRecordSpecLocalService getWrappedService() {
		return _inspectionRecordSpecLocalService;
	}

	@Override
	public void setWrappedService(
		InspectionRecordSpecLocalService inspectionRecordSpecLocalService) {
		_inspectionRecordSpecLocalService = inspectionRecordSpecLocalService;
	}

	private InspectionRecordSpecLocalService _inspectionRecordSpecLocalService;
}