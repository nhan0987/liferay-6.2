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

package vn.dtt.gt.dk.dao.common.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TthcDonViThucHienLocalService}.
 *
 * @author win_64
 * @see TthcDonViThucHienLocalService
 * @generated
 */
public class TthcDonViThucHienLocalServiceWrapper
	implements TthcDonViThucHienLocalService,
		ServiceWrapper<TthcDonViThucHienLocalService> {
	public TthcDonViThucHienLocalServiceWrapper(
		TthcDonViThucHienLocalService tthcDonViThucHienLocalService) {
		_tthcDonViThucHienLocalService = tthcDonViThucHienLocalService;
	}

	/**
	* Adds the tthc don vi thuc hien to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcDonViThucHien the tthc don vi thuc hien
	* @return the tthc don vi thuc hien that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien addTthcDonViThucHien(
		vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien tthcDonViThucHien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcDonViThucHienLocalService.addTthcDonViThucHien(tthcDonViThucHien);
	}

	/**
	* Creates a new tthc don vi thuc hien with the primary key. Does not add the tthc don vi thuc hien to the database.
	*
	* @param Id the primary key for the new tthc don vi thuc hien
	* @return the new tthc don vi thuc hien
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien createTthcDonViThucHien(
		long Id) {
		return _tthcDonViThucHienLocalService.createTthcDonViThucHien(Id);
	}

	/**
	* Deletes the tthc don vi thuc hien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc don vi thuc hien
	* @return the tthc don vi thuc hien that was removed
	* @throws PortalException if a tthc don vi thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien deleteTthcDonViThucHien(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcDonViThucHienLocalService.deleteTthcDonViThucHien(Id);
	}

	/**
	* Deletes the tthc don vi thuc hien from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcDonViThucHien the tthc don vi thuc hien
	* @return the tthc don vi thuc hien that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien deleteTthcDonViThucHien(
		vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien tthcDonViThucHien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcDonViThucHienLocalService.deleteTthcDonViThucHien(tthcDonViThucHien);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tthcDonViThucHienLocalService.dynamicQuery();
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
		return _tthcDonViThucHienLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcDonViThucHienLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcDonViThucHienLocalService.dynamicQuery(dynamicQuery, start,
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
		return _tthcDonViThucHienLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tthcDonViThucHienLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien fetchTthcDonViThucHien(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcDonViThucHienLocalService.fetchTthcDonViThucHien(Id);
	}

	/**
	* Returns the tthc don vi thuc hien with the primary key.
	*
	* @param Id the primary key of the tthc don vi thuc hien
	* @return the tthc don vi thuc hien
	* @throws PortalException if a tthc don vi thuc hien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien getTthcDonViThucHien(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcDonViThucHienLocalService.getTthcDonViThucHien(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcDonViThucHienLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc don vi thuc hiens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcDonViThucHienModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc don vi thuc hiens
	* @param end the upper bound of the range of tthc don vi thuc hiens (not inclusive)
	* @return the range of tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien> getTthcDonViThucHiens(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcDonViThucHienLocalService.getTthcDonViThucHiens(start, end);
	}

	/**
	* Returns the number of tthc don vi thuc hiens.
	*
	* @return the number of tthc don vi thuc hiens
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTthcDonViThucHiensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcDonViThucHienLocalService.getTthcDonViThucHiensCount();
	}

	/**
	* Updates the tthc don vi thuc hien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcDonViThucHien the tthc don vi thuc hien
	* @return the tthc don vi thuc hien that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien updateTthcDonViThucHien(
		vn.dtt.gt.dk.dao.common.model.TthcDonViThucHien tthcDonViThucHien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcDonViThucHienLocalService.updateTthcDonViThucHien(tthcDonViThucHien);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcDonViThucHienLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcDonViThucHienLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcDonViThucHienLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcDonViThucHienLocalService getWrappedTthcDonViThucHienLocalService() {
		return _tthcDonViThucHienLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcDonViThucHienLocalService(
		TthcDonViThucHienLocalService tthcDonViThucHienLocalService) {
		_tthcDonViThucHienLocalService = tthcDonViThucHienLocalService;
	}

	@Override
	public TthcDonViThucHienLocalService getWrappedService() {
		return _tthcDonViThucHienLocalService;
	}

	@Override
	public void setWrappedService(
		TthcDonViThucHienLocalService tthcDonViThucHienLocalService) {
		_tthcDonViThucHienLocalService = tthcDonViThucHienLocalService;
	}

	private TthcDonViThucHienLocalService _tthcDonViThucHienLocalService;
}