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

package vn.dtt.gt.dk.dao.aswmsg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AswmsgSyndatahistoryLocalService}.
 *
 * @author win_64
 * @see AswmsgSyndatahistoryLocalService
 * @generated
 */
public class AswmsgSyndatahistoryLocalServiceWrapper
	implements AswmsgSyndatahistoryLocalService,
		ServiceWrapper<AswmsgSyndatahistoryLocalService> {
	public AswmsgSyndatahistoryLocalServiceWrapper(
		AswmsgSyndatahistoryLocalService aswmsgSyndatahistoryLocalService) {
		_aswmsgSyndatahistoryLocalService = aswmsgSyndatahistoryLocalService;
	}

	/**
	* Adds the aswmsg syndatahistory to the database. Also notifies the appropriate model listeners.
	*
	* @param aswmsgSyndatahistory the aswmsg syndatahistory
	* @return the aswmsg syndatahistory that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory addAswmsgSyndatahistory(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory aswmsgSyndatahistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgSyndatahistoryLocalService.addAswmsgSyndatahistory(aswmsgSyndatahistory);
	}

	/**
	* Creates a new aswmsg syndatahistory with the primary key. Does not add the aswmsg syndatahistory to the database.
	*
	* @param id the primary key for the new aswmsg syndatahistory
	* @return the new aswmsg syndatahistory
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory createAswmsgSyndatahistory(
		long id) {
		return _aswmsgSyndatahistoryLocalService.createAswmsgSyndatahistory(id);
	}

	/**
	* Deletes the aswmsg syndatahistory with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the aswmsg syndatahistory
	* @return the aswmsg syndatahistory that was removed
	* @throws PortalException if a aswmsg syndatahistory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory deleteAswmsgSyndatahistory(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgSyndatahistoryLocalService.deleteAswmsgSyndatahistory(id);
	}

	/**
	* Deletes the aswmsg syndatahistory from the database. Also notifies the appropriate model listeners.
	*
	* @param aswmsgSyndatahistory the aswmsg syndatahistory
	* @return the aswmsg syndatahistory that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory deleteAswmsgSyndatahistory(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory aswmsgSyndatahistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgSyndatahistoryLocalService.deleteAswmsgSyndatahistory(aswmsgSyndatahistory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _aswmsgSyndatahistoryLocalService.dynamicQuery();
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
		return _aswmsgSyndatahistoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _aswmsgSyndatahistoryLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _aswmsgSyndatahistoryLocalService.dynamicQuery(dynamicQuery,
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
		return _aswmsgSyndatahistoryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _aswmsgSyndatahistoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory fetchAswmsgSyndatahistory(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgSyndatahistoryLocalService.fetchAswmsgSyndatahistory(id);
	}

	/**
	* Returns the aswmsg syndatahistory with the primary key.
	*
	* @param id the primary key of the aswmsg syndatahistory
	* @return the aswmsg syndatahistory
	* @throws PortalException if a aswmsg syndatahistory with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory getAswmsgSyndatahistory(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgSyndatahistoryLocalService.getAswmsgSyndatahistory(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgSyndatahistoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the aswmsg syndatahistories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.aswmsg.model.impl.AswmsgSyndatahistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of aswmsg syndatahistories
	* @param end the upper bound of the range of aswmsg syndatahistories (not inclusive)
	* @return the range of aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory> getAswmsgSyndatahistories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgSyndatahistoryLocalService.getAswmsgSyndatahistories(start,
			end);
	}

	/**
	* Returns the number of aswmsg syndatahistories.
	*
	* @return the number of aswmsg syndatahistories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAswmsgSyndatahistoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgSyndatahistoryLocalService.getAswmsgSyndatahistoriesCount();
	}

	/**
	* Updates the aswmsg syndatahistory in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param aswmsgSyndatahistory the aswmsg syndatahistory
	* @return the aswmsg syndatahistory that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory updateAswmsgSyndatahistory(
		vn.dtt.gt.dk.dao.aswmsg.model.AswmsgSyndatahistory aswmsgSyndatahistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _aswmsgSyndatahistoryLocalService.updateAswmsgSyndatahistory(aswmsgSyndatahistory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _aswmsgSyndatahistoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_aswmsgSyndatahistoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _aswmsgSyndatahistoryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AswmsgSyndatahistoryLocalService getWrappedAswmsgSyndatahistoryLocalService() {
		return _aswmsgSyndatahistoryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAswmsgSyndatahistoryLocalService(
		AswmsgSyndatahistoryLocalService aswmsgSyndatahistoryLocalService) {
		_aswmsgSyndatahistoryLocalService = aswmsgSyndatahistoryLocalService;
	}

	@Override
	public AswmsgSyndatahistoryLocalService getWrappedService() {
		return _aswmsgSyndatahistoryLocalService;
	}

	@Override
	public void setWrappedService(
		AswmsgSyndatahistoryLocalService aswmsgSyndatahistoryLocalService) {
		_aswmsgSyndatahistoryLocalService = aswmsgSyndatahistoryLocalService;
	}

	private AswmsgSyndatahistoryLocalService _aswmsgSyndatahistoryLocalService;
}