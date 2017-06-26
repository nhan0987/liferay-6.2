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
 * Provides a wrapper for {@link TthcNoidungHoSoLocalService}.
 *
 * @author win_64
 * @see TthcNoidungHoSoLocalService
 * @generated
 */
public class TthcNoidungHoSoLocalServiceWrapper
	implements TthcNoidungHoSoLocalService,
		ServiceWrapper<TthcNoidungHoSoLocalService> {
	public TthcNoidungHoSoLocalServiceWrapper(
		TthcNoidungHoSoLocalService tthcNoidungHoSoLocalService) {
		_tthcNoidungHoSoLocalService = tthcNoidungHoSoLocalService;
	}

	/**
	* Adds the tthc noidung ho so to the database. Also notifies the appropriate model listeners.
	*
	* @param tthcNoidungHoSo the tthc noidung ho so
	* @return the tthc noidung ho so that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo addTthcNoidungHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoLocalService.addTthcNoidungHoSo(tthcNoidungHoSo);
	}

	/**
	* Creates a new tthc noidung ho so with the primary key. Does not add the tthc noidung ho so to the database.
	*
	* @param Id the primary key for the new tthc noidung ho so
	* @return the new tthc noidung ho so
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo createTthcNoidungHoSo(
		long Id) {
		return _tthcNoidungHoSoLocalService.createTthcNoidungHoSo(Id);
	}

	/**
	* Deletes the tthc noidung ho so with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so that was removed
	* @throws PortalException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo deleteTthcNoidungHoSo(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoLocalService.deleteTthcNoidungHoSo(Id);
	}

	/**
	* Deletes the tthc noidung ho so from the database. Also notifies the appropriate model listeners.
	*
	* @param tthcNoidungHoSo the tthc noidung ho so
	* @return the tthc noidung ho so that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo deleteTthcNoidungHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoLocalService.deleteTthcNoidungHoSo(tthcNoidungHoSo);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tthcNoidungHoSoLocalService.dynamicQuery();
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
		return _tthcNoidungHoSoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcNoidungHoSoLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _tthcNoidungHoSoLocalService.dynamicQuery(dynamicQuery, start,
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
		return _tthcNoidungHoSoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _tthcNoidungHoSoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo fetchTthcNoidungHoSo(
		long Id) throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoLocalService.fetchTthcNoidungHoSo(Id);
	}

	/**
	* Returns the tthc noidung ho so with the primary key.
	*
	* @param Id the primary key of the tthc noidung ho so
	* @return the tthc noidung ho so
	* @throws PortalException if a tthc noidung ho so with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo getTthcNoidungHoSo(
		long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoLocalService.getTthcNoidungHoSo(Id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the tthc noidung ho sos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.dtt.gt.dk.dao.common.model.impl.TthcNoidungHoSoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tthc noidung ho sos
	* @param end the upper bound of the range of tthc noidung ho sos (not inclusive)
	* @return the range of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo> getTthcNoidungHoSos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoLocalService.getTthcNoidungHoSos(start, end);
	}

	/**
	* Returns the number of tthc noidung ho sos.
	*
	* @return the number of tthc noidung ho sos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTthcNoidungHoSosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoLocalService.getTthcNoidungHoSosCount();
	}

	/**
	* Updates the tthc noidung ho so in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tthcNoidungHoSo the tthc noidung ho so
	* @return the tthc noidung ho so that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo updateTthcNoidungHoSo(
		vn.dtt.gt.dk.dao.common.model.TthcNoidungHoSo tthcNoidungHoSo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tthcNoidungHoSoLocalService.updateTthcNoidungHoSo(tthcNoidungHoSo);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _tthcNoidungHoSoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_tthcNoidungHoSoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _tthcNoidungHoSoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TthcNoidungHoSoLocalService getWrappedTthcNoidungHoSoLocalService() {
		return _tthcNoidungHoSoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTthcNoidungHoSoLocalService(
		TthcNoidungHoSoLocalService tthcNoidungHoSoLocalService) {
		_tthcNoidungHoSoLocalService = tthcNoidungHoSoLocalService;
	}

	@Override
	public TthcNoidungHoSoLocalService getWrappedService() {
		return _tthcNoidungHoSoLocalService;
	}

	@Override
	public void setWrappedService(
		TthcNoidungHoSoLocalService tthcNoidungHoSoLocalService) {
		_tthcNoidungHoSoLocalService = tthcNoidungHoSoLocalService;
	}

	private TthcNoidungHoSoLocalService _tthcNoidungHoSoLocalService;
}