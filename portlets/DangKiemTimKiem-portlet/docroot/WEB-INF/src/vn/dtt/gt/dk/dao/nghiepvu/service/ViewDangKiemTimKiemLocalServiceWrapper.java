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
 * Provides a wrapper for {@link ViewDangKiemTimKiemLocalService}.
 *
 * @author win_64
 * @see ViewDangKiemTimKiemLocalService
 * @generated
 */
public class ViewDangKiemTimKiemLocalServiceWrapper
	implements ViewDangKiemTimKiemLocalService,
		ServiceWrapper<ViewDangKiemTimKiemLocalService> {
	public ViewDangKiemTimKiemLocalServiceWrapper(
		ViewDangKiemTimKiemLocalService viewDangKiemTimKiemLocalService) {
		_viewDangKiemTimKiemLocalService = viewDangKiemTimKiemLocalService;
	}

	/**
	* Adds the view dang kiem tim kiem to the database. Also notifies the appropriate model listeners.
	*
	* @param viewDangKiemTimKiem the view dang kiem tim kiem
	* @return the view dang kiem tim kiem that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem addViewDangKiemTimKiem(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem viewDangKiemTimKiem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewDangKiemTimKiemLocalService.addViewDangKiemTimKiem(viewDangKiemTimKiem);
	}

	/**
	* Creates a new view dang kiem tim kiem with the primary key. Does not add the view dang kiem tim kiem to the database.
	*
	* @param id the primary key for the new view dang kiem tim kiem
	* @return the new view dang kiem tim kiem
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem createViewDangKiemTimKiem(
		long id) {
		return _viewDangKiemTimKiemLocalService.createViewDangKiemTimKiem(id);
	}

	/**
	* Deletes the view dang kiem tim kiem with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the view dang kiem tim kiem
	* @return the view dang kiem tim kiem that was removed
	* @throws PortalException if a view dang kiem tim kiem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem deleteViewDangKiemTimKiem(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _viewDangKiemTimKiemLocalService.deleteViewDangKiemTimKiem(id);
	}

	/**
	* Deletes the view dang kiem tim kiem from the database. Also notifies the appropriate model listeners.
	*
	* @param viewDangKiemTimKiem the view dang kiem tim kiem
	* @return the view dang kiem tim kiem that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem deleteViewDangKiemTimKiem(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem viewDangKiemTimKiem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewDangKiemTimKiemLocalService.deleteViewDangKiemTimKiem(viewDangKiemTimKiem);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _viewDangKiemTimKiemLocalService.dynamicQuery();
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
		return _viewDangKiemTimKiemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _viewDangKiemTimKiemLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _viewDangKiemTimKiemLocalService.dynamicQuery(dynamicQuery,
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
		return _viewDangKiemTimKiemLocalService.dynamicQueryCount(dynamicQuery);
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
		return _viewDangKiemTimKiemLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem fetchViewDangKiemTimKiem(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _viewDangKiemTimKiemLocalService.fetchViewDangKiemTimKiem(id);
	}

	/**
	* Returns the view dang kiem tim kiem with the primary key.
	*
	* @param id the primary key of the view dang kiem tim kiem
	* @return the view dang kiem tim kiem
	* @throws PortalException if a view dang kiem tim kiem with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem getViewDangKiemTimKiem(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _viewDangKiemTimKiemLocalService.getViewDangKiemTimKiem(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _viewDangKiemTimKiemLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the view dang kiem tim kiems.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewDangKiemTimKiemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of view dang kiem tim kiems
	* @param end the upper bound of the range of view dang kiem tim kiems (not inclusive)
	* @return the range of view dang kiem tim kiems
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem> getViewDangKiemTimKiems(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewDangKiemTimKiemLocalService.getViewDangKiemTimKiems(start,
			end);
	}

	/**
	* Returns the number of view dang kiem tim kiems.
	*
	* @return the number of view dang kiem tim kiems
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getViewDangKiemTimKiemsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewDangKiemTimKiemLocalService.getViewDangKiemTimKiemsCount();
	}

	/**
	* Updates the view dang kiem tim kiem in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param viewDangKiemTimKiem the view dang kiem tim kiem
	* @return the view dang kiem tim kiem that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem updateViewDangKiemTimKiem(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem viewDangKiemTimKiem)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewDangKiemTimKiemLocalService.updateViewDangKiemTimKiem(viewDangKiemTimKiem);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _viewDangKiemTimKiemLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_viewDangKiemTimKiemLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _viewDangKiemTimKiemLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ViewDangKiemTimKiem> searchDangKiemTimKiem(
		java.lang.String soChungChi, java.lang.String soKhung,
		java.lang.String soDongCo, long guestId, int start, int end) {
		return _viewDangKiemTimKiemLocalService.searchDangKiemTimKiem(soChungChi,
			soKhung, soDongCo, guestId, start, end);
	}

	@Override
	public long countDangKiemTimKiem(java.lang.String soChungChi,
		java.lang.String soKhung, java.lang.String soDongCo, long guestId) {
		return _viewDangKiemTimKiemLocalService.countDangKiemTimKiem(soChungChi,
			soKhung, soDongCo, guestId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ViewDangKiemTimKiemLocalService getWrappedViewDangKiemTimKiemLocalService() {
		return _viewDangKiemTimKiemLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedViewDangKiemTimKiemLocalService(
		ViewDangKiemTimKiemLocalService viewDangKiemTimKiemLocalService) {
		_viewDangKiemTimKiemLocalService = viewDangKiemTimKiemLocalService;
	}

	@Override
	public ViewDangKiemTimKiemLocalService getWrappedService() {
		return _viewDangKiemTimKiemLocalService;
	}

	@Override
	public void setWrappedService(
		ViewDangKiemTimKiemLocalService viewDangKiemTimKiemLocalService) {
		_viewDangKiemTimKiemLocalService = viewDangKiemTimKiemLocalService;
	}

	private ViewDangKiemTimKiemLocalService _viewDangKiemTimKiemLocalService;
}