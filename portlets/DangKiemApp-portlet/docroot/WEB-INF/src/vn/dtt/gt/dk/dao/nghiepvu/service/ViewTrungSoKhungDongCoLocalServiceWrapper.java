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
 * Provides a wrapper for {@link ViewTrungSoKhungDongCoLocalService}.
 *
 * @author win_64
 * @see ViewTrungSoKhungDongCoLocalService
 * @generated
 */
public class ViewTrungSoKhungDongCoLocalServiceWrapper
	implements ViewTrungSoKhungDongCoLocalService,
		ServiceWrapper<ViewTrungSoKhungDongCoLocalService> {
	public ViewTrungSoKhungDongCoLocalServiceWrapper(
		ViewTrungSoKhungDongCoLocalService viewTrungSoKhungDongCoLocalService) {
		_viewTrungSoKhungDongCoLocalService = viewTrungSoKhungDongCoLocalService;
	}

	/**
	* Adds the view trung so khung dong co to the database. Also notifies the appropriate model listeners.
	*
	* @param viewTrungSoKhungDongCo the view trung so khung dong co
	* @return the view trung so khung dong co that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo addViewTrungSoKhungDongCo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo viewTrungSoKhungDongCo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewTrungSoKhungDongCoLocalService.addViewTrungSoKhungDongCo(viewTrungSoKhungDongCo);
	}

	/**
	* Creates a new view trung so khung dong co with the primary key. Does not add the view trung so khung dong co to the database.
	*
	* @param id the primary key for the new view trung so khung dong co
	* @return the new view trung so khung dong co
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo createViewTrungSoKhungDongCo(
		long id) {
		return _viewTrungSoKhungDongCoLocalService.createViewTrungSoKhungDongCo(id);
	}

	/**
	* Deletes the view trung so khung dong co with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the view trung so khung dong co
	* @return the view trung so khung dong co that was removed
	* @throws PortalException if a view trung so khung dong co with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo deleteViewTrungSoKhungDongCo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _viewTrungSoKhungDongCoLocalService.deleteViewTrungSoKhungDongCo(id);
	}

	/**
	* Deletes the view trung so khung dong co from the database. Also notifies the appropriate model listeners.
	*
	* @param viewTrungSoKhungDongCo the view trung so khung dong co
	* @return the view trung so khung dong co that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo deleteViewTrungSoKhungDongCo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo viewTrungSoKhungDongCo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewTrungSoKhungDongCoLocalService.deleteViewTrungSoKhungDongCo(viewTrungSoKhungDongCo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _viewTrungSoKhungDongCoLocalService.dynamicQuery();
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
		return _viewTrungSoKhungDongCoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewTrungSoKhungDongCoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _viewTrungSoKhungDongCoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewTrungSoKhungDongCoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _viewTrungSoKhungDongCoLocalService.dynamicQuery(dynamicQuery,
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
		return _viewTrungSoKhungDongCoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _viewTrungSoKhungDongCoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo fetchViewTrungSoKhungDongCo(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _viewTrungSoKhungDongCoLocalService.fetchViewTrungSoKhungDongCo(id);
	}

	/**
	* Returns the view trung so khung dong co with the primary key.
	*
	* @param id the primary key of the view trung so khung dong co
	* @return the view trung so khung dong co
	* @throws PortalException if a view trung so khung dong co with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo getViewTrungSoKhungDongCo(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _viewTrungSoKhungDongCoLocalService.getViewTrungSoKhungDongCo(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _viewTrungSoKhungDongCoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the view trung so khung dong cos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.ViewTrungSoKhungDongCoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of view trung so khung dong cos
	* @param end the upper bound of the range of view trung so khung dong cos (not inclusive)
	* @return the range of view trung so khung dong cos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo> getViewTrungSoKhungDongCos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewTrungSoKhungDongCoLocalService.getViewTrungSoKhungDongCos(start,
			end);
	}

	/**
	* Returns the number of view trung so khung dong cos.
	*
	* @return the number of view trung so khung dong cos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getViewTrungSoKhungDongCosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewTrungSoKhungDongCoLocalService.getViewTrungSoKhungDongCosCount();
	}

	/**
	* Updates the view trung so khung dong co in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param viewTrungSoKhungDongCo the view trung so khung dong co
	* @return the view trung so khung dong co that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo updateViewTrungSoKhungDongCo(
		vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo viewTrungSoKhungDongCo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _viewTrungSoKhungDongCoLocalService.updateViewTrungSoKhungDongCo(viewTrungSoKhungDongCo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _viewTrungSoKhungDongCoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_viewTrungSoKhungDongCoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _viewTrungSoKhungDongCoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.ViewTrungSoKhungDongCo> findByHoSoThuTucIdTrungSoKhungSoDongCo(
		long idHoSoThuTuc) {
		return _viewTrungSoKhungDongCoLocalService.findByHoSoThuTucIdTrungSoKhungSoDongCo(idHoSoThuTuc);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ViewTrungSoKhungDongCoLocalService getWrappedViewTrungSoKhungDongCoLocalService() {
		return _viewTrungSoKhungDongCoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedViewTrungSoKhungDongCoLocalService(
		ViewTrungSoKhungDongCoLocalService viewTrungSoKhungDongCoLocalService) {
		_viewTrungSoKhungDongCoLocalService = viewTrungSoKhungDongCoLocalService;
	}

	@Override
	public ViewTrungSoKhungDongCoLocalService getWrappedService() {
		return _viewTrungSoKhungDongCoLocalService;
	}

	@Override
	public void setWrappedService(
		ViewTrungSoKhungDongCoLocalService viewTrungSoKhungDongCoLocalService) {
		_viewTrungSoKhungDongCoLocalService = viewTrungSoKhungDongCoLocalService;
	}

	private ViewTrungSoKhungDongCoLocalService _viewTrungSoKhungDongCoLocalService;
}