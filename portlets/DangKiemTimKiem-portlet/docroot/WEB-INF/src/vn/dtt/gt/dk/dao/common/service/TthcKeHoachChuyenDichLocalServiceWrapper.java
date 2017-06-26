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
 * Provides a wrapper for {@link TthcKeHoachChuyenDichLocalService}.
 *
 * @author win_64
 * @see TthcKeHoachChuyenDichLocalService
 * @generated
 */
public class TthcKeHoachChuyenDichLocalServiceWrapper
	implements TthcKeHoachChuyenDichLocalService,
		ServiceWrapper<TthcKeHoachChuyenDichLocalService> {
	public TthcKeHoachChuyenDichLocalServiceWrapper(
		TthcKeHoachChuyenDichLocalService tthcKeHoachChuyenDichLocalService) {
		_tthcKeHoachChuyenDichLocalService = tthcKeHoachChuyenDichLocalService;
	}

	/**
	* Adds the tthc ke hoach chuyen dich to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcKeHoachChuyenDich the tthc ke hoach chuyen dich
	* @return the tthc ke hoach chuyen dich that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich addTthcKeHoachChuyenDich(
		vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich tthcKeHoachChuyenDich)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcKeHoachChuyenDichLocalService.addTthcKeHoachChuyenDich(tthcKeHoachChuyenDich);
	}

	/**
	* Creates a new tthc ke hoach chuyen dich with the primary key. Does not add the tthc ke hoach chuyen dich to the database.
	*
	* @param id the primary key for the new tthc ke hoach chuyen dich
	* @return the new tthc ke hoach chuyen dich
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich createTthcKeHoachChuyenDich(
		long id) {
		return _tthcKeHoachChuyenDichLocalService.createTthcKeHoachChuyenDich(id);
	}

	/**
	* Deletes the tthc ke hoach chuyen dich with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the tthc ke hoach chuyen dich
	* @return the tthc ke hoach chuyen dich that was removed
	* @throws PortalException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich deleteTthcKeHoachChuyenDich(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcKeHoachChuyenDichLocalService.deleteTthcKeHoachChuyenDich(id);
	}

	/**
	* Deletes the tthc ke hoach chuyen dich from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcKeHoachChuyenDich the tthc ke hoach chuyen dich
	* @return the tthc ke hoach chuyen dich that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich deleteTthcKeHoachChuyenDich(
		vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich tthcKeHoachChuyenDich)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcKeHoachChuyenDichLocalService.deleteTthcKeHoachChuyenDich(tthcKeHoachChuyenDich);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tthcKeHoachChuyenDichLocalService.dynamicQuery();
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
		return _tthcKeHoachChuyenDichLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcKeHoachChuyenDichLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcKeHoachChuyenDichLocalService.dynamicQuery(dynamicQuery,
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
		return _tthcKeHoachChuyenDichLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tthcKeHoachChuyenDichLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich fetchTthcKeHoachChuyenDich(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcKeHoachChuyenDichLocalService.fetchTthcKeHoachChuyenDich(id);
	}

	/**
	* Returns the tthc ke hoach chuyen dich with the primary key.
	*
	* @param id the primary key of the tthc ke hoach chuyen dich
	* @return the tthc ke hoach chuyen dich
	* @throws PortalException if a tthc ke hoach chuyen dich with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich getTthcKeHoachChuyenDich(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcKeHoachChuyenDichLocalService.getTthcKeHoachChuyenDich(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcKeHoachChuyenDichLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc ke hoach chuyen dichs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcKeHoachChuyenDichModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc ke hoach chuyen dichs
	* @param end the upper bound of the range of tthc ke hoach chuyen dichs (not inclusive)
	* @return the range of tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich> getTthcKeHoachChuyenDichs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcKeHoachChuyenDichLocalService.getTthcKeHoachChuyenDichs(start,
			end);
	}

	/**
	* Returns the number of tthc ke hoach chuyen dichs.
	*
	* @return the number of tthc ke hoach chuyen dichs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTthcKeHoachChuyenDichsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcKeHoachChuyenDichLocalService.getTthcKeHoachChuyenDichsCount();
	}

	/**
	* Updates the tthc ke hoach chuyen dich in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcKeHoachChuyenDich the tthc ke hoach chuyen dich
	* @return the tthc ke hoach chuyen dich that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich updateTthcKeHoachChuyenDich(
		vn.dtt.gt.dk.dao.common.model.TthcKeHoachChuyenDich tthcKeHoachChuyenDich)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcKeHoachChuyenDichLocalService.updateTthcKeHoachChuyenDich(tthcKeHoachChuyenDich);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcKeHoachChuyenDichLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcKeHoachChuyenDichLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcKeHoachChuyenDichLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcKeHoachChuyenDichLocalService getWrappedTthcKeHoachChuyenDichLocalService() {
		return _tthcKeHoachChuyenDichLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcKeHoachChuyenDichLocalService(
		TthcKeHoachChuyenDichLocalService tthcKeHoachChuyenDichLocalService) {
		_tthcKeHoachChuyenDichLocalService = tthcKeHoachChuyenDichLocalService;
	}

	@Override
	public TthcKeHoachChuyenDichLocalService getWrappedService() {
		return _tthcKeHoachChuyenDichLocalService;
	}

	@Override
	public void setWrappedService(
		TthcKeHoachChuyenDichLocalService tthcKeHoachChuyenDichLocalService) {
		_tthcKeHoachChuyenDichLocalService = tthcKeHoachChuyenDichLocalService;
	}

	private TthcKeHoachChuyenDichLocalService _tthcKeHoachChuyenDichLocalService;
}