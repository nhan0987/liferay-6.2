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
 * Provides a wrapper for {@link CorporationInspectorLocalService}.
 *
 * @author win_64
 * @see CorporationInspectorLocalService
 * @generated
 */
public class CorporationInspectorLocalServiceWrapper
	implements CorporationInspectorLocalService,
		ServiceWrapper<CorporationInspectorLocalService> {
	public CorporationInspectorLocalServiceWrapper(
		CorporationInspectorLocalService corporationInspectorLocalService) {
		_corporationInspectorLocalService = corporationInspectorLocalService;
	}

	/**
	* Adds the corporation inspector to the database. Also notifies the appropriate model listeners.
	*
	* @param corporationInspector the corporation inspector
	* @return the corporation inspector that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector addCorporationInspector(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector corporationInspector)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationInspectorLocalService.addCorporationInspector(corporationInspector);
	}

	/**
	* Creates a new corporation inspector with the primary key. Does not add the corporation inspector to the database.
	*
	* @param id the primary key for the new corporation inspector
	* @return the new corporation inspector
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector createCorporationInspector(
		long id) {
		return _corporationInspectorLocalService.createCorporationInspector(id);
	}

	/**
	* Deletes the corporation inspector with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporation inspector
	* @return the corporation inspector that was removed
	* @throws PortalException if a corporation inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector deleteCorporationInspector(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _corporationInspectorLocalService.deleteCorporationInspector(id);
	}

	/**
	* Deletes the corporation inspector from the database. Also notifies the appropriate model listeners.
	*
	* @param corporationInspector the corporation inspector
	* @return the corporation inspector that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector deleteCorporationInspector(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector corporationInspector)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationInspectorLocalService.deleteCorporationInspector(corporationInspector);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _corporationInspectorLocalService.dynamicQuery();
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
		return _corporationInspectorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _corporationInspectorLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _corporationInspectorLocalService.dynamicQuery(dynamicQuery,
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
		return _corporationInspectorLocalService.dynamicQueryCount(dynamicQuery);
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
		return _corporationInspectorLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector fetchCorporationInspector(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationInspectorLocalService.fetchCorporationInspector(id);
	}

	/**
	* Returns the corporation inspector with the primary key.
	*
	* @param id the primary key of the corporation inspector
	* @return the corporation inspector
	* @throws PortalException if a corporation inspector with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector getCorporationInspector(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _corporationInspectorLocalService.getCorporationInspector(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _corporationInspectorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the corporation inspectors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationInspectorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporation inspectors
	* @param end the upper bound of the range of corporation inspectors (not inclusive)
	* @return the range of corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector> getCorporationInspectors(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationInspectorLocalService.getCorporationInspectors(start,
			end);
	}

	/**
	* Returns the number of corporation inspectors.
	*
	* @return the number of corporation inspectors
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCorporationInspectorsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationInspectorLocalService.getCorporationInspectorsCount();
	}

	/**
	* Updates the corporation inspector in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param corporationInspector the corporation inspector
	* @return the corporation inspector that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector updateCorporationInspector(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationInspector corporationInspector)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationInspectorLocalService.updateCorporationInspector(corporationInspector);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _corporationInspectorLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_corporationInspectorLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _corporationInspectorLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CorporationInspectorLocalService getWrappedCorporationInspectorLocalService() {
		return _corporationInspectorLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCorporationInspectorLocalService(
		CorporationInspectorLocalService corporationInspectorLocalService) {
		_corporationInspectorLocalService = corporationInspectorLocalService;
	}

	@Override
	public CorporationInspectorLocalService getWrappedService() {
		return _corporationInspectorLocalService;
	}

	@Override
	public void setWrappedService(
		CorporationInspectorLocalService corporationInspectorLocalService) {
		_corporationInspectorLocalService = corporationInspectorLocalService;
	}

	private CorporationInspectorLocalService _corporationInspectorLocalService;
}