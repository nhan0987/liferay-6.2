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
 * Provides a wrapper for {@link THONGSOCHUNGCHIDONGCOLocalService}.
 *
 * @author win_64
 * @see THONGSOCHUNGCHIDONGCOLocalService
 * @generated
 */
public class THONGSOCHUNGCHIDONGCOLocalServiceWrapper
	implements THONGSOCHUNGCHIDONGCOLocalService,
		ServiceWrapper<THONGSOCHUNGCHIDONGCOLocalService> {
	public THONGSOCHUNGCHIDONGCOLocalServiceWrapper(
		THONGSOCHUNGCHIDONGCOLocalService thongsochungchidongcoLocalService) {
		_thongsochungchidongcoLocalService = thongsochungchidongcoLocalService;
	}

	/**
	* Adds the t h o n g s o c h u n g c h i d o n g c o to the database. Also notifies the appropriate model listeners.
	*
	* @param thongsochungchidongco the t h o n g s o c h u n g c h i d o n g c o
	* @return the t h o n g s o c h u n g c h i d o n g c o that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO addTHONGSOCHUNGCHIDONGCO(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO thongsochungchidongco)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.addTHONGSOCHUNGCHIDONGCO(thongsochungchidongco);
	}

	/**
	* Creates a new t h o n g s o c h u n g c h i d o n g c o with the primary key. Does not add the t h o n g s o c h u n g c h i d o n g c o to the database.
	*
	* @param id the primary key for the new t h o n g s o c h u n g c h i d o n g c o
	* @return the new t h o n g s o c h u n g c h i d o n g c o
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO createTHONGSOCHUNGCHIDONGCO(
		long id) {
		return _thongsochungchidongcoLocalService.createTHONGSOCHUNGCHIDONGCO(id);
	}

	/**
	* Deletes the t h o n g s o c h u n g c h i d o n g c o with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i d o n g c o
	* @return the t h o n g s o c h u n g c h i d o n g c o that was removed
	* @throws PortalException if a t h o n g s o c h u n g c h i d o n g c o with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO deleteTHONGSOCHUNGCHIDONGCO(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.deleteTHONGSOCHUNGCHIDONGCO(id);
	}

	/**
	* Deletes the t h o n g s o c h u n g c h i d o n g c o from the database. Also notifies the appropriate model listeners.
	*
	* @param thongsochungchidongco the t h o n g s o c h u n g c h i d o n g c o
	* @return the t h o n g s o c h u n g c h i d o n g c o that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO deleteTHONGSOCHUNGCHIDONGCO(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO thongsochungchidongco)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.deleteTHONGSOCHUNGCHIDONGCO(thongsochungchidongco);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _thongsochungchidongcoLocalService.dynamicQuery();
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
		return _thongsochungchidongcoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _thongsochungchidongcoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _thongsochungchidongcoLocalService.dynamicQuery(dynamicQuery,
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
		return _thongsochungchidongcoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _thongsochungchidongcoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO fetchTHONGSOCHUNGCHIDONGCO(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.fetchTHONGSOCHUNGCHIDONGCO(id);
	}

	/**
	* Returns the t h o n g s o c h u n g c h i d o n g c o with the primary key.
	*
	* @param id the primary key of the t h o n g s o c h u n g c h i d o n g c o
	* @return the t h o n g s o c h u n g c h i d o n g c o
	* @throws PortalException if a t h o n g s o c h u n g c h i d o n g c o with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO getTHONGSOCHUNGCHIDONGCO(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.getTHONGSOCHUNGCHIDONGCO(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the t h o n g s o c h u n g c h i d o n g c os.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.nghiepvu.model.impl.THONGSOCHUNGCHIDONGCOModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t h o n g s o c h u n g c h i d o n g c os
	* @param end the upper bound of the range of t h o n g s o c h u n g c h i d o n g c os (not inclusive)
	* @return the range of t h o n g s o c h u n g c h i d o n g c os
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO> getTHONGSOCHUNGCHIDONGCOs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.getTHONGSOCHUNGCHIDONGCOs(start,
			end);
	}

	/**
	* Returns the number of t h o n g s o c h u n g c h i d o n g c os.
	*
	* @return the number of t h o n g s o c h u n g c h i d o n g c os
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTHONGSOCHUNGCHIDONGCOsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.getTHONGSOCHUNGCHIDONGCOsCount();
	}

	/**
	* Updates the t h o n g s o c h u n g c h i d o n g c o in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param thongsochungchidongco the t h o n g s o c h u n g c h i d o n g c o
	* @return the t h o n g s o c h u n g c h i d o n g c o that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO updateTHONGSOCHUNGCHIDONGCO(
		vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO thongsochungchidongco)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.updateTHONGSOCHUNGCHIDONGCO(thongsochungchidongco);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _thongsochungchidongcoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_thongsochungchidongcoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _thongsochungchidongcoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public boolean deleteDCXVehicleCertificateSpecWithHosothutucId(
		long hosothutucId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.deleteDCXVehicleCertificateSpecWithHosothutucId(hosothutucId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO> findByCertificateRecordAndHosothutucId(
		long hosothutucId) {
		return _thongsochungchidongcoLocalService.findByCertificateRecordAndHosothutucId(hosothutucId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO> findByVehicleGroupInitialAndHosothutucId(
		long hosothutucId) {
		return _thongsochungchidongcoLocalService.findByVehicleGroupInitialAndHosothutucId(hosothutucId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO> findByCertificateRecordId(
		long certificateRecordId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.findByCertificateRecordId(certificateRecordId);
	}

	@Override
	public java.util.List<vn.dtt.gt.dk.dao.nghiepvu.model.THONGSOCHUNGCHIDONGCO> findByVehicleGroupId(
		long vehicleGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _thongsochungchidongcoLocalService.findByVehicleGroupId(vehicleGroupId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public THONGSOCHUNGCHIDONGCOLocalService getWrappedTHONGSOCHUNGCHIDONGCOLocalService() {
		return _thongsochungchidongcoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTHONGSOCHUNGCHIDONGCOLocalService(
		THONGSOCHUNGCHIDONGCOLocalService thongsochungchidongcoLocalService) {
		_thongsochungchidongcoLocalService = thongsochungchidongcoLocalService;
	}

	@Override
	public THONGSOCHUNGCHIDONGCOLocalService getWrappedService() {
		return _thongsochungchidongcoLocalService;
	}

	@Override
	public void setWrappedService(
		THONGSOCHUNGCHIDONGCOLocalService thongsochungchidongcoLocalService) {
		_thongsochungchidongcoLocalService = thongsochungchidongcoLocalService;
	}

	private THONGSOCHUNGCHIDONGCOLocalService _thongsochungchidongcoLocalService;
}