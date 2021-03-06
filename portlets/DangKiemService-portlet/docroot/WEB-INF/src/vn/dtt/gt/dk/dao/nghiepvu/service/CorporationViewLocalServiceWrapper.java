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
 * Provides a wrapper for {@link CorporationViewLocalService}.
 *
 * @author huymq
 * @see CorporationViewLocalService
 * @generated
 */
public class CorporationViewLocalServiceWrapper
	implements CorporationViewLocalService,
		ServiceWrapper<CorporationViewLocalService> {
	public CorporationViewLocalServiceWrapper(
		CorporationViewLocalService corporationViewLocalService) {
		_corporationViewLocalService = corporationViewLocalService;
	}

	/**
	* Adds the corporation view to the database. Also notifies the appropriate model listeners.
	*
	* @param corporationView the corporation view
	* @return the corporation view that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView addCorporationView(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView corporationView)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationViewLocalService.addCorporationView(corporationView);
	}

	/**
	* Creates a new corporation view with the primary key. Does not add the corporation view to the database.
	*
	* @param id the primary key for the new corporation view
	* @return the new corporation view
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView createCorporationView(
		long id) {
		return _corporationViewLocalService.createCorporationView(id);
	}

	/**
	* Deletes the corporation view with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporation view
	* @return the corporation view that was removed
	* @throws PortalException if a corporation view with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView deleteCorporationView(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _corporationViewLocalService.deleteCorporationView(id);
	}

	/**
	* Deletes the corporation view from the database. Also notifies the appropriate model listeners.
	*
	* @param corporationView the corporation view
	* @return the corporation view that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView deleteCorporationView(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView corporationView)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationViewLocalService.deleteCorporationView(corporationView);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _corporationViewLocalService.dynamicQuery();
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
		return _corporationViewLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _corporationViewLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _corporationViewLocalService.dynamicQuery(dynamicQuery, start,
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
		return _corporationViewLocalService.dynamicQueryCount(dynamicQuery);
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
		return _corporationViewLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView fetchCorporationView(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationViewLocalService.fetchCorporationView(id);
	}

	/**
	* Returns the corporation view with the primary key.
	*
	* @param id the primary key of the corporation view
	* @return the corporation view
	* @throws PortalException if a corporation view with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView getCorporationView(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _corporationViewLocalService.getCorporationView(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _corporationViewLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the corporation views.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.CorporationViewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporation views
	* @param end the upper bound of the range of corporation views (not inclusive)
	* @return the range of corporation views
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> getCorporationViews(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationViewLocalService.getCorporationViews(start, end);
	}

	/**
	* Returns the number of corporation views.
	*
	* @return the number of corporation views
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCorporationViewsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationViewLocalService.getCorporationViewsCount();
	}

	/**
	* Updates the corporation view in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param corporationView the corporation view
	* @return the corporation view that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView updateCorporationView(
		vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView corporationView)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _corporationViewLocalService.updateCorporationView(corporationView);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _corporationViewLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_corporationViewLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _corporationViewLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByInspectorId(
		long inspectorId) {
		return _corporationViewLocalService.findByInspectorId(inspectorId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findCorporationView(
		long inspectorid, int isleader) {
		return _corporationViewLocalService.findCorporationView(inspectorid,
			isleader);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findCorporationView(
		long inspectorid) {
		return _corporationViewLocalService.findCorporationView(inspectorid);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView findByCorporationIdAndIsLeader(
		java.lang.String corporationId, int isleader) {
		return _corporationViewLocalService.findByCorporationIdAndIsLeader(corporationId,
			isleader);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByCorporationId(
		java.lang.String corporationId) {
		return _corporationViewLocalService.findByCorporationId(corporationId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.CorporationView> findByDanhSachDangKiemVienTheoDoi(
		java.lang.String corporationId) {
		return _corporationViewLocalService.findByDanhSachDangKiemVienTheoDoi(corporationId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CorporationViewLocalService getWrappedCorporationViewLocalService() {
		return _corporationViewLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCorporationViewLocalService(
		CorporationViewLocalService corporationViewLocalService) {
		_corporationViewLocalService = corporationViewLocalService;
	}

	@Override
	public CorporationViewLocalService getWrappedService() {
		return _corporationViewLocalService;
	}

	@Override
	public void setWrappedService(
		CorporationViewLocalService corporationViewLocalService) {
		_corporationViewLocalService = corporationViewLocalService;
	}

	private CorporationViewLocalService _corporationViewLocalService;
}