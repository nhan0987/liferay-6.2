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
 * Provides a wrapper for {@link THONGSOCHUNGCHIXECOGIOILocalService}.
 *
 * @author win_64
 * @see THONGSOCHUNGCHIXECOGIOILocalService
 * @generated
 */
public class THONGSOCHUNGCHIXECOGIOILocalServiceWrapper
	implements THONGSOCHUNGCHIXECOGIOILocalService,
		ServiceWrapper<THONGSOCHUNGCHIXECOGIOILocalService> {
	public THONGSOCHUNGCHIXECOGIOILocalServiceWrapper(
		THONGSOCHUNGCHIXECOGIOILocalService thongsochungchixecogioiLocalService) {
		_thongsochungchixecogioiLocalService = thongsochungchixecogioiLocalService;
	}

	/**
	* Adds the t h o n g s o c h u n g c h i x e c o g i o i to the database. Also notifies the appropriate model listeners.
	*
	* @param thongsochungchixecogioi the t h o n g s o c h u n g c h i x e c o g i o i
	* @return the t h o n g s o c h u n g c h i x e c o g i o i that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI addTHONGSOCHUNGCHIXECOGIOI(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchixecogioiLocalService.addTHONGSOCHUNGCHIXECOGIOI(thongsochungchixecogioi);
	}

	/**
	* Creates a new t h o n g s o c h u n g c h i x e c o g i o i with the primary key. Does not add the t h o n g s o c h u n g c h i x e c o g i o i to the database.
	*
	* @param id the primary key for the new t h o n g s o c h u n g c h i x e c o g i o i
	* @return the new t h o n g s o c h u n g c h i x e c o g i o i
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI createTHONGSOCHUNGCHIXECOGIOI(
		long id) {
		return _thongsochungchixecogioiLocalService.createTHONGSOCHUNGCHIXECOGIOI(id);
	}

	/**
	* Deletes the t h o n g s o c h u n g c h i x e c o g i o i with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e c o g i o i
	* @return the t h o n g s o c h u n g c h i x e c o g i o i that was removed
	* @throws PortalException if a t h o n g s o c h u n g c h i x e c o g i o i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI deleteTHONGSOCHUNGCHIXECOGIOI(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchixecogioiLocalService.deleteTHONGSOCHUNGCHIXECOGIOI(id);
	}

	/**
	* Deletes the t h o n g s o c h u n g c h i x e c o g i o i from the database. Also notifies the appropriate model listeners.
	*
	* @param thongsochungchixecogioi the t h o n g s o c h u n g c h i x e c o g i o i
	* @return the t h o n g s o c h u n g c h i x e c o g i o i that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI deleteTHONGSOCHUNGCHIXECOGIOI(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchixecogioiLocalService.deleteTHONGSOCHUNGCHIXECOGIOI(thongsochungchixecogioi);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _thongsochungchixecogioiLocalService.dynamicQuery();
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
		return _thongsochungchixecogioiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _thongsochungchixecogioiLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _thongsochungchixecogioiLocalService.dynamicQuery(dynamicQuery,
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
		return _thongsochungchixecogioiLocalService.dynamicQueryCount(dynamicQuery);
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
		return _thongsochungchixecogioiLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI fetchTHONGSOCHUNGCHIXECOGIOI(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchixecogioiLocalService.fetchTHONGSOCHUNGCHIXECOGIOI(id);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i x e c o g i o i with the primary key.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i x e c o g i o i
	* @return the t h o n g s o c h u n g c h i x e c o g i o i
	* @throws PortalException if a t h o n g s o c h u n g c h i x e c o g i o i with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI getTHONGSOCHUNGCHIXECOGIOI(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchixecogioiLocalService.getTHONGSOCHUNGCHIXECOGIOI(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchixecogioiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i x e c o g i o is.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIXECOGIOIModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i x e c o g i o is
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i x e c o g i o is (not inclusive)
	* @return the range of t h o n g s o c h u n g c h i x e c o g i o is
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> getTHONGSOCHUNGCHIXECOGIOIs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchixecogioiLocalService.getTHONGSOCHUNGCHIXECOGIOIs(start,
			end);
	}

	/**
	* Returns the number of t h o n g s o c h u n g c h i x e c o g i o is.
	*
	* @return the number of t h o n g s o c h u n g c h i x e c o g i o is
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTHONGSOCHUNGCHIXECOGIOIsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchixecogioiLocalService.getTHONGSOCHUNGCHIXECOGIOIsCount();
	}

	/**
	* Updates the t h o n g s o c h u n g c h i x e c o g i o i in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thongsochungchixecogioi the t h o n g s o c h u n g c h i x e c o g i o i
	* @return the t h o n g s o c h u n g c h i x e c o g i o i that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI updateTHONGSOCHUNGCHIXECOGIOI(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI thongsochungchixecogioi)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchixecogioiLocalService.updateTHONGSOCHUNGCHIXECOGIOI(thongsochungchixecogioi);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _thongsochungchixecogioiLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_thongsochungchixecogioiLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _thongsochungchixecogioiLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public boolean deleteXCGVehicleCertificateSpecWithHosothutucId(
		long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchixecogioiLocalService.deleteXCGVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByCertificateRecordAndHosothutucId(
		long hosothutucId) {
		return _thongsochungchixecogioiLocalService.findByCertificateRecordAndHosothutucId(hosothutucId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByVehicleGroupInitialAndHosothutucId(
		long hosothutucId) {
		return _thongsochungchixecogioiLocalService.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findPart2ByCertificateRecordAndHosothutucId(
		long hosothutucId) {
		return _thongsochungchixecogioiLocalService.findPart2ByCertificateRecordAndHosothutucId(hosothutucId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOIPHAN2> findPart2ByVehicleGroupInitialAndHosothutucId(
		long hosothutucId) {
		return _thongsochungchixecogioiLocalService.findPart2ByVehicleGroupInitialAndHosothutucId(hosothutucId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByCertificateRecordId(
		long certificateRecordId) {
		return _thongsochungchixecogioiLocalService.findByCertificateRecordId(certificateRecordId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByVehicleGroupId(
		long vehicleGroupId) {
		return _thongsochungchixecogioiLocalService.findByVehicleGroupId(vehicleGroupId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIXECOGIOI> findByHoSoThuTucId(
		long hoSoThuTucId) {
		return _thongsochungchixecogioiLocalService.findByHoSoThuTucId(hoSoThuTucId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public THONGSOCHUNGCHIXECOGIOILocalService getWrappedTHONGSOCHUNGCHIXECOGIOILocalService() {
		return _thongsochungchixecogioiLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTHONGSOCHUNGCHIXECOGIOILocalService(
		THONGSOCHUNGCHIXECOGIOILocalService thongsochungchixecogioiLocalService) {
		_thongsochungchixecogioiLocalService = thongsochungchixecogioiLocalService;
	}

	@Override
	public THONGSOCHUNGCHIXECOGIOILocalService getWrappedService() {
		return _thongsochungchixecogioiLocalService;
	}

	@Override
	public void setWrappedService(
		THONGSOCHUNGCHIXECOGIOILocalService thongsochungchixecogioiLocalService) {
		_thongsochungchixecogioiLocalService = thongsochungchixecogioiLocalService;
	}

	private THONGSOCHUNGCHIXECOGIOILocalService _thongsochungchixecogioiLocalService;
}